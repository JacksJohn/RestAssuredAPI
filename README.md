# RestAssuredAPI
API test to query and Validate Trade Me Charities and Books

      *API Endpoint*
            a. Charities: https://api.trademe.co.nz/v1/Charities.json
            b. Books: https://api.trademe.co.nz/v1/Categories/0193-.json

**Prerequisites**
1. Install Java 8 or above
2. Install Maven
3. Add TestNG plugins

**Running the tests**
1. Import project into Eclipse
2. Right click on testng.xml and run as TestNG suite.              
<classes>
      <class name="getRequest.TC02a_searchValidateCharityPosTest"/>
      <class name="getRequest.TC02b_searchValidateCharityNegTest"/>   
      <class name="getRequest.TC03a_ValidateQueryBookPass"/>
      <class name="getRequest.TC03b_ValidateQueryBookFail"/>
    </classes>
