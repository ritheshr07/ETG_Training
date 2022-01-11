var TShirt = /** @class */ (function () {
    function TShirt(c, m, d, s) {
        this.color = c;
        this.material = m;
        this.design = d;
        this.size = s;
    }
    TShirt.prototype.display = function () {
        console.log("\n Color - " + this.color + " \n Material - " + this.material + "\n Design - " + this.design + "\n Size- " + this.size);
    };
    return TShirt;
}());
var small = new TShirt("Orange", "cotton", "round-neck", "small");
small.display();
var large = new TShirt("yellow", "lenin", "V-neck", "Large");
large.display();
var xlarge = new TShirt("blue", "silk", "Collered-neck", "Xtra-Large");
xlarge.display();
