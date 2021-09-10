/**
 * @author Owen - kjkleindorfer
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;
//This program includes methods to find the power of 3 or 4 of a number as well as checks if a number is zero
public class PowerOf {
	
	private double num;
	
	public PowerOf( double num) {
		this.num = num;
	}
	
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public double exponentThree() {
		
		return num * num * num;
	}
	public double exponentFour() {
		
		return num * num * num * num;
	}
	
	public boolean checkZero() {
		if (num == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
