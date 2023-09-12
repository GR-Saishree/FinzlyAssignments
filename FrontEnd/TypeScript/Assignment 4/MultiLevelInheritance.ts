export class Animal{

    age:number;
    name:string;

    constructor(age:number,name:string){
        this.age=age;
        this.name=name;

    }

    displayDetails(){
        console.log(`
           Age: ${this.age}
           Name: ${this.name}

        `);
        
    }
}

export class Dog extends Animal {

    makesSound:string;

    constructor(age:number,name:string,makesSound:string){
        super(age,name);
        this.makesSound=makesSound;
    }

    override displayDetails(){
        console.log(`
           Age: ${this.age}
           Name: ${this.name}
           Makes Sound: ${this.makesSound}

        `);
    }
}

export class Puppy extends Dog {

    color:string;

    constructor(age:number,name:string,makesSound:string,color:string){
        super(age,name,makesSound);
        this.color=color;
        
    }

    override displayDetails(){
        console.log(`
           Age: ${this.age}
           Name: ${this.name}
           Makes Sound: ${this.makesSound}
           Color: ${this.color}

        `);
    }
}



