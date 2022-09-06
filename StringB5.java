package com.yash.string;

public class StringB5 {

	public static void main(String[] args) {
		long startingTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Tech");
		for (int i = 0; i < 100000; i++) {
			buffer.append("vidvan");
		}
		System.out.println(
				"Time consumed by StringBuffer: " + (System.currentTimeMillis() - startingTime) + "milliseconds");
		startingTime = System.currentTimeMillis();

		StringBuilder builder = new StringBuilder("Tech");
		for (int i = 0; i < 100000; i++) {
			builder.append("vidvan");
		}
		System.out.println(
				"Time consumed by StringBuilder: " + (System.currentTimeMillis() - startingTime) + "milliseconds");
	}

}
