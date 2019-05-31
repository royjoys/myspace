package com.badminton.court.badmintonCourtBooking;

public class SyntheticCourt implements Court {

	private int hours;
	
	public SyntheticCourt(int hours) {
		super();
		this.hours = hours;
	}

	@Override
	public String info() {
		return "Enjoy Synthetic Court";
	}

	@Override
	public double cost() {
		return 250*hours;
	}

}
