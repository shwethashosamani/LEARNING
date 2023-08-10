package com.kodnest.programs;
import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args) {
			TemperatureConverter temperatureConverter=new TemperatureConverter();
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the temperature in Fahrenheit");
			double f=scan.nextDouble();
			System.out.println(temperatureConverter.ConvertFahrenheitToCelsius(f));
	}
}
