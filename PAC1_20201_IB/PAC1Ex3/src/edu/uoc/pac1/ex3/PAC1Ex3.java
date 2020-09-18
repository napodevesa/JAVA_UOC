package edu.uoc.pac1.ex3;

import java.util.Arrays;

public class PAC1Ex3 {

	public static void main(String[] args) {
		int[] vector = {2,3,4,5,6};
		
		System.out.println(Arrays.toString(subVector(vector)));
	}
	
	public static int[] subVector(int[] vector) {	
		
		if (vector == null) {
			System.out.println ("[ERROR] Vector is null");
			
		}
		
		
		if (vector != null) {
			if (vector[0]%2==0) {
				for (int i = 0; i < vector.length; i++) {
					int[] vector1 = new int[lengthSubVector(vector, )];
					if (vector[i]%2==0) {
						vector1[i]=vector[i];
					}
				}
				contador+=1;
			}
			
			if (vector[0]%2!=0) {
				for (int i = 0; i < vector.length; i++) {
					if (vector[i]%2!=0) {
						vector1[i]=vector[i];
						contador+=1;
					}
				}
				contador+=1;
			}
			return vector1;
		}	
}

	
	public static int lengthSubVector(int[] vector, boolean even) {
		int contador = 0;
		
		if (vector == null) {
			System.out.println ("[ERROR] Vector is null");
			return contador;
		}
		
		if (vector != null) {
			
			for (int i = 0; i < vector.length; i++) {
				int x = vector[i];
				
				if (even) {
					if (x%2 == 0) {
						contador += 1;
					}
				}	
					
				if (even == false) {
					if (x%2 != 0) {
						contador += 1;
						}
				
				  }
				
			}
		}
		return contador;
	}
	
}
