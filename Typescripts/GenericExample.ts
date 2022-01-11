function getArray(items : any[] ): any[] {
return new Array().concat(items);
}

let MyNumArr=getArray([1,2,3]);
let MyStrArr=getArray(["Hello","Bye"]);

MyNumArr.push(10);MyStrArr.push("Hi");
MyStrArr.push(10);MyNumArr.push("500");

console.log(MyNumArr);
console.log(MyStrArr);

