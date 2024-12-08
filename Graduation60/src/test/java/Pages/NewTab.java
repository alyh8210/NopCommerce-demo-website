package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewTab {


    public WebElement PasswordFacebook()
    {
        return Hooks.driver.findElement(By.id(":r5:"));
    }


}
