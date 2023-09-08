"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var DisplayClassData_1 = require("./DisplayClassData");
var obj = new DisplayClassData_1.Student(1, 'Sai shree', 21);
obj.display();
console.log("\n    Addition of two subject marks is : ".concat((0, DisplayClassData_1.addMarks)(68, 86), ";\n"));
console.log("Student selected subject is  " + DisplayClassData_1.studentSub);
