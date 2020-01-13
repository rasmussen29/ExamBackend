(this.webpackJsonptask_nested=this.webpackJsonptask_nested||[]).push([[0],{21:function(e,t,a){e.exports=a(32)},26:function(e,t,a){},32:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),r=a(17),c=a.n(r),s=(a(26),a(10)),o=a(5),i="https://mostedwear.dk/exam";function m(e){return e.ok?e.json():window.M.toast({html:"Serveren returnerede fejlkode: "+e.status})}var u=function(){var e=function(e){localStorage.setItem("jwtToken",e)},t=function(){return localStorage.getItem("jwtToken")},a=function(){var e=null!=t();return e},n=function(e,n,l){var r={method:e,headers:{"Content-type":"application/json",Accept:"application/json"}};return n&&a()&&(r.headers["x-access-token"]=t()),l&&(r.body=JSON.stringify(l)),r};return{makeOptions:n,setToken:e,getToken:t,loggedIn:a,login:function(t,a){var l=n("POST",!0,{username:t,password:a});return fetch(i+"/api/login",l).then(m).then((function(t){e(t.token)}))},logout:function(){localStorage.removeItem("jwtToken")},fetchData:function(e){var t=n("GET",!0);return fetch(i+"/api/info/"+e,t).then(m)},fetch_AllRecipes:function(e){return fetch(i+"/api/madplan/all").then(m)},search:function(e){var t=n("POST",!0,{id:e});return fetch(i+"/api/madplan/search",t).then(m)}}}();function E(){return l.a.createElement("div",null,l.a.createElement("center",null,l.a.createElement("h5",null,"Opskrifter")),l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"s12"},l.a.createElement(f,null),l.a.createElement(d,null))))}var d=function(){var e=Object(n.useState)([]),t=Object(o.a)(e,2),a=t[0],r=t[1];return Object(n.useEffect)((function(){u.fetch_AllRecipes().then((function(e){return r(e)}))}),[a]),l.a.createElement("div",null,l.a.createElement("center",null,l.a.createElement("p",null,"Alle recipes fra API")),l.a.createElement("center",null,l.a.createElement("p",null,"Fandt: ",l.a.createElement("b",null,a.length," "),"afgange")),a.map((function(e){return l.a.createElement("div",{class:"col s4"},l.a.createElement("div",{class:"card horizontal",style:{width:"100%",height:"300px"}},l.a.createElement("div",{class:"card-image teal"},l.a.createElement("p",{style:{writingMode:"vertical-rl",marginTop:"30px",color:"white"}},l.a.createElement("b",null,"RECIPE"))),l.a.createElement("div",{class:"card-stacked"},l.a.createElement("div",{class:"card-content"},l.a.createElement("p",null,l.a.createElement("b",null,e.id)),l.a.createElement("p",null,e.description),l.a.createElement("br",null),l.a.createElement("p",null,e.prep_time)),l.a.createElement("div",{class:"card-action"},l.a.createElement("div",null,l.a.createElement("button",{className:"waves-effect waves-light btn"},"Gem"))))))})))};function f(){var e=Object(n.useState)({id:""}),t=Object(o.a)(e,2),a=t[0],r=t[1],c=Object(n.useState)([]),i=Object(o.a)(c,2),m=i[0],E=i[1];return l.a.createElement("div",null,l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"offset-s3 col s6 offset-s3"},l.a.createElement("div",{class:"card-panel"},l.a.createElement("form",{onChange:function(e){r(Object(s.a)({searchInfo:a},e.target.id,e.target.value))},style:{display:"inline-block",width:"100%"}},l.a.createElement("br",null),l.a.createElement("div",{class:"row",style:{width:"100%"}},l.a.createElement("div",{class:"col",style:{width:"100%"}},l.a.createElement("p",null,"S\xf8g efter: "),l.a.createElement("input",{id:"id",type:"text",class:"validate",style:{borderBottom:"2px solid red",display:"inline"},required:!0}))),l.a.createElement("br",null),l.a.createElement("button",{className:"waves-effect waves-light btn",onClick:function(e){e.preventDefault(),u.search(a.id).then((function(e){return E(e)}))}},"Find opskrift"),l.a.createElement("br",null))))),l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"s12"},l.a.createElement(p,{searchData:m}))))}function p(e){var t=e.searchData;return l.a.createElement("div",null,t.map((function(e){return l.a.createElement("div",{class:"col s4"},l.a.createElement("div",{class:"card horizontal",style:{width:"100%",height:"300px"}},l.a.createElement("div",{class:"card-image teal"},l.a.createElement("p",{style:{writingMode:"vertical-rl",marginTop:"30px",color:"white"}},l.a.createElement("b",null,"RECIPE"))),l.a.createElement("div",{class:"card-stacked"},l.a.createElement("div",{class:"card-content"},l.a.createElement("p",null,l.a.createElement("b",null,e.id)),l.a.createElement("p",null,e.description),l.a.createElement("br",null),l.a.createElement("p",null,e.prep_time)),l.a.createElement("div",{class:"card-action"},l.a.createElement("div",null,l.a.createElement("button",{className:"waves-effect waves-light btn"},"Gem"))))))})))}function v(){return window.M.toast({html:"Velkommen til MadPlan!"}),l.a.createElement("div",null,l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"offset-s4 col s4 offset-s4"},l.a.createElement("br",null),l.a.createElement("center",null,l.a.createElement("img",{style:{width:"100%"},src:"/madplan.jpg",alt:""}),l.a.createElement("h5",null,"Madplanl\xe6gning gjort nemt"),l.a.createElement("br",null),l.a.createElement("p",null,"Det kan v\xe6re sv\xe6rt at lave en madplan til ugen, som rent faktisk bliver overholdt. Det kan ogs\xe5 v\xe6re sv\xe6rt at skulle finde p\xe5 mad til s\xe5 mange dage, n\xe5r det b\xe5de skal v\xe6re sund og varieret kost.")))))}function g(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),a.push.apply(a,n)}return a}function h(e){var t=e.login,a=Object(n.useState)({username:"",password:""}),r=Object(o.a)(a,2),c=r[0],i=r[1];return l.a.createElement("div",null,l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"offset-s4 col s4 offset-s4"},l.a.createElement("div",{class:"card-panel"},l.a.createElement("form",{onChange:function(e){i(function(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?g(a,!0).forEach((function(t){Object(s.a)(e,t,a[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):g(a).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))}))}return e}({},c,Object(s.a)({},e.target.id,e.target.value)))},style:{display:"inline-block"}},l.a.createElement("br",null),l.a.createElement("div",{class:"col s12"},l.a.createElement("input",{placeholder:"Brugernavn",id:"username"})),l.a.createElement("div",{class:"col s12"},l.a.createElement("input",{placeholder:"Adgangskode",id:"password"})),l.a.createElement("br",null),l.a.createElement("div",{class:"col s12"},l.a.createElement("button",{className:"waves-effect waves-light btn",onClick:function(e){e.preventDefault(),t(c.username,c.password)}},"Login")),l.a.createElement("br",null))))))}function b(e){var t=e.user,a=Object(n.useState)("Loading..."),r=Object(o.a)(a,2),c=r[0],s=r[1];return Object(n.useEffect)((function(){u.fetchData(t).then((function(e){return s(e.msg)}))}),[t]),l.a.createElement("div",null,c)}function w(){var e=Object(n.useState)(!1),t=Object(o.a)(e,2),a=t[0],r=t[1],c=Object(n.useState)(""),s=Object(o.a)(c,2),i=s[0],m=s[1],E=function(){u.logout(),r(!1)},d=localStorage.getItem("jwtToken");return l.a.createElement("div",null,l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"offset-s4 col s4 offset-s4"},l.a.createElement("br",null),l.a.createElement("center",null,l.a.createElement("h5",null,"Login"),l.a.createElement("hr",null),l.a.createElement("p",null,"Log ind for at kunne gemme dine ugeplaner")))),a?l.a.createElement("div",null,l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"offset-s3 col s6 offset-s3"},l.a.createElement("div",{class:"card-panel"},l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"col s12"},l.a.createElement("p",{className:"LoggedInP"},"Du er nu logget ind"),l.a.createElement("hr",null),l.a.createElement("p",null,"Serveren svarede: "),l.a.createElement("p",{className:"pnoOverflow",style:{fontSize:"12px"}},l.a.createElement(b,{user:i})),l.a.createElement("p",{className:"pnoOverflow",style:{fontSize:"12px"}},l.a.createElement("b",null,"Token: "),d),l.a.createElement("br",null),l.a.createElement("button",{className:"waves-effect waves-light btn",onClick:E},"Opret ugeplan"),l.a.createElement("hr",null),l.a.createElement("button",{className:"waves-effect waves-light btn",onClick:E},"Log ud"))))))):l.a.createElement(h,{login:function(e,t){u.login(e,t).then((function(e){return r(!0)})),m(e)}}))}function O(){return l.a.createElement("div",null,l.a.createElement("div",{class:"row"},l.a.createElement("div",{class:"offset-s4 col s4 offset-s4"},l.a.createElement("center",null,l.a.createElement("img",{style:{width:"60%"},src:"/rushflight.png",alt:""}),l.a.createElement("h5",null,"CPHBusiness Exam Project")))))}var j=a(8),k=a(6),y=function(){return l.a.createElement("nav",{style:{marginBottom:"40px"}},l.a.createElement("div",{class:"nav-wrapper"},l.a.createElement("h5",{className:"headerlogo",style:{display:"inline"}},l.a.createElement("b",{style:{color:"#01BD9C"}},"Mad"),"Plan"),l.a.createElement("ul",{id:"nav-mobile",className:"right"},l.a.createElement("li",null,l.a.createElement(j.b,{exact:!0,to:"/"},"Startside")),l.a.createElement("li",null,l.a.createElement(j.b,{exact:!0,to:"/showroom"},"Opskrifter",l.a.createElement("span",{class:"new badge"},"2"))),l.a.createElement("li",null,l.a.createElement(j.b,{exact:!0,to:"/login"},"Login")),l.a.createElement("li",null,l.a.createElement(j.b,{exact:!0,to:"/omos"},"Om os")))))};a(31);var S=a(20);a.n(S).a.AutoInit(),c.a.render(l.a.createElement((function(){return l.a.createElement(j.a,null,l.a.createElement(y,null),l.a.createElement(k.c,null,l.a.createElement(k.a,{exact:!0,path:"/"},l.a.createElement(v,null)),l.a.createElement(k.a,{exact:!0,path:"/showroom"},l.a.createElement(E,null)),l.a.createElement(k.a,{exact:!0,path:"/login"},l.a.createElement(w,null)),l.a.createElement(k.a,{exact:!0,path:"/omos"},l.a.createElement(O,null))))}),null),document.getElementById("root"))}},[[21,1,2]]]);
//# sourceMappingURL=main.667e0263.chunk.js.map