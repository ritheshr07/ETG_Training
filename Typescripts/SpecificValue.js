var SpecificValue = /** @class */ (function () {
    function SpecificValue() {
        this.numarr = [1, 2, 3, 4];
    }
    SpecificValue.prototype.find = function () {
        for (this.i = 0; this.i < this.numarr.length; this.i = this.i + 1) {
            if (1 == this.numarr[this.i]) {
                console.log("number found");
            }
        }
    };
    return SpecificValue;
}());
var arr = new SpecificValue();
arr.find();
