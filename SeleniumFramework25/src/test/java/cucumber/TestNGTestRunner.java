package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber",glue="stepDefinitions",
monochrome=true, tags = "@Regression", plugin= {"html:target/cucumberreports.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests 
{

	//cucumber->  TestNG, junit


}
