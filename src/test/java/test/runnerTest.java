package test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
        features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\datatableverify\\src\\test\\java\\resources",
        //tags = "@Test1 or @Test2",
        glue = "/test"
        
        
		)

public class runnerTest {

}
