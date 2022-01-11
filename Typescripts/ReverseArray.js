var ReverseArray = /** @class */ (function () {
    function ReverseArray() {
        this.num = [0, 1, 2, 3].reverse();
    }
    ReverseArray.prototype.display = function () {
        console.log("the reverse order is: " + this.num);
    };
    return ReverseArray;
}());
var r = new ReverseArray();
r.display();
