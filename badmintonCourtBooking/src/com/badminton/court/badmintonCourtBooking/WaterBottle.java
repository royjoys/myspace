package com.badminton.court.badmintonCourtBooking;

public class WaterBottle extends CourtDecorator {

	public WaterBottle(Court court) {
		super(court);
	}

	@Override
	public String info() {
		return "Adding Water Bottle with "+ super.info();
	}

	@Override
	public double cost() {
		return 10 + super.cost();
	}

}
