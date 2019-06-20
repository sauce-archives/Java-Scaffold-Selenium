package com.saucelabs.saucedemo.page;

import com.retailmenot.scaffold.webelements.ButtonWebElement;
import com.retailmenot.scaffold.webelements.DivWebElement;
import com.retailmenot.scaffold.webelements.InputWebElement;
import com.saucelabs.saucedemo.BasePage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    @Getter private InputWebElement usernameInput = new InputWebElement(By.id("user-name"));
    @Getter private InputWebElement passwordInput = new InputWebElement(By.id("password"));
    @Getter private ButtonWebElement submitButton = new ButtonWebElement(By.className("btn_action"));
    @Getter private DivWebElement credentialsInfo =new DivWebElement(By.id("login_credentials"));

    @Override
    public boolean isOnPage() {
        return credentialsInfo.isDisplayed();
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
}
