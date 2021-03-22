package com.vidvaan.collections.crud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentUtil {

	private static List<Student> students = new ArrayList<Student>();

	static {
		students.add(new Student(101, "Satya", 20000.00));
		students.add(new Student(103, "Harish", 20000.00));
		students.add(new Student(105, "Raja", 20000.00));
		students.add(new Student(102, "Naresh", 20000.00));
		students.add(new Student(104, "Jaggu", 20000.00));
	}

	public static List<Student> getAllStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
		return students;
	}

	public static void create(Student student) {
		students.add(student);
		System.out.println("One Student inserted...");
	}

	public static void update(Student student) {
		students.set(5, student);
		System.out.println("One Student updated...");
	}

	public static void delete(int id) {
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			Student student = itr.next();
			if (student.getSid() == id) {
				itr.remove();
			}
		}
		System.out.println(id + " Student is deleted...");
	}

	public static void sort() {
		Collections.sort(students);
		System.out.println("Student sorted...");
		for (Student student : students) {

			System.out.println(student);
		}
	}

	public static void search(int id) {
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			Student student = itr.next();
			if (student.getSid() == id) {
				System.out.println("Searched student is : "+student.getSid() + " " + student.getSname() + " " + student.getSfee());
			}
		}
	}

	public static void main(String[] args) {
		getAllStudents();

		Student student = new Student(106, "Anwar", 23000.00);
		create(student);
		getAllStudents();

		Student student1 = new Student(106, "Anwar Annu", 23000.00);
		update(student1);
		getAllStudents();

		delete(106);
		getAllStudents();

		sort();

		search(101);

	}

}
