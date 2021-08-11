"use strict";
//array of colors
var array = ["red", "voilet", "blue", "green"];
//arrow function with slice method:
var nthElement = function (arr, n) {
    if (n === void 0) { n = 1; }
    return (n > 0 ? arr.slice(n - 1, n) : arr.slice(n - 1))[0];
};
console.log(nthElement(array, 3));
var color = array[2];
console.log(color);
var org = {
    name: "snehal",
    address: {
        city: "kolhapur",
        pincode: 416121
    }
};
if (org.address.pincode === 416121)
    console.log(org.address.pincode);
