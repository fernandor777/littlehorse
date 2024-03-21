"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[3701],{3905:(e,a,t)=>{t.d(a,{Zo:()=>s,kt:()=>m});var n=t(7294);function r(e,a,t){return a in e?Object.defineProperty(e,a,{value:t,enumerable:!0,configurable:!0,writable:!0}):e[a]=t,e}function l(e,a){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);a&&(n=n.filter((function(a){return Object.getOwnPropertyDescriptor(e,a).enumerable}))),t.push.apply(t,n)}return t}function o(e){for(var a=1;a<arguments.length;a++){var t=null!=arguments[a]?arguments[a]:{};a%2?l(Object(t),!0).forEach((function(a){r(e,a,t[a])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):l(Object(t)).forEach((function(a){Object.defineProperty(e,a,Object.getOwnPropertyDescriptor(t,a))}))}return e}function i(e,a){if(null==e)return{};var t,n,r=function(e,a){if(null==e)return{};var t,n,r={},l=Object.keys(e);for(n=0;n<l.length;n++)t=l[n],a.indexOf(t)>=0||(r[t]=e[t]);return r}(e,a);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);for(n=0;n<l.length;n++)t=l[n],a.indexOf(t)>=0||Object.prototype.propertyIsEnumerable.call(e,t)&&(r[t]=e[t])}return r}var d=n.createContext({}),u=function(e){var a=n.useContext(d),t=a;return e&&(t="function"==typeof e?e(a):o(o({},a),e)),t},s=function(e){var a=u(e.components);return n.createElement(d.Provider,{value:a},e.children)},c="mdxType",p={inlineCode:"code",wrapper:function(e){var a=e.children;return n.createElement(n.Fragment,{},a)}},h=n.forwardRef((function(e,a){var t=e.components,r=e.mdxType,l=e.originalType,d=e.parentName,s=i(e,["components","mdxType","originalType","parentName"]),c=u(t),h=r,m=c["".concat(d,".").concat(h)]||c[h]||p[h]||l;return t?n.createElement(m,o(o({ref:a},s),{},{components:t})):n.createElement(m,o({ref:a},s))}));function m(e,a){var t=arguments,r=a&&a.mdxType;if("string"==typeof e||r){var l=t.length,o=new Array(l);o[0]=h;var i={};for(var d in a)hasOwnProperty.call(a,d)&&(i[d]=a[d]);i.originalType=e,i[c]="string"==typeof e?e:r,o[1]=i;for(var u=2;u<l;u++)o[u]=t[u];return n.createElement.apply(null,o)}return n.createElement.apply(null,t)}h.displayName="MDXCreateElement"},5162:(e,a,t)=>{t.d(a,{Z:()=>o});var n=t(7294),r=t(6010);const l={tabItem:"tabItem_Ymn6"};function o(e){let{children:a,hidden:t,className:o}=e;return n.createElement("div",{role:"tabpanel",className:(0,r.Z)(l.tabItem,o),hidden:t},a)}},4866:(e,a,t)=>{t.d(a,{Z:()=>g});var n=t(7462),r=t(7294),l=t(6010),o=t(2466),i=t(6550),d=t(1980),u=t(7392),s=t(12);function c(e){return function(e){return r.Children.map(e,(e=>{if(!e||(0,r.isValidElement)(e)&&function(e){const{props:a}=e;return!!a&&"object"==typeof a&&"value"in a}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}(e).map((e=>{let{props:{value:a,label:t,attributes:n,default:r}}=e;return{value:a,label:t,attributes:n,default:r}}))}function p(e){const{values:a,children:t}=e;return(0,r.useMemo)((()=>{const e=a??c(t);return function(e){const a=(0,u.l)(e,((e,a)=>e.value===a.value));if(a.length>0)throw new Error(`Docusaurus error: Duplicate values "${a.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[a,t])}function h(e){let{value:a,tabValues:t}=e;return t.some((e=>e.value===a))}function m(e){let{queryString:a=!1,groupId:t}=e;const n=(0,i.k6)(),l=function(e){let{queryString:a=!1,groupId:t}=e;if("string"==typeof a)return a;if(!1===a)return null;if(!0===a&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:a,groupId:t});return[(0,d._X)(l),(0,r.useCallback)((e=>{if(!l)return;const a=new URLSearchParams(n.location.search);a.set(l,e),n.replace({...n.location,search:a.toString()})}),[l,n])]}function f(e){const{defaultValue:a,queryString:t=!1,groupId:n}=e,l=p(e),[o,i]=(0,r.useState)((()=>function(e){let{defaultValue:a,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(a){if(!h({value:a,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${a}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return a}const n=t.find((e=>e.default))??t[0];if(!n)throw new Error("Unexpected error: 0 tabValues");return n.value}({defaultValue:a,tabValues:l}))),[d,u]=m({queryString:t,groupId:n}),[c,f]=function(e){let{groupId:a}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(a),[n,l]=(0,s.Nk)(t);return[n,(0,r.useCallback)((e=>{t&&l.set(e)}),[t,l])]}({groupId:n}),b=(()=>{const e=d??c;return h({value:e,tabValues:l})?e:null})();(0,r.useLayoutEffect)((()=>{b&&i(b)}),[b]);return{selectedValue:o,selectValue:(0,r.useCallback)((e=>{if(!h({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);i(e),u(e),f(e)}),[u,f,l]),tabValues:l}}var b=t(2389);const v={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};function T(e){let{className:a,block:t,selectedValue:i,selectValue:d,tabValues:u}=e;const s=[],{blockElementScrollPositionUntilNextRender:c}=(0,o.o5)(),p=e=>{const a=e.currentTarget,t=s.indexOf(a),n=u[t].value;n!==i&&(c(a),d(n))},h=e=>{let a=null;switch(e.key){case"Enter":p(e);break;case"ArrowRight":{const t=s.indexOf(e.currentTarget)+1;a=s[t]??s[0];break}case"ArrowLeft":{const t=s.indexOf(e.currentTarget)-1;a=s[t]??s[s.length-1];break}}a?.focus()};return r.createElement("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,l.Z)("tabs",{"tabs--block":t},a)},u.map((e=>{let{value:a,label:t,attributes:o}=e;return r.createElement("li",(0,n.Z)({role:"tab",tabIndex:i===a?0:-1,"aria-selected":i===a,key:a,ref:e=>s.push(e),onKeyDown:h,onClick:p},o,{className:(0,l.Z)("tabs__item",v.tabItem,o?.className,{"tabs__item--active":i===a})}),t??a)})))}function w(e){let{lazy:a,children:t,selectedValue:n}=e;const l=(Array.isArray(t)?t:[t]).filter(Boolean);if(a){const e=l.find((e=>e.props.value===n));return e?(0,r.cloneElement)(e,{className:"margin-top--md"}):null}return r.createElement("div",{className:"margin-top--md"},l.map(((e,a)=>(0,r.cloneElement)(e,{key:a,hidden:e.props.value!==n}))))}function y(e){const a=f(e);return r.createElement("div",{className:(0,l.Z)("tabs-container",v.tabList)},r.createElement(T,(0,n.Z)({},e,a)),r.createElement(w,(0,n.Z)({},e,a)))}function g(e){const a=(0,b.Z)();return r.createElement(y,(0,n.Z)({key:String(a)},e))}},203:(e,a,t)=>{t.r(a),t.d(a,{assets:()=>s,contentTitle:()=>d,default:()=>m,frontMatter:()=>i,metadata:()=>u,toc:()=>c});var n=t(7462),r=(t(7294),t(3905)),l=t(4866),o=t(5162);const i={},d="Child Threads",u={unversionedId:"developer-guide/wfspec-development/child-threads",id:"developer-guide/wfspec-development/child-threads",title:"Child Threads",description:"You can use WorkflowThread#spawnThread() and WorkflowThread#waitForThreads() to launch and wait for Child ThreadRuns, respectively. This is useful if you want to execute multiple pieces of business logic in parallel.",source:"@site/docs/05-developer-guide/08-wfspec-development/07-child-threads.md",sourceDirName:"05-developer-guide/08-wfspec-development",slug:"/developer-guide/wfspec-development/child-threads",permalink:"/docs/developer-guide/wfspec-development/child-threads",draft:!1,tags:[],version:"current",sidebarPosition:7,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Exception Handling",permalink:"/docs/developer-guide/wfspec-development/exception-handling"},next:{title:"User Tasks",permalink:"/docs/developer-guide/wfspec-development/user-tasks"}},s={},c=[{value:"Spawning Child Threads",id:"spawning-child-threads",level:2},{value:"Waiting for Child Threads",id:"waiting-for-child-threads",level:2}],p={toc:c},h="wrapper";function m(e){let{components:a,...t}=e;return(0,r.kt)(h,(0,n.Z)({},p,t,{components:a,mdxType:"MDXLayout"}),(0,r.kt)("h1",{id:"child-threads"},"Child Threads"),(0,r.kt)("p",null,"You can use ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread#spawnThread()")," and ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread#waitForThreads()")," to launch and wait for Child ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"s, respectively. This is useful if you want to execute multiple pieces of business logic in parallel."),(0,r.kt)("h2",{id:"spawning-child-threads"},"Spawning Child Threads"),(0,r.kt)("p",null,"The ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread::spawnThread()")," method takes in three arguments:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},"A ",(0,r.kt)("inlineCode",{parentName:"li"},"ThreadFunc")," (normally a lambda or function pointer) defining the logic for the Child ",(0,r.kt)("inlineCode",{parentName:"li"},"ThreadSpec"),"/",(0,r.kt)("inlineCode",{parentName:"li"},"ThreadRun"),"."),(0,r.kt)("li",{parentName:"ol"},"The name to assign to the Child ",(0,r.kt)("inlineCode",{parentName:"li"},"ThreadSpec"),"."),(0,r.kt)("li",{parentName:"ol"},"A ",(0,r.kt)("inlineCode",{parentName:"li"},"Map<String, ?>")," for any input variables to the child thread (or equivalent, depending on the language of the SDK you use).")),(0,r.kt)("p",null,"Let's spawn a child thread whose ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec")," we call ",(0,r.kt)("inlineCode",{parentName:"p"},"my-child-thread"),", and set the variable ",(0,r.kt)("inlineCode",{parentName:"p"},"child-var")," to ",(0,r.kt)("inlineCode",{parentName:"p"},"foo"),"."),(0,r.kt)(l.Z,{mdxType:"Tabs"},(0,r.kt)(o.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-java"},'SpawnedThread spawnedThread = thread.spawnThread(\n    child -> {\n        WfRunVariable childVar = child.addVariable("child-var", VariableType.STR);\n        child.execute("some-task", childVar);\n    },\n    "my-child-thread",\n    Map.of("child-var", "foo")\n);\n'))),(0,r.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-go"},'spawnedThread := thread.SpawnThread(\n    func (child *wflib.WorkflowThread) {\n        childVar := child.AddVariable("child-var", model.VariableType_STR);\n        child.Execute("some-task", childVar);\n    },\n    "my-child-thread",\n    map[string]interface{}{"child-var": "foo"},\n)\n'))),(0,r.kt)(o.Z,{value:"python",label:"Python",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-python"},'def my_thread_child(child: WorkflowThread) -> None:\n    child_var = child.add_variable("child-var", VariableType.STR)\n    child.execute("some-task", child_var)\n\nwf.spawn_thread(my_thread_child, "my-child-thread", {"child-var": "foo"})\n')))),(0,r.kt)("h2",{id:"waiting-for-child-threads"},"Waiting for Child Threads"),(0,r.kt)("p",null,"The ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread::waitForThreads()")," method takes in a variable number of args. Each arg is the ",(0,r.kt)("inlineCode",{parentName:"p"},"SpawnedThread")," object returned when you launch your Child ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun")," (see above)."),(0,r.kt)("admonition",{type:"note"},(0,r.kt)("p",{parentName:"admonition"},"The return type is ",(0,r.kt)("inlineCode",{parentName:"p"},"NodeOutput"),"; however, it should be noted that the ",(0,r.kt)("inlineCode",{parentName:"p"},"NodeOutput")," should only be used to set a timeout or handle an exception; there is no content/payload/value associated with ",(0,r.kt)("inlineCode",{parentName:"p"},"NodeOutput")," for ",(0,r.kt)("inlineCode",{parentName:"p"},"WAIT_FOR_THREAD")," Nodes."),(0,r.kt)("p",{parentName:"admonition"},"Future releases of LittleHorse will allow a child ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun")," to return an output.")),(0,r.kt)(l.Z,{mdxType:"Tabs"},(0,r.kt)(o.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-java"},'SpawnedThread spawnedThread = thread.spawnThread(...);\nSpawnedThread anotherThread = thread.spawnThread(...);\n// Omitted: Execute some business logic in parallel\n\nNodeOutput waitedThreads = thread.waitForThreads(spawnedThread, anotherThread);\n\n// You can handle exceptions here\nthread.handleException(\n    waitedThread,\n    null, // catch any failure\n    handler -> {\n        handler.execute("some-error-reporting-task");\n    }\n);\n'))),(0,r.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-go"},'spawnedThread := ... // see above to spawn thread\nanotherThread := ... // see above to spawn thread\n\n// Omitted: Execute some business logic in parallel\n\nwaitedThreads := thread.WaitForThreads(spawnedThread, anotherThread)\n\nthread.HandleException(\n    waitedThreads,\n    nil, // handle any failure\n    func (handler *wflib.WorkflowThread) {\n        handler.execute("some-error-reporting-task")\n    },\n)\n'))),(0,r.kt)(o.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-python"},'def my_handler(handle: WorkflowThread) -> None:\n    handle.execute("some-error-reporting-task")\n\noutput = wf.wait_for_threads(SpawnedThreads.from_list(...))\nwf.handle_exception(output, my_handler) # handle any failure\n')))))}m.isMDXComponent=!0}}]);