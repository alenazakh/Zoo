package org.zoo;


public class OnlyForTesting {

    public int multiply3 (int a) {
        return (a * 3);
    }

    public boolean passingExam(int score) {
        boolean passExam = false;
        while (score < 0 || score > 100) {
            System.out.println("Incorrect data. Try again: ");
        }
        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
            passExam = true;
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
        return passExam;
    }

    public int multiplicationOfAnyNFirstNumbers (int a, int n) {
        int result = 1;
        int x = a;
        for (int i = 1; i <= n; i++) {
            x += i - 1;
            result *= x;
        }
        System.out.printf("multiplication for numbers from %d to %d : %d\n", a, n-1, result);
        return result;
    }

    public int factorial (int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.printf("Factorial of %d = %d.\n", number, result);
        return result;
    }

}
