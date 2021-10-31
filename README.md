**RestAssuredAPI**
API test to query and Validate Trade Me Charities and Books

  *API*
        a. Charities: https://api.trademe.co.nz/v1/Charities.json
        
        b. Books: https://api.trademe.co.nz/v1/Categories/0193-.json
        
**Prerequisites**

Install Java 8 or above
Install Maven
Add TestNG plugins

**Running the tests**

Import project into Eclipse
Right click on testng.xml and run as TestNG suite.
**Note:** 
_a. Tests class files are under getRequest package (src/test/java). 
b. TestNG.XML configured to have all 4 tests included in the same run. 
c. utils package can be ignored as was initially intended for parameterization._
