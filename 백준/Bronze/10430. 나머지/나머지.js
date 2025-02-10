const fs = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(val=>+val);
const [a,b,c] = fs;

var result1 = (a+b)%c;
var result2 = ((a%c)+(b%c))%c;
var result3 = (a*b)%c;
var result4 = ((a%c)*(b%c))%c;
    
console.log(result1);
console.log(result2);
console.log(result3);
console.log(result4);
