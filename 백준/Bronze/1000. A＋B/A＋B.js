var fs = require('fs');
var input = fs.readFileSync('dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
var c = a+b;

console.log(c);