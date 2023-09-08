// Fat arrow function with parameter and without return type

let sum1=(a3:number,b3:number)=>{
    console.log("Sum of given numbers :"+(a3+b3));
    
}

sum1(25,36);

// fat arrow function without parameter and with return type

let greeting=():string=>{
    return "Hello, welcome";
}

console.log(greeting());
