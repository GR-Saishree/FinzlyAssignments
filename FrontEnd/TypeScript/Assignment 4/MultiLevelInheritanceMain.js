"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var MultiLevelInheritance_1 = require("./MultiLevelInheritance");
var animalObj = new MultiLevelInheritance_1.Animal(6, 'Animal');
animalObj.displayDetails();
var dogObj = new MultiLevelInheritance_1.Dog(6, 'Dog', 'Bark');
dogObj.displayDetails();
var puppyObj = new MultiLevelInheritance_1.Puppy(2, 'Puppy', 'Cry', 'Brown');
puppyObj.displayDetails();
