package com.oop.design.patterns.creational.factory;

import com.oop.design.patterns.creational.factory.car.ICar;
import com.oop.design.patterns.creational.factory.car.Racing;

/**
 * concrete factory class for racing car
 * @author Hitesh
 *
 */
public class RacingCarFactory implements ICarFactory {

	@Override
	public ICar create() {
		return new Racing(500, 8);
	}

}
