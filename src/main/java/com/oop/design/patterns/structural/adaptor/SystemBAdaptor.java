package com.oop.design.patterns.structural.adaptor;

public class SystemBAdaptor implements IAdaptor {

	private SystemBAdaptee systemBAdaptee;

	public SystemBAdaptor(SystemBAdaptee systemBAdaptee) {
		super();
		this.systemBAdaptee = systemBAdaptee;
	}

	@Override
	public void request() {
		systemBAdaptee.specificRequest();

	}

}
