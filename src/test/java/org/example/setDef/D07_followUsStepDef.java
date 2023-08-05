package org.example.setDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
    @Given("user opens facebook link")
    public void user_opens_facebook_link(){
        homePage.faceBookIcon().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String link )
            {
  Set<String> WindowHandles = Hooks.driver.getWindowHandles();
                Iterator<String> iterator = WindowHandles.iterator();
             String Tab0 = iterator.next();
             String Tab1 = iterator.next();
    Hooks.driver.switchTo().window(Tab1);
                wait.until(ExpectedConditions.urlToBe(link));
                System.out.println("actual:" + Hooks.driver.getCurrentUrl() + " ,expected " +link);
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),link);
    Hooks.driver.close();
    Hooks.driver.switchTo().window(Tab0);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {

        homePage.twitterIcon().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homePage.rssIcon().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePage.youTubeIcon().click();
    }
}
