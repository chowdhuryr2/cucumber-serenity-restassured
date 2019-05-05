package com.serene.tests.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	features = "src/test/resources/features/Login/Login.feature"
	, glue = "com.serene.tests.feature_steps"
	, dryRun = false
)

public class TestRunner {

}
