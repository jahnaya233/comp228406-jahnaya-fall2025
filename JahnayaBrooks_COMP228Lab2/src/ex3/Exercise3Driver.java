package ex3;

import static ex3.OverloadedMethods.sum;

public class Exercise3Driver {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out. println("The sum of 5 and 10 is: " + result);

        int results = sum(3,6,9);
        System.out. println("The sum of 3, 6, and 9 is: " + results);

        int resultss = sum(1,4,7);
        System.out. println("The sum of 1, 4, and 7 is: " + resultss);

    }
}
