"use strict";
exports.__esModule = true;
var PersonDetails = /** @class */ (function () {
    function PersonDetails() {
    }
    PersonDetails.prototype.getFullname = function () {
        return this.first + this.last;
    };
    return PersonDetails;
}());
var p1 = new PersonDetails();
p1.first = "Rithesh";
p1.last = " R ";
console.log(p1.getFullname());
