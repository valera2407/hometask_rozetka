package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SeleniumTest {

    @Test
    public void rozetkaTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        FindAndComprasion findAndComprasion = PageFactory.initElements(webDriver, FindAndComprasion.class);
        Laptops laptops = PageFactory.initElements(webDriver, Laptops.class);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        Actions actions = new Actions(webDriver);
        findAndComprasion.findProducts("acer swift");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-goods-tile-default/div/div[2]")));
        laptops.openFirst();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-product-top/div/div[2]/a")));
        actions.moveToElement(webDriver.findElement(By.xpath("//rz-product-top/div/div[2]/a"))).perform();
        findAndComprasion.addProductToList(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-product/div/rz-product-top/div/app-breadcrumbs/ul/li[4]/a")));
        laptops.openSecond(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-product-top/div/div[2]/a")));
        actions.moveToElement(webDriver.findElement(By.xpath("//rz-product-top/div/div[2]/a"))).perform();
        findAndComprasion.addProductToList(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/a/button")));
        findAndComprasion.compareProducts();
        webDriver.quit();
    }

    @Test
    public void rozetkaTest2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        FindPhone findPhone = PageFactory.initElements(webDriver, FindPhone.class);
        BuyPage buy = PageFactory.initElements(webDriver, BuyPage.class);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        findPhone.findSamsung(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button")));
        buy.buyProduct(webDriver);
        webDriver.quit();
    }

    @Test
    public void rozetkaTest3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        FindPhone findPhone = PageFactory.initElements(webDriver, FindPhone.class);
        AddWarranty warranty = PageFactory.initElements(webDriver, AddWarranty.class);
        BuyPage buy = PageFactory.initElements(webDriver, BuyPage.class);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        findPhone.findPhoneWithFilters(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/app-additional-services/div/div/ul/li[2]/app-service-item/label")));
        warranty.add();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button")));
        buy.buyAndCopy(webDriver);
        webDriver.quit();
    }

    @Test
    public void rozetkaTest4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        CloseCross cross = PageFactory.initElements(webDriver, CloseCross.class);
        Promotions promotions = PageFactory.initElements(webDriver, Promotions.class);
        BuyPage buy = PageFactory.initElements(webDriver, BuyPage.class);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        Actions actions = new Actions(webDriver);
        cross.close();
        promotions.findProposition(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-product-top/div/div[2]/a")));
        actions.moveToElement(webDriver.findElement(By.xpath("//rz-product-top/div/div[2]/a"))).perform();
        buy.buyProduct(webDriver);
        webDriver.quit();
    }

    @Test
    public void rozetkaTest5() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");

        LanguageUA languageUA = PageFactory.initElements(webDriver, LanguageUA.class);
        languageUA.change();
        CreateAccount create = PageFactory.initElements(webDriver, CreateAccount.class);
        create.createUser("Имя",
                "Фамилия",
                "661234567",
                "email@gmail.com",
                "password",
                webDriver);
        webDriver.quit();
    }
}
