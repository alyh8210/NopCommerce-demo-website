package Pages;

import StepDefs.Hooks;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {


    public WebElement EmailTextbox()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class='email']"));
    }

    public WebElement PasswordTextbox()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement LoginButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
    }

    public WebElement ErrorMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']"));
    }
}
