package com.cucumber.stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/features",
        glue = "com.cucumber.stepDefinitions",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )
public class RunCucuTest {
}