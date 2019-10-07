package com.nt.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nt.calc.BankIntrAmt;
import com.nt.calc.BankIntrAmtImpl;

public class BankLoanTestCase {
	
	static BankIntrAmt bank = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BankLoanTestCase.setUpBeforeClass()");
		bank = new BankIntrAmtImpl();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("BankLoanTestCase.tearDownAfterClass()");
		bank = null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BankLoanTestCase.setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("BankLoanTestCase.tearDown()");
	}

	@Test
	public void testWithPositiveValue()throws Exception {
		
		float result = bank.simpleInterest(10000, 2, 12);
		System.out.println(result);
		
	}
	
	@Test
	public void testWithNegetiveValue()throws Exception {
		
		float result = bank.simpleInterest(10000, 2, 12);
		System.out.println(result);
		
	}

}
