const http=require("http");
const myserver=http.createServer(function(req,res){
res.end("HEllo SAthwik");
}).listen(9000, "127.0.0.1", ()=>{
console.log("Hello From Server");
})