package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    // Product link from search results
    private By productLink =
            By.xpath("//a[contains(@href,'/products/scarlette-three-hand-date-two-tone-stainless-steel-watch/ES5388.html')]");

    // Product title on Product Details Page
    private By productTitle =
            By.xpath("//h1[contains(@class,'pdp-title')]");

    // Product price
    private By productPrice =
            By.xpath("//*[contains(normalize-space(),'11,995.00')]");

    // Add To Bag button
    private By addToBagButton =
            By.xpath("//button[normalize-space()='Add To Bag']");


    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnProduct() {

        click(productLink);
    }


    public String getProductName() {

        return getText(productTitle);
    }


    public String getProductPrice() {

        return getText(productPrice);
    }


    public void clickAddToBag() {

        click(addToBagButton);
    }
}