package com.oop.design.patterns.beahviour.observer;

/**
 * Interface representing subject in observer pattern
 * @author Hitesh
 *
 */
public interface IObservable {
	
	void add(IObserver observer);
	void remove(IObserver observer);
	void notification();
	
}
