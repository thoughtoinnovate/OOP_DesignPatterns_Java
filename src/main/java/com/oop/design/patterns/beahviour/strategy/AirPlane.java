package com.oop.design.patterns.beahviour.strategy;

public class AirPlane {
	
	private final IFlyBehaviour iFlyBehaviour;
	
	
	
	public AirPlane(IFlyBehaviour iFlyBehaviour) {
		super();
		this.iFlyBehaviour = iFlyBehaviour;
	}



	public void fly() {
		this.iFlyBehaviour.fly();
	}

}
