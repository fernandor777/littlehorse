"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[3983],{9164:(e,n,r)=>{r.r(n),r.d(n,{assets:()=>h,contentTitle:()=>s,default:()=>p,frontMatter:()=>i,metadata:()=>d,toc:()=>c});var a=r(4848),t=r(8453),l=r(1470),o=r(9365);const i={},s="Exception Handling",d={id:"developer-guide/wfspec-development/exception-handling",title:"Exception Handling",description:"In LittleHorse, a Failure is analogous to an Exception in Programming.",source:"@site/docs/05-developer-guide/08-wfspec-development/06-exception-handling.md",sourceDirName:"05-developer-guide/08-wfspec-development",slug:"/developer-guide/wfspec-development/exception-handling",permalink:"/docs/developer-guide/wfspec-development/exception-handling",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:6,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Interrupts",permalink:"/docs/developer-guide/wfspec-development/interrupts"},next:{title:"Child Threads",permalink:"/docs/developer-guide/wfspec-development/child-threads"}},h={},c=[{value:"Handling a Failure.",id:"handling-a-failure",level:2},{value:"Throwing an <code>EXCEPTION</code>",id:"throwing-an-exception",level:3},{value:"Handling Exceptions",id:"handling-exceptions",level:3},{value:"Handling Errors",id:"handling-errors",level:3}];function u(e){const n={a:"a",admonition:"admonition",code:"code",em:"em",h1:"h1",h2:"h2",h3:"h3",li:"li",ol:"ol",p:"p",pre:"pre",ul:"ul",...(0,t.R)(),...e.components};return(0,a.jsxs)(a.Fragment,{children:[(0,a.jsx)(n.h1,{id:"exception-handling",children:"Exception Handling"}),"\n",(0,a.jsxs)(n.p,{children:["In LittleHorse, a ",(0,a.jsx)(n.code,{children:"Failure"})," is analogous to an ",(0,a.jsx)(n.code,{children:"Exception"})," in Programming."]}),"\n",(0,a.jsx)(n.h2,{id:"handling-a-failure",children:"Handling a Failure."}),"\n",(0,a.jsx)(n.p,{children:"In LittleHorse, there are two different types of Failures:"}),"\n",(0,a.jsxs)(n.ul,{children:["\n",(0,a.jsxs)(n.li,{children:[(0,a.jsx)(n.code,{children:"EXCEPTION"}),", which denotes something that went wrong at the business-process level (eg. an executive rejected a transaction)."]}),"\n",(0,a.jsxs)(n.li,{children:[(0,a.jsx)(n.code,{children:"ERROR"}),", which denotes a technical failure, such as a third-party API being unavailable due to a network partition."]}),"\n"]}),"\n",(0,a.jsxs)(n.p,{children:["The ",(0,a.jsx)(n.code,{children:"WorkflowThread"})," has three methods to allow you to handle various types of Failures:"]}),"\n",(0,a.jsxs)(n.ol,{children:["\n",(0,a.jsxs)(n.li,{children:[(0,a.jsx)(n.code,{children:"handleException()"}),", which handles ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," business failures."]}),"\n",(0,a.jsxs)(n.li,{children:[(0,a.jsx)(n.code,{children:"handleError()"}),", which handles ",(0,a.jsx)(n.code,{children:"ERROR"})," technical failures."]}),"\n",(0,a.jsxs)(n.li,{children:[(0,a.jsx)(n.code,{children:"handleAnyFailure()"}),", which catches any failure of any type."]}),"\n"]}),"\n",(0,a.jsxs)(n.p,{children:["All three methods require a ",(0,a.jsx)(n.code,{children:"NodeOutput"})," for the ",(0,a.jsx)(n.code,{children:"Node"})," on which to add the ",(0,a.jsx)(n.code,{children:"failureHandler"})," (see the ",(0,a.jsx)(n.a,{href:"/docs/concepts/exception-handling",children:"Concept Docs"}),"). Additionally, all three methods require a ",(0,a.jsx)(n.code,{children:"ThreadFunc"})," which defines the logic for the Failure Handler (either a lambda or a function pointer)."]}),"\n",(0,a.jsxs)(n.p,{children:["The syntax to handle a ",(0,a.jsx)(n.code,{children:"Failure"})," is similar no matter which type of ",(0,a.jsx)(n.code,{children:"Node"})," you are handling a failure for."]}),"\n",(0,a.jsxs)(n.h3,{id:"throwing-an-exception",children:["Throwing an ",(0,a.jsx)(n.code,{children:"EXCEPTION"})]}),"\n",(0,a.jsx)(n.admonition,{type:"info",children:(0,a.jsxs)(n.p,{children:["This section is concerned with throwing an ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," at the ",(0,a.jsx)(n.code,{children:"ThreadSpec"})," level inside a ",(0,a.jsx)(n.code,{children:"WfSpec"}),". If you want to throw an ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," at the Task Worker level, please refer to the ",(0,a.jsx)(n.a,{href:"/docs/developer-guide/task-worker-development#throwing-workflow-exceptions",children:"Task Worker Development Docs"})]})}),"\n",(0,a.jsxs)(n.p,{children:["In programming languages such as Java and Python (please, let's not mention Go...I have opinions about Go but it's best I don't discuss it), you can ",(0,a.jsx)(n.code,{children:"throw"})," or ",(0,a.jsx)(n.code,{children:"raise"})," an ",(0,a.jsx)(n.code,{children:"Exception"}),". For example:"]}),"\n",(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-python",children:'class MyError(Exception):\n    def __init__(self, foo: str):\n        self._foo = foo\n\nif something_bad_happens():\n   raise MyError("bar")\n\ndo_something_else()\n'})}),"\n",(0,a.jsxs)(n.p,{children:["Raising a ",(0,a.jsx)(n.code,{children:"MyError"})," here interrupts the flow of the program and prevents ",(0,a.jsx)(n.code,{children:"do_something_else()"})," from being called. Similarly, throwing an ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," in LittleHorse can stop the flow of the ",(0,a.jsx)(n.code,{children:"ThreadRun"}),"."]}),"\n",(0,a.jsx)(n.admonition,{type:"info",children:(0,a.jsxs)(n.p,{children:["Even though GoLang itself highly stupidly doesn't allow you to interrupt program execution with exceptions, you can still use the Go SDK to define a ",(0,a.jsx)(n.code,{children:"WfSpec"})," that throws a LittleHorse ",(0,a.jsx)(n.code,{children:"EXCEPTION"}),"."]})}),"\n",(0,a.jsxs)(n.p,{children:["Let's throw an ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," with the name ",(0,a.jsx)(n.code,{children:"payment-failed"}),". To do this, we will need the ",(0,a.jsx)(n.code,{children:"WorkflowThread#fail()"})," method, which takes two arguments:"]}),"\n",(0,a.jsxs)(n.ol,{children:["\n",(0,a.jsx)(n.li,{children:"The name of the exception to throw."}),"\n",(0,a.jsxs)(n.li,{children:["A human readable error message which will show up on the ",(0,a.jsx)(n.code,{children:"WfRun"}),"."]}),"\n"]}),"\n",(0,a.jsxs)(n.p,{children:["Note that you can optionally specify a third argument, which is either a ",(0,a.jsx)(n.code,{children:"WfRunVariable"})," or some literal value that represents the ",(0,a.jsx)(n.em,{children:"content"})," of the Exception we throw. In future versions of LittleHorse, you will be able to access this value as an input variable in the Exception Handler ",(0,a.jsx)(n.code,{children:"ThreadRun"}),"."]}),"\n",(0,a.jsxs)(l.A,{children:[(0,a.jsx)(o.A,{value:"java",label:"Java",default:!0,children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-java",children:'// Throw a normal exception\nwf.fail("payment-failed", "This is a human readable error message for developers");\n\n// Throw an exception with content\nWfRunVariable exnContent = ...;\nwf.fail("payment-failed", "This is a human readable error message for developers", exnContent);\n'})})}),(0,a.jsx)(o.A,{value:"go",label:"Go",children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-go",children:'wf.Fail(nil, "payment-failed", "This is a human readable error message for developers")\n\n// Fail with output.\nvar exnContent *model.WfRunVariable\n// ...\nwf.Fail(exnContent, "payment-failed", "This is a human readable error message for developers")\n'})})}),(0,a.jsx)(o.A,{value:"python",label:"Python",default:!0,children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-python",children:'wf.fail("payment-failed", "This is a human readable error message for developers")\n'})})})]}),"\n",(0,a.jsx)(n.admonition,{type:"tip",children:(0,a.jsxs)(n.p,{children:["Like many things in LittleHorse, a user-defined ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," must be in ",(0,a.jsx)(n.code,{children:"sub-domain-case"}),". For those of you who love Kubernetes, this is the same regex used by K8s resource names."]})}),"\n",(0,a.jsx)(n.h3,{id:"handling-exceptions",children:"Handling Exceptions"}),"\n",(0,a.jsxs)(n.p,{children:["Let's handle a business failure with the ",(0,a.jsx)(n.code,{children:"WorkflowThread#handleException"})," method. You need to provide:"]}),"\n",(0,a.jsxs)(n.ol,{children:["\n",(0,a.jsxs)(n.li,{children:["The ",(0,a.jsx)(n.code,{children:"NodeOutput"})," to handle the failure on."]}),"\n",(0,a.jsxs)(n.li,{children:["A ",(0,a.jsx)(n.code,{children:"ThreadFunc"})," (function pointer or lambda) to execute as the exception handler."]}),"\n"]}),"\n",(0,a.jsxs)(n.p,{children:["You can optionally provide the name of a specific ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," to handle. If that is not provided, it will handle any business ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," (but not a technical failure)."]}),"\n",(0,a.jsxs)(n.p,{children:["In this example, we will handle an ",(0,a.jsx)(n.code,{children:"EXCEPTION"})," thrown by a Child ",(0,a.jsx)(n.code,{children:"ThreadRun"}),". We catch the exception from the ",(0,a.jsx)(n.code,{children:"waitForTheads()"})," call."]}),"\n",(0,a.jsx)(n.admonition,{type:"tip",children:(0,a.jsxs)(n.p,{children:["You'll notice that we have two Failure Handlers defined in the example below. The way this behaves in practice is that the ",(0,a.jsx)(n.em,{children:"first matching handler"})," is executed. This is useful to allow you to handle different business exceptions with different exception handlers."]})}),"\n",(0,a.jsxs)(l.A,{children:[(0,a.jsx)(o.A,{value:"java",label:"Java",default:!0,children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-java",children:'// ...\nNodeOutput threadsResult = thread.waitForThreads(...);\n\nthread.handleException(\n    threadsResult,\n    "my-exn", // handle only \'my-exn\'\n    handler -> {\n        handler.execute("some-failure-handler-for-my-exn");\n    }\n);\n\nthread.handleException(\n    threadsResult,\n    null, // handle any business exception\n    handler -> {\n        handler.execute("some-other-task-in-failure-handler");\n    }\n);\n\n// We get here unless the Failure Handler fails.\nthread.execute("another-task");\n'})})}),(0,a.jsx)(o.A,{value:"go",label:"Go",children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-go",children:'threadsResult := thread.WaitForThreads(...)\n\nexnName := "my-exn"\nthread.HandleException(\n    &threadsResult,\n    &exnName, // handle specific exception\n    func(handler *wflib.WorkflowThread) {\n        handler.Execute("some-task-in-my-exn-handler")\n    },\n)\n\nthread.HandleException(\n    &taskOutput,\n    &nil, // handle any exception\n    func(handler *wflib.WorkflowThread) {\n        handler.Execute("some-other-task-in-failure-handler")\n    },\n)\n\n// We will always get here unless the Failure Handler fails.\nthread.Execute("another-task");\n'})})}),(0,a.jsx)(o.A,{value:"python",label:"Python",children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-python",children:'def entrypoint(wf: WorkflowThread) -> None:\n    def my_exn_handler(handler: WorkflowThread) -> None:\n        handler.execute("some-task-in-my-exn-handler")\n\n    def any_exn_handler(handler: WorkflowThread) -> None:\n        handler.execute("some-other-task-in-failure-handler")\n\n    threads_result = wf.wait_for_threads(...)\n    wf.handle_exception(output, my_exn_handler, exn_name="my-exn")\n    wf.handle_exception(output, any_exn_handler, exn_name=None)\n\n    # We will always get here unless the Failure Handler fails.\n    wf.execute("another-task")\n'})})})]}),"\n",(0,a.jsx)(n.h3,{id:"handling-errors",children:"Handling Errors"}),"\n",(0,a.jsxs)(n.p,{children:["Let's handle a technical failure with the ",(0,a.jsx)(n.code,{children:"WorkflowThread#handleError"})," method. Just as with ",(0,a.jsx)(n.code,{children:"handleException()"}),", you need to provide:"]}),"\n",(0,a.jsxs)(n.ol,{children:["\n",(0,a.jsxs)(n.li,{children:["The ",(0,a.jsx)(n.code,{children:"NodeOutput"})," to handle the failure on."]}),"\n",(0,a.jsxs)(n.li,{children:["A ",(0,a.jsx)(n.code,{children:"ThreadFunc"})," (function pointer or lambda) to execute as the exception handler."]}),"\n"]}),"\n",(0,a.jsxs)(n.p,{children:["You can optionally provide the name of a specific ",(0,a.jsx)(n.code,{children:"ERROR"})," to handle. If that is not provided, it will handle any technical ",(0,a.jsx)(n.code,{children:"ERROR"})," (but not a business ",(0,a.jsx)(n.code,{children:"EXCEPTION"}),")."]}),"\n",(0,a.jsxs)(n.p,{children:["In this example, we will handle a ",(0,a.jsx)(n.code,{children:"TIMEOUT"})," error from a ",(0,a.jsx)(n.code,{children:"TaskRun"}),"."]}),"\n",(0,a.jsxs)(l.A,{children:[(0,a.jsx)(o.A,{value:"java",label:"Java",default:!0,children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-java",children:'NodeOutput taskOutput = thread.execute("flaky-task");\n\nthread.handleError(\n    taskOutput,\n    "TIMEOUT", // handle only TIMEOUT errors. Leave null to catch any ERROR.\n    handler -> {\n        handler.execute("some-task");\n    }\n);\n\n'})})}),(0,a.jsx)(o.A,{value:"go",label:"Go",children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-go",children:'threadsResult := thread.WaitForThreads(...)\n\nerrorName := "TIMEOUT"\nthread.HandleError(\n    &threadsResult,\n    &errorName, // handle only TIMEOUT error. Leave nil to catch all ERROR.\n    func(handler *wflib.WorkflowThread) {\n        handler.Execute("some-task-in-my-exn-handler")\n    },\n)\n'})})}),(0,a.jsx)(o.A,{value:"python",label:"Python",children:(0,a.jsx)(n.pre,{children:(0,a.jsx)(n.code,{className:"language-python",children:'def entrypoint(wf: WorkflowThread) -> None:\n    def error_handler(handler: WorkflowThread) -> None:\n        handler.execute("some-task")\n\n    task_output = wf.wait_for_threads(...)\n    wf.handle_error(task_output, error_handler, error_type=LHErrorType.TIMEOUT)\n'})})})]})]})}function p(e={}){const{wrapper:n}={...(0,t.R)(),...e.components};return n?(0,a.jsx)(n,{...e,children:(0,a.jsx)(u,{...e})}):u(e)}},9365:(e,n,r)=>{r.d(n,{A:()=>o});r(6540);var a=r(8215);const t={tabItem:"tabItem_Ymn6"};var l=r(4848);function o(e){let{children:n,hidden:r,className:o}=e;return(0,l.jsx)("div",{role:"tabpanel",className:(0,a.A)(t.tabItem,o),hidden:r,children:n})}},1470:(e,n,r)=>{r.d(n,{A:()=>y});var a=r(6540),t=r(8215),l=r(3104),o=r(6347),i=r(205),s=r(7485),d=r(1682),h=r(9466);function c(e){return a.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,a.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function u(e){const{values:n,children:r}=e;return(0,a.useMemo)((()=>{const e=n??function(e){return c(e).map((e=>{let{props:{value:n,label:r,attributes:a,default:t}}=e;return{value:n,label:r,attributes:a,default:t}}))}(r);return function(e){const n=(0,d.X)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,r])}function p(e){let{value:n,tabValues:r}=e;return r.some((e=>e.value===n))}function x(e){let{queryString:n=!1,groupId:r}=e;const t=(0,o.W6)(),l=function(e){let{queryString:n=!1,groupId:r}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!r)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return r??null}({queryString:n,groupId:r});return[(0,s.aZ)(l),(0,a.useCallback)((e=>{if(!l)return;const n=new URLSearchParams(t.location.search);n.set(l,e),t.replace({...t.location,search:n.toString()})}),[l,t])]}function f(e){const{defaultValue:n,queryString:r=!1,groupId:t}=e,l=u(e),[o,s]=(0,a.useState)((()=>function(e){let{defaultValue:n,tabValues:r}=e;if(0===r.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!p({value:n,tabValues:r}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${r.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const a=r.find((e=>e.default))??r[0];if(!a)throw new Error("Unexpected error: 0 tabValues");return a.value}({defaultValue:n,tabValues:l}))),[d,c]=x({queryString:r,groupId:t}),[f,m]=function(e){let{groupId:n}=e;const r=function(e){return e?`docusaurus.tab.${e}`:null}(n),[t,l]=(0,h.Dv)(r);return[t,(0,a.useCallback)((e=>{r&&l.set(e)}),[r,l])]}({groupId:t}),j=(()=>{const e=d??f;return p({value:e,tabValues:l})?e:null})();(0,i.A)((()=>{j&&s(j)}),[j]);return{selectedValue:o,selectValue:(0,a.useCallback)((e=>{if(!p({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);s(e),c(e),m(e)}),[c,m,l]),tabValues:l}}var m=r(2303);const j={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var g=r(4848);function w(e){let{className:n,block:r,selectedValue:a,selectValue:o,tabValues:i}=e;const s=[],{blockElementScrollPositionUntilNextRender:d}=(0,l.a_)(),h=e=>{const n=e.currentTarget,r=s.indexOf(n),t=i[r].value;t!==a&&(d(n),o(t))},c=e=>{let n=null;switch(e.key){case"Enter":h(e);break;case"ArrowRight":{const r=s.indexOf(e.currentTarget)+1;n=s[r]??s[0];break}case"ArrowLeft":{const r=s.indexOf(e.currentTarget)-1;n=s[r]??s[s.length-1];break}}n?.focus()};return(0,g.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,t.A)("tabs",{"tabs--block":r},n),children:i.map((e=>{let{value:n,label:r,attributes:l}=e;return(0,g.jsx)("li",{role:"tab",tabIndex:a===n?0:-1,"aria-selected":a===n,ref:e=>s.push(e),onKeyDown:c,onClick:h,...l,className:(0,t.A)("tabs__item",j.tabItem,l?.className,{"tabs__item--active":a===n}),children:r??n},n)}))})}function v(e){let{lazy:n,children:r,selectedValue:t}=e;const l=(Array.isArray(r)?r:[r]).filter(Boolean);if(n){const e=l.find((e=>e.props.value===t));return e?(0,a.cloneElement)(e,{className:"margin-top--md"}):null}return(0,g.jsx)("div",{className:"margin-top--md",children:l.map(((e,n)=>(0,a.cloneElement)(e,{key:n,hidden:e.props.value!==t})))})}function b(e){const n=f(e);return(0,g.jsxs)("div",{className:(0,t.A)("tabs-container",j.tabList),children:[(0,g.jsx)(w,{...n,...e}),(0,g.jsx)(v,{...n,...e})]})}function y(e){const n=(0,m.A)();return(0,g.jsx)(b,{...e,children:c(e.children)},String(n))}},8453:(e,n,r)=>{r.d(n,{R:()=>o,x:()=>i});var a=r(6540);const t={},l=a.createContext(t);function o(e){const n=a.useContext(l);return a.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function i(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(t):e.components||t:o(e.components),a.createElement(l.Provider,{value:n},e.children)}}}]);