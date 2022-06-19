package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_SearchPage;
import org.example.pages.P02_HomePage;

public class SD01_SearchFunctionality {
    P01_SearchPage searchPage=new P01_SearchPage (Hooks.driver);
    P02_HomePage homePage=new P02_HomePage(Hooks.driver);


    @When("user press on search field")
    public void clickSearchField(){
        homePage.click_Search_field();
    }
    @And("^user search with Item name\"(.*?)\"")
    public void searchWithItemName(String itemName){

        homePage.Enter_item_Name(itemName);
    }
    @And("user press on search button")
    public void clickSearchButton(){
        homePage.clickSearchButton();
    }
    @Then("user could find relative result")
    public void find_results(){
        searchPage.results();



    }
}





//package org.example.stepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.P01_SearchPage;
//import org.testng.asserts.SoftAssert;
//
//public class SD01_SearchFunctionality {
//
//    P01_SearchPage P01 = new P01_SearchPage(Hooks.driver);
//    String searchedProduct;
//
//    @Given("^Type \"(.*)\" on search text box$")
//    public void searchProduct(String product){
//        P01.search.sendKeys(product);
//        searchedProduct = product;
//    }
//
//    @When("Click on SEARCH button or hit enter key")
//    public void clickSearch(){
//        P01.searchButton.click();
//        Hooks.rest();
//    }
//
//    @Then("User could find InstaBug products")
//    public void searchAssertion(){
//        SoftAssert searchAssertion = new SoftAssert();
//        searchAssertion.assertEquals(P01.searchKeyword.getAttribute("value"),searchedProduct);
//        searchAssertion.assertAll();
//    }
//
//
//}

