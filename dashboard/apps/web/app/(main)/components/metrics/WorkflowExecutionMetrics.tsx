"use client";

import { useEffect, useState } from "react";
import moment, { utc } from "moment";
import { Button, Loader } from "ui";
import { WorkflowsChart } from "../../../../components/Charts/WorkflowsChart";
import { LatencyChart } from "../../../../components/Charts/LatencyChart";
import { fethWorkflowMetrics } from "./fetchWorkflowMetrics";
import { useTenant } from "../../../../contexts/TenantContext";
import { MetricsWindowLength } from "littlehorse-client/dist/proto/common_enums";

export interface TaskDefMetric {
  windowStart: Date;
  type: string;
  totalStarted: string;
  totalScheduled: string;
  totalErrored: string;
  totalCompelted: string;
  taskDefName: string;
  startToCompleteMax: string;
  startToCompleteAvg: string;
  scheduleToStartMax: string;
  ScheduleToStartAvg: string;
}

export interface ExecutionMetricsProps {
  windowLength: keyof Omit<typeof MetricsWindowLength, "UNRECOGNIZED">;
  windows: number;
  lastWindowStart: Date;
}
export function WorkflowExecutionMetrics({
  windows = 16,
  lastWindowStart = moment().toDate(),
  windowLength = "HOURS_2",
}: ExecutionMetricsProps) {
  const [data, setData] = useState<any[]>([]);
  const [chart, setChart] = useState("workflows");
  const [isLoading, setIsLoading] = useState(false);
  const { currentTenant } = useTenant();
  const windowsNotOverpassing300 = windows > 300 ? 300 : windows;

  function timeoutP(_lastWindowStart: Date, metrics: any[]) {
    const lastWindowStartAsMoment = moment(_lastWindowStart);
    let firstDate: moment.Moment;
    if (windowLength === "HOURS_2") {
      firstDate = lastWindowStartAsMoment
        .clone()
        .subtract(windowsNotOverpassing300 * 2, "hours");
    } else if (windowLength === "DAYS_1") {
      firstDate = lastWindowStartAsMoment
        .clone()
        .subtract(windowsNotOverpassing300, "days");
    } else {
      const fact = Number(lastWindowStartAsMoment.format("mm")) % 5;

      lastWindowStartAsMoment.subtract(fact, "minutes");
      firstDate = lastWindowStartAsMoment
        .clone()
        .subtract(windowsNotOverpassing300 * 5, "minutes");
    }
    const out: any[] = [];
    const curr = lastWindowStartAsMoment.clone();
    if (windowLength === "HOURS_2") {
      while (curr.format("YMMDDHH") > firstDate.format("YMMDDHH")) {
        out.push({
          label: curr.toString(),
          data: metrics?.find((d) => {
            return (
              utc(d.windowStart).format("YMMDDHH") === curr.format("YMMDDHH") ||
              moment(d.windowStart).format("YMMDDHH") ===
                curr.clone().subtract(1, "hour").format("YMMDDHH")
            );
          }) || {
            windowStart: curr.toString(),
            windowLength,
            taskDefName: "CLUSTER_LEVEL_METRIC",
            scheduleToStartMax: "0",
            scheduleToStartAvg: "0",
            startToCompleteMax: "0",
            startToCompleteAvg: "0",
            totalCompleted: "0",
            totalErrored: "0",
            totalStarted: "0",
            totalScheduled: "0",
          },
        });
        curr.subtract(2, "hours");
      }
    } else if (windowLength === "DAYS_1") {
      while (curr.format("YMMDD") > firstDate.format("YMMDD")) {
        out.push({
          label: curr.toString(),
          data: metrics?.find((d) => {
            return utc(d.windowStart).format("YMMDD") === curr.format("YMMDD");
          }) || {
            windowStart: curr.toString(),
            windowLength,
            taskDefName: "CLUSTER_LEVEL_METRIC",
            scheduleToStartMax: "0",
            scheduleToStartAvg: "0",
            startToCompleteMax: "0",
            startToCompleteAvg: "0",
            totalCompleted: "0",
            totalErrored: "0",
            totalStarted: "0",
            totalScheduled: "0",
          },
        });
        curr.subtract(1, "days");
      }
    } else {
      while (curr.format("YMMDDHHmm") > firstDate.format("YMMDDHHmm")) {
        out.push({
          label: curr.toString(),
          data: metrics?.find((d) => {
            return (
              utc(d.windowStart).format("YMMDDHHmm") ===
              curr.format("YMMDDHHmm")
            );
          }) || {
            windowStart: curr.toString(),
            windowLength,
            taskDefName: "CLUSTER_LEVEL_METRIC",
            scheduleToStartMax: "0",
            scheduleToStartAvg: "0",
            startToCompleteMax: "0",
            startToCompleteAvg: "0",
            totalCompleted: "0",
            totalErrored: "0",
            totalStarted: "0",
            totalScheduled: "0",
          },
        });
        curr.subtract(5, "minutes");
      }
    }

    return out.reverse();
  }

  const getData = async () => {
    setIsLoading(true);
    const metricsResponse = await fethWorkflowMetrics(
      {
        wfSpecId: {
          name: "CLUSTER_LEVEL_METRIC",
          majorVersion: 0,
          revision: 0,
        },
        lastWindowStart: lastWindowStart.toLocaleTimeString(),
        windowLength,
        numWindows: windowsNotOverpassing300,
      },
      currentTenant
    );

    if (metricsResponse) {
      setData(timeoutP(lastWindowStart, metricsResponse.results));
    }
    setIsLoading(false);
  };

  useEffect(() => {
    getData();
  }, [currentTenant, windowsNotOverpassing300, lastWindowStart, windowLength]);

  return (
    <article>
      <header>
        <div className=".article-title">
          <h3>Workflow Execution metrics</h3>
          <h4>Cluster level</h4>
        </div>
        <div className="btns btns-right">
          <Button
            className={`btn btn-dark ${chart === "workflows" && "active-dark"}`}
            onClick={() => {
              setChart("workflows");
            }}
          >
            Workflows
          </Button>
          <Button
            className={`btn btn-dark ${chart === "latency" && "active-dark"}`}
            onClick={() => {
              setChart("latency");
            }}
          >
            Latency
          </Button>
        </div>
      </header>

      {isLoading ? (
        <Loader />
      ) : (
        <div
          className={`${
            data.length === 0
              ? "flex items-center justify-items-center justify-center"
              : ""
          }`}
          style={{
            height: data.length === 0 ? "400px" : "auto",
          }}
        >
          {data.length > 0 ? (
            <>
              {chart === "workflows" && (
                <WorkflowsChart data={data} type={windowLength} />
              )}
              {chart === "latency" && (
                <LatencyChart data={data} type={windowLength} />
              )}
            </>
          ) : (
            <p> No data available</p>
          )}
        </div>
      )}
    </article>
  );
}
