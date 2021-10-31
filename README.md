# RestAssuredAPI
API test to query and Validate Trade Me Charities and Books

      *API*
            a. Charities: https://api.trademe.co.nz/v1/Charities.json
            b. Books: https://api.trademe.co.nz/v1/Categories/0193-.json

**Prerequisites**
1. Install Java 8 or above
2. Install Maven
3. Add TestNG plugins

**Running the tests**
1. Import project into Eclipse
2. Right click on testng.xml and run as TestNG suite.              
     *Note: a. Tests class files are under getRequest package (src/test/java).*
            *b. TestNG.XML configured to have all 4 tests included in the same run.*
            *c. utils package can be ignored as was initially intended for parameterization.*
