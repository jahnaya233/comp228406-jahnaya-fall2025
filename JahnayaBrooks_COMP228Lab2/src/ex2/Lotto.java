package ex2;

import java.util.Random;

public class Lotto {
    private int [] numbers = new int[3];
    public Lotto () {
        Random pick = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[1] = pick.nextInt(9) + 1;
        }
    }

    public int [] getNumbers() {
        return numbers;
    }

    public int getSum() {
        int sum = 0;
        for (int n: numbers) {
            sum += n;
        }
        return sum;
    }
}

