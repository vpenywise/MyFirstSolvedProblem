package testing;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import CoolTrick.Sashko;

class Testing {
	
	Sashko testSashko = new Sashko();
	List<Integer> testNumber = new ArrayList<>();

	@Test
	void testInputWithinRange() {

		
		testSashko.checkUserInput(9, 3, testNumber);

		assertTrue(testSashko.askUserInput() == 3);

	}
	
	@Test
	public void testSize() {
//		assertEquals("Testing the size of the List", 3, testNumber);
	}
	
//		testSashko.checkUserInput(9, 3, firstNumber);
//		askUserInput(testSashko);
//		checkCorrectUserInput(testSashko);
//		checkWrongtUserInput(testSashko);

//	}
//
//	private void askUserInput(Sashko testSashko) {
//		int output = testSashko.askUserInput();
//		assertEquals(output, 3);
//	}
//
//	private void checkCorrectUserInput(Sashko testSashko) {
//		List<Integer> firstNumber = new ArrayList<>();
//		testSashko.checkUserInput(9, 3, firstNumber);
//	}
//	private void checkWrongtUserInput(Sashko testSashko) {
//		List<Integer> firstNumber = new ArrayList<>();
//		testSashko.checkUserInput(9, 10, firstNumber);
//	}
}
