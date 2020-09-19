package edu.uoc.pac1.ex3;
import java.util.Arrays;

public class PAC1Ex3 {

	public static void main(String[] args) {
       
		int[] vector = {2,3,4,5,6};
		System.out.println(Arrays.toString(subVector(vector)));
	
		
	}
	
	public static int[] subVector(int[] vector) {	
		
		if (vector == null) {
			System.out.println ("[ERROR] Vector is null!!");
			return null;
		}
		
		
		if (vector.length == 0) {
			return vector;	
		}
		
		
		int j=0;
		int[] subVector = new int[lengthVector(vector)];
		
		if (vector.length > 0) {
			for (int i=0; i<vector.length; i++) {
				
					if (vector[0]%2==0 && (vector[i]%2==0)) {

								subVector[j]=vector[i];
								j++;
		 
					}
			
					if (vector[0]%2!=0 && vector[i]%2!=0) {
							
							subVector[j]=vector[i];
							j++;
							
					    }
			}
		}
							
		return subVector;					
	}	

	
	public static int lengthSubVector(int[] vector, boolean even) {
		int contador = 0;
		
		if (vector == null) {
			System.out.println ("[ERROR] Vector is null!!");
			contador = 0;
		}
		       
		if (vector.length == 0 ) {
			contador = 0 ;
		 }
		
		if (vector.length > 0 && vector != null) {
					for (int i = 0; i < vector.length; i++) {
							int x = vector[i];
				
							if (even == true && x%2 == 0) {
									contador += 1;
							}
							
							if (even == false && x% 2 != 0) {
									contador += 1;
							}
							
					}
		
		}
		return contador;
	} 
	
	//function aux //
	
	public static int lengthVector(int[] vector) {
		int contador = 0;
		


		if (vector.length > 0) {
			for (int i=0; i<vector.length; i++) {
				
					if (vector[0]%2==0 && (vector[i]%2==0)) {
								contador++;
		    
					}
			
					if (vector[0]%2!=0 && vector[i]%2!=0) {
							
							contador++;	
					
					    }
			}
		}
		return contador;
	} 
	

}