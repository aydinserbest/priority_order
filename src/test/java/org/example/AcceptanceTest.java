package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.InputStream;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features"
        //tags = "@runnerClassTag"
)
public class AcceptanceTest {


}
