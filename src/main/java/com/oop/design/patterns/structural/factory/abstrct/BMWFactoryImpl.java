package com.oop.design.patterns.structural.factory.abstrct;

import com.oop.design.patterns.structural.factory.car.BMW;
import com.oop.design.patterns.structural.factory.car.ICar;

public class BMWFactoryImpl implements BMWCarAbstractFactory {

	@Override
	public ICar getLuxuxryCar() {
		return new BMW(200, 8);
	}

	@Override
	public ICar getSportsCar() {
		return new BMW(300, 10);
	}

}
