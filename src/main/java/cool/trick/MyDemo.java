package cool.trick;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDemo {

    public static void main(String[] args) {
        Sashko sashko = new Sashko();
        final int middle = 9;
        int last = 0;
        List<Integer> numbers = new ArrayList<>();

        last = askUserInput();
        Integer integer = sashko.checkUserInput(middle, last, numbers);
        System.out.println(integer);

    }

    public static int askUserInput() {
        int last;
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the last digit of your number?");
        last = scan.nextInt();
        scan.close();
        return last;
    }
}
