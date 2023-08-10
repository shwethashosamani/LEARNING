package com.kodnest.programs;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter your score");
			 int score=scan.nextInt();
			 GiveGrade grade=new GiveGrade();
			 grade.checkscore(score);
	}

}
