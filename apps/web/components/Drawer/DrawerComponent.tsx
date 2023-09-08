import React, { useEffect, useState } from "react";
import { TaskDefInformation } from "./internals/TaskDefInformation";
import { NOPInformation } from "./internals/NOPInformation";
import { ExternalEventInformation } from "./internals/ExternalEventInformation";
import { SpawnChildInformation } from "./internals/SpawnChildInformation";
import { WaitChildInformation } from "./internals/WaitChildInformation";
import { LH_EXCEPTION } from "./internals/FailureInformation";
import { parseKey } from "./internals/drawerInternals";
import WfVariable, { Value } from "./wfVariable";
import { SleepNodeInformation } from "./internals/SleepNodeInformation";
import { UserTaskNodeInformation } from "./internals/UserTaskNodeInformation";

interface DrawerComponentProps {
  isWFRun:boolean
  internalComponent?: string | undefined;
  data: any;
  datao: any;
  nodeName: string;
  wfRunId?: string;
  setToggleSideBar: (value: boolean) => void;
  setCode: (code: string) => void;
  setLanguage: (language: string) => void;
  setError: (value: boolean) => void;
  setThread: (value: string) => void;
  run?: any;
  runs?: any[];
}

export const DrawerComponent = (props: DrawerComponentProps) => {
  // console.log('DATA',props.data)
  // console.log('DATAO',props.datao)
  const [current_run, setCurrentRun] = useState<any>(props.run);
  const [type, setType] = useState('');
  const [rawData, setRawData] = useState<any>();
  const [wfRunRawData, setWfRunRawData] = useState<any>();
  const [selectedNodeData, setSelectedNodeData] = useState<any>();
  const [mainData, setMainData] =
    useState<{ name: string; type: string; value?: string }[]>();
  const [selectedNode, setSelectedNode] = useState<any>();
  const [wfRunData, setWfRunData] = useState<any>();
  const [errorData, setErrorData] = useState<any>([]);
  const [lastSelectedNode, setLastSelectedNode] = useState<any>();
  const [threadName, setThreadName] = useState<string>();

  const setThreadHandler = (thread: string) => {
    setThreadName(thread);
    props.setThread(thread);
    setCurrentRun(props.runs?.find( r => r.threadSpecName === thread))
  };

  const getData: any = async (
    url: string,
    name: string,
    handler: (data: any) => void,
    dataPath: string
  ) => {
    const response = await fetch(url + name);

    if (response.ok) {
      const content = await response.json();

      handler(content.data[dataPath]);
    } else console.warn("INVALID RESPONSE FROM API");
  };
  const getVariableData = async (wfRunId, RunNumber, name) => {
    const res = await fetch("/api/drawer/variable", {
      method: "POST",
      body: JSON.stringify({
        wfRunId,
        RunNumber,
        name,
      }),
    });
    if (res.ok) {
      const content = await res.json();
    }
  };
  const getErrorData: any = (node: any, key: string) => {
    if (node) {
      const logs = "task" in node ? node.task.logOutput : null;
      const data = node[key].map((element: any) => {
        return {
          ...element,
          log: logs,
        };
      });

      setErrorData(data);
    } else {
      setErrorData([]);
    }
  };

  useEffect(() => {
    if (props.wfRunId && wfRunRawData === undefined)
      getData(
        "../../api/drawer/wfRun/",
        props.wfRunId,
        setWfRunRawData,
        "results"
      );

    if (props.data) {
      if (mainData === undefined || threadName) {
        let selectedThread;

        if (threadName === undefined) {
          selectedThread = props.data.entrypointThreadName;
          selectedThread;
        }

        setMainData(
          props.data.threadSpecs[selectedThread || threadName].variableDefs
        );
      }

      if (props.wfRunId) {
        getVariableData(props.wfRunId, "0", "customer-id");
      }

      if (props.nodeName !== lastSelectedNode) {
        setLastSelectedNode(props.nodeName);
        setSelectedNodeData(undefined);
        setWfRunData(undefined);
        setSelectedNode(
          props.data.threadSpecs[threadName || "entrypoint"].nodes[
            props.nodeName
          ]
        );
        if (props.wfRunId) {
          const wfRunNode = wfRunRawData.find(
            (element: any) => element.nodeName === props.nodeName
          );
          if (wfRunNode) {
            getErrorData(wfRunNode, "failures");
          } else {
            setErrorData([]);
          }
        } else {
          getErrorData(
            props.data.threadSpecs[threadName || "entrypoint"].nodes[
              props.nodeName
            ],
            "failureHandlers"
          );
        }
      }

      const processComplexData = {
        task: () => {
          console.log("selectedNode", selectedNode);
          if (rawData === undefined)
            getData(
              "../../api/drawer/taskDef/",
              selectedNode?.task.taskDefName,
              setRawData,
              "result"
            );
          else {
            const processedData = rawData.inputVars.map(
              (
                element: { name: string; type: string; _: any },
                index: number
              ) => {
                const currentVariable = selectedNode?.task.variables[index];

                let variableName = currentVariable?.variableName;

                const jsonPath = currentVariable?.jsonPath?.replace("$", "");

                if (jsonPath) variableName?.concat(jsonPath);

                return {
                  name: element.name,
                  type: element.type,
                  variableName: variableName,
                };
              }
            );

            if (props.wfRunId && wfRunRawData) {
              const wfRunNode = wfRunRawData.find(
                (element: any) => element.nodeName === props.nodeName
              );

              if (wfRunNode && props.internalComponent) {
                const data =
                  wfRunNode[props.internalComponent as keyof typeof wfRunNode];
                if (data) {
                  const inputs = (data as any)?.inputVariables?.map(
                    (element: any, index: number) => {
                      const variableType: string = element.value.type;
                      const correctKey = parseKey(variableType) || "";
                      const value = element.value[correctKey] || "";

                      processedData[index].value = value;

                      return {
                        name: element.varName,
                        type: element.value.type,
                        value: value,
                      };
                    }
                  );

                  const outputs = (data as any)?.inputVariables?.map(
                    (element: any) => {
                      const variableType: string = element.value.type;
                      const correctKey = parseKey(variableType) || "";
                      const value = element.value[correctKey] || "";

                      return {
                        type: element.value.type,
                        value: value,
                      };
                    }
                  );

                  const wfRunComplexData = {
                    nodeData: {
                      reachTime: wfRunNode.arrivalTime || "",
                      completionTime: wfRunNode.endTime || "",
                      status: wfRunNode.status,
                    },
                    inputs: inputs,
                    outputs: outputs,
                  };

                  setWfRunData(wfRunComplexData);
                }
              }
            }

            setSelectedNodeData(processedData);
          }
        },
        externalEvent: () => {
          if (props.wfRunId && wfRunRawData) {
            const wfRunNode = wfRunRawData.find(
              (element: any) => element.nodeName === props.nodeName
            );

            if (wfRunNode && props.internalComponent) {
              const data = wfRunNode[
                props.internalComponent as keyof typeof wfRunNode
              ] as {
                externalEventDefName: string;
                eventTime: string;
                externalEventId: {
                  wfRunId: string;
                  externalEventDefName: string;
                  guid: string;
                };
              };

              if (data) {
                const wfRunComplexData = {
                  nodeData: {
                    reachTime: wfRunNode.arrivalTime || "",
                    completionTime: wfRunNode.endTime || "",
                    status: wfRunNode.status,
                  },
                  guid: data.externalEventId?.guid || "",
                  arrivedTime: data?.eventTime || "",
                  arrived: data.eventTime ? "YES" : "NO",
                };

                setWfRunData(wfRunComplexData);
              }
            }
          }

          const processedData = selectedNode?.variableMutations.map(
            (element: {
              lhsName: string;
              operation: string;
              nodeOutput: any;
            }) => {
              let literalValue =
                selectedNode.externalEvent.externalEventDefName;

              if (element.nodeOutput?.hasOwnProperty("jsonpath"))
                console.warn("Missing fix of property: jsonpath");

              if (element.nodeOutput?.hasOwnProperty("jsonPath"))
                console.warn(
                  "Property fixed: jsonPath; NEED TO SUBSTITUTE ON CODE"
                );

              //TODO: verify that the jsonPath property is right spelled
              const jsonPath = element.nodeOutput?.jsonpath?.replace("$", "");

              if (jsonPath) literalValue = literalValue + jsonPath;

              // FIXME: why is the concat not working?
              //literalValue.concat(jsonPath)

              return {
                mutatedVariable: element.lhsName,
                mutatedType: element.operation,
                literalValue: literalValue,
              };
            }
          );

          setSelectedNodeData(processedData);
        },
        nop_def: () => {
          setSelectedNodeData(selectedNode?.outgoingEdges);
        },
        startThread: () => {
          if (props.wfRunId && wfRunRawData) {
            const wfRunNode = wfRunRawData.find(
              (element: any) => element.nodeName === props.nodeName
            );

            console.log("wfRunRawData", wfRunRawData);
            console.log("wfRunNode", wfRunNode);
            console.log("props.nodeName", props.nodeName);

            if (wfRunNode && props.internalComponent) {
              const data = wfRunNode[
                props.internalComponent as keyof typeof wfRunNode
              ] as {
                externalEventDefName: string;
                eventTime: string;
              };

              if (data) {
                const wfRunComplexData = {
                  nodeData: {
                    reachTime: wfRunNode.arrivalTime || "",
                    completionTime: wfRunNode.endTime || "",
                    status: wfRunNode.status,
                  },
                };

                setWfRunData(wfRunComplexData);
              }
            }
          }
        },
      };

      if (props.internalComponent) {
        const complexData =
          processComplexData[
            props.internalComponent as keyof typeof processComplexData
          ];

        if (complexData instanceof Function) complexData();
      }
    }
  }, [
    props.data,
    rawData,
    wfRunRawData,
    selectedNode,
    props.nodeName,
    props.internalComponent,
    threadName,
  ]);

  useEffect( () => {
    if(!props?.nodeName) return 
    setType(props.nodeName.split('-').reverse()[0])
  },[props.nodeName])

  const setToggleSideBar = (
    value: boolean,
    isError: boolean,
    code: string,
    language?: string
  ) => {
    props.setToggleSideBar(value);
    if (
      language === undefined ||
      language === "jsonObj" ||
      language === "jsonArr"
    ) {
      props.setCode(JSON.parse(code));
      return;
    }
    props.setCode(code);
    props.setLanguage(language);
    props.setError(isError);
  };

  return (
    <div className="drawer-component">
      <>
        <div className="drawer__threadSelector">
          <p className="drawer__threadSelector__header">THREADSPEC NAME</p>
          <div className="drawer__threadSelector__container">
            <select
              className="drawer__threadSelector__container__select"
              value={threadName}
              onChange={(event) => setThreadHandler(event.target.value)}
            >
              {props.runs &&
                props.runs?.map(({threadSpecName, number}) => {
                  return (
                    <option key={number} value={threadSpecName}>
                      {threadSpecName}
                    </option>
                  );
                })}
            </select>
          </div>
        </div>
        <div className="drawer__mainTable">
          <div className="drawer__mainTable__header">
            {props.run ? "ThreadRun Variables" : "ThreadSpec Variables"}
          </div>
          <div
            className={`drawer__mainTable__header__subheaders ${
              props.run
                ? "drawer__mainTable__header__subheaders-three-columns"
                : ""
            }`}
          >
            <p className="center ">NAME</p>
            <p className="center">TYPE</p>
            {props.run && <p className="center">VALUE</p>}
          </div>
          {mainData &&
            mainData.map(({ name, type }, index) => {
              return (
                <div key={index}>
                  <WfVariable
                    wfRunId={props.wfRunId}
                    RunNumber={"0"}
                    name={name}
                    index={index}
                    run={props.run}
                    type={type}
                    setToggleSideBar={setToggleSideBar}
                    errorData={errorData}
                  />
                </div>
              );
            })}
        </div>

        {props.internalComponent === "task" && (
          <TaskDefInformation
            {...{
              linkedThread: setThreadHandler,
              data: selectedNodeData,
              nodeName: props.nodeName,
              errorData: errorData,
              wfRunData: wfRunData,
              setToggleSideBar: setToggleSideBar,
            }}
          />
        )}
        {props.internalComponent === "nop_def" && (
          <NOPInformation
            {...{
              data: selectedNodeData,
              nodeName: props.nodeName,
              errorData: errorData,
              setToggleSideBar: setToggleSideBar,
            }}
          />
        )}

        {props.internalComponent === "startThread" && (
          <SpawnChildInformation
            {...{
              linkedThread: setThreadHandler,
              nodeName: props.nodeName,
              errorData: errorData,
              wfRunData: wfRunData,
              setToggleSideBar: setToggleSideBar,
            }}
          />
        )}
        {props.internalComponent === "waitForThread" && (
          <WaitChildInformation
            {...{
              linkedThread: setThreadHandler,
              nodeName: props.nodeName,
              errorData: errorData,
              wfRunDrawer: props.wfRunId === undefined ? false : true,
              setToggleSideBar: setToggleSideBar,
            }}
          />
        )}
        {type === 'EXTERNAL_EVENT' ? 
        <ExternalEventInformation
          {...{
            isWFRun : true,
            run: current_run,
            data:props.datao.find((d : any) => d.name === props.nodeName),
            wfRunId: props.wfRunId,
            nodeName: props.nodeName,
            errorData: errorData,
            setToggleSideBar: setToggleSideBar,
          }}
        /> : ''}
        {type === 'SLEEP' ? <SleepNodeInformation run={current_run} isWFRun={props.isWFRun} wfRunId={props.wfRunId} data={props.datao.find((d : any) => d.name === props.nodeName)} /> : ''}
        {type === 'USER_TASK' ? <UserTaskNodeInformation run={current_run} isWFRun={props.isWFRun} wfRunId={props.wfRunId} 
          setToggleSideBar={props.setToggleSideBar}
          setCode={props.setCode}
          data={props.datao.find((d : any) => d.name === props.nodeName)}
         /> : ''}
      </>
    </div>
  );
};
