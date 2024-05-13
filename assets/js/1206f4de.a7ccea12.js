"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[9511],{8152:(e,n,o)=>{o.r(n),o.d(n,{assets:()=>t,contentTitle:()=>c,default:()=>h,frontMatter:()=>d,metadata:()=>r,toc:()=>l});var s=o(4848),i=o(8453);const d={},c="Conditional Branching",r={id:"concepts/conditionals",title:"Conditional Branching",description:"Just as if/else allows you to implement control flow in your programs, Conditional Branching allows you to add control flow to your LittleHorse Workflows.",source:"@site/docs/04-concepts/09-conditionals.md",sourceDirName:"04-concepts",slug:"/concepts/conditionals",permalink:"/docs/concepts/conditionals",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:9,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Child Threads",permalink:"/docs/concepts/child-threads"},next:{title:"Exception Handling",permalink:"/docs/concepts/exception-handling"}},t={},l=[{value:"Comparator Types",id:"comparator-types",level:2},{value:"<code>LESS_THAN</code>",id:"less_than",level:3},{value:"<code>GREATER_THAN</code>",id:"greater_than",level:3},{value:"<code>LESS_THAN_EQ</code>",id:"less_than_eq",level:3},{value:"<code>GREATER_THAN_EQ</code>",id:"greater_than_eq",level:3},{value:"<code>EQUALS</code>",id:"equals",level:3},{value:"<code>NOT_EQUALS</code>",id:"not_equals",level:3},{value:"<code>IN</code>",id:"in",level:3},{value:"<code>NOT_IN</code>",id:"not_in",level:3}];function a(e){const n={code:"code",h1:"h1",h2:"h2",h3:"h3",p:"p",pre:"pre",...(0,i.R)(),...e.components};return(0,s.jsxs)(s.Fragment,{children:[(0,s.jsx)(n.h1,{id:"conditional-branching",children:"Conditional Branching"}),"\n",(0,s.jsxs)(n.p,{children:["Just as ",(0,s.jsx)(n.code,{children:"if/else"})," allows you to implement control flow in your programs, Conditional Branching allows you to add control flow to your LittleHorse Workflows."]}),"\n",(0,s.jsx)(n.p,{children:"Let's look at how an if statement works in Python:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-python",children:"if foo < bar:\n    do_something()\n"})}),"\n",(0,s.jsxs)(n.p,{children:["Look at the booean expression ",(0,s.jsx)(n.code,{children:"foo < bar"}),". It consists of a left-hand-side (",(0,s.jsx)(n.code,{children:"foo"}),"), comparator (",(0,s.jsx)(n.code,{children:"<"}),"), and right-hand-side (",(0,s.jsx)(n.code,{children:"bar"}),")."]}),"\n",(0,s.jsx)(n.p,{children:"In LittleHorse, we have Edge Conditions, which also have an LHS, Comparator, and RHS."}),"\n",(0,s.jsxs)(n.p,{children:["The LHS and RHS are any ",(0,s.jsx)(n.code,{children:"VariableAssignment"}),", meaning they can be a value taken from some ",(0,s.jsx)(n.code,{children:"Variable"})," or a hard-coded literal value."]}),"\n",(0,s.jsx)(n.h2,{id:"comparator-types",children:"Comparator Types"}),"\n",(0,s.jsx)(n.p,{children:"Let's look at all of the Comparators supported by LittleHorse."}),"\n",(0,s.jsx)(n.h3,{id:"less_than",children:(0,s.jsx)(n.code,{children:"LESS_THAN"})}),"\n",(0,s.jsxs)(n.p,{children:["This is equivalent to ",(0,s.jsx)(n.code,{children:"<"})," and is valid for ",(0,s.jsx)(n.code,{children:"STR"}),", ",(0,s.jsx)(n.code,{children:"INT"}),", ",(0,s.jsx)(n.code,{children:"DOUBLE"}),", and ",(0,s.jsx)(n.code,{children:"BOOL"})," RHS and LHS."]}),"\n",(0,s.jsxs)(n.p,{children:["Note that you may provide a ",(0,s.jsx)(n.code,{children:"JSON_OBJ"})," variable with a ",(0,s.jsx)(n.code,{children:"jsonPath"})," as one of your comparands so long as the result of evaluating the ",(0,s.jsx)(n.code,{children:"jsonPath"})," is a primitive type."]}),"\n",(0,s.jsxs)(n.p,{children:["For example, with the following ",(0,s.jsx)(n.code,{children:"JSON_OBJ"})," variable (let's say the variable is named ",(0,s.jsx)(n.code,{children:"myVar"}),"):"]}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{children:'{\n    "foo": "Hello, there!",\n    "bar": {\n        "baz": 1234\n    }\n}\n'})}),"\n",(0,s.jsx)(n.p,{children:"You could do the following in the Java SDK:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{children:'// myVar.bar.baz < 500\nthread.condition(myVar.jsonPath("$.bar.baz), ComparatorPb.LESS_THAN, 500)\n'})}),"\n",(0,s.jsx)(n.h3,{id:"greater_than",children:(0,s.jsx)(n.code,{children:"GREATER_THAN"})}),"\n",(0,s.jsxs)(n.p,{children:["This is the same as ",(0,s.jsx)(n.code,{children:"LESS_THAN"}),", except it corresponds to ",(0,s.jsx)(n.code,{children:">"}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"less_than_eq",children:(0,s.jsx)(n.code,{children:"LESS_THAN_EQ"})}),"\n",(0,s.jsxs)(n.p,{children:["This is the same as ",(0,s.jsx)(n.code,{children:"LESS_THAN"})," and ",(0,s.jsx)(n.code,{children:"GREATER_THAN"}),", except it corresponds to ",(0,s.jsx)(n.code,{children:"<="}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"greater_than_eq",children:(0,s.jsx)(n.code,{children:"GREATER_THAN_EQ"})}),"\n",(0,s.jsxs)(n.p,{children:["Well, you know the drill... ",(0,s.jsx)(n.code,{children:">="}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"equals",children:(0,s.jsx)(n.code,{children:"EQUALS"})}),"\n",(0,s.jsxs)(n.p,{children:["This is valid for any variable type, and is similar to ",(0,s.jsx)(n.code,{children:".equals()"})," in Java."]}),"\n",(0,s.jsxs)(n.p,{children:["One note: if the ",(0,s.jsx)(n.code,{children:"RHS"})," is a different type from the ",(0,s.jsx)(n.code,{children:"LHS"}),", then LittleHorse will try to cast the ",(0,s.jsx)(n.code,{children:"RHS"})," to the same type as the ",(0,s.jsx)(n.code,{children:"LHS"})," (see the ",(0,s.jsx)(n.code,{children:"Variables"})," section for more info). If the cast fails, then the ",(0,s.jsx)(n.code,{children:"ThreadRun"})," fails with a ",(0,s.jsx)(n.code,{children:"VAR_SUB_ERROR"}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"not_equals",children:(0,s.jsx)(n.code,{children:"NOT_EQUALS"})}),"\n",(0,s.jsxs)(n.p,{children:["This is the inverse of ",(0,s.jsx)(n.code,{children:"EQUALS"}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"in",children:(0,s.jsx)(n.code,{children:"IN"})}),"\n",(0,s.jsxs)(n.p,{children:["This is valid for any type on the ",(0,s.jsx)(n.code,{children:"LHS"})," and ",(0,s.jsx)(n.code,{children:"JSON_OBJ"})," and ",(0,s.jsx)(n.code,{children:"JSON_ARR"})," on the ",(0,s.jsx)(n.code,{children:"RHS"}),". For the ",(0,s.jsx)(n.code,{children:"JSON_OBJ"})," type, this returns true if the ",(0,s.jsx)(n.code,{children:"LHS"})," has a key which is equal to the ",(0,s.jsx)(n.code,{children:"RHS"}),". For the ",(0,s.jsx)(n.code,{children:"JSON_ARR"})," type, it returns true if one of the elements of the ",(0,s.jsx)(n.code,{children:"RHS"})," is equal to the ",(0,s.jsx)(n.code,{children:"LHS"}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"not_in",children:(0,s.jsx)(n.code,{children:"NOT_IN"})}),"\n",(0,s.jsxs)(n.p,{children:["This is the inverse of ",(0,s.jsx)(n.code,{children:"IN"}),"."]})]})}function h(e={}){const{wrapper:n}={...(0,i.R)(),...e.components};return n?(0,s.jsx)(n,{...e,children:(0,s.jsx)(a,{...e})}):a(e)}},8453:(e,n,o)=>{o.d(n,{R:()=>c,x:()=>r});var s=o(6540);const i={},d=s.createContext(i);function c(e){const n=s.useContext(d);return s.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function r(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(i):e.components||i:c(e.components),s.createElement(d.Provider,{value:n},e.children)}}}]);