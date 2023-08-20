package com.finzly.testQuestion1;

public class Triangle implements Shape{

	private double base;
	private double height;
	private double side1;
	private double side2;
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	Triangle(double base,double height,double side1,double side2){
		setBase(base);
		setHeight(height);
		setSide1(side1);
		setSide2(side2);
	}
	
	@Override
	public void calculateArea() {
		double area=(base*height)/2;
		System.out.println("The area of the triangle is: "+area);
	}
	
	@Override
	public void calculatePerimeter() {
		double perimeter=side1+base+side2;
		System.out.println("The perimeter of the triangle is: "+perimeter);
	}
}
