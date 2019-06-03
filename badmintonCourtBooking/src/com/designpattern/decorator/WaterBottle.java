package com.designpattern.decorator;

public class WaterBottle extends CourtDecorator {
	private int count = 0;
	public WaterBottle(Court court, int count) {
		super(court);
		this.count = count;
	}

	@Override
	public String info() {
		return "Adding "+this.count+" Water Bottle with "+ super.info();
	}

	@Override
	public double cost() {
		return 10*this.count + super.cost();
	}

}
