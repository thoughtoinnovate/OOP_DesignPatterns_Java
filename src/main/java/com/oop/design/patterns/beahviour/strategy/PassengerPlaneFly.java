package com.oop.design.patterns.beahviour.strategy;

/***
 * Concrete class behaviour for passenger plane
 * @author Hitesh
 *
 */
public class PassengerPlaneFly implements IFlyBehaviour {

	@Override
	public void fly() {
		
		System.out.println("Flying at the slow speed");

	}

}
