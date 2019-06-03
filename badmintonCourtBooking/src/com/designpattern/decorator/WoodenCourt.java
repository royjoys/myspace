package com.designpattern.decorator;

public class WoodenCourt implements Court {

	private int hours;

	public WoodenCourt(int hours) {
		super();
		this.hours = hours;
	}

	@Override
	public String info() {
		return "Enjoy Wooden Court";
	}

	@Override
	public double cost() {
		return 300*hours;
	}

}
