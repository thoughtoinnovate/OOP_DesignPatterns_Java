package com.oop.design.patterns.structural.decorator.abstrct;

public class Chocolate extends AddonDecorator {

	private Beverage beverage;

	public Chocolate(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 10;
	}

}
