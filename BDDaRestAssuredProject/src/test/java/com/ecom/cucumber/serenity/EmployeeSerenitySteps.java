package com.ecom.cucumber.serenity;

import gherkin.deps.com.google.gson.*;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class EmployeeSerenitySteps {
	
	@Step
	public ValidatableResponse createEmployee(String firstName,String job){
		
		JsonObject jsonnody=new JsonObject();
		jsonnody.addProperty("name", firstName);
		jsonnody.addProperty("job", job);
		
		return SerenityRest.given()
				.body(jsonnody.toString())
				.post("/users")
				.then();
	}

}
