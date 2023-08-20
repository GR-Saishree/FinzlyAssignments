package com.finzly.testQuestion2;

public class MotorCycle implements Vehicle {
	
	private double speed;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	MotorCycle(){
		setSpeed(speed);
	}
	
	@Override
	public void start() {
		if(speed==0) {
			speed=1;
			System.out.println("The Motorcycle is started");
		}
		else {
		    System.out.println("The Motorcycle is already in motion");
		}
	}
	
	@Override
	public void accelerate() {
		if(speed>0) {
			speed++;
			System.out.println("The Motorcycle is accelerated");
		}
		else {
			start();
			accelerate();
		}
		
	}
	
	@Override
	public void brake() {
		if(speed>0) {
			speed=0;
			System.out.println("The Motorcycle is stopped");
		}
		else {
			System.out.println("The Motorcycle is already not in motion");
		}
		
	}

}
