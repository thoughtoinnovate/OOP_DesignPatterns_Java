package com.oop.design.patterns.creational.factory.car;

public abstract class Car implements ICar {

	private final int speed;
	private final int gears;

	public Car(int speed, int gears) {
		super();
		this.speed = speed;
		this.gears = gears;
	}

	int getSpeed() {
		return speed;
	}

	int getGears() {
		return gears;
	}
	
	

}
