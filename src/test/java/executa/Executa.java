package executa;

import org.junit.runner.RunWith;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "cadastrarTeste",
		tags = "@cadastro",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/report-cucumber.html"},
		snippets = SnippetType.CAMELCASE
		)

public class Executa extends Drivers {

	
	


}
