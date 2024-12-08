package StepDefs;

import Pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;



public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user navigate to homepage")
    public void user_navigate_homepage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @When("user selects euro currency")
    public void userSelectsEuroCurrency()
    {
        Select selectObj = new Select(homePage.currencydropdown());
        selectObj.selectByVisibleText("Euro");
    }




    @Then("products should be displayed in euro currency")
    public void productsShouldBeDisplayedInEuroCurrency()
    {
        for (int i = 0; i < homePage.products().size() ; i++)
        {

            Assert.assertTrue(homePage.products().get(i).getText().contains("$"));
        }
    }
}
