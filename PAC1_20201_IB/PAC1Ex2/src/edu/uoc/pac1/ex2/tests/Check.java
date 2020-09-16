package edu.uoc.pac1.ex2.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.uoc.pac1.ex2.PAC1Ex2;

class Check {

	@Test
	void testIncomeTaxPayable() {
		assertEquals(2246.80,PAC1Ex2.incomeTaxPayable(41234));
		assertEquals(8367.30,PAC1Ex2.incomeTaxPayable(67891));
		assertEquals(13629.60,PAC1Ex2.incomeTaxPayable(85432),0.01);
		assertEquals(0.0,PAC1Ex2.incomeTaxPayable(12345));
		assertEquals(0.0,PAC1Ex2.incomeTaxPayable(20000));
		assertEquals(0.1,PAC1Ex2.incomeTaxPayable(20001));
	}

	@Test
	void testPensionContribution() {
		assertEquals(300,PAC1Ex2.pensionContribution(20000/14.0),0.01);
		assertEquals(0,PAC1Ex2.pensionContribution(1000/14.0));
		assertEquals(107.142857,PAC1Ex2.pensionContribution(15000/14.0),0.0001);
	}

}

