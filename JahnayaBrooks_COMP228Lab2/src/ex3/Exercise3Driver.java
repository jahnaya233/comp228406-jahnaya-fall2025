package ex3;

import static ex3.OverloadedMethods.sum;

public class Exercise3Driver {
    public static void main(String[] args) {
        int result = sum(3, 6);
        System.out.println("The sum of 3 and 6 is: " + result);

        int resultSec = sum(7,2,4);
        System.out.println("The sum of 7, 2, and 4 is: " + resultSec);

        int resultThird = sum(1,4,7);
        System.out.println("The sum of 1, 4, and 7 is: " + resultThird);

    }
}
