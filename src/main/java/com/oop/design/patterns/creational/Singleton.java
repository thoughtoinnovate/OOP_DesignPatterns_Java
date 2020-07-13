package com.oop.design.patterns.creational;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static volatile Singleton INSTANCE = null;

	private Singleton() {
		// Private constructor

		// Handling reflection scenario
		if (INSTANCE != null) {
			throw new RuntimeException("Already have instance created,Please use getInstance method.");
		}
	}

	public static Singleton getInstance() {

		if (null == INSTANCE) {

			// multi-threading handling
			synchronized (Singleton.class) {

				if (null == INSTANCE) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}

	/**
	 * prevents duplicate instance in deserialization
	 */
	protected Singleton readResolve() {
		return getInstance();

	}

}
