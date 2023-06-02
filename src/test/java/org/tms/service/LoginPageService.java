package org.tms.service;

import org.tms.model.User;
import org.tms.page.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";

    public InventoryPageService login(User user) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillUserName(user.getName())
                .fillPassword(user.getPassword())
                .clickLoginButton();
        return new InventoryPageService();
    }

}
