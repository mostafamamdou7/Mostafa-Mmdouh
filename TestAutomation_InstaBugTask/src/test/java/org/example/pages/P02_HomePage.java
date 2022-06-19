package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_HomePage {
    WebDriver driver;

   private By clickSearchField = By.name("q");
   private By clickSearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

    public P02_HomePage(WebDriver driver) {
        this.driver = driver;
    }

//    public void navigateToHomePage(){
//        driver.navigate().to("https://www.google.com/");
//    }
    public void click_Search_field(){
        driver.findElement(clickSearchField).click();
    }

    public void Enter_item_Name(String itemName){
        driver.findElement(clickSearchField).sendKeys(itemName);
    }
    public void clickSearchButton(){
        driver.findElement(clickSearchButton).click();
    }
}