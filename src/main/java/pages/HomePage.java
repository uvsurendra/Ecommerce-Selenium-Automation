package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By searchIcon =
            By.xpath("(//button[@aria-label=\"Open search\"])[2]");

    private By searchInput =
            By.xpath("//input[@placeholder='Enter your search']");

    private By searchButton =
            By.xpath("//button[normalize-space()='Search']");


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickSearch() {

        click(searchIcon);
    }


    public void enterSearch(String productName) {

        type(searchInput, productName);
    }


    public void clickSearchButton() {

        click(searchButton);
    }
}
