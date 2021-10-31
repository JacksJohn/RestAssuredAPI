package getRequest;


import org.testng.Assert;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ExcelUtils;
import utils.ExcelUtilsTest;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.lang.String;

import static io.restassured.RestAssured.*;

public class TC03a_ValidateQueryBookPass  {
	
	
	
	//Postive test to Validate the type and 
	//path of the Nonfiction book

	@Test
	public void testGetBookValidate1() {
		
		
		String TypeValidate1="Disorders & diseases";
		String PathValidate1="/Books/Nonfiction/Health-lifestyle/Disorders-diseases";
		System.out.println("Start of Test *TC03a* run");
		
		baseURI="https://api.trademe.co.nz/v1/";

				
		given().
		when().
			get("/Categories/193.json").
		then().
			assertThat().
			statusCode(200).
			and().
			body("Subcategories[7].Subcategories[9].Subcategories[3].Name",equalTo(TypeValidate1)).
			and().
		    body("Subcategories[7].Subcategories[9].Subcategories[3].Path",equalTo(PathValidate1));
		    
		
		System.out.println("End of Test *TC03a* run");
		System.out.println("************************");
					
			}		
		
		
	}



