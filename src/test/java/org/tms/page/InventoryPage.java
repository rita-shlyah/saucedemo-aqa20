package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page {

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    public String getTextOfNameOfMainPageSection() {
        return waitVisibilityOf(nameOfMainPageSection).getText();
    }

    public void clickOnShoppingCartButton() {
        waitElementToBeClickable(shoppingCartButton).click();
    }
}
