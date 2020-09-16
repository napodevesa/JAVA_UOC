package edu.uoc.pac1.ex2;

import java.util.Scanner;

public class PAC1Ex2 {

	public static void main(String[] args) {
		double income, incomeTax, pensionContribution;
		
		System.out.print("Write your annual income: ");
		Scanner input = new Scanner(System.in);
		
		income = input.nextDouble();
		
		incomeTax = incomeTaxPayable(income);
		pensionContribution = pensionContribution(income/14);
		
		System.out.printf("\nThe income tax payable is: %.2f €",incomeTax);
		System.out.printf("\nThe pension contribution is: %f €",pensionContribution);
		
		input.close();
	}
	
	public static double incomeTaxPayable(double income) {
		//TODO
	}
	
	public static double pensionContribution(double salary) {
		//TODO	
	}
}
