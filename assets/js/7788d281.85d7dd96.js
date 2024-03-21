"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[9475],{3905:(e,t,n)=>{n.d(t,{Zo:()=>s,kt:()=>m});var a=n(7294);function r(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function i(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,a)}return n}function o(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?i(Object(n),!0).forEach((function(t){r(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):i(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function l(e,t){if(null==e)return{};var n,a,r=function(e,t){if(null==e)return{};var n,a,r={},i=Object.keys(e);for(a=0;a<i.length;a++)n=i[a],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,t);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(e);for(a=0;a<i.length;a++)n=i[a],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(r[n]=e[n])}return r}var p=a.createContext({}),d=function(e){var t=a.useContext(p),n=t;return e&&(n="function"==typeof e?e(t):o(o({},t),e)),n},s=function(e){var t=d(e.components);return a.createElement(p.Provider,{value:t},e.children)},h="mdxType",c={inlineCode:"code",wrapper:function(e){var t=e.children;return a.createElement(a.Fragment,{},t)}},u=a.forwardRef((function(e,t){var n=e.components,r=e.mdxType,i=e.originalType,p=e.parentName,s=l(e,["components","mdxType","originalType","parentName"]),h=d(n),u=r,m=h["".concat(p,".").concat(u)]||h[u]||c[u]||i;return n?a.createElement(m,o(o({ref:t},s),{},{components:n})):a.createElement(m,o({ref:t},s))}));function m(e,t){var n=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var i=n.length,o=new Array(i);o[0]=u;var l={};for(var p in t)hasOwnProperty.call(t,p)&&(l[p]=t[p]);l.originalType=e,l[h]="string"==typeof e?e:r,o[1]=l;for(var d=2;d<i;d++)o[d]=n[d];return a.createElement.apply(null,o)}return a.createElement.apply(null,n)}u.displayName="MDXCreateElement"},3104:(e,t,n)=>{n.r(t),n.d(t,{assets:()=>p,contentTitle:()=>o,default:()=>c,frontMatter:()=>i,metadata:()=>l,toc:()=>d});var a=n(7462),r=(n(7294),n(3905));const i={},o="Child Threads",l={unversionedId:"concepts/child-threads",id:"concepts/child-threads",title:"Child Threads",description:"As discussed in the WfRun documentation, a WfRun can have multiple ThreadRuns. The main thread is called the Entrypoint Thread, and all other threads are children (or grandchildren) of the entrypoint.",source:"@site/docs/04-concepts/08-child-threads.md",sourceDirName:"04-concepts",slug:"/concepts/child-threads",permalink:"/littlehorse/docs/concepts/child-threads",draft:!1,tags:[],version:"current",sidebarPosition:8,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Task Workers",permalink:"/littlehorse/docs/concepts/task-workers"},next:{title:"Conditional Branching",permalink:"/littlehorse/docs/concepts/conditionals"}},p={},d=[{value:"Entrypoint Thread",id:"entrypoint-thread",level:2},{value:"Thread Types",id:"thread-types",level:2},{value:"Variable Scoping",id:"variable-scoping",level:2}],s={toc:d},h="wrapper";function c(e){let{components:t,...n}=e;return(0,r.kt)(h,(0,a.Z)({},s,n,{components:t,mdxType:"MDXLayout"}),(0,r.kt)("h1",{id:"child-threads"},"Child Threads"),(0,r.kt)("p",null,"As discussed in the ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/concepts/workflows"},(0,r.kt)("inlineCode",{parentName:"a"},"WfRun")," documentation"),", a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun")," can have multiple ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"s. The main thread is called the Entrypoint Thread, and all other threads are children (or grandchildren) of the entrypoint."),(0,r.kt)("h2",{id:"entrypoint-thread"},"Entrypoint Thread"),(0,r.kt)("p",null,"A ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," defines one or more ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec"),"s, and the corresponding ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun")," has one or more ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"s. Each ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun")," has a corresponding ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec")," in the ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),"."),(0,r.kt)("p",null,"In every ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),", one ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec")," is special: it is the ",(0,r.kt)("inlineCode",{parentName:"p"},"ENTRYPOINT")," thread. Similarly, each ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun")," has a special ",(0,r.kt)("inlineCode",{parentName:"p"},"ENTRYPOINT")," thread run."),(0,r.kt)("p",null,"When you run a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," (thereby creating a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun"),"), the resulting ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun")," is created with one entrypoint ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),", which (as you guessed) is specified by the entrypoint ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec")," of the ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),"."),(0,r.kt)("h2",{id:"thread-types"},"Thread Types"),(0,r.kt)("p",null,"A ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun")," may have multiple ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"s in it. ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"s have four types:"),(0,r.kt)("ul",null,(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"ENTRYPOINT")," threads, described above."),(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"CHILD")," thread, created explicitly via a ",(0,r.kt)("inlineCode",{parentName:"li"},"SPAWN_THREAD")," node (in Java, for example, ",(0,r.kt)("inlineCode",{parentName:"li"},"WorkflowThread::spawnThread()"),")."),(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"INTERRUPT")," thread, triggered by an External Event."),(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"FAILURE_HANDLER")," threads, which are akin to exception handlers in programming.")),(0,r.kt)("p",null,"All ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"s other than the entrypoint thread will have a ",(0,r.kt)("inlineCode",{parentName:"p"},"parentThreadId"),", referring to the thread that spawned it. In the case of an ",(0,r.kt)("inlineCode",{parentName:"p"},"INTERRUPT")," thread, the parent thread is the thread that was interrupted; in the case of a ",(0,r.kt)("inlineCode",{parentName:"p"},"FAILURE_HANDLER")," thread, the parent is the thread whose failure triggered the exception handler."),(0,r.kt)("h2",{id:"variable-scoping"},"Variable Scoping"),(0,r.kt)("p",null,"A ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec")," can define ",(0,r.kt)("inlineCode",{parentName:"p"},"Variable"),"s (for example, through the ",(0,r.kt)("inlineCode",{parentName:"p"},"variableDefs")," field in the JSON spec, or ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread::adVariable()")," in Java). When a ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun")," is created, all defined ",(0,r.kt)("inlineCode",{parentName:"p"},"Variable"),"s are instantiated (either with input values or as ",(0,r.kt)("inlineCode",{parentName:"p"},"NULL"),")."),(0,r.kt)("p",null,"When a child ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun")," of any type is started, it has ",(0,r.kt)("em",{parentName:"p"},"read and write")," access to its own ",(0,r.kt)("inlineCode",{parentName:"p"},"Variable"),"s, and all ",(0,r.kt)("inlineCode",{parentName:"p"},"Variable"),"s that its parent has access to (including the parent's parent, and so on)."),(0,r.kt)("p",null,"Since a ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun")," can have multiple children, the parent does ",(0,r.kt)("em",{parentName:"p"},"not")," have access to the variables of the children."))}c.isMDXComponent=!0}}]);