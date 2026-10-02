    package pages;

    import base.BasePage;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class LoginPage extends BasePage {

        private By signInButton =
                By.xpath("//button[normalize-space()='Sign in']");

        private By mobileNumberField =
                By.id("phoneInput");

        private By mobileContinueButton =
                By.xpath("//button[normalize-space()='CONTINUE']");


        public LoginPage(WebDriver driver) {
            super(driver);
        }


        public void clickSignIn() {

            click(signInButton);
        }


        public void enterMobileNumber(String mobileNumber) {

            type(mobileNumberField, mobileNumber);
        }


        public void clickMobileContinue() {

            click(mobileContinueButton);
        }
    }
