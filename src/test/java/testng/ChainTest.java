import org.testng.annotations.Test;
import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;


public class ChainTest {
  
  @Step("step01")
  public ChainTest step01() {
    System.out.println("Step 01 executed");
    // Perform actions for Step 01
    return this;
  }
  
  @Step("step02")
  public ChainTest step02() {
    System.out.println("Step 02 executed");
    // Perform actions for Step 02
    return this;
  }
  
  @QaseTitle("Test with chained steps")
  @Test
  public void Test01() {
    step01().step02();
    System.out.println("Test 01 executed");
  }
}
