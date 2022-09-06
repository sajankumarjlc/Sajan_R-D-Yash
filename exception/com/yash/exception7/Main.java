package com.yash.exception7;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Main {

	public static void main(String[] args) {
		try {
			// creating exception
			NumberFormatException ex = new NumberFormatException("Exception");

			// setting cause to exception
			ex.initCause(new NullPointerException("This is Acutal Exception"));

			// throwing an exception with cause
			throw ex;

		} catch (NumberFormatException e) {
			// Display the exception
			System.out.println(e);

			// Getting the actual cause of the exception
			System.out.println(e.getCause());
		}
	}

}
