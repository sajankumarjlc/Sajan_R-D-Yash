package com.yash.oops2;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Rectangle implements Shape {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int area() {
		return length * breadth;
	}

}
