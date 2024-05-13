"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[2337],{2144:(e,n,s)=>{s.r(n),s.d(n,{assets:()=>l,contentTitle:()=>r,default:()=>h,frontMatter:()=>o,metadata:()=>c,toc:()=>d});var t=s(4848),i=s(8453);const o={sidebar_label:"Sleeping"},r="Sleeping",c={id:"concepts/sleeping",title:"Sleeping",description:"You can make a ThreadRun go to sleep for a period of time by using a SLEEP Node. This Node type has no output, and simply holds a ThreadRun in place until the time expires.",source:"@site/docs/04-concepts/12-sleeping.md",sourceDirName:"04-concepts",slug:"/concepts/sleeping",permalink:"/docs/concepts/sleeping",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:12,frontMatter:{sidebar_label:"Sleeping"},sidebar:"tutorialSidebar",previous:{title:"Interrupts",permalink:"/docs/concepts/interrupts"},next:{title:"Developer Guide",permalink:"/docs/developer-guide/"}},l={},d=[];function a(e){const n={code:"code",h1:"h1",li:"li",p:"p",ul:"ul",...(0,i.R)(),...e.components};return(0,t.jsxs)(t.Fragment,{children:[(0,t.jsx)(n.h1,{id:"sleeping",children:"Sleeping"}),"\n",(0,t.jsxs)(n.p,{children:["You can make a ",(0,t.jsx)(n.code,{children:"ThreadRun"})," go to sleep for a period of time by using a ",(0,t.jsx)(n.code,{children:"SLEEP"})," Node. This ",(0,t.jsx)(n.code,{children:"Node"})," type has no output, and simply holds a ",(0,t.jsx)(n.code,{children:"ThreadRun"})," in place until the time expires."]}),"\n",(0,t.jsxs)(n.p,{children:["You may specify the time by using a ",(0,t.jsx)(n.code,{children:"VariableAssignment"})," that resolves to one of the three things:"]}),"\n",(0,t.jsxs)(n.ul,{children:["\n",(0,t.jsxs)(n.li,{children:[(0,t.jsx)(n.code,{children:"sleepSeconds"}),": An ",(0,t.jsx)(n.code,{children:"INT"})," Value determining how many seconds to sleep for."]}),"\n",(0,t.jsxs)(n.li,{children:[(0,t.jsx)(n.code,{children:"isoDate"}),": A ",(0,t.jsx)(n.code,{children:"STR"})," value representing a timestamp in ISO format."]}),"\n",(0,t.jsxs)(n.li,{children:[(0,t.jsx)(n.code,{children:"timestamp"}),": A ",(0,t.jsx)(n.code,{children:"INT"})," value representing the number of milliseconds since the epoch.","\n",(0,t.jsxs)(n.ul,{children:["\n",(0,t.jsxs)(n.li,{children:["(Don't worry, in LittleHorse the ",(0,t.jsx)(n.code,{children:"INT"})," is a 64-bit number.)"]}),"\n"]}),"\n"]}),"\n"]}),"\n",(0,t.jsxs)(n.p,{children:["Note that when a ",(0,t.jsx)(n.code,{children:"ThreadRun"})," reaches a ",(0,t.jsx)(n.code,{children:"SLEEP"})," Node, the status of the ",(0,t.jsx)(n.code,{children:"ThreadRun"})," remains ",(0,t.jsx)(n.code,{children:"RUNNING"}),". Additionally, the ",(0,t.jsx)(n.code,{children:"ThreadRun"})," is immediately interruptible (unless, of course, it has a non-interruptible Child Thread)."]})]})}function h(e={}){const{wrapper:n}={...(0,i.R)(),...e.components};return n?(0,t.jsx)(n,{...e,children:(0,t.jsx)(a,{...e})}):a(e)}},8453:(e,n,s)=>{s.d(n,{R:()=>r,x:()=>c});var t=s(6540);const i={},o=t.createContext(i);function r(e){const n=t.useContext(o);return t.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function c(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(i):e.components||i:r(e.components),t.createElement(o.Provider,{value:n},e.children)}}}]);