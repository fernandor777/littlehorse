"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[3133],{4467:(e,n,i)=>{i.r(n),i.d(n,{assets:()=>o,contentTitle:()=>d,default:()=>a,frontMatter:()=>r,metadata:()=>t,toc:()=>h});var s=i(4848),c=i(8453);const r={sidebar_label:"Workflows"},d="WfSpec and WfRun",t={id:"concepts/workflows",title:"WfSpec and WfRun",description:"In the LittleHorse API, there are two types of Objects:",source:"@site/docs/04-concepts/01-workflows.md",sourceDirName:"04-concepts",slug:"/concepts/workflows",permalink:"/docs/concepts/workflows",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:1,frontMatter:{sidebar_label:"Workflows"},sidebar:"tutorialSidebar",previous:{title:"Concepts",permalink:"/docs/concepts/"},next:{title:"Nodes",permalink:"/docs/concepts/nodes"}},o={},h=[{value:"<code>WfSpec</code>",id:"wfspec",level:2},{value:"<code>WfSpec</code> Versioning",id:"wfspec-versioning",level:3},{value:"<code>WfRun</code>",id:"wfrun",level:2},{value:"Threading Model",id:"threading-model",level:3},{value:"Lifecycle",id:"lifecycle",level:3},{value:"Interruptibility",id:"interruptibility",level:3}];function l(e){const n={a:"a",code:"code",em:"em",h1:"h1",h2:"h2",h3:"h3",li:"li",p:"p",ul:"ul",...(0,c.R)(),...e.components};return(0,s.jsxs)(s.Fragment,{children:[(0,s.jsxs)(n.h1,{id:"wfspec-and-wfrun",children:[(0,s.jsx)(n.code,{children:"WfSpec"})," and ",(0,s.jsx)(n.code,{children:"WfRun"})]}),"\n",(0,s.jsx)(n.p,{children:"In the LittleHorse API, there are two types of Objects:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:"Metadata objects, which are like blueprints."}),"\n",(0,s.jsx)(n.li,{children:"Execution objects, which are instantiations of Metadata objects."}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["You will find several instances of duality between a Metadata Object and an Execution Object. The ",(0,s.jsx)(n.code,{children:"WfSpec"}),"/",(0,s.jsx)(n.code,{children:"WfRun"})," duality is the first such instance of this duality."]}),"\n",(0,s.jsx)(n.h2,{id:"wfspec",children:(0,s.jsx)(n.code,{children:"WfSpec"})}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"WfSpec"}),", short for Workflow Specification, is a metadata object that LittleHorse uses to define a blueprint for how a business process or technical process works. Essentially, the ",(0,s.jsx)(n.code,{children:"WfSpec"})," contains business logic for a process. You can use the ",(0,s.jsx)(n.code,{children:"RunWf"})," grpc call to instruct the LittleHorse server to run an instance of that ",(0,s.jsx)(n.code,{children:"WfSpec"}),", thus creating a ",(0,s.jsx)(n.code,{children:"WfRun"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"WfSpec"})," consists of one or more ",(0,s.jsx)(n.code,{children:"ThreadSpec"}),"s, which in turn contain a set of ",(0,s.jsx)(n.code,{children:"Node"}),"s and a set of edges between those ",(0,s.jsx)(n.code,{children:"Node"}),"s. A ",(0,s.jsx)(n.code,{children:"Node"}),' defines a unit of work (for example, "execute this computer task" or "wait for this callback to come in from an external system"), and the edges define the control flow in the ',(0,s.jsx)(n.code,{children:"ThreadRun"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["In the programming analogy, you could think of a ",(0,s.jsx)(n.code,{children:"WfSpec"})," as the actual source code for your program."]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"WfSpec"})," has a composite ID of a ",(0,s.jsx)(n.code,{children:"name"})," and an integer ",(0,s.jsx)(n.code,{children:"version"}),"."]}),"\n",(0,s.jsxs)(n.h3,{id:"wfspec-versioning",children:[(0,s.jsx)(n.code,{children:"WfSpec"})," Versioning"]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"WfSpec"})," is a versioned resource. Each ",(0,s.jsx)(n.code,{children:"WfSpec"})," is uniquely identified by its ",(0,s.jsx)(n.code,{children:"name"})," (a String), its ",(0,s.jsx)(n.code,{children:"majorVersion"})," (an auto-incremented number, managed by LittleHorse), and its ",(0,s.jsx)(n.code,{children:"revision"})," (another auto-incremented number)."]}),"\n",(0,s.jsxs)(n.p,{children:["When you create a ",(0,s.jsx)(n.code,{children:"WfSpec"})," with the same ",(0,s.jsx)(n.code,{children:"name"})," as another previous ",(0,s.jsx)(n.code,{children:"WfSpec"}),", LittleHorse will either increment the ",(0,s.jsx)(n.code,{children:"revision"}),' (if there are no "breaking changes") or increment the ',(0,s.jsx)(n.code,{children:"majorVersion"})," and set ",(0,s.jsx)(n.code,{children:"revision"})," to zero (if there ",(0,s.jsx)(n.em,{children:"are"}),' "breaking changes"). A "breaking change" in this regard is defined as changing either:']}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["The set of required input variables to the ",(0,s.jsx)(n.code,{children:"WfSpec"}),", or"]}),"\n",(0,s.jsxs)(n.li,{children:["The set of indexed searchable variables in the ",(0,s.jsx)(n.code,{children:"WfSpec"}),"."]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["When you run a ",(0,s.jsx)(n.code,{children:"WfSpec"})," (thus creating a ",(0,s.jsx)(n.code,{children:"WfRun"}),"), you may optionally specify the version of the ",(0,s.jsx)(n.code,{children:"WfSpec"})," that you wish to run. If you specify a specific version, then LittleHorse will run the ",(0,s.jsx)(n.code,{children:"WfSpec"})," specified by the ",(0,s.jsx)(n.code,{children:"RunWf"})," request. If no version number is provided, then ",(0,s.jsx)(n.code,{children:"LittleHorse"})," will automatically run the latest version of the ",(0,s.jsx)(n.code,{children:"WfSpec"})," with the provided name. For instructions on how this works in practice, please check out our ",(0,s.jsx)(n.a,{href:"/docs/developer-guide/grpc/managing-metadata",children:"Metadata Management docs"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["This versioning scheme allows you to improve the business logic of your ",(0,s.jsx)(n.code,{children:"WfSpec"})," without changing the client code that invokes the ",(0,s.jsx)(n.code,{children:"WfSpec"}),": all your clients need to do is specify the ",(0,s.jsx)(n.code,{children:"name"})," of their ",(0,s.jsx)(n.code,{children:"WfSpec"}),', and the latest logic will be run transparently. Alternatively, you can "pin" your clients to run a specific version of your ',(0,s.jsx)(n.code,{children:"WfSpec"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["Once a ",(0,s.jsx)(n.code,{children:"WfRun"})," is launched with the ",(0,s.jsx)(n.code,{children:"WfSpec"})," specified by (",(0,s.jsx)(n.code,{children:"name"}),' "foo", ',(0,s.jsx)(n.code,{children:"version"})," 123), the ",(0,s.jsx)(n.code,{children:"WfRun"})," will always be associated with that specific version. In other words, deploying a new version of a ",(0,s.jsx)(n.code,{children:"WfSpec"})," does not affect already-running ",(0,s.jsx)(n.code,{children:"WfRun"}),"s."]}),"\n",(0,s.jsx)(n.p,{children:'Future versions of LittleHorse will add an optional "on-the-fly" upgrade mechanism.'}),"\n",(0,s.jsx)(n.h2,{id:"wfrun",children:(0,s.jsx)(n.code,{children:"WfRun"})}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"WfRun"}),", short for Workflow Run, is an instantiation of a ",(0,s.jsx)(n.code,{children:"WfSpec"}),". Each ",(0,s.jsx)(n.code,{children:"WfRun"})," consists of one or more ",(0,s.jsx)(n.code,{children:"ThreadRun"}),"s, which in turn contain multiple ",(0,s.jsx)(n.code,{children:"NodeRun"}),"s."]}),"\n",(0,s.jsxs)(n.p,{children:["In the programming analogy, you could think of a ",(0,s.jsx)(n.code,{children:"WfRun"})," as a process that is running your ",(0,s.jsx)(n.code,{children:"WfSpec"})," program. A ",(0,s.jsx)(n.code,{children:"ThreadRun"})," is a thread in that program."]}),"\n",(0,s.jsxs)(n.p,{children:["Many simple ",(0,s.jsx)(n.code,{children:"WfRun"}),"s will have only one ",(0,s.jsx)(n.code,{children:"ThreadRun"}),': the "entrypoint" thread. However, just as regular programs can spawn child threads to execute work in parallel, a LittleHorse ',(0,s.jsx)(n.code,{children:"WfRun"})," might spawn child ",(0,s.jsx)(n.code,{children:"ThreadRun"}),"s."]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"WfRun"}),"'s ID is simply a string."]}),"\n",(0,s.jsx)(n.h3,{id:"threading-model",children:"Threading Model"}),"\n",(0,s.jsxs)(n.p,{children:["In LittleHorse, a ",(0,s.jsx)(n.code,{children:"ThreadSpec"})," is a sub-structure of a ",(0,s.jsx)(n.code,{children:"WfSpec"})," that defines one sequential thread of execution. A ",(0,s.jsx)(n.code,{children:"ThreadRun"})," is a run of a ",(0,s.jsx)(n.code,{children:"ThreadSpec"}),", and it is a sub-structure of a ",(0,s.jsx)(n.code,{children:"WfRun"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:[(0,s.jsx)(n.code,{children:"WfSpec"}),"s and ",(0,s.jsx)(n.code,{children:"WfRun"}),"s are API Objects, meaning that they have ID's and can be directly retrieved from the LittleHorse API. In contrast, ",(0,s.jsx)(n.code,{children:"ThreadSpec"}),"s and ",(0,s.jsx)(n.code,{children:"ThreadRun"}),"s are NOT API objects; rather, they are sub-structures that can be retrieved from the API by querying their parents."]}),"\n",(0,s.jsxs)(n.p,{children:[(0,s.jsx)(n.code,{children:"ThreadSpec"}),"s and ",(0,s.jsx)(n.code,{children:"ThreadRun"}),"s exhibit the same Metadata/Execution duality seen with ",(0,s.jsx)(n.code,{children:"WfSpec"}),"s and ",(0,s.jsx)(n.code,{children:"WfRun"}),"s."]}),"\n",(0,s.jsxs)(n.p,{children:["Every ",(0,s.jsx)(n.code,{children:"WfSpec"})," has one special ",(0,s.jsx)(n.code,{children:"ThreadSpec"})," called the Entrypoint ",(0,s.jsx)(n.code,{children:"ThreadSpec"}),". When a ",(0,s.jsx)(n.code,{children:"WfSpec"})," is run (thus creating a ",(0,s.jsx)(n.code,{children:"WfRun"}),"), the first thing that starts is a ",(0,s.jsx)(n.code,{children:"ThreadRun"})," specified by the Entrypoint ",(0,s.jsx)(n.code,{children:"ThreadSpec"}),". You can think of the Entrypoint ",(0,s.jsx)(n.code,{children:"ThreadSpec"})," as the ",(0,s.jsx)(n.code,{children:"main()"})," function in a generic programming language."]}),"\n",(0,s.jsxs)(n.p,{children:["And just like a thread in a normal program, a ",(0,s.jsx)(n.code,{children:"ThreadRun"})," in LittleHorse can spawn child ",(0,s.jsx)(n.code,{children:"ThreadRun"}),"s."]}),"\n",(0,s.jsx)(n.h3,{id:"lifecycle",children:"Lifecycle"}),"\n",(0,s.jsxs)(n.p,{children:["The status of a ",(0,s.jsx)(n.code,{children:"WfRun"})," is determined by looking at the status of the Entrypoint ",(0,s.jsx)(n.code,{children:"ThreadRun"}),". A ",(0,s.jsx)(n.code,{children:"ThreadRun"}),", and by extension a ",(0,s.jsx)(n.code,{children:"WfRun"}),", can have one of the following statuses;"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"RUNNING"})}),"\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"HALTING"})}),"\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"HALTED"})}),"\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"ERROR"})}),"\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"COMPLETED"})}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"ThreadRun"})," can be halted for any of the following reasons:"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["If a ",(0,s.jsx)(n.code,{children:"StopWfRun"})," request is received (manual halt by system administrator)."]}),"\n",(0,s.jsxs)(n.li,{children:["When interrupted by an ",(0,s.jsx)(n.code,{children:"ExternalEvent"})," which triggers an Interrupt Handler."]}),"\n",(0,s.jsxs)(n.li,{children:["If the ",(0,s.jsx)(n.code,{children:"ThreadRun"})," is a child thread, and the parent ",(0,s.jsx)(n.code,{children:"ThreadRun"})," is ",(0,s.jsx)(n.code,{children:"HALTED"}),"."]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["Note that halting a parent ",(0,s.jsx)(n.code,{children:"ThreadRun"})," causes all of the children of that ",(0,s.jsx)(n.code,{children:"ThreadRun"})," to be halted as well."]}),"\n",(0,s.jsx)(n.h3,{id:"interruptibility",children:"Interruptibility"}),"\n",(0,s.jsxs)(n.p,{children:["When a ",(0,s.jsx)(n.code,{children:"ThreadRun"})," is halted (for example, via the ",(0,s.jsx)(n.code,{children:"StopWfRun"})," grpc or when Interrupted), it moves to either the ",(0,s.jsx)(n.code,{children:"HALTING"})," or ",(0,s.jsx)(n.code,{children:"HALTED"})," state. If the ",(0,s.jsx)(n.code,{children:"ThreadRun"})," is interruptible, it moves immediately to the ",(0,s.jsx)(n.code,{children:"HALTED"})," state. Otherwise, it moves to the ",(0,s.jsx)(n.code,{children:"HALTED"})," state as soon as it is interruptible."]}),"\n",(0,s.jsx)(n.p,{children:"The criteria for interruptibility are as follows:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["If the ",(0,s.jsx)(n.code,{children:"ThreadRun"})," has any child threads, all children must be in the ",(0,s.jsx)(n.code,{children:"COMPLETED"}),", ",(0,s.jsx)(n.code,{children:"ERROR"}),", or ",(0,s.jsx)(n.code,{children:"HALTED"})," state.","\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:"If this condition is not satisfied, then the runtime will halt all Children."}),"\n"]}),"\n"]}),"\n",(0,s.jsxs)(n.li,{children:["There can be no ",(0,s.jsx)(n.code,{children:"TaskRun"}),"s that have been dispatched to a Task Worker but not completed, failed, or timed out. In other words, no in-flight tasks."]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["If a ",(0,s.jsx)(n.code,{children:"WfRun"})," is waiting at an ",(0,s.jsx)(n.code,{children:"EXTERNAL_EVENT"}),", ",(0,s.jsx)(n.code,{children:"USER_TASK"}),", or ",(0,s.jsx)(n.code,{children:"SLEEP"})," Node, the second condition is automatically satisfied."]})]})}function a(e={}){const{wrapper:n}={...(0,c.R)(),...e.components};return n?(0,s.jsx)(n,{...e,children:(0,s.jsx)(l,{...e})}):l(e)}},8453:(e,n,i)=>{i.d(n,{R:()=>d,x:()=>t});var s=i(6540);const c={},r=s.createContext(c);function d(e){const n=s.useContext(r);return s.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function t(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(c):e.components||c:d(e.components),s.createElement(r.Provider,{value:n},e.children)}}}]);