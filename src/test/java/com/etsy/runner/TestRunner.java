package com.etsy.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber.report.html",
                "rerun:target/cucumber.txt"
        },
        features = "src/test/resources/features",
        glue = "com/etsy/step_definitions",
        dryRun = false,
        tags = ""

)



public class TestRunner {
}
