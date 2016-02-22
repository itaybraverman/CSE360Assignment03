package cse360assign3;

/**
* CSE360 - Spring 2016 - Assignment 3
* <p>
* CalculatorTest Class
* Junit tests for all the functions in the Calculator class.
* 
*/

//Importing the test library
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		// Checking to see if object was created in the memory.
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();
		// Checking the get function for the default value of 0.
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		test.add(5);
		// Checkign basic addition of an int.
		assertEquals(5, test.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();
		test.subtract(5);
		// Checkign subtruction from initial value of 0
		assertEquals(-5, test.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		test.subtract(5);
		test.multiply(-2);
		// Checking for multiplying negative and positive
		assertEquals(10, test.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();
		test.subtract(5);
		test.divide(-5);
		// Checking for negative divide by negative
		assertEquals(1, test.getTotal());
	}
	
	// Checking to see exception is being returned when dividing by 0
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideZero() {
		Calculator test = new Calculator();
		test.subtract(5);
		test.divide(0);
	}

	@Test
	public void testGetHistory() {
		Calculator test = new Calculator();
		// Checking to see if string returns empty
		assertEquals("", test.getHistory());
	}

}
