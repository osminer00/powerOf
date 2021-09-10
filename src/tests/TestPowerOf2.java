package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.PowerOf;

public class TestPowerOf2 { //All tests for TestPowerOf2 are set to purposely fail to demonstrate tests working properly
	double num2 = 4;
	PowerOf p2 = new PowerOf(num2);

	@Test
	public void test() { //Purposefully fails exponent of 4
		double wrongAnswer1 = 255; //Correct answer 256
		assertEquals(wrongAnswer1, p2.exponentFour(), 0);
	}
	
	@Test
	public void test2() { //Purposely fails if value is zero or not
		assertTrue(p2.checkZero());
	}
	@Test
	public void test3() { //Purposefully fails if value is not null
		assertNull(p2.getNum());
	}
	
}
