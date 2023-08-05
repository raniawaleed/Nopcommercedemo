package org.example.page;

import org.example.setDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    By SignInPage = By.className("ico-login");
    By MailField = By.id("Email");
    By PassField = By.id("Password");
    By LoginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
    By MyAccount = By.className("ico-account");
    By ErrorMassege = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");

    public WebElement signInPage (){return Hooks.driver.findElement(SignInPage);}
    public WebElement mailField(){return Hooks.driver.findElement(MailField);}
    public WebElement passField(){return Hooks.driver.findElement(PassField);}
    public WebElement loginButton(){return Hooks.driver.findElement(LoginButton);}
    public WebElement myAccount(){return Hooks.driver.findElement(MyAccount);}
    public WebElement errorMassege(){return Hooks.driver.findElement(ErrorMassege);}
}
