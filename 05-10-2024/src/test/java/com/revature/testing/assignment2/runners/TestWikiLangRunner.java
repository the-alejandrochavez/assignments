package com.revature.testing.assignment2.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/revature/testing/assignment2/resources/features",
        glue = {"com.revature.testing.assignment2.steps"}
)

public class TestWikiLangRunner {
}
