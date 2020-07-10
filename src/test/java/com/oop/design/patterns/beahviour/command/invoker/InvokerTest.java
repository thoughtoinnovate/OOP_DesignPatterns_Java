package com.oop.design.patterns.beahviour.command.invoker;

import org.junit.Assert;
import org.junit.Test;

import com.oop.design.patterns.beahviour.command.LightColorChangeCommand;
import com.oop.design.patterns.beahviour.command.LightOnCommand;
import com.oop.design.patterns.beahviour.command.resource.SmartLight;

public class InvokerTest {

	@Test
	public void test() {
		SmartLight smartLight = new SmartLight();
		Invoker smartLightInvoker = new Invoker(new LightOnCommand(smartLight), new LightColorChangeCommand(smartLight));
		
		Assert.assertFalse(smartLight.isOn());
		smartLightInvoker.switchOn();
		Assert.assertTrue(smartLight.isOn());
		Assert.assertFalse("green".equalsIgnoreCase(smartLight.getColor()));
		smartLightInvoker.changeColor();
		Assert.assertTrue("green".equalsIgnoreCase(smartLight.getColor()));
	}

}
