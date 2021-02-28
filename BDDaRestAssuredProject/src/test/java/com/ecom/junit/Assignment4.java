package com.ecom.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;


@RunWith(SerenityRunner.class)
public class Assignment4{
	
	String username="postman";
	String password="password";
	@BeforeClass
	
	public static void init(){
		RestAssured.baseURI="http://postman-echo.com/basic-auth";
	}
	
	@Title("This check the authentication of the POSTMAN Application")
	@Test
	public void registerCutomer(){
		JsonObject json=new JsonObject();
		json.addProperty("Username", username);
		json.addProperty("Password", password);
		
		ValidatableResponse response=SerenityRest.given()
				.headers("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==")
				.body(json.toString())
				.get()
				.then()
				.log()
				.all()
				.statusCode(200);		
		
	}

}
