package cool.trick;

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

            System.out.println("The number breakdown is: " + number);
            System.out.print("The actual number is: ");
            for (int entry : number) {
                System.out.print(entry);
            }
            StringBuilder sb = new StringBuilder(number.size());
            for (int digit : number) {
                sb.append(digit);
            }
            return Integer.valueOf(sb.toString());
        }
        return null;
    }

}