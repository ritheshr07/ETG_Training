class TShirt{
    color:string;
    material:string;
    design:string;
    size:String;
    constructor(c:string,m:string,d:string,s:string){
        this.color=c;
        this.material=m;
        this.design=d;
        this.size=s;

    }
    display(){
        console.log("\n Color - " + this.color+" \n Material - " + this.material + "\n Design - "  + this.design + "\n Size- "  + this.size );
    }
}
var small = new TShirt("Orange","cotton","round-neck","small");
small.display();
var large = new TShirt("yellow","lenin","V-neck","Large");
large.display();
var xlarge = new TShirt("blue","silk","Collered-neck","Xtra-Large");
xlarge.display();