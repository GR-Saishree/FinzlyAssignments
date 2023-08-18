package com.finzly.homeworks;

public class EndUser {
	
	public static void main(String[] args) {
		Shape s=new Circle(5.6);
		s.calculateArea();
		s.calculatePerimeter();
		s=new Rectangle(5,8);
		s.calculateArea();
		s.calculatePerimeter();
		s=new Triangle(5,16,8,9);
		s.calculateArea();
		s.calculatePerimeter();
	}

}
