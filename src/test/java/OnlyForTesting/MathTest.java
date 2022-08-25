package OnlyForTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static org.testng.Assert.*;
import static org.zoo.OnlyForTesting.*;

public class MathTest {

    @DataProvider(name = "setOfNumbers")
    public Object[][] setOfNumbers () {
        return new Object [][] {{2.0, 6.0}, {7.0, 21.0}, {100.0, 300.0}, {0.0, 0.0}, {-5.0, -15.0}, {15000000.3, 45000000.9}};
    }

    @DataProvider(name = "setOfNumbers1")
    public Object[][] setOfNumbers1 () {
        return new Object [][] {{7, "5040"}, {15, "1307674368000"}, {37, "13763753091226345046315979581580902400000000"}};
    }

    @DataProvider(name = "negativeSetOfNumbers2")
    public Object[][] negativeSetOfNumbers2 () {
        return new Object [][] { {-9999}, {-15}, {0} };
    }

    @DataProvider(name = "setOfNumbers3")
    public Object[][] setOfNumbers3 () {
        return new Object [][] { {0}, {15}, {69} };
    }

    @DataProvider(name = "setOfNumbers4")
    public Object[][] setOfNumbers4 () {
        return new Object [][] { {70}, {85}, {100} };
    }

    @DataProvider(name = "negativeSetOfNumbers5")
    public Object[][] negativeSetOfNumbers5 () {
        return new Object [][] { {-15}, {-1}, {101}, {9999} };
    }



    //not with DataProvider because of SoftAssert usage
    @Test (groups = "positive", timeOut = 1000)
    public void dividePositiveTest () {
        SoftAssert currentSoftAssert = new SoftAssert();
        currentSoftAssert.assertEquals(divideBy(5, 1), (5.0/1.0));
        currentSoftAssert.assertEquals(divideBy(-15, 4), (-15.0/4.0));
        currentSoftAssert.assertEquals(divideBy(0, 6), (0.0/6.0));
        currentSoftAssert.assertEquals(divideBy(2345678.15, 14.89), (2345678.15/14.89));
        currentSoftAssert.assertAll("failure message");
    }

    @Test (groups = "negative", expectedExceptions = ArithmeticException.class)
    public void divideByNull () {
        double a = 5.0;
        double b = 0.0;
        double result = divideBy (a, b);
    }

    @Test (groups = "positive", dataProvider = "setOfNumbers") // round with BigDecimal
    public void positiveMultiply3 (double a, double expectedResult) {
        BigDecimal bd = new BigDecimal(multiply3(a)).setScale(6, RoundingMode.HALF_UP);
        double actualResult = bd.doubleValue();
        assertEquals (actualResult, expectedResult);
    }

    @Test (groups = "positive", dataProvider = "setOfNumbers1")
    public void positiveFactorialTest (int number, String expectedResult) throws Exception {
        BigInteger expectedResultBigInteger = new BigInteger(expectedResult);
        assertEquals(factorial(number), expectedResultBigInteger);
    }

    @Test (groups = "negative", dataProvider = "negativeSetOfNumbers2", expectedExceptions = Exception.class)
    public void negativeFactorialTest1 (int number) throws Exception {
        factorial(number);                            //function doesn't work for big numbers
    }

    @Test (groups = "positive", dataProvider = "setOfNumbers4")
    public void passExamTrueTest (int score) throws Exception {
        assertTrue(passingExam(score));
    }

    @Test (groups = "positive", dataProvider = "setOfNumbers3")
    public void passExamFalseTest (int score) throws Exception {
        assertFalse(passingExam(score));
    }

    @Test (groups = "negative", dataProvider = "negativeSetOfNumbers5", expectedExceptions = Exception.class)
    public void passExamNegativeTest (int score) throws Exception {
        assertFalse(passingExam(score));
    }








}
