package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.service.InventoryPageService;
import org.tms.service.LoginPageService;
import org.tms.service.ShoppingCartPageService;

public class ShoppingCartPageTest extends BaseTest {
    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void shoppingCartPageTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        ShoppingCartPageService shoppingCartPageService = new ShoppingCartPageService();
        String actualTextOfShoppingCartPage = shoppingCartPageService.openShoppingCartPage();
        String expectedShoppingCartPageText = "Your Cart";
        Assert.assertEquals(actualTextOfShoppingCartPage, expectedShoppingCartPageText, "The actual text of the page does not match expected!");
    }
}
