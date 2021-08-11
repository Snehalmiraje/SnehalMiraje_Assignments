"use strict";
var __spreadArray = (this && this.__spreadArray) || function (to, from) {
    for (var i = 0, il = from.length, j = to.length; i < il; i++, j++)
        to[j] = from[i];
    return to;
};
//Question 4
var names = ["snehal", "sachin", "aavi"];
var output = [];
for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
    var n_1 = names_1[_i];
    output.push("{" + n_1 + ": " + n_1.length + "}");
}
console.log(output);
//Question 5
//a
function add(a, b) {
    if (a === void 0) { a = 5; }
    if (b === void 0) { b = 8; }
    return (a + b);
}
console.log("Addtion with default values:", add());
//b
var userfriends = function (username) {
    var frdlist = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        frdlist[_i - 1] = arguments[_i];
    }
    console.log("names of user is : ", username);
    console.log("Frds os user are/is: ");
    for (var _a = 0, frdlist_1 = frdlist; _a < frdlist_1.length; _a++) {
        var f_1 = frdlist_1[_a];
        console.log(f_1);
    }
};
var username = "snehal";
var username2 = "sachin";
userfriends(username, 's');
userfriends(username2, 's', 'b', 'c');
var printCapitalName = function (msg) {
    var usernames = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        usernames[_i - 1] = arguments[_i];
    }
    console.log(msg);
    for (var _a = 0, usernames_1 = usernames; _a < usernames_1.length; _a++) {
        var n_2 = usernames_1[_a];
        console.log(n_2.toUpperCase());
    }
};
var usernames = ["snehal", "sachin", "aavi", "ravina"];
var msg = "Names in capital";
printCapitalName.apply(void 0, __spreadArray([msg], usernames));
