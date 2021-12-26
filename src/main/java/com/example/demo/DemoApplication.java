package com.example.demo;

import cool.trick.Sashko;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Sashko sashko = new Sashko();
        final int middle = 9;
        int last = 0;
        List<Integer> numbers = new ArrayList<>();

        last = askUserInput();
        Integer integer = sashko.checkUserInput(middle, last, numbers);
        System.out.println(integer);

        try {
            Integer integer2 = sashko.checkUserInput2(middle, last);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());//Тук би трябвало да ти принтира съобщението което хвърляш като грешка в метода
        }

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
