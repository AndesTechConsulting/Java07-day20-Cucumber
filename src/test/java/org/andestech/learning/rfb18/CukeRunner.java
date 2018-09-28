package org.andestech.learning.rfb18;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.andestech.learning.rfb18.steps"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty"},
        tags = {"@loginFeature"}
       // ,tags = {"@2"}
        )
public class CukeRunner {

}