package ex3;

public class OverloadedMethods {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }
    public static int sum(int[] numbers) {
        int sums = 0;
        for (int num : numbers) {
            sums += num;
        }
        return sums;
    }


}
