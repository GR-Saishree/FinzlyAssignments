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
exports.Puppy = exports.Dog = exports.Animal = void 0;
var Animal = /** @class */ (function () {
    function Animal(age, name) {
        this.age = age;
        this.name = name;
    }
    Animal.prototype.displayDetails = function () {
        console.log("\n           Age: ".concat(this.age, "\n           Name: ").concat(this.name, "\n\n        "));
    };
    return Animal;
}());
exports.Animal = Animal;
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog(age, name, makesSound) {
        var _this = _super.call(this, age, name) || this;
        _this.makesSound = makesSound;
        return _this;
    }
    Dog.prototype.displayDetails = function () {
        console.log("\n           Age: ".concat(this.age, "\n           Name: ").concat(this.name, "\n           Makes Sound: ").concat(this.makesSound, "\n\n        "));
    };
    return Dog;
}(Animal));
exports.Dog = Dog;
var Puppy = /** @class */ (function (_super) {
    __extends(Puppy, _super);
    function Puppy(age, name, makesSound, color) {
        var _this = _super.call(this, age, name, makesSound) || this;
        _this.color = color;
        return _this;
    }
    Puppy.prototype.displayDetails = function () {
        console.log("\n           Age: ".concat(this.age, "\n           Name: ").concat(this.name, "\n           Makes Sound: ").concat(this.makesSound, "\n           Color: ").concat(this.color, "\n\n        "));
    };
    return Puppy;
}(Dog));
exports.Puppy = Puppy;
