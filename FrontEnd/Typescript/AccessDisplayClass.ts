import { Student , addMarks, studentSub } from "./DisplayClassData";


let obj = new Student(1,'Sai shree',21);
obj.display();

console.log(`
    Addition of two subject marks is : ${addMarks(68,86)};
`);

console.log("Student selected subject is  "+studentSub);



