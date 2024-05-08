import org.testng.Assert;
import org.testng.annotations.Test;
import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import io.qase.api.annotation.QaseId;

public class SimpleTest {

    @QaseTitle("Adding test case title in test NG ")
    @Test
    public void testAddition() {
        // Step 1 of the test case
        step1();
        
        // Step 2 of the test case
        step2();
        
        int result = 2 + 3;
        Assert.assertEquals(result, 5, "Addition result is incorrect");
    }

    @Step("Step 1 of the test case")
    private void step1() {
        // do something
    }

    @Step("Step 2 of the test case")
    private void step2() {
        // do something
    }

    @Test
    @QaseId(779)
    public void testMultiplication() {
        int result = 2 * 3;
        Assert.assertEquals(result, 6, "Multiplication result is incorrect");
    }

    @Test
    @QaseId(780)
    public void testDivision() {
        double result = 10 / 2;
        Assert.assertEquals(result, 5.0, "Division result is incorrect");
    }
}
