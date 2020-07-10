package com.oop.design.patterns.structural.factory.car;

public class BMW extends Car implements ICar {

	public BMW(int speed, int gears) {
		super(speed, gears);
	}

	@Override
	public void move() {
		System.out.println("BMW Car moves at speed:"+this.getSpeed()+" and having number of gears:"+this.getGears());

	}

}
