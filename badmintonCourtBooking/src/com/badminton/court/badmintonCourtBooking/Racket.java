package com.badminton.court.badmintonCourtBooking;

public class Racket extends CourtDecorator {

	private int count;

	public Racket(Court court, int count) {
		super(court);
		this.count = count;
	}

	@Override
	public String info() {
		return "Adding "+count+" Racket(s) with "+ super.info();
	}

	@Override
	public double cost() {
		return 30*this.count + super.cost();
	}

}
