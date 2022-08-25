package org.zoo;


import java.math.BigInteger;

public class OnlyForTesting {

    public static double multiply3 (double a) {
        return (a * 3.0);
    }

    public static double divideBy (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Only for numbers > 0");
        } else {
            return a / b;
        }
    }

    public static boolean passingExam(int score) throws Exception {
        boolean passExam = false;
        while (score < 0 || score > 100) {
            throw new Exception("Score should by in the range from 0 to 100.");
        }
        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
            passExam = true;
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
        return passExam;
    }


    public static BigInteger factorial (int number) throws Exception {
        if (number <= 0) {
            throw new Exception("Only for numbers > 0");
        } else {
            BigInteger result = new BigInteger("1");
            for (int i = 1; i <= number; i++) {
                String iToString = String.valueOf(i);
                BigInteger tempI = new BigInteger(iToString);
                result = result.multiply(tempI);  //result *= i;
            }
            return result; }
    }

}
