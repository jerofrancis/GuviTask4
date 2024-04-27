package com.demo.task4.StudentManagement;

import java.util.Scanner;

public class Student {

	int rollNo;
	String name;
	int age;
	String course;
	
	//initialize value using constructor
	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	//method to validate Age
	static void validate(int age) throws AgeNotWithinRangeException {
		
		if(age<15 || age>21)
		{
			throw new AgeNotWithinRangeException("Age not with in 15 and 21");
		}
	}
	
	//method to validate name
	static void validateName(String name) throws NameNotValidException
	{
		if(!name.matches("[a-zA-Z]+"))
		{
			throw new NameNotValidException("name should not have symbol or number");
		}
	}
	
	public static void main(String[] arg) {
		
		try {
			System.out.println("Enter the age:");
			Scanner in = new Scanner(System.in);
			int age = in.nextInt();
			validate(age);
			System.out.println("Enter the name:");
			Scanner in1 = new Scanner(System.in);
			String name = in1.next();
			validateName(name);
		}
		catch(AgeNotWithinRangeException e) {
			System.out.println("caught an exception: "+e.getMessage());
		}
		catch(NameNotValidException e) {
			System.out.println("caught an exception: "+e.getMessage());
		}
		}
	
}
