package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class P03_homePage {
    SoftAssert S = new SoftAssert();
    Random random = new Random();
    Actions actions = new Actions(Hooks.driver);
    public String p ;
    WebElement Su;
    String subCat;
    int mainCat;

    public WebElement MyaccountTab()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class='ico-account']"));
    }

    public List<WebElement> products()
    {
        return Hooks.driver.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div"));
    }

    public WebElement currencydropdown()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement Searchbar()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id='small-searchterms']"));
    }

    public WebElement SearchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[type='submit']"));
    }

    public WebElement Addtocartbutton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class='button-2 product-box-add-to-cart-button']"));
    }

    public WebElement Slider()
    {
        return Hooks.driver.findElement(By.cssSelector("img[class='nivo-main-image']"));
    }

    public WebElement Nokia()
    {
        return Hooks.driver.findElement(By.className("product-item"));
    }

    public WebElement Facebooklink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement Twitterlink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href='https://twitter.com/nopCommerce']"));
    }

    public WebElement Youtubelink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href='http://www.youtube.com/user/nopCommerce']"));
    }

    public WebElement Rsslink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href='https://demo.nopcommerce.com/news/rss/1']"));
    }

    public void ClickSearchIcon(){
        hook.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }

    public void assureURLTrue(){
        String URL = Hooks.driver.getCurrentUrl();
        S.assertTrue(URL.contains("https://demo.nopcommerce.com/search?q=" + p));
        System.out.println("The URL matched");
    }

    public List<WebElement> countNumberOfSearch(){
        int count = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")).size();
        System.out.println("the number of count : " + count);
        List<WebElement> items = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
        return items;
    }

    public void SearchForBySKU(String productSKU){
        p= productSKU ;
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(p);
    }

    public void ClickSearch(){
        Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }

    public void clickOnProduct(){
        Hooks.driver.findElement(By.className("product-item")).click();
    }

    public String getProductSKU(){
        String SKU = Hooks.driver.findElement(By.className("sku")).getText();
        return SKU;
    }
}
