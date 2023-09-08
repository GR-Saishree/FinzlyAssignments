export class Student{

    public id:number;
    public name:string;
    public age:number;

    constructor(id:number,name:string,age:number){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public display(){
        console.log(`
        Student ID: ${this.id}
        Student Name: ${this.name}
        Student Age: ${this.age}
        `)
    }
}

export function addMarks(a:number,b:number):number{
    return (a+b);
}

export const studentSub = 'Science';