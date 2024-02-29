"use client";
import { MetricsWindowLength } from "littlehorse-client/dist/proto/common_enums";
import moment from "moment";
import { useState } from "react";
import { Calendar } from "ui";
import { TaskExecutionMetrics } from "../components/metrics/TaskExecutionMetrics";
import { WorkflowExecutionMetrics } from "../components/metrics/WorkflowExecutionMetrics";

export type WindowsLength = keyof Omit<typeof MetricsWindowLength, "UNRECOGNIZED">


export function Metrics() {
  const [windowLength, setWindowLength] = useState<WindowsLength>("HOURS_2");
  const [windows, setWindows] = useState(24);
  const [lastDate, setLastDate] = useState(moment().toDate());

  return (
    <section>
      <div className="between">
        <h2>Metrics</h2>
        <Calendar
          changeLastDate={setLastDate}
          changeNoWindows={setWindows}
          changeWindowsLenght={setWindowLength}
          lastDate={lastDate}
          noWindows={windows}
          type={windowLength}
        />
      </div>

      <WorkflowExecutionMetrics
        lastWindowStart={lastDate}
        windowLength={windowLength}
        windows={windows}
      />
      <TaskExecutionMetrics
        lastWindowStart={lastDate}
        windowLength={windowLength}
        windows={windows}
      />
    </section>
  );
}
