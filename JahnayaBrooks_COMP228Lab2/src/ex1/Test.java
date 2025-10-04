package ex1;

import java.util.Scanner;
import java.util.Random;
public class Test {


    private String[] questions = {
            "1. What is the main function of a Java compiler?",
            "2. Which of the following components does a Java application need to have at least one of?",
            "3. Which of the following processes is typically used by JVM to execute bytecode?",
            "4. Which of the following typically groups related classes so that they could be imported into programs and reused?",
            "5. Method arguments may be _____."
    };


    private String[][] choices = {
            {"1. It executes the bytecodes.", "2. It places the program in memory to execute it.",
                    "3. It examines the bytecodes to ensure that they are valid and do not violate " +
                            "Java's security restrictions", "4. It translates the Java source code into bytecodes that represent the tasks to execute.!!"},
            {"2. 1. Local variable", "2. Class!!", "3. Non-static Method", "4. Instance variable"},
            {"3. 1. A combination of interpretation and just-in-time (JIT) compilation!!", "2. Interpretation", "3. Regular time compilation only", "4. Just-in-time (JIT) compilation"},
            {"4. 1. Function", "2. IDE", "3. Package!!", "4. Method"},
            {"5. 1. Only strings", "2. Only variables", "3. Constants, variables, or expressions!!", "4. Only constants"}


    };


    private int[] correctInput = {4, 2, 1, 3, 3};
    private int incorrect = 0;
    private int correct = 0;
    private Scanner scanner;
    private Random random = new Random();

    public void simulateQuestion(int qList) {
        System.out.println(questions[qList]);
        for (String choi : choices[qList]) {
            System.out.println(choi);
        }
        inputAnswer();
    }
    public void checkAnswer(int qList, int ans) {
        if (ans == correctInput[qList]) {
            correct++;
            System.out.println(generateMessage(true));
        } else {
            incorrect++;
            System.out.println(generateMessage(false));
            System.out.println("Correct Answer: " + choices[qList][correctInput[qList] - 1]);
        }
        System.out.println();
    }

    public String generateMessage(boolean correct) {
        switch (random.nextInt(4)) {
            case 0:
                return correct ? "Very good!" : "No. Please try again.";
            case 1:
                return correct ? "Excellent!" : "Wrong. Try once more.";
            case 3:
                return correct ? "Keep up the good work!" : "Don't give up!";
            case 4:
                return correct ? "Nice work!" : "No. Keep trying..";
            default:
                return  "";
        }
    }
public void inputAnswer() {
        for (int i =0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        double percentage = (correct * 100.0) / questions.length;
        System.out.println("Correct answers: " + correct);
    System.out.println("Incorrect answers: " + incorrect);
    System.out.printf("Percentage: %.2f%%", percentage);

}
    private void inputAnswer(int qList) {
        System.out.print("Choose options from 1 -4");
        if (scanner.hasNextInt()) {
            int answer = scanner.nextInt();
            checkAnswer(qList, answer);
        } else {
            System.out.println("Invalid, Please enter a number from 1 to 4");
            scanner.next();
            inputAnswer(qList);
        }
    }

}