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
