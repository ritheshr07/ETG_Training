var Products = /** @class */ (function () {
    function Products() {
    }
    Products.prototype.display = function () {
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    };
    Products.prototype.productPrice = function () {
        var proPrice = (this.price * 0.12) + this.price;
        console.log(proPrice);
    };
    return Products;
}());
var pr1 = new Products();
pr1.pid = 1;
pr1.pname = "Book";
pr1.price = 200.00;
pr1.display();
pr1.productPrice();
