const myfs=require("fs")
const mybuf_data=myfs.readFileSync("data.txt");
console.log(mybuf_data);
const orgData=mybuf_data.toString();
console.log(orgData);