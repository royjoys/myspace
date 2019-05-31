package com.badminton.court.badmintonCourtBooking;

public class Shuttle extends CourtDecorator {
	private int count = 0;

	public Shuttle(Court court, int count) {
		super(court);
		this.count = count;
	}

	@Override
	public String info() {
		return "Adding "+count+" Shuttle(s) with " + super.info();
	}

	@Override
	public double cost() {
		return 150*this.count + super.cost();
	}

}
