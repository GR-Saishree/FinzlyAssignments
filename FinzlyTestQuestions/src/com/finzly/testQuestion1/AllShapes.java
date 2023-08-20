package com.finzly.testQuestion1;

public class AllShapes {
	
	public static void main(String[] args) {
		
		Shape s=new Circle(5.5);
		s.calculateArea();
		s.calculatePerimeter();
		s=new Rectangle(6.4, 10.2);
		s.calculateArea();
		s.calculatePerimeter();
		s=new Triangle(8, 3, 7, 5);
		s.calculateArea();
		s.calculatePerimeter();
	}
	

}
