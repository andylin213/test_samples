const express = require('express');
const testlib = require('testlib');
// const { exec } = require('child_process');
const app = express();

function source() {}
function sink(x) {}
function spread(x) {}
function ignore() {
   const x = source();
   sink(x);
}
function test(x, y) {
   sink(y);
}

//  主页输出 "Hello World"
app.get('/', function (req, res) {
   // const name = req.query.name;
   // exec(name);
   // res.send('Hello GET' + name);

   const a = source();
   const aa = spread(a);
   sink(aa);

   const b = testlib.source();
   const bb = testlib.spread(b);
   testlib.sink(bb);

   ignore();

   test(1, 2);
})
 
//
// var server = app.listen(8081, function () {
//
//   var host = server.address().address
//   var port = server.address().port
//
//   console.log("应用实例，访问地址为 http://%s:%s", host, port)
// })