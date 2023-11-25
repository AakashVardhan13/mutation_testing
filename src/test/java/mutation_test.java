import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class mutation_test{
    private Main calculator;
    @Before
    public void setUp(){
        calculator = new Main();
    }

    @Test
    public void test_add_positive(){
        int x = 2;
        int y = 3;
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, calculator.add(x, y));
    }

    @Test
    public void test_add_negative(){
        int x = 5;
        int y = 1;
        int expectedResult = 2;
        Assert.assertNotEquals(expectedResult, calculator.add(x, y));
    }

    @Test
    public void test_sub_positive(){
        int x = 8;
        int y = 3;
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, calculator.sub(x, y));
    }

    @Test
    public void test_sub_negative(){
        int x = 8;
        int y = 2;
        int expectedResult = 7;
        Assert.assertNotEquals(expectedResult, calculator.sub(x, y));
    }

    @Test
    public void test_mul_positive(){
        int x = 3;
        int y = 3;
        int expectedResult = 9;
        Assert.assertEquals(expectedResult, calculator.mul(x, y));
    }

    @Test
    public void test_mul_negative(){
        int x = 4;
        int y = 7;
        int expectedResult = 9;
        Assert.assertNotEquals(expectedResult, calculator.mul(x, y));
    }

    @Test
    public void test_div_positive(){
        int x = 3;
        int y = 2;
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, calculator.div(x, y));
    }
    @Test
    public void test_div_negative(){
        int x = 6;
        int y = 2;
        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.div(x, y));
    }

}