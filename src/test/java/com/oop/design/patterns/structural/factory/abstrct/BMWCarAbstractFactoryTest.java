package com.oop.design.patterns.structural.factory.abstrct;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.oop.design.patterns.structural.factory.car.ICar;

public class BMWCarAbstractFactoryTest {


	@Test
	public void test() {
		BMWCarAbstractFactory bmwFactory = new BMWFactoryImpl();
		
		//luxury car
		ICar luxuxryCar = bmwFactory.getLuxuxryCar();
		ICar sportsCar = bmwFactory.getSportsCar();
		
		luxuxryCar.move();
		sportsCar.move();
	}

}
