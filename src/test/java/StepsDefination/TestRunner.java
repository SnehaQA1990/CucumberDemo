package StepsDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {"StepsDefination"},
dryRun = false,
//monochrome = true,
name = {"Login"},

plugin= {

"pretty", "html:reports/myreport.html"

}//,

 // tags = "@Tag1 or @Tag2"

)
public class TestRunner {

}
