package com.oop.design.patterns.structural.proxy;

import org.junit.Test;

public class ProxySubjectTest {

	

	@Test
	public void test() {
		ISubject proxySubject = new ProxySubject();
		proxySubject.doWork();
	}

}
