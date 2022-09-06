package com.yash.string;

import java.util.Scanner;

/**
 * 
 * @author sajan.kumar
 *
 */

public class IndexInsertion1 {

	public static void main(String[] agrs) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter 1 st String:");
			String str1 = scanner.next();
			System.out.println("Enter 2 st String:");
			String str2 = scanner.next();
			System.out.println("enter the index where we have to insert:");
			int index = scanner.nextInt();

			String temp = "";
			String newstr = "";
			for (int i = 0; i < str1.length(); i++) {
				newstr = newstr + str1.charAt(i);
				if (i == index) {
					temp = newstr + str2;
				}

			}
			System.out.println(temp);
		}

	}

}
