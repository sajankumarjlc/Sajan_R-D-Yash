package com.yash.exception7;

import java.util.Scanner;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Student {
	int rollno;
	static String sname;
	static String classname;
	static String name;
	static int totalmarks; // marks out of 500, total five subjects each subject marks 100.

	public String position(int totalmarks, String sname) {
		if (totalmarks > 60 && totalmarks <= 70) {
			System.out.println(sname);
			System.out.println("Class : Third Class...");

		} else if (totalmarks > 70 && totalmarks <= 80) {
			System.out.println(sname);
			System.out.println("Class : Second Class...");
		} else if (totalmarks > 80 && totalmarks <= 100) {
			System.out.println(sname);
			System.out.println("Class : First Class...");
		} else if (totalmarks > 35 && totalmarks <= 60) {
			System.out.println("Fourth Class...");
		} else if (totalmarks >= 0 && totalmarks <= 35) {
			System.out.println(sname);
			System.out.println("Sorry ..You are Fail...");
		}
		return sname;
	}

	public String belowFifthy(int totalmark, String sname) {
		if (totalmark <= 50) {
			name = sname;
		}
		return name;

	}

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student deatails :");
		System.out.println("Enter Student Name  :");
		sname = sc.next();
		System.out.println("Enter Student ClassName  :");
		classname = sc.next();
		System.out.println("Enter StudentTotalmark :");
		totalmarks = sc.nextInt();

		s.position(totalmarks, sname);
	}

}