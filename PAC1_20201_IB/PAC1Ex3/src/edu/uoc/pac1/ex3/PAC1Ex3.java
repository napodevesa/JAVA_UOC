package edu.uoc.pac1.ex3;
import java.util.Arrays;

public class PAC1Ex3 {

	public static void main(String[] args) {
		int[] vector = {2,3,4,5,6};
		
		boolean even= false;
		lengthSubVector(vector, even);
		
		System.out.println(lengthSubVector(vector, even));
		
		//System.out.println(Arrays.toString(subVector(vector)));
	}
	
	public static int[] subVector(int[] vector) {	
		
		//boolean even= true;
		int[] newVector = new int[5];
		
		if (vector.length == 0) {
			System.out.println ("[ERROR] Vector is null");
		}
		
		while (vector.length > 0) {
					if (vector[0]%2==0) {
							for (int i = 0; i < vector.length; i++) {
								if (vector[i]%2==0) {
									newVector[i]=vector[i];
								}
							}
					
					}else {
				
						if (vector[0]%2!=0) {
								for (int i = 0; i < vector.length; i++) {
									if (vector[i]%2!=0) {
										newVector[i]=vector[i];
									}
								}
						}	
					}
		}
		return newVector;
					
	}	

	
	public static int lengthSubVector(int[] vector, boolean even) {
		int contador = 0;

		        if (vector.length == 0) {
		        	
					System.out.println ("[ERROR] Vector is null");
					contador = 0;
				
		        }else {
					for (int i = 0; i < vector.length; i++) {
							int x = vector[i];
							
							if (even && x%2 == 0) {
									contador += 1;
							}
							if (even == false && x%2 != 0) {
								contador += 1;
							}
					}
		
				}
		return contador;
	} 
} 
