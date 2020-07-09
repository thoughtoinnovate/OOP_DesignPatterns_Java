package com.oop.design.patterns.structural.factory.car;

public class Racing extends Car implements ICar {

	public Racing(int speed, int gears) {
		super(speed, gears);
	}

	@Override
	public void move() {
		System.out.println("Racing Car moves");

	}

}
