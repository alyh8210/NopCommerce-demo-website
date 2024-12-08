package StepDefs;

import Pages.P03_homePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;


public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));

    ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());


    @When("user opens facebook link")
    public void useropensfacebooklink()
    {
        homePage.Facebooklink().click();
    }


    @Then("facebook is opened in new tab")
    public void facebookIsOpenedInNewTab()
    {
        Assert.assertEquals(Hooks.driver.switchTo().window(tabs.get(1)) , "http://www.facebook.com/nopCommerce");

    }
}
