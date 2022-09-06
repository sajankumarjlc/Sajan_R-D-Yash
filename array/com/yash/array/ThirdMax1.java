package com.yash.array;

/**
 * 
 * @author sajan.kumar
 *
 */

public class ThirdMax1 {

	public static void main(String[] agrs) {
		int a[] = { 5,8,12,20 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		int max = a[a.length - 3];
		System.out.println("third maximum number is: " + max);

	}

}
