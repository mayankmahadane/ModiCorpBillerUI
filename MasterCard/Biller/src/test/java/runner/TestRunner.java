package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/CucumberReport.html", "rerun:target/failedrerun.txt"},
				 features = {"src/test/features"},
				 glue = {"steps"})
public class TestRunner {

}
