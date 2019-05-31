package com.badminton.court.badmintonCourtBooking;

public abstract class CourtDecorator implements Court {

	Court court;

	public CourtDecorator(Court court) {
		super();
		this.court = court;
	}

	@Override
	public String info() {
		return court.info();
	}

	@Override
	public double cost() {
		return court.cost();
	}
	

}
