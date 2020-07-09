package com.oop.design.patterns.beahviour.strategy;

/**
 * Concrete Implementation of jet flying behaviour
 * @author Hitesh
 *
 */
public class FighterJetFly implements IFlyBehaviour {

	@Override
	public void fly() {
		
		System.out.println("Flying at the jet speed");

	}

}
