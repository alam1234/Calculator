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
	
	// Check the addition of two integer numbers.
	@Test
	public void testAddOfTwoIntegerNumbers() {
		
		int a = 4;
		int b = 2;
		
		int expected = 6;
		int result = cal.add(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the addition of two negative numbers.
	@Test
	public void testAddOfTwoNegativeNumbers() {
		
		int a = -4;
		int b = -2;
		
		int expected = -6;
		int result = cal.add(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the addition of one positive and one negative number.
	@Test
	public void testAddOfOnePositiveAndOneNegativeNumber() {
		
		int a = 4;
		int b = -2;
		
		int expected = 2;
		int result = cal.add(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the subtraction of two integer numbers.
	@Test
	public void testSubtracttOfTwoIntegerNumbers() {

		int a = 4;
		int b = 2;
		
		int expected = 2;
		int result = cal.subtract(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the subtraction of two negative numbers.
	@Test
	public void testSubtracttOfTwoNegativeNumbers() {

		int a = -4;
		int b = -2;
		
		int expected = -2;
		int result = cal.subtract(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the subtraction of one positive and one negative number.
	@Test
	public void testSubtractOfOnePositiveAndOneNegativeNumber() {

		int a = 4;
		int b = -2;
		
		int expected = 6;
		int result = cal.subtract(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the division of two integer numbers.
	@Test
	public void testDevideOfTwoIntegerNumbers() {

		int a = 4;
		int b = 2;
		
		int expected = 2;
		int result = cal.devide(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the division of two negative numbers.
	@Test
	public void testDevideOfTwoNegativeNumbers() {

		int a = -4;
		int b = -2;
		
		int expected = 2;
		int result = cal.devide(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the division of one positive number and one negative number.
	@Test
	public void testDevideOfOnePositiveAndOneNegativeNumber() {

		int a = 4;
		int b = -2;
		
		int expected = -2;
		int result = cal.devide(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the division when result will be fractional or remainder exist.
	@Test
	public void testDevideWhenResultWillBeFractional() {

		int a = 5;
		int b = 2;
		
		double expected = 2.5;
		double result = cal.devide(a, b);
		
		assertEquals(expected, result, 0.00001);
		
	}
	
	// Check the division of a number by zero.
	@Test
	public void testDevideANumberByZero() {

		int a = 5;
		int b = 0;
		
		try {
			
			cal.devide(a, b);
			fail("should be thrown an exception");
			
		} catch (ArithmeticException e){
			assertTrue(e.getMessage().contains("/ by zero"));
		}
	}
	
	// Check the division of zero by any number.
	@Test
	public void testDevideZeroByAnyNumber() {

		int a = 0;
		int b = 31;
		
		int expected = 0;
		int result = cal.devide(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the multiplication of two integer numbers.
	@Test
	public void testMultiplyOfTwoIntegerNumbers() {

		int a = 5;
		int b = 2;
		
		int expected = 10;
		int result = cal.multiply(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the multiplication of two negative numbers.
	@Test
	public void testMultiplyOfTwoNegativeNumbers() {

		int a = -5;
		int b = -2;
		
		int expected = 10;
		int result = cal.multiply(a, b);
		
		assertEquals(expected, result);
		
	}
	
	// Check the multiplication of one positive and one negative number.
	@Test
	public void testMultiplyOfOnePositiveAndOneNegativeNumber() {

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
