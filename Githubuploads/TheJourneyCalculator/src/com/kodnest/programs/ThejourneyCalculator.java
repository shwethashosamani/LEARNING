package com.kodnest.programs;

import java.util.Scanner;

public class ThejourneyCalculator {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.println("enter time and speed");
		Scanner scan =new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		System.out.println(journeyCalculator.calculateDistance(speed, time));
	}

}
