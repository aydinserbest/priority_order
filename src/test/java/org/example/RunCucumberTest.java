package org.example;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
//@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//@IncludeTags("runnerClassTag") // do not write @ in front of this
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@runnerClassTag")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.login.step_definitions")

public class RunCucumberTest {

}
