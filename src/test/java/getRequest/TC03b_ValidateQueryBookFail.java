package getRequest;


import org.testng.Assert;

import org.testng.annotations.Test;
import io.restassured.*;



import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ExcelUtils;
import utils.ExcelUtilsTest;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class TC03b_ValidateQueryBookFail  {
	
	
	@Test
	//Validation for a negative 
	public void testGetBookValidate2() {
		
		String TypeValidate2="Disorders & Diseases"; //String passed with Caps letter hence test will fail
		String PathValidate2="/Books/Nonfiction/Health-lifestyle/Disorders-diseases";
		System.out.println("Start of Test *TC03b* run");
		
		baseURI="https://api.trademe.co.nz/v1/";

		
		given().
		when().
			get("/Categories/193.json").
		then().
			assertThat().
			statusCode(200).
			and().
			body("Subcategories[7].Subcategories[9].Subcategories[3].Name",equalTo(TypeValidate2)).
			and().
		    body("Subcategories[7].Subcategories[9].Subcategories[3].Path",equalTo(PathValidate2));
		    
		
		System.out.println("End of Test *TC03b* run");
		System.out.println("************************");
		
	}


		

}
