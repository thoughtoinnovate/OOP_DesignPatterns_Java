package com.oop.design.patterns.structural.factory;

import com.oop.design.patterns.structural.factory.car.Audi;
import com.oop.design.patterns.structural.factory.car.ICar;

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
