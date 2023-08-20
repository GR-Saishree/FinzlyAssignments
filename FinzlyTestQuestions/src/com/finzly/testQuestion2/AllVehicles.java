package com.finzly.testQuestion2;

public class AllVehicles {
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.start();
		v.accelerate();
		v.brake();
		v=new MotorCycle();
		v.start();
		v.accelerate();
		v.brake();
	}

}
