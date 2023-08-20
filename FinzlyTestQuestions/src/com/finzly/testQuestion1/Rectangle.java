package com.finzly.testQuestion1;

public class Rectangle implements Shape {

	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	Rectangle(double height,double width){
		setHeight(height);
		setWidth(width);
	}
	
	@Override
	public void calculateArea() {
		double area=height*width;
		System.out.println("The area of the rectangle is: "+area);
	}
	
	@Override
	public void calculatePerimeter() {
		double perimeter=2*(height+width);
		System.out.println("The perimeter of the rectangle: "+perimeter);
	}
	
	
}
