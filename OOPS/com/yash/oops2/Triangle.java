package com.yash.oops2;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Triangle implements Shape {

	private int height;
	private int breath;

	public Triangle(int height, int breath) {
		this.height = height;
		this.breath = breath;
	}

	public int area() {
		return (height * breath) / 2;
	}

}
