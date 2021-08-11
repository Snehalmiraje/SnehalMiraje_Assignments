"use strict";
var names = ["snehal", "sachin", "aavi"];
var output = [];
for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
    var n = names_1[_i];
    output.push("{" + n + ": " + n.length + "}");
}
console.log(output);
