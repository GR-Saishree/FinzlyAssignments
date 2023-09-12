"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = exports.Person = void 0;
var Person = /** @class */ (function () {
    function Person(f, l) {
        this.fname = f;
        this.lname = l;
    }
    Person.prototype.display = function () {
        console.log("\n        FirstName: ".concat(this.fname, "\n        Lastname: ").concat(this.lname, "\n        "));
    };
    return Person;
}());
exports.Person = Person;
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(f, l, id, sal) {
        var _this = _super.call(this, f, l) || this;
        _this.id = id;
        _this.salary = sal;
        return _this;
    }
    Employee.prototype.display = function () {
        console.log("\n            FirstName: ".concat(this.fname, "\n            Lastname: ").concat(this.lname, "\n            ID: ").concat(this.id, "\n            Salary: ").concat(this.salary, "\n\n        "));
    };
    return Employee;
}(Person));
exports.Employee = Employee;
