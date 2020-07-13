package com.oop.design.patterns.structural.adaptor;

import org.junit.Test;

public class IAdaptorTest {

	
	@Test
	public void test() {
		
		IAdaptor idapter = new SystemBAdaptor(new SystemBAdaptee());
		
		idapter.request();
		
		
	}

}
