package com.ecom.cucumber.steps;

import com.google.gson.*;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class EmployeeSteps {
	
	@When("^User send the post request for user creation , they must get valid status code of 200$")
	public void validate_status_code_200_for_employee_registration(){
		JsonObject jsonnody=new JsonObject();
		jsonnody.addProperty("name", "Vicky");
		jsonnody.addProperty("job", "S");
		
		 SerenityRest.given()
				.body(jsonnody.toString())
				.post("/users")
				.then();
	}

}
