package com.oop.design.patterns.structural.facade;

import org.junit.Test;

public class IFacadeTest {

	@Test
	public void test() {
		IFacade systemFacade = new SystemFacadeImpl();
		systemFacade.accompalishTask();
	}

}
