package cool.trick;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

@SpringBootTest
public class SashkoTestWithSpringBoot {

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