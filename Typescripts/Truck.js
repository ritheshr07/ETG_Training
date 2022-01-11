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
exports.__esModule = true;
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000) {
            var pc = this.regularPrice - (this.regularPrice * .1);
            console.log(pc);
        }
        else {
            var pc = this.regularPrice - (this.regularPrice * .2);
            console.log(pc);
        }
    };
    return Truck;
}(Car_1.Car));
var t1 = new Truck();
t1.weight = 3000;
t1.regularPrice = 4000;
t1.speed = 80;
t1.color = "Orange";
t1.getSalePrice();
