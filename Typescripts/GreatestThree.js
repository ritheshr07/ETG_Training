var GreatestThree = /** @class */ (function () {
    function GreatestThree() {
        this.num1 = 12;
        this.num2 = 25;
        this.num3 = 89;
    }
    GreatestThree.prototype.greater = function () {
        if ((this.num1 > this.num2) && (this.num1 > this.num3)) {
            console.log(this.num1);
        }
        else if ((this.num2 > this.num1) && (this.num2 > this.num3)) {
            console.log(this.num2);
        }
        else {
            console.log(this.num3);
        }
    };
    return GreatestThree;
}());
var greater1 = new GreatestThree();
greater1.greater();
