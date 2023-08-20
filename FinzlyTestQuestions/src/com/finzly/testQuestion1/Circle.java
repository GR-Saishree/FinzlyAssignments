package com.finzly.testQuestion1;

public class Circle implements Shape {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	Circle(double radius){
		setRadius(radius);
	}
	
	@Override
	public void calculateArea() {
		double area=Math.PI*radius*radius;
		System.out.println("The area of the circle is: "+area);
	}
	
	@Override
	public void calculatePerimeter() {
		double perimeter=2*Math.PI*radius;
		System.out.println("The perimeter of the circle is: "+perimeter);
	}

}
