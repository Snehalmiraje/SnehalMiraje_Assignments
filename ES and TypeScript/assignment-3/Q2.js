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
var Account1 = /** @class */ (function () {
    function Account1(id, Accname, balance) {
        this.id = id;
        this.ACCname = Accname;
        this.balance = balance;
    }
    Account1.prototype.getbalance = function () {
        return this.balance;
    };
    Account1.totalAccB = 0;
    return Account1;
}());
var savingsAcc1 = /** @class */ (function (_super) {
    __extends(savingsAcc1, _super);
    function savingsAcc1(id, accname, balance, cash) {
        var _this = _super.call(this, id, accname, balance) || this;
        _this.interest = cash;
        Account.totalAccB = Account.totalAccB + balance + cash;
        return _this;
    }
    savingsAcc1.prototype.total = function () {
        return this.getbalance() + this.interest;
    };
    return savingsAcc1;
}(Account));
var currentAcc1 = /** @class */ (function (_super) {
    __extends(currentAcc1, _super);
    function currentAcc1(id, accname, balance, cash) {
        var _this = _super.call(this, id, accname, balance) || this;
        _this.cashcredit = cash;
        Account.totalAccB = Account.totalAccB + balance + cash;
        return _this;
    }
    currentAcc1.prototype.total = function () {
        return this.getbalance() + this.cashcredit;
    };
    return currentAcc1;
}(Account));
var sn = new savingsAcc(1, "s", 1000, 100);
var cm = new currentAcc(2, "c", 2000, 200);
var s11 = new savingsAcc(3, "s1", 3000, 300);
var c11 = new currentAcc(4, "c1", 4000, 400);
console.log("Total balance in savings account" + sn.total());
console.log("Total balance in current account" + cm.total());
console.log("Total balance in bank " + Account.totalAccB);
