package cool.trick;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class SashkoTest {

    @Test
    public void test() {
        Sashko sashko = new Sashko();
        List<Integer> testNumber = new ArrayList<>();
        sashko.checkUserInput(9, 3, testNumber);
    }

    @Test
    public void checkWrongtUserInput() {
        Sashko sashko = new Sashko();
        List<Integer> firstNumber = new ArrayList<>();
        Integer integer = sashko.checkUserInput(9, 10, firstNumber);
        //some assert
    }

    @Test
    public void checkCorrectUserInput() {
        Sashko sashko = new Sashko();
        List<Integer> firstNumber = new ArrayList<>();
        Integer integer = sashko.checkUserInput(9, 3, firstNumber);
        //some assert
    }
}