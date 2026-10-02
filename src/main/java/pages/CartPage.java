package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By shoppingBagTitle =
            By.xpath("//*[normalize-space()='Your shopping bag']");

    private By viewShoppingBag =
            By.linkText("View Shopping Bag");


    public CartPage(WebDriver driver) {
        super(driver);
    }


    public boolean isShoppingBagDisplayed() {

        return isDisplayed(shoppingBagTitle);
    }


    public void clickViewShoppingBag() {

        click(viewShoppingBag);
    }
}