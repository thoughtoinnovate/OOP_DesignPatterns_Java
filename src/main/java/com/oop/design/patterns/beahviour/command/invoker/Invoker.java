package com.oop.design.patterns.beahviour.command.invoker;

import com.oop.design.patterns.beahviour.command.ICommand;

public class Invoker {

	private ICommand on;

	private ICommand changeColor;

	public Invoker(ICommand on, ICommand changeColor) {
		super();
		this.on = on;
		this.changeColor = changeColor;
	}

	public void switchOn() {
		this.on.execute();
	}

	public void changeColor() {
		this.changeColor.execute();
	}

}
