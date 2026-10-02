package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected void click(By locator) {

        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        ).click();
    }

    protected void type(By locator, String text) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );

        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        ).getText();
    }

    protected boolean isDisplayed(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        ).isDisplayed();
    }

    protected void acceptConsentIfPresent() {

        try {

            WebDriverWait shortWait =
                    new WebDriverWait(driver, Duration.ofSeconds(5));

            WebElement consentButton =
                    shortWait.until(
                            ExpectedConditions.elementToBeClickable(
                                    By.cssSelector(
                                            "button[data-url*='ConsentTracking-SetConsent'][data-url*='consent=true']"
                                    )
                            )
                    );

            consentButton.click();

        } catch (Exception e) {

            // Consent popup is not displayed
        }
    }
}