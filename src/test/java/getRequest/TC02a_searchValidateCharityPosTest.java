package getRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class TC02a_searchValidateCharityPosTest {
	
	
	
	@Test
	public void testGetCharity1()
	{
		
		
			//Initialize the string that needs to be queried
			//This is a positive test
			String ChTrst1="St John";
			System.out.println("Start of Test *TC02a* run");
			
			baseURI="https://api.trademe.co.nz/v1/";
		
			//Retrieve List of Charities
			ArrayList<String> charities1=
		given().
			contentType(ContentType.JSON).
			get("/Charities.json").
		then().
			extract().
			path("Description");
		
			System.out.println("List of Charities ");
			//Print stored values
			for(String m1: charities1)
			{
				System.out.println(m1);
			}
			
			//Check if the Initialized charity is in the list
			System.out.println("The Charity '"+ChTrst1+
	    		"' was found in the list?: "+
	    		charities1.contains(ChTrst1));
			
			System.out.println("End of Test *TC02a* run");
			System.out.println("************************");
			
	}		
		}

	
	
	

	
