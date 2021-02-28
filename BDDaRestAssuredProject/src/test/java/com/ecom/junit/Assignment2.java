package com.ecom.junit;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

@RunWith(SerenityRunner.class)
public class Assignment2 {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://restcountries.eu/rest/v1/name";
	}
	
	@Test
	public void getResponseForNORWAY(){
		
		Response response=SerenityRest.given()
		.when()
		.get("/norway")
		.then()
		.extract()
		.response();
		
		System.out.println(response.asString());	
		
		List<String> capitals = response.path("capital");

		    // check capital of Norway is Oslo
		    for (String capital : capitals)
		    {
		        Assert.assertEquals(capital, "Oslo");
		        System.out.println("***** Capital of Norway : "+capital);
		    }
		
	}

	
	
	
	
	

}
