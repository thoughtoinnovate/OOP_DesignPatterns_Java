package com.oop.design.patterns.structural.factory.car;

public abstract class Car implements ICar {

	private final int speed;
	private final int gears;

	public Car(int speed, int gears) {
		super();
		this.speed = speed;
		this.gears = gears;
	}

}