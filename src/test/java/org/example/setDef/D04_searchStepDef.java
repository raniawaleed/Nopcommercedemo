package org.example.setDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert =new SoftAssert();


    @Given("user go to search box")
    public void UserGoToSearchBox(){
        homePage.searchField().click();

    }

    @When("user enter the product {string}")
    public void userEnterTheProduct(String name) {
        homePage.searchField().sendKeys(name);
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        homePage.searchButton().click();
    }

    @Then("each result contains the search word {string}")
    public void eachResultContainsTheSearchWord(String name) {

        int NofSearchResult = homePage.productsItem().size();
        for (int i = 0; i < NofSearchResult; i++) {
            String ProductName = homePage.productsItem().get(i).getText();
            System.out.println(ProductName);
            softAssert.assertTrue(ProductName.toLowerCase().contains(name));
        }
    }
        @And("URL will change")
        public void urlWillChange () {
            Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        }

        @And("click on the product in search result")
        public void clickOnTheProductInSearchResult () {
            homePage.productsItem().get(0).click();
        }
        @Then("sku shown in this page contains the {string} that you are using in search")
        public void skuShownInThisPageContainsTheThatYouAreUsingInSearch (String sku){

            Assert.assertTrue(homePage.sku().getText().contains(sku));
        }
    }