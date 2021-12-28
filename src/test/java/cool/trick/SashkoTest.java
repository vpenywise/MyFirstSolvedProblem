package main.pack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class MyOtherClassTest {
	
	@Test
	public void testMyString() {
		MyOtherClass myOtherClassTest = new MyOtherClass();
		String expectedResult = "some random result";
		String returnResult = myOtherClassTest.myTestString(expectedResult);
		assertEquals(expectedResult, returnResult);
	}
	
	@Test
	public void testMySumTwoDigitsMethod() {
		MyOtherClass myOtherClassTest = new MyOtherClass();
		int actualResult = myOtherClassTest.sumTwoDigits(2, 3);
		assertEquals(5, actualResult);
	}
	
	@Test
	public void testMySumTwoDigitsMethod_WrongResult() {
		MyOtherClass myOtherClassTest = new MyOtherClass();
		int actualWrongResult = myOtherClassTest.sumTwoDigits(2, 3);
		assertNotEquals(7, actualWrongResult);
	}
}
