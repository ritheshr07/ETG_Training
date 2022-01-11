import { PersonInterface } from "./PersonInterface";



class PersonDetails implements PersonInterface{

    first: string;

    last: string;



    getFullname(): string {

        return this.first+this.last;

    }

}



var p1 = new PersonDetails();

p1.first="Rithesh";

p1.last=" R ";

console.log(p1.getFullname());