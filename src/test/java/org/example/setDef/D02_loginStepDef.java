package org.example.setDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    SoftAssert softAssert = new SoftAssert();
 @Given("userr go to login page")
    public void userr_go_to_login_page(){
    login.signInPage().click();
 }

    @When("userr login with valid email {string}")
    public void userrLoginWithValidEmail(String email) throws InterruptedException {
    login.mailField().sendKeys(email);
    Thread.sleep(4000);
    }

    @And("userr  should enter valid password {string}")
    public void userrShouldEnterValidPassword(String password) {
login.passField().sendKeys(password);
    }

    @And("userr press on login button")
    public void userrPressOnLoginButton() {
    login.loginButton().click();
    }

    @Then("userr login to the system successfully")
    public void userrLoginToTheSystemSuccessfully() {
       softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
       softAssert.assertTrue(login.myAccount().isDisplayed());
       softAssert.assertAll();
    }

    @When("userr login with invalid email {string}")
    public void userrLoginWithInvalidEmail(String email) {
       login.mailField().sendKeys(email);
    }
   @And("userr enter valiid {string}")
   public void userrEnterValiid(String password) {
      login.passField().sendKeys(password);

   }
    @Then("userr could not login to the system")
    public void userrCouldNotLoginToTheSystem() {
       softAssert.assertTrue(login.errorMassege().getText().contains("Login was unsuccessful."));
       String HexColor= Color.fromString(login.errorMassege().getCssValue("color")).asHex();
       System.out.println(HexColor);
       softAssert.assertEquals(HexColor,"#e4434b");
       softAssert.assertAll();
    }
}
