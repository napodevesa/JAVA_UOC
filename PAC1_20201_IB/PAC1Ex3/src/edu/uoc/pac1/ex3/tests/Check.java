package edu.uoc.pac1.ex3.tests;

import edu.uoc.pac1.ex3.PAC1Ex3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class Check {

	@Test
	void testSubVector() {
		assertArrayEquals(new int[] {1,3},PAC1Ex3.subVector(new int[]{1,2,3}));
		assertArrayEquals(new int[] {4,2},PAC1Ex3.subVector(new int[]{4,1,2,3}));
		assertArrayEquals(new int[] {8},PAC1Ex3.subVector(new int[]{8,1,3}));
		assertArrayEquals(new int[] {7,1,3},PAC1Ex3.subVector(new int[]{7,1,2,-2,3}));
		assertArrayEquals(new int[] {-2,4,2},PAC1Ex3.subVector(new int[]{-2,4,2}));
		assertArrayEquals(new int[] {},PAC1Ex3.subVector(new int[]{}));
		assertArrayEquals(null,PAC1Ex3.subVector(null));
	}
	
	@Test
	void lengthSubVector() {
		assertEquals(2,PAC1Ex3.lengthSubVector(new int[]{1,2,3},false));
		assertEquals(1,PAC1Ex3.lengthSubVector(new int[]{1,2,3},true));
		assertEquals(2,PAC1Ex3.lengthSubVector(new int[]{4,1,2,3},true));
		assertEquals(1,PAC1Ex3.lengthSubVector(new int[]{8,1,3},true));
		assertEquals(3,PAC1Ex3.lengthSubVector(new int[]{7,1,2,-2,3},false));
		assertEquals(3,PAC1Ex3.lengthSubVector(new int[]{-2,4,2},true));
		//assertEquals(0,PAC1Ex3.lengthSubVector(null,true));
		//assertEquals(0,PAC1Ex3.lengthSubVector(null,false));
		assertEquals(0,PAC1Ex3.lengthSubVector(new int[]{},true));
		assertEquals(0,PAC1Ex3.lengthSubVector(new int[]{},false));
	}	
}