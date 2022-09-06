package com.yash.exception10;

import java.util.Arrays;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Child extends Parent {

	void largest(int[] arr) {
		try {
			System.out.println("I am from Child class");
			Arrays.sort(arr);

		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(e);
		}

	}
}