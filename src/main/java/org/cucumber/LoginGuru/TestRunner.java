package org.cucumber.LoginGuru;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/org/cucumber/LoginGuru/newcustomer.feature",glue= {"org.cucumber.LoginGuru"},plugin= {"html:target"})
public class TestRunner {

}
