package org.tms.service;

import org.tms.page.InventoryPage;
import org.tms.page.ShoppingCartPage;

public class ShoppingCartPageService {

   private InventoryPage inventoryPage = new InventoryPage();

   public String openShoppingCartPage () {
       ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
       inventoryPage.clickOnShoppingCartButton();
       return shoppingCartPage.getTextOfNameOfMainPageSection();
   }
}
