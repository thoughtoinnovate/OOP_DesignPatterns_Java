package com.oop.design.patterns.structural.factory;


import org.junit.Test;

import com.oop.design.patterns.creational.factory.BMWCarFactory;
import com.oop.design.patterns.creational.factory.ICarFactory;
import com.oop.design.patterns.creational.factory.RacingCarFactory;
import com.oop.design.patterns.creational.factory.car.ICar;

public class CarFactoryTest {

	@Test
	public void testCarFactory() {
		ICarFactory carFactory = new BMWCarFactory();
		ICar car = carFactory.create();
		car.move();
		
		//Racing Car
		carFactory=new RacingCarFactory();
		car=carFactory.create();
		car.move();
	}

}
