package cse360assign3;

/**
* CSE360 - Spring 2016 - Assignment 3
* <p>
* Calculator Class
* Simple add/subtract/multiply/divide functions to a current total
* 
* @author  Itay Braverman PIN# 125
* @version 1.0
* @since   2016-01-27
*/

public class Calculator {

	/**
	 * total variable.
	 */
	private int total;
	
	/**
	 * Constructor
	 */
	public Calculator () {
		total = 0;
	}
	
	/**
	 * Getter for the total variable
	 * 
	 * @return the current Total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adding value to the Total
	 * 
	 * @param value - integer value
	 */
	public void add (int value) {
		
		total = total + value;
		
	}
	
	/**
	 * Subtracting a value from the Total
	 * 
	 * @param value - integer value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplying the current total by the value
	 * 
	 * @param value - integer value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Dividing the current total by the value
	 * 
	 * @param value - integer value
	 */
	public void divide (int value) {
		total = total / value;
	}
	
	/**
	 * The Counter that will count the amount of inserted integers.
	 * 
	 * @return string history
	 */
	public String getHistory () {
		return "";
	}
}
