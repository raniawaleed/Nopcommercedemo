package org.example.page;

import org.example.setDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    By ClickRegisterPage = By.className("ico-register");
    By SelectGender = By.id("gender-female");
    By FirstName = By.id("FirstName");
    By LastName = By.xpath("//*[@id=\"LastName\"]");
    By DayField = By.name("DateOfBirthDay");
    By MonthField = By.name("DateOfBirthMonth");
    By YearField = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");
    By ResultMsg = By.className("result");


    public WebElement registerPage(){return Hooks.driver.findElement(ClickRegisterPage);}
    public WebElement GenderType(){ return Hooks.driver.findElement(SelectGender); }
    public WebElement firstName(){return Hooks.driver.findElement(FirstName);}
    public WebElement lastName(){return Hooks.driver.findElement(LastName);}
    public WebElement dayField(){return Hooks.driver.findElement(DayField);}
    public WebElement monthField(){return Hooks.driver.findElement(MonthField);}
    public WebElement yearField(){return Hooks.driver.findElement(YearField);}
    public WebElement email(){return Hooks.driver.findElement(Email);}
    public WebElement password(){return Hooks.driver.findElement(Password);}
    public WebElement confirmPassword(){return Hooks.driver.findElement(ConfirmPassword);}
    public WebElement registerButton(){return Hooks.driver.findElement(RegisterButton);}
    public WebElement resultMsg(){return Hooks.driver.findElement(ResultMsg);}


}
