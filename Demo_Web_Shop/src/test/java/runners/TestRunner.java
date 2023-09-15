package runners;



import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
				features = {"Features/AddBookToCart.feature"},
				glue = "stepDefinition"
				)

@Listeners(utility.TestListener.class)

public class TestRunner extends AbstractTestNGCucumberTests{

}



