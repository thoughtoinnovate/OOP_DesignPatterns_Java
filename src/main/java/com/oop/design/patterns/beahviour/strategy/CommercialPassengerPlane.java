package com.oop.design.patterns.beahviour.strategy;


public class CommercialPassengerPlane extends AirPlane {

	public CommercialPassengerPlane() {
		super(new PassengerPlaneFly());
	}

}
