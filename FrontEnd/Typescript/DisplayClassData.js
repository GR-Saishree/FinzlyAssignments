"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.studentSub = exports.addMarks = exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    Student.prototype.display = function () {
        console.log("\n        Student ID: ".concat(this.id, "\n        Student Name: ").concat(this.name, "\n        Student Age: ").concat(this.age, "\n        "));
    };
    return Student;
}());
exports.Student = Student;
function addMarks(a, b) {
    return (a + b);
}
exports.addMarks = addMarks;
exports.studentSub = 'Science';
