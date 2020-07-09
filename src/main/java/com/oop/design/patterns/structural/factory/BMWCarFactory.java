package com.oop.design.patterns.structural.factory;

import com.oop.design.patterns.structural.factory.car.BMW;
import com.oop.design.patterns.structural.factory.car.ICar;

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
