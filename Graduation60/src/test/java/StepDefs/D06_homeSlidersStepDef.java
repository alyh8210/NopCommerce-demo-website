package StepDefs;

import Pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();
  SoftAssert soft = new SoftAssert();

    @When("user click on nokia lumia slider")
    public void userClickOnNokiaLumiaSlider()
    {
        homePage.Slider().click();
    }

//    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

    @Then("user should be directed to nokia lumia page")
    public void userShouldBeDirectedToNokiaLumiaPage()
    {
//        wait.until(ExpectedConditions.textToBePresentInElement(homePage.Nokia() , "Lumia"));
        soft.assertEquals(Hooks.driver.getCurrentUrl() , "https://demo.nopcommerce.com/nokia-lumia-1020");
        soft.assertAll();
    }


}
