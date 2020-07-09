package com.oop.design.patterns.structural.factory.car;

public class Audi extends Car implements ICar{

	public Audi(int speed, int gears) {
		super(speed, gears);
	}

	@Override
	public void move() {
		System.out.println("Audi Car moves");
	}

}
