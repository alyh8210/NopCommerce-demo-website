package StepDefs;

import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();
    public String P;

    @When("user search for products by name {string}")
    public void userSearchForProductsByName(String productName) {
        P = productName;
        homePage.Searchbar().sendKeys(productName);
        homePage.SearchButton().click();
    }

    @Then("user will found all products that searched for by name")
    public void userWillFoundAllProductsThatSearchedForByName() {
        homePage.assureURLTrue();
        List<WebElement> l = homePage.countNumberOfSearch();
        for (int i = 0; i < l.size(); i++) {
            String C = l.get(i).getText();
            Assert.assertTrue(C.toLowerCase().contains(P));
        }
    }
}
