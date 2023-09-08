// Anonymous Function with parameter and without return type

let sum=function (a2:number,b2:number){
   console.log("Sum of two numbers "+(a2+b2));
}

sum(10,20);

// Anonymous Function without parameter and with return type
let result=function () :number{
    return (50+64);
}

console.log("Sum of two numbers is :"+result());
