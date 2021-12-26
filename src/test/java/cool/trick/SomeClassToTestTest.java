package cool.trick;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeClassToTestTest {

    @Test
    public void someMethodToTestReturnStringRTest() {
        SomeClassToTest someClassToTest = new SomeClassToTest();
        String returnedResult = someClassToTest.someMethodToTestReturnString();
        assertEquals("expexted result", returnedResult);
    }

    @Test
    public void sumTwoDigitsTest() {
        SomeClassToTest someClassToTest = new SomeClassToTest();
        Integer actual = someClassToTest.sumTwoDigits(1, 1);
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sumTwoDigitsTest2() {
        SomeClassToTest someClassToTest = new SomeClassToTest();
        Integer actual = someClassToTest.sumTwoDigits(1, 1);
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sumTwoDigitsTest3() {
        SomeClassToTest someClassToTest = new SomeClassToTest();
        Integer actual = someClassToTest.sumTwoDigits(1, 0);
        Integer expected = 1;
        assertEquals(expected, actual);
    }
}