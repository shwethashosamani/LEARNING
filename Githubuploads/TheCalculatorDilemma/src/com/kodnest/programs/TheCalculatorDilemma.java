package com.kodnest.programs;

import java.util.Scanner;

public class TheCalculatorDilemma {
	public static void main(String []args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("enter the opcode");
		int op=scan.nextInt();
		calculator( op,num1,num2);
	}
	public static void calculator(int op,int a,int b)
	{
		
		switch(op)
		{
		case 1:
			int res=a+b;
			System.out.println(res);
			break;
		case 2:
			int res1=a-b;
			System.out.println(res1);
			break;
		case 3:
			int res3=a*b;
			System.out.println(res3);
			break;
		case 4:
			int res4=a/b;
			System.out.println(res4);
			break;
			
		default: 
			System.out.println("Invalid opcode");
		}
		}
	}


