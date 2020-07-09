package com.oop.design.patterns.beahviour.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatRoom implements IObservable {
	
	private final List<IObserver> participants = new ArrayList<IObserver>();

	@Override
	public void add(IObserver observer) {
		
		this.participants.add(observer);

	}

	@Override
	public void remove(IObserver observer) {
	this.participants.remove(observer);

	}

	@Override
	public void notification() {
	
		participants.stream().filter(Objects::nonNull).forEach(ph->ph.update("new content added"));

	}

}
