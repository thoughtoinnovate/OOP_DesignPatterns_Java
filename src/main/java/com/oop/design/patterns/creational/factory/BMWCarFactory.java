package com.oop.design.patterns.creational.factory;

import com.oop.design.patterns.creational.factory.car.BMW;
import com.oop.design.patterns.creational.factory.car.ICar;

/***
 * concrete factory class for bmw car
 * @author Hitesh
 *
 */
public class BMWCarFactory implements ICarFactory {

	@Override
	public ICar create() {
		return new BMW(300, 6);
	}

}
