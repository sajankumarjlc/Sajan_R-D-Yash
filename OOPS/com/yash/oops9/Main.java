package com.yash.oops9;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Main {
	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println("Hashcode of object= " + obj.hashCode());
		obj = null;
		// calling garbage collector
		System.gc();
		System.out.println("end of garbage collection");

	}

	protected void finalize() {
		System.out.println("finalize method called");
	}

}
