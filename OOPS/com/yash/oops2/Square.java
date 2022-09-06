package com.yash.oops2;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Square implements Shape {

	private int length;

	public Square(int length) {
		this.length = length;
	}

	public int area() {
		return length * length;
	}

}
