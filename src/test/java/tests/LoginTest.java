package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage =
                new LoginPage(driver);

        // Step 1: Click Sign In
        loginPage.clickSignIn();

        // Step 2: Enter mobile number
        loginPage.enterMobileNumber("9492257477");

        // Step 3: Click Continue
        loginPage.clickMobileContinue();
    }
}
