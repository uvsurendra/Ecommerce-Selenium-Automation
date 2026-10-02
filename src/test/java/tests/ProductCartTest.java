package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class ProductCartTest extends BaseTest {

    @Test
    public void verifyProductAndCartFlow() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        // 1. Open Search
        homePage.clickSearch();

        // 2. Search for product
        homePage.enterSearch("ES5388");
        homePage.clickSearchButton();

        // 3. Click product from search results
        productPage.clickOnProduct();

        // 4. Verify product name
        String productName = productPage.getProductName();

        Assert.assertTrue(
                productName.contains("Scarlette Three-Hand Date"),
                "Expected product was not displayed"
        );

        // 5. Verify product price
        String price = productPage.getProductPrice();

        Assert.assertTrue(
                price.contains("11,995"),
                "Expected product price ₹11,995 was not displayed"
        );

        // 6. Add product to bag
        productPage.clickAddToBag();

        // 7. Click View Shopping Bag
        cartPage.clickViewShoppingBag();
    }
}