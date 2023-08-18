package com.finzly.testquestions;

public class Guest {

	public static void main(String[] args) {
		Room r=new Room();
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
		r.makeReservation(10, 4, 2000);
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
		r.makeReservation(10, 4, 2000);
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
	}
}
