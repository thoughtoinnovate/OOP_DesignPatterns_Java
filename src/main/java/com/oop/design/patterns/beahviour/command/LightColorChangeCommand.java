package com.oop.design.patterns.beahviour.command;

import com.oop.design.patterns.beahviour.command.resource.SmartLight;

public class LightColorChangeCommand implements ICommand {
	
	private SmartLight smartLight;
	
	

	public LightColorChangeCommand(SmartLight smartLight) {
		super();
		this.smartLight = smartLight;
	}

	@Override
	public void execute() {
		smartLight.setColor("Green");
	}

	@Override
	public void undo() {
		smartLight.setColor("");
	}

}
