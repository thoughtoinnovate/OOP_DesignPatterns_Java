package com.oop.design.patterns.structural.decorator.abstrct;

public class Caramel extends AddonDecorator {

	private Beverage beverage;

	public Caramel(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return this.beverage.cost()+5;
	}

}
