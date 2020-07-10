package com.oop.design.patterns.structural.factory.car;

public class Audi extends Car implements ICar{

	public Audi(int speed, int gears) {
		super(speed, gears);
	}

	@Override
	public void move() {
		System.out.println("Audi Car Car moves at speed:"+this.getSpeed()+" and having number of gears:"+this.getGears());
	}

}
