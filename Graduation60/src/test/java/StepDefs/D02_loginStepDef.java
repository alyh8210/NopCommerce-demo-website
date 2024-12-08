package StepDefs;

import Pages.P02_login;
import Pages.P03_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();
    P03_homePage homepage = new P03_homePage();
    SoftAssert soft = new SoftAssert();


    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }


    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1, String arg2) {
        
    }

    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String username, String password)
    {
        login.EmailTextbox().sendKeys(username);
        login.PasswordTextbox().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton()
    {
        login.LoginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {
        soft.assertEquals(Hooks.driver.getCurrentUrl() , "https://demo.nopcommerce.com/");
        soft.assertTrue(homepage.MyaccountTab().isDisplayed());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem()
    {
      soft.assertTrue(login.ErrorMessage().getText().contains("Login was unsuccessful"));
      String color = login.ErrorMessage().getCssValue("color");
      String hexcolor = Color.fromString(color).asHex();
      soft.assertEquals(hexcolor , "#e4434b");
      soft.assertAll();
    }
}
