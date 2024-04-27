package com.demo.task4.weekDaysEception;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string array to store weekdays
		String[] weekDay = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

		System.out.print("Enter index of day:");
		Scanner sc = new Scanner(System.in);
		int dayIndex = sc.nextInt();
		try
		{
		System.out.println("Day is "+weekDay[dayIndex]);
		}
		catch(Exception e)
		{
			System.out.println("Exception is:"+e.getMessage());
		}
		 
	}

}
