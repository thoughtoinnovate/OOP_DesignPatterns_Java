package com.oop.design.patterns.beahviour.strategy;

public class FighterJetPlane extends AirPlane {

	public FighterJetPlane() {
		super(new FighterJetFly());
	}

}
