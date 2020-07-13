package com.oop.design.patterns.structural.proxy;

public class RealSubject implements ISubject {
	
	private String val;
	
	public  RealSubject(String value){
		this.val=value;
	}
	

	@Override
	public void doWork() {
		System.out.println("Real subject work!");
		
	}

}
