export class Person{

    fname:string;
    lname:string;

    constructor(f:string,l:string){

        this.fname=f;
        this.lname=l;
    }

    display(){
        console.log(`
        FirstName: ${this.fname}
        Lastname: ${this.lname}
        `);
        
    }


}

export class Employee extends Person{

    id:number;
    salary:number;

    constructor(f:string,l:string,id:number,sal:number){
        super(f,l);
        this.id=id;
        this.salary=sal;
    }

    override display(): void {
        console.log(`
            FirstName: ${this.fname}
            Lastname: ${this.lname}
            ID: ${this.id}
            Salary: ${this.salary}

        `);
        
    }

}

