package StepDefs;

import Pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register registerpage = new P01_register();
    SoftAssert soft = new SoftAssert();

  @Given("user go to register page")
    public void user_go_to_register_page()
  {
      Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
  }

    @When("user select gender type")
    public void userSelectGenderType()
    {
      registerpage.GenderType().click();
    }

    @And("user enter first name {string}")
    public void userEnterFirstName(String firstname)
    {
        registerpage.FirstNameTextBox().sendKeys(firstname);

    }

    @And("user enters last name {string}")
    public void userEntersLastName(String lastname)
    {
        registerpage.LastNameTextBox().sendKeys(lastname);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth()
    {
        Select selectObj = new Select(registerpage.BirthDayDropDown());
        selectObj.selectByVisibleText("1");

         selectObj = new Select(registerpage.BirthMonthDropDown());
         selectObj.selectByVisibleText("November");

         selectObj = new Select(registerpage.BirthYearDropDown());
         selectObj.selectByVisibleText("1998");


    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email)
    {
        registerpage.EmailTextBox().sendKeys(email);
    }



    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        registerpage.RegisterButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed()
    {
        soft.assertTrue(registerpage.SuccessMessage().isDisplayed());
        soft.assertEquals(registerpage.SuccessMessage().getText() , "Your registration completed");
        String color = registerpage.SuccessMessage().getCssValue("color");
        soft.assertEquals(color , "rgba(76, 177, 124, 1)" , "color assertion");
        soft.assertAll();
    }

    @And("user fills Password fields {string}")
    public void userFillsPasswordFields(String password)
    {
        registerpage.PasswordTextBox().sendKeys(password);
    }


    @And("user fills confirm Password fields {string}")
    public void userFillsConfirmPasswordFields(String confirm)
    {
        registerpage.ConfirmPasswordTextBox().sendKeys(confirm);
    }



}
