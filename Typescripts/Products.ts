class Products{
    pid:number;
    pname:string;
    price:number;

    display(){
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    }
    productPrice(){

        var proPrice = (this.price * 0.12)+this.price;

        console.log(proPrice);

    }
}
var pr1=new Products();
pr1.pid=1;
pr1.pname="Book";
pr1.price=200.00;
pr1.display();
pr1.productPrice();