package com.ecom.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

@RunWith(SerenityRunner.class)
public class Assignment1 {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://restcountries.eu/rest/v1/name";
	}
	
	@Test
	public void getResponseForINDIA(){
		
		SerenityRest.given()
		.when()
		.get("/INDIA")
		.then()
		.log()
		.all()
		.statusCode(200);
		
	}
	
	@Test
	public void getResponseForXYZ(){
		
		SerenityRest.given()
		.when()
		.get("/XYZ")
		.then()
		.log()
		.all()
		.statusCode(200);
		
	}
	
	

}
