package com.finzly.testquestions;

public class Animal {
	
	private String name;
	private int age;
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void makeSound() {
		System.out.println("Each animal have different sounds");
	}

}
class Lion extends Animal{
	
	Lion(String name,int age){
		super(name,age);
	}
	@Override
	void makeSound() {
		System.out.println("Lion roars");
	}
	
}

class Elephant extends Animal{
	
	Elephant(String name,int age){
		super(name,age);
	}
	
	@Override
	void makeSound() {
		System.out.println("Elephant trumpets");
	}
}

class Girafee extends Animal{
	
	Girafee(String name,int age){
		super(name,age);
	}
	
	@Override
	void makeSound() {
		System.out.println("Girafee hums");
	}
}
