package getRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class TC02b_searchValidateCharityNegTest {
	
	@Test
	public void testGetCharity2()
	{
		
		
		//Initialize the string with search not on List
		//This is a negative test
				String ChTrst2="St John Ambulance";
				System.out.println("Start of Test *TC02b* run");
				
				baseURI="https://api.trademe.co.nz/v1/";
				
					//Retrieve List of Charities
					ArrayList<String> charities2=
				given().
					contentType(ContentType.JSON).
					get("/Charities.json").
				then().
					extract().
					path("Description");
				
					System.out.println("List of Charities ");
					//Print stored values
					for(String m2: charities2)
						{
							System.out.println(m2);
						}
					
					//Check if the Initialized charity is in the list
					//The result will return a false and hence 
					//validates negative test
					System.out.println("The Charity "+ChTrst2+
			    		" was found in the list?: "+
			    		charities2.contains(ChTrst2));
			
					System.out.println("End of Test *TC02b* run");
					System.out.println("************************");
					
		}
	
	}

	
