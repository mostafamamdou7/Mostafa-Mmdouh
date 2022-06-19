package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.ArrayList;

public class P01_SearchPage {
    WebDriver driver;
    String itemName="InstaBug";
    public P01_SearchPage (WebDriver driver) {
        this.driver = driver;
    }
    public void results(){
        int count=driver.findElements(By.cssSelector("h2[class=\"srp\"] a")).size();
        Assert.assertTrue(count>0);
        ArrayList<String> itemsName=null;
        itemsName=new ArrayList<>();
        for (int i=0; i<count; i++){
            System.out.println(driver.findElements(By.cssSelector
                    ("h2[class=\"srp\"] a")).get(i).getText());
            itemsName.add(driver.findElements(By.cssSelector
                    ("h2[class=\"srp\"] a")).get(i).getText());
            Assert.assertTrue(driver.findElements(By.cssSelector
                    ("h2[class=\"srp\"] a")).get(i).getText().toLowerCase().contains(itemName));

        }
        System.out.println(itemsName);
    }
}

