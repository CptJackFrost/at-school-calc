package calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider
    public Object[][] testObjectsPositive(){
        return new Object[][] {
                {2, 3, '+', 5},
                {3, 1, '-', 2},
                {5, 2, '/', 2},
                {4, 3, '*', 12},

        };
    }

    @Test(dataProvider = "testObjectsPositive")
    public void calcTestPositive(int first, int second, char operation, int result){
        Assert.assertEquals(result, Calculator.calc(first, second, operation), "Значения не равны");
    }

    @DataProvider
    public Object[][] testObjectsWrong(){
        return new Object[][] {
                {2, 2, '+', 10},
                {100, 200, '-', 12},
                {6, 3, '/', 1},
                {5, 5, '*', 100}
        };
    }

    @Test(dataProvider = "testObjectsWrong")
    public void calcTestWrongResult(int first, int second, char operation, int result){
        Assert.assertNotEquals(result, Calculator.calc(first, second, operation), "Значения равны");
    }

}
