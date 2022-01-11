function getArray(items) {
    return new Array().concat(items);
}
var MyNumArr = getArray([1, 2, 3]);
var MyStrArr = getArray(["Hello", "Bye"]);
MyNumArr.push(10);
MyStrArr.push("Hi");
MyStrArr.push(10);
MyNumArr.push("500");
console.log(MyNumArr);
console.log(MyStrArr);
