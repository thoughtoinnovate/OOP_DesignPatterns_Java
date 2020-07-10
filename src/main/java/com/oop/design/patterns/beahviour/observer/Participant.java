package com.oop.design.patterns.beahviour.observer;

public class Participant implements IObserver {

	private final String name;
	
	

	public Participant(String name) {
		super();
		this.name = name;
	}



	@Override
	public void update(Object info) {
		
		System.out.println("PH name:"+this.name+" New Message Received:"+String.valueOf(info));

	}

}
