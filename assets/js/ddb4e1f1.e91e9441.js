"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[5185],{3905:(e,t,o)=>{o.d(t,{Zo:()=>c,kt:()=>m});var a=o(7294);function r(e,t,o){return t in e?Object.defineProperty(e,t,{value:o,enumerable:!0,configurable:!0,writable:!0}):e[t]=o,e}function n(e,t){var o=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),o.push.apply(o,a)}return o}function i(e){for(var t=1;t<arguments.length;t++){var o=null!=arguments[t]?arguments[t]:{};t%2?n(Object(o),!0).forEach((function(t){r(e,t,o[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(o)):n(Object(o)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(o,t))}))}return e}function s(e,t){if(null==e)return{};var o,a,r=function(e,t){if(null==e)return{};var o,a,r={},n=Object.keys(e);for(a=0;a<n.length;a++)o=n[a],t.indexOf(o)>=0||(r[o]=e[o]);return r}(e,t);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);for(a=0;a<n.length;a++)o=n[a],t.indexOf(o)>=0||Object.prototype.propertyIsEnumerable.call(e,o)&&(r[o]=e[o])}return r}var l=a.createContext({}),u=function(e){var t=a.useContext(l),o=t;return e&&(o="function"==typeof e?e(t):i(i({},t),e)),o},c=function(e){var t=u(e.components);return a.createElement(l.Provider,{value:t},e.children)},p="mdxType",d={inlineCode:"code",wrapper:function(e){var t=e.children;return a.createElement(a.Fragment,{},t)}},h=a.forwardRef((function(e,t){var o=e.components,r=e.mdxType,n=e.originalType,l=e.parentName,c=s(e,["components","mdxType","originalType","parentName"]),p=u(o),h=r,m=p["".concat(l,".").concat(h)]||p[h]||d[h]||n;return o?a.createElement(m,i(i({ref:t},c),{},{components:o})):a.createElement(m,i({ref:t},c))}));function m(e,t){var o=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var n=o.length,i=new Array(n);i[0]=h;var s={};for(var l in t)hasOwnProperty.call(t,l)&&(s[l]=t[l]);s.originalType=e,s[p]="string"==typeof e?e:r,i[1]=s;for(var u=2;u<n;u++)i[u]=o[u];return a.createElement.apply(null,i)}return a.createElement.apply(null,o)}h.displayName="MDXCreateElement"},8758:(e,t,o)=>{o.r(t),o.d(t,{assets:()=>l,contentTitle:()=>i,default:()=>d,frontMatter:()=>n,metadata:()=>s,toc:()=>u});var a=o(7462),r=(o(7294),o(3905));const n={},i="LittleHorse Overview",s={unversionedId:"overview",id:"overview",title:"LittleHorse Overview",description:"The LittleHorse Server is a high-performance platform for building workflow-driven applications for a variety of use-cases, including:",source:"@site/docs/01-overview.md",sourceDirName:".",slug:"/overview",permalink:"/littlehorse/docs/overview",draft:!1,tags:[],version:"current",sidebarPosition:1,frontMatter:{},sidebar:"tutorialSidebar",next:{title:"Architecture and Guarantees",permalink:"/littlehorse/docs/architecture-and-guarantees"}},l={},u=[{value:"How it Works",id:"how-it-works",level:2},{value:"Run an App",id:"run-an-app",level:3},{value:"Define Your <code>WfSpec</code>",id:"define-your-wfspec",level:4},{value:"Write Task Workers",id:"write-task-workers",level:4},{value:"Run a <code>WfRun</code>",id:"run-a-wfrun",level:4},{value:"Features",id:"features",level:2},{value:"Connect to Anything",id:"connect-to-anything",level:3},{value:"Support Mission-Critical Workflows",id:"support-mission-critical-workflows",level:3},{value:"Highly Secure",id:"highly-secure",level:3},{value:"High Performance",id:"high-performance",level:3},{value:"User Tasks",id:"user-tasks",level:3},{value:"What LittleHorse is NOT",id:"what-littlehorse-is-not",level:2},{value:"Fully-Featured Database",id:"fully-featured-database",level:3},{value:"Vertical Solution",id:"vertical-solution",level:3},{value:"A Container Runtime",id:"a-container-runtime",level:3},{value:"API Management System",id:"api-management-system",level:3},{value:"ETL System",id:"etl-system",level:3},{value:"Service Mesh",id:"service-mesh",level:3},{value:"Get Started",id:"get-started",level:2}],c={toc:u},p="wrapper";function d(e){let{components:t,...n}=e;return(0,r.kt)(p,(0,a.Z)({},c,n,{components:t,mdxType:"MDXLayout"}),(0,r.kt)("h1",{id:"littlehorse-overview"},"LittleHorse Overview"),(0,r.kt)("p",null,"The LittleHorse Server is a high-performance platform for building workflow-driven applications for a variety of use-cases, including:"),(0,r.kt)("ul",null,(0,r.kt)("li",{parentName:"ul"},"Business Process Management"),(0,r.kt)("li",{parentName:"ul"},"Logistics Automation"),(0,r.kt)("li",{parentName:"ul"},"Financial Transactions"),(0,r.kt)("li",{parentName:"ul"},"SAGA Transactions"),(0,r.kt)("li",{parentName:"ul"},"Event-Driven Microservices"),(0,r.kt)("li",{parentName:"ul"},"And more.")),(0,r.kt)("p",null,"Building applications on LittleHorse enables engineering teams to save on infrastructure costs, reduce time to market, and deliver more robust software with less downtime."),(0,r.kt)("p",null,"The code for the LittleHorse Server and all clients is available at ",(0,r.kt)("a",{parentName:"p",href:"https://github.com/littlehorse-enterprises/littlehorse"},"our github"),". All code is free for production use under the Server-Side Public License. "),(0,r.kt)("h2",{id:"how-it-works"},"How it Works"),(0,r.kt)("p",null,"An application built on LittleHorse has the following three components:"),(0,r.kt)("ul",null,(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"WfSpec")," Workflow Definition"),(0,r.kt)("li",{parentName:"ul"},"LittleHorse Server"),(0,r.kt)("li",{parentName:"ul"},"Task Workers")),(0,r.kt)("p",null,"The ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),", short for Workflow Specification, is a metadata object that tells the LittleHorse Server which Tasks to schedule and when they should be scheduled. The Task Workers connect to the LittleHorse Server and execute Tasks as they are scheduled."),(0,r.kt)("p",null,"You as the user of LittleHorse define your own ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),"s, and write your own Task Workers which connect to the LH Server."),(0,r.kt)("p",null,"A depiction of where LittleHorse sits in the tech stack can be seen below:"),(0,r.kt)("p",null,(0,r.kt)("img",{alt:"Depiction of LittleHorse Stack",src:o(8843).Z,width:"1117",height:"479"})),(0,r.kt)("p",null,"You can think of LittleHorse as Middleware software that sits in the same layer as your database. End-user software applications occupy the layer above LittleHorse and ",(0,r.kt)("em",{parentName:"p"},"use")," LittleHorse to support a vertical business process."),(0,r.kt)("h3",{id:"run-an-app"},"Run an App"),(0,r.kt)("p",null,"To build an application with LittleHorse, there are three easy steps:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},"Define your ",(0,r.kt)("inlineCode",{parentName:"li"},"WfSpec")),(0,r.kt)("li",{parentName:"ol"},"Develop your Task Workers"),(0,r.kt)("li",{parentName:"ol"},"Run your ",(0,r.kt)("inlineCode",{parentName:"li"},"WfRun"),"!")),(0,r.kt)("h4",{id:"define-your-wfspec"},"Define Your ",(0,r.kt)("inlineCode",{parentName:"h4"},"WfSpec")),(0,r.kt)("p",null,"In LittleHorse, a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," is a template that defines the logical steps for a certain process or workflow. It contains a set of steps (",(0,r.kt)("inlineCode",{parentName:"p"},"Node"),"s), and flow between those steps (",(0,r.kt)("inlineCode",{parentName:"p"},"Edge"),"s). For example, in an e-commerce application, you might write a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," to orchestrate your checkout process:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},"Update the status of the ",(0,r.kt)("inlineCode",{parentName:"li"},"Order")," in your database."),(0,r.kt)("li",{parentName:"ol"},"Reserve items in your inventory."),(0,r.kt)("li",{parentName:"ol"},"Charge the customer's credit card."),(0,r.kt)("li",{parentName:"ol"},"Notify the customer that the order was completed.")),(0,r.kt)("p",null,"If step #2 or #3 fails, then your ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," would have logic to update the ",(0,r.kt)("inlineCode",{parentName:"p"},"Order")," to failed and notify the customer accordingly."),(0,r.kt)("p",null,(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),"s can be developed in code, using our Java, Go, or Python SDK's. We have ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/developer-guide/wfspec-development/"},"extensive documentation")," for building ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),"s."),(0,r.kt)("h4",{id:"write-task-workers"},"Write Task Workers"),(0,r.kt)("p",null,"A Task Worker is a computer system which connects to LittleHorse, listens to a task queue, and executes a ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/concepts/tasks"},(0,r.kt)("inlineCode",{parentName:"a"},"TaskRun"))," as necessary. In the above e-commerce example, you would have a Task Worker for each step in the ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),"."),(0,r.kt)("p",null,"It is simple to develop a Task Worker. Depending on which language you choose, you only need to write a handful of lines of code to integrate existing systems with LittleHorse as a Task Worker. Basically, any normal method or function can be converted to a LittleHorse Task Worker with no modifications. See our ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/developer-guide/task-worker-development"},"documentation")," for how to develop Task Workers."),(0,r.kt)("h4",{id:"run-a-wfrun"},"Run a ",(0,r.kt)("inlineCode",{parentName:"h4"},"WfRun")),(0,r.kt)("p",null,"Once your ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," is defined, and your Task Workers are polling for ",(0,r.kt)("inlineCode",{parentName:"p"},"TaskRun"),"s to execute, all you need to do is run your ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRun"),"! You can test it out with our CLI, or build a production-ready API that uses our grpc client and executes the ",(0,r.kt)("inlineCode",{parentName:"p"},"RunWf")," grpc call. See ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/developer-guide/grpc/"},"our grpc docs")," for how to run a workflow."),(0,r.kt)("h2",{id:"features"},"Features"),(0,r.kt)("p",null,"At LittleHorse, we spent almost two years developing a cutting-edge system from the ground up so that we could provide you with a platform to future-proof your applications. Best of all, LittleHorse's source code is available and free for production use under the SSPL."),(0,r.kt)("h3",{id:"connect-to-anything"},"Connect to Anything"),(0,r.kt)("p",null,"LittleHorse has clients in Java, Go, and Python, with a .NET release coming in ",(0,r.kt)("inlineCode",{parentName:"p"},"0.6.0"),". This allows you to easily integrate existing systems into a LittleHorse Workflow with minimal code change (in Java, for example, all you need to do to turn a Method into a LittleHorse Task Worker is add the ",(0,r.kt)("inlineCode",{parentName:"p"},"@LHTaskMethod")," annotation)."),(0,r.kt)("p",null,"Additionally, LittleHorse supports integration with external systems through the ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/concepts/external-events"},"External Event")," feature, which allows LittleHorse Workflows to respond to events originating outside of the LittleHorse ecosystem."),(0,r.kt)("h3",{id:"support-mission-critical-workflows"},"Support Mission-Critical Workflows"),(0,r.kt)("p",null,"All data in LittleHorse Cloud is synchronously replicated into three separate datacenters (for example, AWS Availability Zones). LittleHorse has automated failover such that, if a server or even an entire datacenter fails, your workloads will promptly resume making progress on another data center (failover can be as low as 20 seconds)."),(0,r.kt)("p",null,"Due to the synchronous nature of LittleHorse replication, we support an RPO of zero (no data loss) when failing over due to a server crash."),(0,r.kt)("h3",{id:"highly-secure"},"Highly Secure"),(0,r.kt)("p",null,"LittleHorse natively implements OAuth, TLS, and mTLS for authentication and encryption. Release ",(0,r.kt)("inlineCode",{parentName:"p"},"0.7.0")," will include fine-grained ACL's to further lock down the system. Additionally, LittleHorse can be deployed into your own infrastructure (on-prem, private, or public cloud) so that no data leaves your four walls."),(0,r.kt)("h3",{id:"high-performance"},"High Performance"),(0,r.kt)("p",null,"The LittleHorse Scheduler can scale horizontally to dozens or hundreds of servers. With only a handful of LH Server ",(0,r.kt)("inlineCode",{parentName:"p"},"Pod"),"s utlizing a total of just 48 cores on AWS EKS, we were able to schedule over 15,000 tasks per second. We are confident that LittleHorse can scale to meet the demands of any customer's use case."),(0,r.kt)("p",null,"Additionally, LittleHorse is high-performance system that introduces minimal delay. The latency between a Task being completed and the next Task being scheduled can be as low as 12-20ms; for comparison, a leading competitor's delays can 100-300ms."),(0,r.kt)("h3",{id:"user-tasks"},"User Tasks"),(0,r.kt)("p",null,"LittleHorse has rich and native support for assigning work to humans as well as computers. With the ",(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/concepts/user-tasks"},"User Tasks")," feature, a Workflow can wait for a human to provide input, and then immediately resume and take action based on the result provided by the human. User Tasks support a variety of useful features, including:"),(0,r.kt)("ul",null,(0,r.kt)("li",{parentName:"ul"},"Assignment to users or groups of users"),(0,r.kt)("li",{parentName:"ul"},"Automatic reassignment based on deadlines"),(0,r.kt)("li",{parentName:"ul"},"Reminder notifications"),(0,r.kt)("li",{parentName:"ul"},"Rich API's for querying and executing User Tasks.")),(0,r.kt)("h2",{id:"what-littlehorse-is-not"},"What LittleHorse is NOT"),(0,r.kt)("p",null,"As the creator of LittleHorse, we believe that LittleHorse can help almost any IT organization. However, LittleHorse is able to excel at workflow-driven applications because we consciously decided ",(0,r.kt)("em",{parentName:"p"},"not")," to solve certain problems, listed below."),(0,r.kt)("h3",{id:"fully-featured-database"},"Fully-Featured Database"),(0,r.kt)("p",null,'LittleHorse is a special type of workflow engine for building workflow-driven applications and microservices. LittleHorse has a persistent storage layer which can be queried via the grpc API. It also has indexes which allow you to search for workflows based on the value of certain variables (eg. "find the workflow with ',(0,r.kt)("inlineCode",{parentName:"p"},"email == foo@bar.com"),'), workflow status (eg. "find all failed workflows in the last 2 days"), and workflow type. It is indeed possible to build a REST API using only LittleHorse as a data stores; in fact, it is often a good idea.'),(0,r.kt)("p",null,"However, LittleHorse's persistence layer is ",(0,r.kt)("em",{parentName:"p"},"not")," a general-purpose database. It lacks the rich feature set of SQL, and you cannot use LittleHorse as a store for arbitrary data structures. If your data model is not a workflow, LittleHorse cannot store it."),(0,r.kt)("h3",{id:"vertical-solution"},"Vertical Solution"),(0,r.kt)("p",null,"LittleHorse is intended to be used by Software Engineers ",(0,r.kt)("em",{parentName:"p"},"in any industry")," to build products that can be used by end-users. The current iteration is ",(0,r.kt)("em",{parentName:"p"},"not")," intended as a system to be used by Business Users to update business flows; rather, it is intended to ",(0,r.kt)("em",{parentName:"p"},"reduce the turnaround time")," when a Business User asks the IT Organization to implement a new application to automate a specific business flow."),(0,r.kt)("p",null,"However, LittleHorse has a certified implementation partner who can deliver a turnkey, end-to-end BPM solution to clients who require BPM solutions but do not have the engineering resources to implement one on their own."),(0,r.kt)("h3",{id:"a-container-runtime"},"A Container Runtime"),(0,r.kt)("p",null,'In the past, we described LittleHorse as a "microservice orchestration engine" because it orchestrates the activities of various microservices in a business flow. However, we no longer use that description since it causes confusion with Kubernetes, Nomad, Mesos, and other similar systems.'),(0,r.kt)("p",null,"Rather than being a competitor or replacement for the aforementioned runtime systems, LittleHorse is unopinionated about where your code runs. LittleHorse (and especially LittleHorse Cloud) is compatible with any deployment system; all you need to do is provide the LittleHorse Server URL to your software system and it is LittleHorse-enabled, no matter where it runs."),(0,r.kt)("h3",{id:"api-management-system"},"API Management System"),(0,r.kt)("p",null,"LittleHorse is not an API Management System like Apigee or Kong."),(0,r.kt)("h3",{id:"etl-system"},"ETL System"),(0,r.kt)("p",null,"LittleHorse is designed for dynamic, low-latency business process flows and not for bulk batch-loading flows or data transformation flows. We have a rich feature set which makes LittleHorse fantastic for orchestrating and debugging live (low-latency) workflow-driven applications and business process flows; however, LittleHorse's design lends itself less well for batch ETL and data ingestion + transformation."),(0,r.kt)("p",null,"For batch orchestration, we recommend systems like Airflow (",(0,r.kt)("a",{parentName:"p",href:"https://astronomer.io"},"Astronomer")," has a fantastic Cloud Service for Airflow)."),(0,r.kt)("p",null,"For data ingestion, consider systems like ",(0,r.kt)("a",{parentName:"p",href:"https://kafka.apache.org"},"Kafka")," and Kafka Connect; for data transformation and processing we would recommend considering ",(0,r.kt)("a",{parentName:"p",href:"https://kafka.apache.org/documentation/streams/"},"Kafka Streams")," or (if you need to process data outside of Kafka) ",(0,r.kt)("a",{parentName:"p",href:"https://flink.apache.org"},"Flink"),"."),(0,r.kt)("h3",{id:"service-mesh"},"Service Mesh"),(0,r.kt)("p",null,'To say that LittleHorse is "a system that intelligently routes tasks between your microservices" is mostly correct, but it is vague enough to mislead. In particular, you might ask, "doesn\'t a service mesh like Istio or a proxy like Envoy do the same?".'),(0,r.kt)("p",null,"Service mesh implementations such as ",(0,r.kt)("a",{parentName:"p",href:"https://istio.io"},"Istio")," provide many awesome features, but the two most common use-cases are securing traffic at the L4 layer (mTLS) and request routing, for example with a ",(0,r.kt)("a",{parentName:"p",href:"https://istio.io/latest/docs/reference/config/networking/virtual-service/"},(0,r.kt)("inlineCode",{parentName:"a"},"VirtualService")),"."),(0,r.kt)("p",null,"LittleHorse sits ",(0,r.kt)("em",{parentName:"p"},"above"),' the Istio layer. The LittleHorse Server is a server that LittleHorse Clients (eg. Task Workers and your Microservices) connect to. The Task Workers listen to virtual "task queues" within LittleHorse, and the LittleHorse Server dispatches ',(0,r.kt)("a",{parentName:"p",href:"/littlehorse/docs/concepts/tasks"},"Tasks")," to the Task Workers according to the workflows."),(0,r.kt)("admonition",{type:"note"},(0,r.kt)("p",{parentName:"admonition"},"When LittleHorse Cloud reaches general availability, we will ",(0,r.kt)("em",{parentName:"p"},"internally")," use Istio (as an implementation detail) in order to help secure traffic within our own clusters. We mention this because:"),(0,r.kt)("ol",{parentName:"admonition"},(0,r.kt)("li",{parentName:"ol"},"It illustrates that LittleHorse and Istio solve very different problems,"),(0,r.kt)("li",{parentName:"ol"},"LittleHorse is compatible with Istio, and"),(0,r.kt)("li",{parentName:"ol"},"We take security very seriously; Istio is one of many security layers we leverage in order to protect your data in LittleHorse Cloud."))),(0,r.kt)("h2",{id:"get-started"},"Get Started"),(0,r.kt)("p",null,"Want to painlessly automate your workflows?"),(0,r.kt)("ul",null,(0,r.kt)("li",{parentName:"ul"},"Check out our ",(0,r.kt)("a",{parentName:"li",href:"/littlehorse/docs/developer-guide/install"},"Quickstarts")),(0,r.kt)("li",{parentName:"ul"},"Join our ",(0,r.kt)("a",{parentName:"li",href:"https://launchpass.com/littlehorsecommunity"},"Slack Community")),(0,r.kt)("li",{parentName:"ul"},"Check out our code on ",(0,r.kt)("a",{parentName:"li",href:"https://github.com/littlehorse-enterprises/littlehorse"},"Github")),(0,r.kt)("li",{parentName:"ul"},"Request early access to ",(0,r.kt)("a",{parentName:"li",href:"https://docs.google.com/forms/d/e/1FAIpQLScXVvTYy4LQnYoFoRKRQ7ppuxe0KgncsDukvm96qKN0pU5TnQ/viewform?usp=sf_link"},"LittleHorse Cloud"))),(0,r.kt)("p",null,"Ride well!"))}d.isMDXComponent=!0},8843:(e,t,o)=>{o.d(t,{Z:()=>a});const a=o.p+"assets/images/littlehorse-in-the-stack-169df1cd38f1c4f2346c21f077419c7f.png"}}]);