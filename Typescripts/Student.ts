export class Student{
    stdID:number=123;
    stdName:String="Rithesh";
    stdMark:number=2345;

    constructor(i:number,n:string,s:number){
        this.stdID=i;
        this.stdName=n;
        this.stdMark=s;

    }
    display(){
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdMark);
    }
}
var s1=new Student(11,"sdfg",90);
s1.display();
