package com.yash.array;

/**
 * 
 * @author sajan.kumar
 *
 */
public class Duplicate2 {

	public static void main(String[] args) {

		int[] numArray = { 2, 6, 7, 6, 2, 7, 7 };
		int count = 0;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] == numArray[j]) {

					count++;

					System.out.println("Duplicate element found " + numArray[j] + "count:" + count);
				}

			}
		}
	}

}
