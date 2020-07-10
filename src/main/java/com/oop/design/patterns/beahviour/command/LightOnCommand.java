package com.oop.design.patterns.beahviour.command;

import com.oop.design.patterns.beahviour.command.resource.SmartLight;

public class LightOnCommand implements ICommand {

	private SmartLight smartLight;

	public LightOnCommand(SmartLight smartLight) {
		super();
		this.smartLight = smartLight;
	}

	@Override
	public void execute() {
		smartLight.setOn(true);

	}

	@Override
	public void undo() {
		smartLight.setOn(false);
	}

}
