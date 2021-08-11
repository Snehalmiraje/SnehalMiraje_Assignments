"use strict";
var promise1 = new Promise(function (resolve) {
    resolve(11);
});
var promise2 = new Promise(function (resolve) {
    resolve(25);
});
Promise.all([promise1, promise2]).then(function (values) {
    var sum = 0;
    sum = Number(values[0]) + Number(values[1]);
    console.log(sum);
});
