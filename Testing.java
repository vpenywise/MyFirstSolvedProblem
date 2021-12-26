package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import CoolTrick.Sashko;

class Testing {

	@Test
	void testInputWithinRange() {
		
		Sashko testSashko = new Sashko();
		
		askUserInput(testSashko);
		
		checkUserInput(testSashko);
	}

	private void askUserInput(Sashko testSashko) {
		int output = testSashko.askUserInput();
		assertEquals(output, 3);
	}

	private void checkUserInput(Sashko testSashko) {
		List<Integer> numbers = new ArrayList<>();
		testSashko.checkUserInput(9, 3, numbers);
	}
}
