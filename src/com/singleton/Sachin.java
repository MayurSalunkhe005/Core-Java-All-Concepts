package com.singleton;

/**
 * this is {@code singleton} class use {@code getInstance()} method to create an
 * object
 * 
 * @author Sachin
 *
 */

public class Sachin {

	private static Sachin s = new Sachin();
	/* private static Sachin s; */
	
	private Sachin() {
	}

	public static Sachin getInstance() {
		System.out.println("thanks to use me for making sinlgeton class");
		return s;
	}
}
