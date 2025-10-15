const myfs=require("fs");
const bioData={
    name:"SAthwik",
    age:24,
    skill:"NodeJS Programmer"
}
console.log(bioData);
JSON.stringify(bioData)
var myData=JSON.stringify(bioData);
myfs.writeFile("myjsondata9.json",myData,(err)=>{
    console.log("process completed")
})
