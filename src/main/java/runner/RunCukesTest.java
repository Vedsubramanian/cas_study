package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/addtocart.feature"},
glue="Stepdefinition",
plugin="html:target/htmlreport")
public class RunCukesTest {
}