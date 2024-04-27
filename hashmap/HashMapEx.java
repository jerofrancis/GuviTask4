package com.demo.task4.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

	Map<String, String> studentsDetail = new HashMap<>();

	// Method to add a student
	public void addStudent(String name, String grade) {
		studentsDetail.put(name, grade);
	}

	// Method to remove a student
	public void removeStudent(String name) {
		studentsDetail.remove(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapEx student = new HashMapEx();
		while (true) {
			System.out.println("1. add new student");
			System.out.println("2. remove student");
			System.out.println("3. display student");
			System.out.print("Enter your choice: ");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();

			switch (choice) {
			case 1:
		// add some students
				System.out.println("Enter the number of students to be added");
				Scanner sc = new Scanner(System.in);
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {
					System.out.println("Enter the name of a student");
					Scanner sc1 = new Scanner(System.in);
					String name = sc1.next();
					System.out.println("Enter the grade of a student");
					Scanner sc2 = new Scanner(System.in);
					String grade = sc2.next();
					student.addStudent(name, grade);
				}
				break;
		
			case 2:
				// Remove a student
				System.out.println("Enter the name of a student to remove");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next();
				student.removeStudent(name);
				break;
			case 3:
				// Display the students
				student.displayStudents();
				break;
				
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 3");
			}
			}
	}

	public void displayStudents() {
		System.out.println("Students and their grades:");
		for (Map.Entry<String, String> entry : studentsDetail.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue());
		}
	}
}
