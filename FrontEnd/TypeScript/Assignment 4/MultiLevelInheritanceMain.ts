import { Animal,Dog,Puppy } from "./MultiLevelInheritance";


let animalObj =  new Animal(16,'Animal');
animalObj.displayDetails();

let dogObj = new Dog(6,'Dog','Bark');
dogObj.displayDetails();

let puppyObj = new Puppy(2,'Puppy','Cry','Brown');
puppyObj.displayDetails();