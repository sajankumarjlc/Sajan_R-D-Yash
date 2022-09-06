package com.yash.exception3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Main {

	public static void main(String[] args) throws IOException {
		int n = 0;
		System.out.println("Enter a number");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
		}
		System.out.println(n);
	}
}
