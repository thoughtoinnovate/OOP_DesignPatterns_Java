package com.oop.design.patterns.structural.decorator.abstrct;

import org.junit.Assert;
import org.junit.Test;

public class CoffeeDecoratorTest {

	
	@Test
	public void test() {
		
		Beverage coffee = new Coffee();
		
		//Decorate the coffee
		AddonDecorator coffeDecorator = new Chocolate(
				new Caramel(coffee));
		
		System.out.println(coffeDecorator.cost());
		
		Assert.assertTrue(65==coffeDecorator.cost());
	}

}
