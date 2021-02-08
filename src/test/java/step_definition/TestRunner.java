package step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/reports/cucumber-html-report", "json:target/reports/cucumber-json-report.json" },monochrome=true,
features = "features"
,glue={"step_definition"}
)
public class TestRunner {


}
