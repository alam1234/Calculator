package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private static Calculator cal;

	@BeforeClass
	public static void createObject() {
		cal = new Calculator();
	}
	
	@Test
	public void testAdd() throws Exception {
		
		int a = 4;
		int b = 2;
		
		int expected = 6;
		int result = cal.add(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testAddWithNegativeValue() throws Exception {
		
		int a = 4;
		int b = -2;
		
		int expected = 2;
		int result = cal.add(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testSubtract() throws Exception{

		int a = 4;
		int b = 2;
		
		int expected = 2;
		int result = cal.subtract(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testSubtractWithNegativeValue() throws Exception{

		int a = 4;
		int b = -2;
		
		int expected = 6;
		int result = cal.subtract(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testDevideWhenResultWillNotBeFractional() throws Exception{

		int a = 4;
		int b = 2;
		
		int expected = 2;
		int result = cal.devide(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testDevideWithNegativeValue() throws Exception{

		int a = 4;
		int b = -2;
		
		int expected = -2;
		int result = cal.devide(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testDevideWhenResultWillBeFractional() throws Exception{

		int a = 5;
		int b = 2;
		
		double expected = 2.5;
		double result = cal.devide(a, b);
		
		assertEquals(expected, result, 0.00001);
		
	}
	
	@Test
	public void testMultiply() throws Exception {

		int a = 5;
		int b = 2;
		
		int expected = 10;
		int result = cal.multiply(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testMultiplyWithNegativeValue() throws Exception {

		int a = 5;
		int b = -2;
		
		int expected = -10;
		int result = cal.multiply(a, b);
		
		assertEquals(expected, result);
		
	}

	@AfterClass
	public static void closeObject() {
		cal = null;
	}

}
