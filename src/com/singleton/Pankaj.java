package com.singleton;

public class Pankaj {

	public static void main(String[] args) {

		/*
		 * Sachin s = new Sachin(); Sachin s1 = new Sachin(); Sachin s2 = new Sachin();
		 * Sachin s3 = new Sachin();
		 */
		
		Sachin s = Sachin.getInstance();
		Sachin s1 = Sachin.getInstance();
		Sachin s2 = Sachin.getInstance();
		Sachin s3 = Sachin.getInstance();

		if (s == s1) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
