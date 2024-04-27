package com.demo.task4.stack;

import java.util.Scanner;
import java.util.*;

public class StackPushPop {

	// Pushing element on the top of the stack
	static void stack_push(Stack<Integer> stack) {
		System.out.println("enter any 5 numbers to insert into stack:");
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			int element = sc.nextInt();
			stack.push(element);
		}
	}

	// Popping element from the top of the stack
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation:");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	// Searching element in the stack
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		while (true) {
			System.out.println("1. push element");
			System.out.println("2. pop element");
			System.out.println("3. Search element");
			System.out.print("Enter your choice: ");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				stack_push(stack);
				break;
			case 2:
				stack_pop(stack);
				break;
			case 3:
				System.out.println("Enter the element to search:");
				Scanner srch = new Scanner(System.in);
				int search = srch.nextInt();
				stack_search(stack, search);
				break;
			case 4:
				System.out.println("Exiting program.");
				s.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		}
	}
}
