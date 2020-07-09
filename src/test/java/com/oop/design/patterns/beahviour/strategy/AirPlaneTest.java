package com.oop.design.patterns.beahviour.strategy;

import org.junit.Test;

public class AirPlaneTest {

	@Test
	public void testPlanes() {
		
		AirPlane deltaAir = new CommercialPassengerPlane();
		deltaAir.fly();
		
		AirPlane defenseFighter=new FighterJetPlane();
		defenseFighter.fly();
	}

}
