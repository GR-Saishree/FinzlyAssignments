package com.finzly.homeworks;

public interface Shape {
	
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();

}
class Circle implements Shape{
    
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
		System.out.println("The area of the circle is:"+area);
		
	}

	@Override
	public void calculatePerimeter() {
		double perimeter=2*Math.PI*radius;
		System.out.println("The perimeter of the circle is:"+perimeter);
		
	}
	
}

class Rectangle implements Shape{
	
	private double length;
	private double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	Rectangle(double length,double breadth){
		setLength(length);
		setBreadth(breadth);
	}

	@Override
	public void calculateArea() {
		double area=length*breadth;
		System.out.println("The area of the rectangle is:"+area);
		
	}

	@Override
	public void calculatePerimeter() {
		double perimeter=2*(length+breadth);
		System.out.println("The perimeter of the rectangle is:"+perimeter);
		
	}
	
	
}

class Triangle implements Shape{
	
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
		System.out.println("The area of the triangle is:"+area);
		
	}

	@Override
	public void calculatePerimeter() {
		double perimeter=side1+base+side2;
		System.out.println("The perimeter of the triangle is:"+perimeter);
		
	}
	
	
}