package com.oop.design.patterns.beahviour.strategy;

public class HighSpeedPlane extends AirPlane {

	public HighSpeedPlane() {
		super(new FighterJetFly());
		
	}

}
