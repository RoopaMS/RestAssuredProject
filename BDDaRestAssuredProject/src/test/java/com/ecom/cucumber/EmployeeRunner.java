package com.ecom.cucumber;

import org.junit.runner.RunWith;

import com.ecom.testbase.TestBase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
@CucumberOptions(features="src/test/resources/feature")
public class EmployeeRunner extends TestBase{
	
	

}
