package com.ecom.junit;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.ecom.cucumber.serenity.EmployeeSerenitySteps;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;


@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Assignment3{
	
	String name="Vicky";
	String job="Managers";
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="https://reqres.in/api/users";
	}
	
	@Steps
	EmployeeSerenitySteps steps;
	@Title("This will register employee")
	@Test
	public void registerEmployee(){
		
		steps.createEmployee(name, job).statusCode(201);
		
//		System.out.println("** Response **");
//		System.out.println(response.asString());
//		System.out.println("** Status Code **");
//		System.out.println(response.statusCode());
			
	}

}
