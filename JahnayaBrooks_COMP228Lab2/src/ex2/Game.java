package ex2;

import javax.swing.JOptionPane;

public class Game {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter something between 3 and 27");


        int inputNumber = Integer.parseInt(input);

        boolean win = false;

        for (int attempt = 1; attempt <= 5; attempt++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
            int[] nums = lotto.getNumbers();

            JOptionPane.showMessageDialog(null,"Roll " + attempt + ": " + nums[0] + ", " + nums[1] + ", " + nums[2] + "Sum: " + sum);
            if (sum == inputNumber) {
                JOptionPane.showMessageDialog(null,"You have won!");
                win = true;
                break;
            }
            
    else{
                    JOptionPane.showMessageDialog(null,
                            "You have lost");
                }
            }

        }
    }
