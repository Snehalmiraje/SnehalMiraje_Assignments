"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, Accname, balance) {
        this.id = id;
        this.ACCname = Accname;
        this.balance = balance;
    }
    Account.prototype.getbalance = function () {
        return this.balance;
    };
    Account.totalAccB = 0;
    return Account;
}());
var savingsAcc = /** @class */ (function (_super) {
    __extends(savingsAcc, _super);
    function savingsAcc(id, accname, balance, cash) {
        var _this = _super.call(this, id, accname, balance) || this;
        _this.interest = cash;
        Account.totalAccB = Account.totalAccB + balance + cash;
        return _this;
    }
    savingsAcc.prototype.total = function () {
        return this.getbalance() + this.interest;
    };
    return savingsAcc;
}(Account));
var currentAcc = /** @class */ (function (_super) {
    __extends(currentAcc, _super);
    function currentAcc(id, accname, balance, cash) {
        var _this = _super.call(this, id, accname, balance) || this;
        _this.cashcredit = cash;
        Account.totalAccB = Account.totalAccB + balance + cash;
        return _this;
    }
    currentAcc.prototype.total = function () {
        return this.getbalance() + this.cashcredit;
    };
    return currentAcc;
}(Account));
var s = new savingsAcc(1, "s", 1000, 100);
var c = new currentAcc(2, "c", 2000, 200);
var s1 = new savingsAcc(3, "s1", 3000, 300);
var c1 = new currentAcc(4, "c1", 4000, 400);
console.log("Total balance in savings account" + s.total());
console.log("Total balance in current account" + c.total());
console.log("Total balance in bank " + Account.totalAccB);
