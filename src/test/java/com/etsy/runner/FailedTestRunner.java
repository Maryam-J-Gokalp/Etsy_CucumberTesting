package com.etsy.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/cucumber-report/cucumber.txt",
        glue = "com/etsy/step_definitions"
)
public class FailedTestRunner {
}
