package tests;

import static org.junit.Assert.*;
import model.PowerOf;

import org.junit.Test;

public class TestPowerOf1 { //All tests run without errors for TestOFPower1. See TestOfPower2 for demonstration of failed tests
	double num1 = 2;
	PowerOf p1 = new PowerOf(num1);
	
	
	@Test
	public void test() { //tests exponet of 3
		double answer1 = 8;

		assertEquals(answer1, p1.exponentThree(), 0);
	}
	
	@Test
	public void test2() { //checks exponent of 4
		double answer2 = 16;

		assertEquals(answer2, p1.exponentFour(), 0);
	}
	
	@Test
	public void test3() { //checks if value is 0
		assertFalse(p1.checkZero());
	}
	
	@Test
	public void test4() { //checks if value is not null
		assertNotNull(p1.getNum());
	}
	
}
