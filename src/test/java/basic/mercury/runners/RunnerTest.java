package basic.mercury.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue	 = {"basic.mercury.steps", "basic.mercury.setup"},
		tags	 = {"@CT01"},
		snippets = SnippetType.UNDERSCORE
		)


public class RunnerTest {}
