import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    @Description("Test for checking equals 2 and 3")
    public void test1() {
        Assert.assertEquals(2, 3);
    }

    @Test
    @Description("Test for checking equals 2 and 2")
    public void test2() {
        Assert.assertEquals(2, 2);
    }

    @Test
    @Description("Test for checking smth")
    public void test3() {
        Assert.assertTrue(true, "This test should be failed");
    }

    @Test
    @Description("Test with failing")
    public void test4() {
        Assert.fail("This test should be failed");
    }

    @Test(dependsOnMethods = "test4")
    public void skippedByDependencyTest() {

    }

}