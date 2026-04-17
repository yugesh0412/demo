package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static Base.baseclass.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFolder/Demo.feature",glue ="stepDef",tags ="@1")
public class Runnerclass {
   @BeforeClass
    public static void start(){
       openTheBrowser();
       maximize();
       implicityWait();
   }
   @AfterClass
    public static void end() throws InterruptedException {
     //  quit();
   }
}
