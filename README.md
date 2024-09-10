# UI Automation Testing Framework

This UI Automation Testing Framework is built using Java, TestNg, Allure Reporting, Log4j2, Maven, Selenium, Page Object Model (POM) design, and Lombok. It includes automated tests for login, color verification, and end-to-end scenarios.

## Table of Contents
- Prerequisites
- Installation
- Configuration
- Running Tests
- Reporting
- Code Examples
- Contributing
- License

## Prerequisites
- Java 17 or higher
- Maven 3.6.3 or higher
- A web browser (e.g., Chrome, Firefox)
- ChromeDriver or GeckoDriver (for Selenium)

## Installation
### Clone the repository:
```
git clone https://github.com/yourusername/your-repo-name.git
cd your-repo-name
```
### Install dependencies:
```
mvn clean install
```

## Configuration
Update the credentials.properties file with your username and password. This file is included in .gitignore to ensure sensitive information is not tracked by Git.

Example credentials.properties:
```
username=your-username
password=your-password
```

## Running Tests
To run all tests, use the following Maven command:
```
mvn test
```

To run specific tests, use the following command:
```
mvn test -Dcucumber.options="--tags @yourTag"
```

## Reporting
Allure Reporting is used to generate test reports. To generate and view the report:

Run the tests to generate the report data:
```
mvn clean test
```

Generate the Allure report:
```
allure generate target/allure-results --clean -o target/allure-report
```

## Code Examples
### Sample Test Case
#### Java

```import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;

public class LoginTest extends TestBase {

    @Test
    public void loginErrorWhenUserNameIsMissingTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        Wait.waitInSeconds(2);
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputShortPassword();
        signInPage.clickSignInButton();
        String message = signInPage.getEmailError();
        Assert.assertEquals(message, ErrorMessage.REQUIRED_FIELD_ERROR_MESSAGE.getValue());
    }

```

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the onica.andrei19@yahoo.com license.

Feel free to customize this README file further to suit your project’s specific needs. If you have any questions or need additional examples, let me know!
