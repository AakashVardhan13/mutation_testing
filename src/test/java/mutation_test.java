import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class mutation_test{
    private Main cal;
    @Before
    public void setUp(){
        cal = new Main();
    }

    @Test
    public void test_add_positive(){
        double x = 2;
        double y = 3;
        double expectedResult = 5;
        Assert.assertEquals(expectedResult, cal.add(x, y));
    }

    @Test
    public void test_add_negative(){
        double x = 5;
        double y = 1;
        double expectedResult = 2;
        Assert.assertNotEquals(expectedResult, cal.add(x, y));
    }

    @Test
    public void test_sub_positive(){
        double x = 8;
        double y = 3;
        double expectedResult = 5;
        Assert.assertEquals(expectedResult, cal.sub(x, y));
    }

    @Test
    public void test_sub_negative(){
        double x = 8;
        double y = 2;
        double expectedResult = 7;
        Assert.assertNotEquals(expectedResult, cal.sub(x, y));
    }

    @Test
    public void test_mul_positive(){
        double x = 3;
        double y = 3;
        double expectedResult = 9;
        Assert.assertEquals(expectedResult, cal.mul(x, y));
    }

    @Test
    public void test_mul_negative(){
        double x = 4;
        double y = 7;
        double expectedResult = 9;
        Assert.assertNotEquals(expectedResult, cal.mul(x, y));
    }

    @Test
    public void test_div_positive(){
        double x = 3;
        double y = 2;
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, cal.div(x, y));
    }
    @Test
    public void test_div_negative(){
        double x = 6;
        double y = 2;
        double expectedResult = 5;
        Assert.assertNotEquals(expectedResult, cal.div(x, y));
    }

}