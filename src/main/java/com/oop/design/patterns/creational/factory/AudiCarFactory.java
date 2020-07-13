package com.oop.design.patterns.creational.factory;

import com.oop.design.patterns.creational.factory.car.Audi;
import com.oop.design.patterns.creational.factory.car.ICar;

/**
 * Concrete factory class for audi car
 * @author Hitesh
 *
 */
public class AudiCarFactory implements ICarFactory {

	@Override
	public ICar create() {
		return new Audi(500, 5);
	}

}
