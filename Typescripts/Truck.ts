import { Car } from "./Car";

class Truck extends Car{

    weight:Number;

    getSalePrice(): void {

        if(this.weight >2000){
            var pc = this.regularPrice - (this.regularPrice*.1);
            console.log(pc);
        }

        else{
            var pc = this.regularPrice - (this.regularPrice*.2);
            console.log(pc);
        }

    }

}
var t1 = new Truck();
t1.weight=3000;
t1.regularPrice=4000;
t1.speed = 80;
t1.color= "Orange";
t1.getSalePrice();