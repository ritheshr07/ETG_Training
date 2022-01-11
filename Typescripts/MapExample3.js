var proArray=[
    {price:"100",product:"Mobile"},
    {price:"200",product:"Laptop"},
    {price:"300",product:"Mic"},
    {price:"400",product:"PC"}

];
//Map Example
var newPro=proArray.map(function(value) {return value.price;}  )
console.log(newPro);

//with arrow function
var newPro1=proArray.map(value=> value.price);
console.log(newPro1);

//filter Example
var filterEx=proArray.filter(function(value){
if(value.price<300) {
    return true;
}
})
console.log(filterEx);

//sort Example
const sortProduct=proArray.sort((a,b)=>(a.product>b.product? 1:-1));
console.log(sortProduct);
