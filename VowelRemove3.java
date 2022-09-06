package com.yash.string;

/**
 * 
 * @author sajan.kumar
 *
 */

public class VowelRemove3 {

	public static void main(String[] agrs) {
		String s = "sajankumar";

		String temp = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			}
			temp = temp + ch;

		}
		System.out.println(temp);
	}

}
