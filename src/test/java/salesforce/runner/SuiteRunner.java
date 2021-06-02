package salesforce.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/salesforce/features" ,
					monochrome = true ,
					glue = "salesforce/stepdefinitions" , 
					plugin = {"pretty", "html:src/test/java/Reports/SampleReport.html"})
public class SuiteRunner {

}
