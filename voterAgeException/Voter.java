package com.demo.task4.voterAgeException;

import java.util.Scanner;

import com.demo.task4.StudentManagement.AgeNotWithinRangeException;

public class Voter {

	int voterId;
	String name;
	int age;

	public Voter(int voterId, String name, int age) throws Exception {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;

		if (age < 18) {
			throw new AgeNotWithinRangeException("invalid age for voter");
		}
	}

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Voter Id: ");
			int voterid = s.nextInt();
			System.out.print("name: ");
			String name = s.next();
			System.out.print("Age: ");
			int Age = s.nextInt();
			Voter vt = new Voter(voterid, name, Age);
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}
	}

}
