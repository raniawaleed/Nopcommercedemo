package org.example.setDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
P01_register register = new P01_register();
SoftAssert softAssert = new SoftAssert();

@Given("user go to register page")
    public void userGoToRegisterPage(){
    register.registerPage().click();
}


    @When("user select gender type")
    public void userSelectGenderType() {
register.GenderType().click();
    }

    @And("user enter first name {string}")
    public void userEnterFirstName(String firstName) {
    register.firstName().sendKeys(firstName);
    }

    @And("user enter last name {string}")
    public void userEnterLastName(String LastName) {
    register.lastName().sendKeys(LastName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select Day = new Select(register.dayField());

        Select Month = new Select(register.monthField());

        Select Year = new Select(register.yearField());
        Day.selectByValue("13");

        Month.selectByValue("2");

        Year.selectByValue("1998");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
register.email().sendKeys(email);
    }

    @And("user fills Password field {string}")
    public void userFillsPasswordField(String password) {
    register.password().sendKeys(password);
    }

    @And("user fills Confirm Password Field {string}")
    public void userFillsConfirmPasswordField(String confirmpasswoerd) {
    register.confirmPassword().sendKeys(confirmpasswoerd);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {softAssert.assertEquals(register.resultMsg().getText(),"Your registration completed");
        System.out.println("color" + register.resultMsg().getCssValue("color"));
        softAssert.assertTrue(register.resultMsg().getCssValue("color").contains("(76, 177, 124, 1)"));
        softAssert.assertAll();}
}



