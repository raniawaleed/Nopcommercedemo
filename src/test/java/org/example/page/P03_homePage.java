package org.example.page;

import org.example.setDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    By SearchField = By.id("small-searchterms");
    By SearchButton =  By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By ProductsItems = By.className("product-item");
    By SKU =By.className("sku");

    By FaceBookIcon = By.className("facebook");
    By YouTubeIcon = By.className("youtube");
    By TwitterIcon = By.className("twitter");
    By RssIcon = By.className("rss");
    public WebElement searchField(){return Hooks.driver.findElement(SearchField);}
    public WebElement searchButton(){return Hooks.driver.findElement(SearchButton);}
    public List<WebElement> productsItem(){return Hooks.driver.findElements(ProductsItems);}
    public WebElement sku(){return Hooks.driver.findElement(SKU);}

    public WebElement faceBookIcon(){return Hooks.driver.findElement(FaceBookIcon);}
    public WebElement twitterIcon(){return Hooks.driver.findElement(TwitterIcon);}
    public WebElement rssIcon(){return Hooks.driver.findElement(RssIcon);}
    public WebElement youTubeIcon(){return Hooks.driver.findElement(YouTubeIcon);}



}

