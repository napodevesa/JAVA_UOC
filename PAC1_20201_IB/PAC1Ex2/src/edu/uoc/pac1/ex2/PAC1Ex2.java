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
		
		System.out.printf("\nThe income tax payable is: %.2f ",incomeTax);
		System.out.printf("\nThe pension contribution is: %f ",pensionContribution);
		
		input.close();
	}
	
	public static double incomeTaxPayable(double income) {
		
		if (income > 0 && income<=20000) {
		income = 0;
		}
		
		if (income>20000 && income <= 40000) {
			income =  20000 * 0 + (income - 20_000) * 0.1;
		}
		if (income>40000 && income <=60000) {
			income =  20000 * 0.1 + (income - 40_000) * 0.2;
		} 
		
		if (income>60000) {
			income= 20000 * 0.1 + 20000 * 0.2 + (income - 60000) * 0.3;
		}
	
		return income;
			 
	}
	
	public static double pensionContribution(double salary) {
		
		int n = (int)(salary/200);
		float suma = 0;
		float tasa = 0;
		float sumaFinal = 0;
		
		 for (int i = 0; i<n; i++ ) {
			

			 suma = (float) (salary * tasa); 
			 tasa = (float) (tasa + 0.01);
			 sumaFinal+=suma;
		 }
		
		
		 return sumaFinal  ;
			
	}
}
