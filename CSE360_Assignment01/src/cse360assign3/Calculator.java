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
	private String history;
	
	/**
	 * Constructor
	 */
	public Calculator () {
		total = 0;
		history = "0";
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
		setHistory(value, "add");
	}
	
	/**
	 * Subtracting a value from the Total
	 * 
	 * @param value - integer value
	 */
	public void subtract (int value) {
		total = total - value;
		setHistory(value, "sub");
	}
	
	/**
	 * Multiplying the current total by the value
	 * 
	 * @param value - integer value
	 */
	public void multiply (int value) {
		total = total * value;
		setHistory(value, "mul");
	}
	
	/**
	 * Dividing the current total by the value
	 * 
	 * @param value - integer value
	 */
	public void divide (int value) {
		total = total / value;
		setHistory(value, "div");
	}
	
	/**
	 * Adding the operation and value to the string history
	 * 
	 * @param value the value that will be added to the string after the operation symbol
	 * @param operation will be added as a string symbol between the previous and current value
	 */
	private void setHistory (int value, String operation) {
		
		String temp = "";
		
		if (operation == "add"){
			temp = " + ";
		}
		else if (operation == "sub"){
			temp = " - ";
		}
		else if (operation == "mul"){
			temp = " * ";
		}
		else if (operation == "div"){
			temp = " / ";
		}
		
		history = history + temp + value; 
	}
	
	/**
	 * The Counter that will count the amount of inserted integers.
	 * 
	 * @return string history
	 */
	public String getHistory () {
		return history;
	}
}
