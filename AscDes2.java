package com.yash.string;

/**
 * 
 * @author sajan.kumar
 *
 */

public class AscDes2 {

	public static void main(String[] agrs) {
		String s = "sajankumar";

		// Converts given string into character array
		char[] s1 = s.toCharArray();
        
		// Counts each character present in the string
		for (int i = 0; i <= s1.length - 1; i++) {
			for (int j = i + 1; j <= s1.length - 1; j++) {
				if (s1[i] > s1[j]) {
					char temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}

			}

			System.out.println(s1[i]);
		}

	}

}
