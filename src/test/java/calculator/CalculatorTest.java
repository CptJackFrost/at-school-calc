package calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {



    @DataProvider
    public Object[][] testObjects(){
        return new Object[][] {
                {2, 3, '+', 5},
                {2, 2, '+', 10},
                {3, 1, '-', 2},
                {100, 200, '-', 12},
                {5, 2, '/', 2},
                {6, 3, '/', 1},
                {4, 3, '*', 12},
                {"one", 2, '+', 3}
        };
    }

    @Test(dataProvider = "testObjects")
    public void calcTest(int first, int second, char operation, int result){
        Assert.assertEquals(result, Calculator.calc(first, second, operation), "Значения не равны");
    }

}
