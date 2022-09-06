package com.yash.oops1;

/**
 * 
 * @author sajan.kumar
 *
 */

public class Main {

	public static void main(String[] agrs) {

		Department[] dept = new Department[2];
		dept[0] = new Department("dept 1", "IT");
		dept[1] = new Department("dept 2", "HR");

		Employee employee = new Employee("12500", " 8 feb ", " Pune", dept[0], "ashwini.lohar@yash.com", "9960873595");
		employee.EmployeeDisplay();

		Customer customer = new Customer("1", "ashwini", "pune", "13 jully");
		customer.CustomerDisplay();

	}
}