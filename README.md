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
   Note: a. The tests are under the package 'getRequest'
         b. utils package can be ignored as was intended for parameterization of String/data validaton.
3. Right click on testng.xml and run as TestNG suite.
        Note: The following are configured to be part of the single run .i.e. Test to retrieve and validate Charity and test to validate books
              
