package com.oop.design.patterns.structural.proxy;

public class ProxySubject implements ISubject {
	
	private RealSubject realSubject;

	@Override
	public void doWork() {
		
		if(null==realSubject) {
			realSubject= new RealSubject("Proxy Calling");
		}
		
		System.out.println("Poxy work");
		
		realSubject.doWork();

	}

}
