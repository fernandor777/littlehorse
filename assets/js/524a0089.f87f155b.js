"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[4982],{2885:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>d,contentTitle:()=>i,default:()=>h,frontMatter:()=>o,metadata:()=>c,toc:()=>a});var s=t(4848),r=t(8453);const o={sidebar_label:"External Events"},i="ExternalEventDef and ExternalEvent",c={id:"concepts/external-events",title:"ExternalEventDef and ExternalEvent",description:"In LittleHorse, an ExternalEventDef is a Metadata Object that defines some event or activity occuring outside of the LittleHorse WfRun. An ExternalEvent is an Execution Object that represents the occurrence of such an event. Common use-cases for an External Event would be encapsulating a webhook from github when a new branch is pushed, or representing an event from DocuSign that is fired when a document is completed.",source:"@site/docs/04-concepts/04-external-events.md",sourceDirName:"04-concepts",slug:"/concepts/external-events",permalink:"/docs/concepts/external-events",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:4,frontMatter:{sidebar_label:"External Events"},sidebar:"tutorialSidebar",previous:{title:"Tasks",permalink:"/docs/concepts/tasks"},next:{title:"User Tasks",permalink:"/docs/concepts/user-tasks"}},d={},a=[{value:"Motivation",id:"motivation",level:2},{value:"<code>ExternalEvent</code> Structure",id:"externalevent-structure",level:2},{value:"<code>ExternalEventDef</code> Structure",id:"externaleventdef-structure",level:2},{value:"<code>ExternalEvent</code> Nodes",id:"externalevent-nodes",level:2}];function l(e){const n={a:"a",admonition:"admonition",code:"code",em:"em",h1:"h1",h2:"h2",li:"li",p:"p",ul:"ul",...(0,r.R)(),...e.components};return(0,s.jsxs)(s.Fragment,{children:[(0,s.jsxs)(n.h1,{id:"externaleventdef-and-externalevent",children:[(0,s.jsx)(n.code,{children:"ExternalEventDef"})," and ",(0,s.jsx)(n.code,{children:"ExternalEvent"})]}),"\n",(0,s.jsxs)(n.p,{children:["In LittleHorse, an ",(0,s.jsx)(n.code,{children:"ExternalEventDef"})," is a Metadata Object that defines some event or activity occuring outside of the LittleHorse ",(0,s.jsx)(n.code,{children:"WfRun"}),". An ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," is an Execution Object that represents the occurrence of such an event. Common use-cases for an External Event would be encapsulating a webhook from github when a new branch is pushed, or representing an event from DocuSign that is fired when a document is completed."]}),"\n",(0,s.jsxs)(n.p,{children:["An External Event can be recorded through the ",(0,s.jsx)(n.code,{children:"PutExternalEvent"})," gRPC call. This can be accomplished using clients in any of our SDK's or through the use of ",(0,s.jsx)(n.code,{children:"lhctl"}),". Future versions of LittleHorse will allow you to directly hook up a webhook or event streaming system (eg Kafka) to LittleHorse and send events in a hands-off manner."]}),"\n",(0,s.jsx)(n.h2,{id:"motivation",children:"Motivation"}),"\n",(0,s.jsxs)(n.p,{children:["Workflow engines aim to help automate business processes. Oftentimes, such business processes involve interacting with the outside world and ",(0,s.jsx)(n.em,{children:"listening"})," for things to happen outside of the workflow engine before making a decision about what to do next. That is precisely what an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," is for: while a ",(0,s.jsx)(n.code,{children:"TaskRun"})," allows a ",(0,s.jsx)(n.code,{children:"WfRun"})," to change the outside world, an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," allows a ",(0,s.jsx)(n.code,{children:"WfRun"})," to react to the outside world. Some common use-cases are to:"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:"Integrate with asynchronous third-party API's."}),"\n",(0,s.jsxs)(n.li,{children:["Trigger ",(0,s.jsx)(n.a,{href:"/docs/concepts/interrupts",children:"Interrupts"}),"."]}),"\n",(0,s.jsx)(n.li,{children:"Wait for a person to sign a document in DocuSign."}),"\n",(0,s.jsx)(n.li,{children:"Wait for a customer to respond to a text message using a callback from the Twilio API."}),"\n"]}),"\n",(0,s.jsxs)(n.h2,{id:"externalevent-structure",children:[(0,s.jsx)(n.code,{children:"ExternalEvent"})," Structure"]}),"\n",(0,s.jsxs)(n.p,{children:["An ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," has a composite ID consisting of:"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["The ",(0,s.jsx)(n.code,{children:"wfRunId"})," of the associated ",(0,s.jsx)(n.code,{children:"WfRun"})]}),"\n",(0,s.jsxs)(n.li,{children:["The ",(0,s.jsx)(n.code,{children:"name"})," of the ",(0,s.jsx)(n.code,{children:"ExternalEventDef"})]}),"\n",(0,s.jsxs)(n.li,{children:["A ",(0,s.jsx)(n.code,{children:"guid"})," which is unique to the"]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["Why the ",(0,s.jsx)(n.code,{children:"wfRunId"}),"? An ",(0,s.jsx)(n.code,{children:"ExternalEven"})," is intended to affect the behavior of a ",(0,s.jsx)(n.code,{children:"WfRun"}),"; therefore, an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," must be correlated to a specific ",(0,s.jsx)(n.code,{children:"WfRun"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:[(0,s.jsx)(n.code,{children:"ExternalEvent"}),"s have a payload which is simply a ",(0,s.jsx)(n.code,{children:"VariableValue"}),"."]}),"\n",(0,s.jsxs)(n.h2,{id:"externaleventdef-structure",children:[(0,s.jsx)(n.code,{children:"ExternalEventDef"})," Structure"]}),"\n",(0,s.jsxs)(n.p,{children:["There is an ",(0,s.jsx)(n.code,{children:"ExternalEventDef"})," API Resource. The relationship between an ",(0,s.jsx)(n.code,{children:"ExternalEventDef"})," and an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," is the same as the relationship between a ",(0,s.jsx)(n.code,{children:"WfSpec"})," and a ",(0,s.jsx)(n.code,{children:"WfRun"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["Currently, the only field in an ",(0,s.jsx)(n.code,{children:"ExternalEventDef"})," is the name of the event type. The event name is used to isolate events of different types, for example ",(0,s.jsx)(n.code,{children:'"document-signed"'})," and ",(0,s.jsx)(n.code,{children:'"document-rejected"'})," events."]}),"\n",(0,s.jsxs)(n.p,{children:["In future versions of LittleHorse, the ",(0,s.jsx)(n.code,{children:"ExternalEventDef"})," will have more information:"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["An optional schema for the data type to enable type checking in the ",(0,s.jsx)(n.code,{children:"WfSpec"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Information on how to correlate an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," to a ",(0,s.jsx)(n.code,{children:"WfRun"})," without explicitly setting the ",(0,s.jsx)(n.code,{children:"wfRunId"}),"."]}),"\n"]}),"\n",(0,s.jsxs)(n.h2,{id:"externalevent-nodes",children:[(0,s.jsx)(n.code,{children:"ExternalEvent"})," Nodes"]}),"\n",(0,s.jsxs)(n.p,{children:["One use for an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," is the ",(0,s.jsx)(n.code,{children:"EXTERNAL_EVENT"})," Node Type. When a ",(0,s.jsx)(n.code,{children:"ThreadRun"})," reaches an ",(0,s.jsx)(n.code,{children:"EXTERNAL_EVENT"})," node, it will halt until an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," of the specified type (and with the correct ",(0,s.jsx)(n.code,{children:"wfRunId"}),") arrives. The output of the ",(0,s.jsx)(n.code,{children:"NodeRun"})," is simply the payload of the ",(0,s.jsx)(n.code,{children:"ExternalEvent"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["An ",(0,s.jsx)(n.code,{children:"EXTERNAL_EVENT"})," node can have a timeout configured; this means that if the ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," does arrive within X seconds after the ",(0,s.jsx)(n.code,{children:"ThreadRun"})," arrives at the node, then the NodeRun will fail with a ",(0,s.jsx)(n.code,{children:"TIMEOUT"})," exception."]}),"\n",(0,s.jsxs)(n.p,{children:["If the ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," arrives before the ",(0,s.jsx)(n.code,{children:"ThreadRun"})," reaches the ",(0,s.jsx)(n.code,{children:"EXTERNAL_EVENT"})," Node, that's ok! The ",(0,s.jsx)(n.code,{children:"ThreadRun"})," will immediately pick up the ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," and move on to the next ",(0,s.jsx)(n.code,{children:"Node"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["An ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," gets correlated to one and only one ",(0,s.jsx)(n.code,{children:"NodeRun"}),". When posting an event, you can optionally specify a ",(0,s.jsx)(n.code,{children:"threadRunNumber"})," to ensure that the ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," can only be assigned to a ",(0,s.jsx)(n.code,{children:"NodeRun"})," on that specific ",(0,s.jsx)(n.code,{children:"ThreadRun"}),"."]}),"\n",(0,s.jsx)(n.admonition,{type:"info",children:(0,s.jsxs)(n.p,{children:["An ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," can also be used to trigger an Interrupt in LittleHorse. For more information, see the ",(0,s.jsx)(n.a,{href:"/docs/concepts/interrupts",children:"Interrupt documentation"}),"."]})}),"\n",(0,s.jsx)(n.admonition,{type:"note",children:(0,s.jsxs)(n.p,{children:["If you configure an ",(0,s.jsx)(n.code,{children:"EXTERNAL_EVENT"})," node with the ExternalEventDef ",(0,s.jsx)(n.code,{children:"foo"}),", you cannot use the ",(0,s.jsx)(n.code,{children:"foo"})," external event def as an Interrupt Trigger elsewhere in the same ",(0,s.jsx)(n.code,{children:"WfSpec"}),"."]})})]})}function h(e={}){const{wrapper:n}={...(0,r.R)(),...e.components};return n?(0,s.jsx)(n,{...e,children:(0,s.jsx)(l,{...e})}):l(e)}},8453:(e,n,t)=>{t.d(n,{R:()=>i,x:()=>c});var s=t(6540);const r={},o=s.createContext(r);function i(e){const n=s.useContext(o);return s.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function c(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(r):e.components||r:i(e.components),s.createElement(o.Provider,{value:n},e.children)}}}]);