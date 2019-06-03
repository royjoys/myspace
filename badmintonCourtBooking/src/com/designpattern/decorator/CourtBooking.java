package com.designpattern.decorator;

public class CourtBooking {

	public static void main(String[] args) {
		Court c = new Shuttle(new Racket(new SyntheticCourt(2),4),3);
		
		
		System.out.println(c.info());
		System.out.println(c.cost());
	}

}
