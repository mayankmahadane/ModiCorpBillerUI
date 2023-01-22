package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/CucumberRerunReport.html", "rerun:target/failedrerun.txt"},
				 features = {"@target/failedrerun.txt"},
				 glue = {"steps"})
public class FailedRunner {

}
