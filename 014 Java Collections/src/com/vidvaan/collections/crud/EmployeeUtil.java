package com.vidvaan.collections.crud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeUtil {

	private static List<Employee> employees = new ArrayList<Employee>();

	static {
		employees.add(new Employee(101, "Satya", 23000.00));
		employees.add(new Employee(103, "Harish", 21000.00));
		employees.add(new Employee(105, "Naresh", 24000.00));
		employees.add(new Employee(102, "Raja", 25000.00));
		employees.add(new Employee(104, "Veeru", 28000.00));
	}

	public static List<Employee> getAllEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		return employees;
	}

	public static void creat(Employee employee) {
		employees.add(employee);
		System.out.println("One Employee added...");
	}
	
	public static void update(Employee employee) {
		System.out.println("One Employee updated...");
		employees.set(5, employee);
	}
	
	public static void delete(int id) {
		Iterator<Employee> itr = employees.iterator();
		while(itr.hasNext()) {
			Employee employee = itr.next();
			if(employee.getEid()==id) {
				itr.remove();
			}
		}
		System.out.println("One Employee deleted...");
	}
	
	public static void sort() {
		Collections.sort(employees);
		System.out.println("Employee Sorted...");
	}

	public static void main(String[] args) {
		getAllEmployees();

		Employee employee = new Employee(106, "Anwar", 26000.00);
		creat(employee);
		getAllEmployees();
		
		Employee employee1 = new Employee(106, "Anwar Annu", 26000.00);
		update(employee1);
		getAllEmployees();

		delete(106);
		getAllEmployees();
		
		sort();
		getAllEmployees();


	}

}
