package main.pack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class MyOtherClassTest {
	
	@Test
	public void testMyString() {
		MyOtherClass myOtherClassTest = new MyOtherClass();
		testMyString(myOtherClassTest, "WLA DO");
	}
	
	@Test
	public void testMySumTwoDigitsMethod() {
		MyOtherClass myOtherClassTest = new MyOtherClass();
		testMySumTwoDigitsMethod(myOtherClassTest);
	}

	@Test
	public void testMySumTwoDigitsMethod_WrongResult() {
		MyOtherClass myOtherClassTest = new MyOtherClass();
		testMySumTwoDigitsMethod_WrongResult(myOtherClassTest);
	}
	
	private void testMyString(MyOtherClass myOtherClassTest, String expectedResult) {
		expectedResult = "";
		String returnResult = myOtherClassTest.myTestString(expectedResult);
		assertEquals(expectedResult, returnResult);
	}
	
	private void testMySumTwoDigitsMethod(MyOtherClass myOtherClassTest) {
		int actualResult = myOtherClassTest.sumTwoDigits(2, 3);
		assertEquals(5, actualResult);
	}
	
	private void testMySumTwoDigitsMethod_WrongResult(MyOtherClass myOtherClassTest) {
		int actualWrongResult = myOtherClassTest.sumTwoDigits(2, 3);
		assertNotEquals(7, actualWrongResult);
	}
}
