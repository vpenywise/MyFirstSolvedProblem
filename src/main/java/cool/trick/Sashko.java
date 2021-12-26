package cool.trick;

import org.apache.commons.lang3.Range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sashko {


    public Integer checkUserInput(int middle, int last, List<Integer> number) {
        int first;
        if (last <= 0 || last > 9) {
            System.out.println("You can only enter a number between 1 and 9");
        } else {
            first = middle - last;

            number.add(first);
            number.add(middle);
            number.add(last);

            printLog(number);
            return createNumberFromDigits(number);
        }
        return null;
    }

    public Integer checkUserInput2(int middle, int last) throws IllegalArgumentException {
        // Не че ти спестява много код това с рейнджа,
        // но пък може да задаваш някви странни стойности нап;ример double Range.between(3d,4.2d); и само като инфо го пращам
        Range<Integer> myRange = Range.between(0, 9);
        //Вместо да принтираш грешката, метода ти може да хвърли грешка, която грешка после да прихванеш и ако искаш тогава да я принтираш.
        //работата на метода ти, не е да принтира. Ако се счупи нещо да си хвъърли грешка. Който иска да я хваща и да я принтира.
        if (myRange.contains(last)) {
            throw new IllegalArgumentException("You can only enter a number between 1 and 9");//това ще бъде прихванато, там където се вика ак охвърли грешка.
            // В нашия случай в DemoApplication
        }//за това махнах и else. Защото реално АКО влезе в if-a метода ще спре. В противен случай няма да влезе в ИФа и ще си продължи. няма нужда от else state

        //first няма смисъл един път да годекларираш па после да му придаваш стойност. Всичко можеш на един ред.
        // Ако не се ползва по - рано дадена променлива или обект. Няма смисъл да се създава
        int first = middle - last;

        List<Integer> number = new ArrayList<>();
        number.add(first);
        number.add(middle);
        number.add(last);
        //Това също може да го събереш на 1 ред
        //List<Integer> number = Arrays.asList(first,middle,last);


        //Понеже тук нищо друго не прави, спокойно може да изнесеш двта принта в отделен метод.
        //Както казах, работа на този метод, НЕ Е да принтира.
        printLog(number);

        //Това тук само с цел прегледност и по- песно четене на кода. Като видиш метода ти е ясно какво би трябало да прави.
        //Защото иначе гледаш някакъв лист с цифри, върти се цикъл и не че няма да вденеш какво се случва, но няма да губиш време.
        //Просто четеш името на метода (ако е смислено написан ще се разбере и безда гледаш кода)
        Integer generatedNumber = createNumberFromDigits(number);
        return generatedNumber;
        //даже не е нужно да създаваш променлива, която после да връщаш, може директно така
        //return createNumberFromDigits(number);
    }


    //тези методи са прайвет, защото се ползват САМО и единствено тук от горния метод.
    private Integer createNumberFromDigits(List<Integer> number) {
        StringBuilder sb = new StringBuilder(number.size());
        for (int digit : number) {
            sb.append(digit);
        }
        return Integer.valueOf(sb.toString());
    }

    private void printLog(List<Integer> number) {
        System.out.println("The number breakdown is: " + number);
        System.out.print("The actual number is: ");
        for (int entry : number) {
            System.out.print(entry);
        }
    }
}