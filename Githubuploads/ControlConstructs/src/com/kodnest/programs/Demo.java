package com.kodnest.programs;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter The Marks");
			int marks=scan.nextInt();
			System.out.println("Welcome To KodNest");
			checkMarks(marks);
	}
	public static void checkMarks(int marks)
	{
		if(marks>=80)
		{
			System.out.println("Welcome To TechClub");
		}
	}

}
