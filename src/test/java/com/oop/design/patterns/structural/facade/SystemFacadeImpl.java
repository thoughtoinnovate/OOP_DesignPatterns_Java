package com.oop.design.patterns.structural.facade;

public class SystemFacadeImpl implements IFacade {

	@Override
	public void accompalishTask() {
		ISubsystem subsystemA = new SubSystemA();
		ISubsystem subsystemB = new SubSystemB();

		subsystemA.doWork();
		subsystemB.doWork();

	}

}
