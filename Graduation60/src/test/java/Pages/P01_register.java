package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement GenderType()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement FirstNameTextBox()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement LastNameTextBox()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement BirthDayDropDown()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement BirthMonthDropDown()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement BirthYearDropDown()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement EmailTextBox()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement PasswordTextBox()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPasswordTextBox()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement SuccessMessage()
    {
        return Hooks.driver.findElement(By.className("result"));
    }



}
