"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(i, n, s) {
        this.stdID = 123;
        this.stdName = "Rithesh";
        this.stdMark = 2345;
        this.stdID = i;
        this.stdName = n;
        this.stdMark = s;
    }
    Student.prototype.display = function () {
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdMark);
    };
    return Student;
}());
exports.Student = Student;
var s1 = new Student(11, "sdfg", 90);
s1.display();
