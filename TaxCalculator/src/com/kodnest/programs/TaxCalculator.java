package com.kodnest.programs;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double taxrate=scan.nextDouble();
		System.out.println("Total cost including tax:");
		CalculateTotalWithTax calculateTotalWithTax=new CalculateTotalWithTax();
		System.out.println(calculateTotalWithTax.calculateTotalWithTax(purchaseAmount,taxrate));
	}

}
