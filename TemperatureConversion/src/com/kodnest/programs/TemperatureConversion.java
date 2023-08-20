package com.kodnest.programs;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:\r\n"
				+ "\r\n"
				+ "1. Convert Celsius to Fahrenheit\r\n"
				+ "\r\n"
				+ "2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice: ");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("enter the temperature in celsius");
			double c=scan.nextDouble();
			double temp1=celsiusToFahrenheit(c);
			System.out.println(c+"is equivalent to"+temp1);
		}
		else
		{
			System.out.println("enter the temperature in fahrenheit");
			double f=scan.nextDouble();
			 double temp2=fahrenheitToCelsius(f);
			System.out.println(f+"is equivalent to"+temp2);
		}
	}
public static double celsiusToFahrenheit(double c)
{
	return (c*9/5)+32;
}
public static double fahrenheitToCelsius(double f)
{
	return (f-32)*5/9;
}
}
