package com.vidvaan.collections.hashset.sorting;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeCoustomSortingOrderUsingEname {

	public static void main(String[] args) {
		Set<Employee> treeset = new TreeSet<>(new MycomparatorEname());
		treeset.add(new Employee(102, "Satya", 20000.00));
		treeset.add(new Employee(105, "Harish", 25000.00));
		treeset.add(new Employee(101, "Naresh", 30000.00));
		treeset.add(new Employee(103, "Anwar", 28000.00));
		treeset.add(new Employee(104, "veeru", 23000.00));

		for (Employee employee : treeset) {
			System.out.println(employee);
		}

	}
}
