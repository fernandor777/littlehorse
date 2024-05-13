"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[216],{5010:(e,t,r)=>{r.r(t),r.d(t,{assets:()=>u,contentTitle:()=>a,default:()=>p,frontMatter:()=>o,metadata:()=>c,toc:()=>d});var n=r(4848),l=r(8453),s=r(1470),i=r(9365);const o={},a="Quickstart Installation",c={id:"developer-guide/install",title:"Quickstart Installation",description:"The minimum to get started with LittleHorse is to install the lhctl CLI, run the server in docker, and use your choice of the Java, GoLang, or Python client libraries.",source:"@site/docs/05-developer-guide/00-install.md",sourceDirName:"05-developer-guide",slug:"/developer-guide/install",permalink:"/docs/developer-guide/install",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:0,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Developer Guide",permalink:"/docs/developer-guide/"},next:{title:"Configuring the Clients",permalink:"/docs/developer-guide/client-configuration"}},u={},d=[{value:"LittleHorse CLI",id:"littlehorse-cli",level:2},{value:"LittleHorse Server (Local Dev)",id:"littlehorse-server-local-dev",level:2},{value:"LittleHorse Client Libraries",id:"littlehorse-client-libraries",level:2},{value:"Get Started",id:"get-started",level:2}];function h(e){const t={a:"a",admonition:"admonition",code:"code",h1:"h1",h2:"h2",li:"li",p:"p",pre:"pre",strong:"strong",ul:"ul",...(0,l.R)(),...e.components};return(0,n.jsxs)(n.Fragment,{children:[(0,n.jsx)(t.h1,{id:"quickstart-installation",children:"Quickstart Installation"}),"\n",(0,n.jsxs)(t.p,{children:["The minimum to get started with LittleHorse is to install the ",(0,n.jsx)(t.code,{children:"lhctl"})," CLI, run the server in docker, and use your choice of the Java, GoLang, or Python client libraries."]}),"\n",(0,n.jsx)(t.admonition,{type:"tip",children:(0,n.jsxs)(t.p,{children:["For fast responses, we recommend you join our ",(0,n.jsx)(t.a,{href:"https://launchpass.com/littlehorsecommunity",children:"LittleHorse Community Slack Workspace"})," to exchange ideas about and receive support for LittleHorse."]})}),"\n",(0,n.jsx)(t.p,{children:"Your system will need:"}),"\n",(0,n.jsxs)(t.ul,{children:["\n",(0,n.jsxs)(t.li,{children:[(0,n.jsx)(t.code,{children:"brew"})," or ",(0,n.jsx)(t.code,{children:"go"})," to install ",(0,n.jsx)(t.code,{children:"lhctl"})," (if you use ",(0,n.jsx)(t.code,{children:"go"}),", make sure to put ",(0,n.jsx)(t.code,{children:"~/go/bin"})," in your ",(0,n.jsx)(t.code,{children:"PATH"}),")."]}),"\n",(0,n.jsxs)(t.li,{children:[(0,n.jsx)(t.code,{children:"docker"})," to run the LH Server."]}),"\n",(0,n.jsxs)(t.li,{children:["Either ",(0,n.jsx)(t.code,{children:"go"}),", ",(0,n.jsx)(t.code,{children:"java"}),", or ",(0,n.jsx)(t.code,{children:"python"})," to run the client libraries."]}),"\n"]}),"\n",(0,n.jsx)(t.h2,{id:"littlehorse-cli",children:"LittleHorse CLI"}),"\n",(0,n.jsxs)(t.p,{children:["First, install ",(0,n.jsx)(t.code,{children:"lhctl"}),", the LittleHorse CLI."]}),"\n",(0,n.jsxs)(s.A,{children:[(0,n.jsxs)(i.A,{value:"brew",label:"Homebrew",default:!0,children:[(0,n.jsx)(t.p,{children:"Installation via Homebrew has been tested on Mac and Linux."}),(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"brew install littlehorse-enterprises/lh/lhctl\n"})})]}),(0,n.jsxs)(i.A,{value:"go",label:"Go",children:[(0,n.jsxs)(t.p,{children:["Alternatively, you can install ",(0,n.jsx)(t.code,{children:"lhctl"})," directly from source using GoLang. Please remember to put ",(0,n.jsx)(t.code,{children:"~/go/bin/"})," in your ",(0,n.jsx)(t.code,{children:"PATH"}),"."]}),(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"go install github.com/littlehorse-enterprises/littlehorse/lhctl@0.7.2\n"})})]})]}),"\n",(0,n.jsx)(t.h2,{id:"littlehorse-server-local-dev",children:"LittleHorse Server (Local Dev)"}),"\n",(0,n.jsxs)(t.p,{children:["The easiest way to run the LittleHorse Server is using the ",(0,n.jsx)(t.code,{children:"lh-standalone"})," docker image. You can do so as follows:"]}),"\n",(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"docker run --name littlehorse -d -p 2023:2023 -p 8080:8080 ghcr.io/littlehorse-enterprises/littlehorse/lh-standalone:0.7.2\n"})}),"\n",(0,n.jsxs)(t.p,{children:["Note that the ",(0,n.jsx)(t.code,{children:"lh-standalone"})," image is only suitable for local development. Once the container is up and running, you should be able to verify that the server is working as follows:"]}),"\n",(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"-> lhctl version\nlhctl version: 0.7.2\nServer version: 0.7.2\n"})}),"\n",(0,n.jsx)(t.admonition,{type:"info",children:(0,n.jsxs)(t.p,{children:["The ",(0,n.jsx)(t.code,{children:"lh-standalone"})," image takes some time to start up since it first starts a Kafka Broker process before starting the LH Server process. If your ",(0,n.jsx)(t.code,{children:"lhctl search wfSpec"})," command fails at first, keep trying for about 20-40 seconds until Kafka is ready."]})}),"\n",(0,n.jsxs)(t.p,{children:["You should be able to access the LH Developer Dashboard at ",(0,n.jsx)(t.code,{children:"http://localhost:8080/"})," after the ",(0,n.jsx)(t.code,{children:"lh-standalone"})," image has started up."]}),"\n",(0,n.jsx)(t.h2,{id:"littlehorse-client-libraries",children:"LittleHorse Client Libraries"}),"\n",(0,n.jsx)(t.p,{children:"All the LittleHorse Client libraries, including grpc clients, can be accessed through standard installation mechanisms in a language of your choice."}),"\n",(0,n.jsxs)(s.A,{children:[(0,n.jsxs)(i.A,{value:"java",label:"Java",default:!0,children:[(0,n.jsxs)(t.p,{children:["The Java Client Library is available on Maven Central. To add it as a dependency to your project, simply put the following in your ",(0,n.jsx)(t.code,{children:"build.gradle"})," (or do the equivalent with your ",(0,n.jsx)(t.code,{children:"pom.xml"}),")"]}),(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"  implementation 'io.littlehorse:littlehorse-client:0.7.2'\n"})})]}),(0,n.jsxs)(i.A,{value:"go",label:"Go",children:[(0,n.jsx)(t.p,{children:"You add the LittleHorse Go Library as a dependency to your Go project as follows:"}),(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"go get github.com/littlehorse-enterprises/littlehorse/sdk-go@0.7.2\n"})})]}),(0,n.jsxs)(i.A,{value:"python",label:"Python",children:[(0,n.jsx)(t.p,{children:"You can install the LittleHorse Client Library as follows:"}),(0,n.jsx)(t.pre,{children:(0,n.jsx)(t.code,{children:"pip3 install littlehorse-client==0.7.2\n"})})]})]}),"\n",(0,n.jsx)(t.h2,{id:"get-started",children:"Get Started"}),"\n",(0,n.jsx)(t.p,{children:"You can use one of the LittleHorse QuickStarts to get going really fast:"}),"\n",(0,n.jsxs)(t.ul,{children:["\n",(0,n.jsxs)(t.li,{children:[(0,n.jsx)(t.strong,{children:"Java Quickstart"})," on ",(0,n.jsx)(t.a,{href:"https://github.com/littlehorse-enterprises/lh-quickstart-java",children:"GitHub"})," and on ",(0,n.jsx)(t.a,{href:"https://www.youtube.com/watch?v=8Zo_UOStg98",children:"YouTube"})]}),"\n",(0,n.jsxs)(t.li,{children:[(0,n.jsx)(t.strong,{children:"Go Quickstart"})," on ",(0,n.jsx)(t.a,{href:"https://github.com/littlehorse-enterprises/lh-quickstart-go",children:"GitHub"})," and on ",(0,n.jsx)(t.a,{href:"https://www.youtube.com/watch?v=oZQc2ISSZsk",children:"YouTube"})]}),"\n",(0,n.jsxs)(t.li,{children:[(0,n.jsx)(t.strong,{children:"Python Quickstart"})," on ",(0,n.jsx)(t.a,{href:"https://github.com/littlehorse-enterprises/lh-quickstart-python",children:"GitHub"})," and on ",(0,n.jsx)(t.a,{href:"https://www.youtube.com/watch?v=l3TZOjfpzTw",children:"YouTube"})]}),"\n",(0,n.jsx)(t.li,{children:(0,n.jsx)(t.a,{href:"https://launchpass.com/littlehorsecommunity",children:(0,n.jsx)(t.strong,{children:"Join Our Slack"})})}),"\n"]}),"\n",(0,n.jsxs)(t.p,{children:["Additional rich examples can be found at our ",(0,n.jsx)(t.a,{href:"https://github.com/littlehorse-enterprises/littlehorse",children:"core GitHub repository"}),"."]})]})}function p(e={}){const{wrapper:t}={...(0,l.R)(),...e.components};return t?(0,n.jsx)(t,{...e,children:(0,n.jsx)(h,{...e})}):h(e)}},9365:(e,t,r)=>{r.d(t,{A:()=>i});r(6540);var n=r(8215);const l={tabItem:"tabItem_Ymn6"};var s=r(4848);function i(e){let{children:t,hidden:r,className:i}=e;return(0,s.jsx)("div",{role:"tabpanel",className:(0,n.A)(l.tabItem,i),hidden:r,children:t})}},1470:(e,t,r)=>{r.d(t,{A:()=>w});var n=r(6540),l=r(8215),s=r(3104),i=r(6347),o=r(205),a=r(7485),c=r(1682),u=r(9466);function d(e){return n.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,n.isValidElement)(e)&&function(e){const{props:t}=e;return!!t&&"object"==typeof t&&"value"in t}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function h(e){const{values:t,children:r}=e;return(0,n.useMemo)((()=>{const e=t??function(e){return d(e).map((e=>{let{props:{value:t,label:r,attributes:n,default:l}}=e;return{value:t,label:r,attributes:n,default:l}}))}(r);return function(e){const t=(0,c.X)(e,((e,t)=>e.value===t.value));if(t.length>0)throw new Error(`Docusaurus error: Duplicate values "${t.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[t,r])}function p(e){let{value:t,tabValues:r}=e;return r.some((e=>e.value===t))}function b(e){let{queryString:t=!1,groupId:r}=e;const l=(0,i.W6)(),s=function(e){let{queryString:t=!1,groupId:r}=e;if("string"==typeof t)return t;if(!1===t)return null;if(!0===t&&!r)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return r??null}({queryString:t,groupId:r});return[(0,a.aZ)(s),(0,n.useCallback)((e=>{if(!s)return;const t=new URLSearchParams(l.location.search);t.set(s,e),l.replace({...l.location,search:t.toString()})}),[s,l])]}function m(e){const{defaultValue:t,queryString:r=!1,groupId:l}=e,s=h(e),[i,a]=(0,n.useState)((()=>function(e){let{defaultValue:t,tabValues:r}=e;if(0===r.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(t){if(!p({value:t,tabValues:r}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${t}" but none of its children has the corresponding value. Available values are: ${r.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return t}const n=r.find((e=>e.default))??r[0];if(!n)throw new Error("Unexpected error: 0 tabValues");return n.value}({defaultValue:t,tabValues:s}))),[c,d]=b({queryString:r,groupId:l}),[m,x]=function(e){let{groupId:t}=e;const r=function(e){return e?`docusaurus.tab.${e}`:null}(t),[l,s]=(0,u.Dv)(r);return[l,(0,n.useCallback)((e=>{r&&s.set(e)}),[r,s])]}({groupId:l}),f=(()=>{const e=c??m;return p({value:e,tabValues:s})?e:null})();(0,o.A)((()=>{f&&a(f)}),[f]);return{selectedValue:i,selectValue:(0,n.useCallback)((e=>{if(!p({value:e,tabValues:s}))throw new Error(`Can't select invalid tab value=${e}`);a(e),d(e),x(e)}),[d,x,s]),tabValues:s}}var x=r(2303);const f={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var j=r(4848);function v(e){let{className:t,block:r,selectedValue:n,selectValue:i,tabValues:o}=e;const a=[],{blockElementScrollPositionUntilNextRender:c}=(0,s.a_)(),u=e=>{const t=e.currentTarget,r=a.indexOf(t),l=o[r].value;l!==n&&(c(t),i(l))},d=e=>{let t=null;switch(e.key){case"Enter":u(e);break;case"ArrowRight":{const r=a.indexOf(e.currentTarget)+1;t=a[r]??a[0];break}case"ArrowLeft":{const r=a.indexOf(e.currentTarget)-1;t=a[r]??a[a.length-1];break}}t?.focus()};return(0,j.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,l.A)("tabs",{"tabs--block":r},t),children:o.map((e=>{let{value:t,label:r,attributes:s}=e;return(0,j.jsx)("li",{role:"tab",tabIndex:n===t?0:-1,"aria-selected":n===t,ref:e=>a.push(e),onKeyDown:d,onClick:u,...s,className:(0,l.A)("tabs__item",f.tabItem,s?.className,{"tabs__item--active":n===t}),children:r??t},t)}))})}function g(e){let{lazy:t,children:r,selectedValue:l}=e;const s=(Array.isArray(r)?r:[r]).filter(Boolean);if(t){const e=s.find((e=>e.props.value===l));return e?(0,n.cloneElement)(e,{className:"margin-top--md"}):null}return(0,j.jsx)("div",{className:"margin-top--md",children:s.map(((e,t)=>(0,n.cloneElement)(e,{key:t,hidden:e.props.value!==l})))})}function y(e){const t=m(e);return(0,j.jsxs)("div",{className:(0,l.A)("tabs-container",f.tabList),children:[(0,j.jsx)(v,{...t,...e}),(0,j.jsx)(g,{...t,...e})]})}function w(e){const t=(0,x.A)();return(0,j.jsx)(y,{...e,children:d(e.children)},String(t))}},8453:(e,t,r)=>{r.d(t,{R:()=>i,x:()=>o});var n=r(6540);const l={},s=n.createContext(l);function i(e){const t=n.useContext(s);return n.useMemo((function(){return"function"==typeof e?e(t):{...t,...e}}),[t,e])}function o(e){let t;return t=e.disableParentContext?"function"==typeof e.components?e.components(l):e.components||l:i(e.components),n.createElement(s.Provider,{value:t},e.children)}}}]);