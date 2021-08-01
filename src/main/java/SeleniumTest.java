import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
//DONE
    @Test
    public void rozetkaTest1() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        var search = webDriver.findElement(By.xpath("//input"));
        search.sendKeys("acer swift");
        var find = webDriver.findElement(By.xpath("//rz-header/header/div/div/div/form/button"));
        find.click();
        Thread.sleep(1000);
        var laptop = webDriver.findElement(By.xpath
                ("//app-goods-tile-default/div/div[2]"));
        laptop.click();
        Thread.sleep(1000);
        var element = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/button"));
        element.click();
        Thread.sleep(1000);
        var back = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-product/div/rz-product-top/div/app-breadcrumbs/ul/li[4]/a"));
        back.click();
        Thread.sleep(1000);
        var laptop2 = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[3]/app-goods-tile-default/div/div[2]"));
        laptop2.click();
        Thread.sleep(1000);
        var element2 = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/button"));
        element2.click();
        Thread.sleep(1000);
        var element3 = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/a/button"));
        element3.click();
    }

    //DONE
    @Test
    public void rozetkaTest2() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        var phone = webDriver.findElement(By.linkText("Смартфоны, ТВ и электроника"));
        phone.click();
        Thread.sleep(1000);
        var samsung = webDriver.findElement(By.linkText("Смартфоны Samsung S-серии"));
        samsung.click();
        Thread.sleep(1000);
        var model = webDriver.findElement(By.xpath("//section/rz-grid/ul/li[9]/app-goods-tile-default/div/div[2]"));
        model.click();
        Thread.sleep(1000);
        var buy = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/app-goods-kit/section/app-slider/div[1]/div/ul/li[1]/app-kit-details/div/div/div/app-kit-price/div/app-buy-button-kits"));
        buy.click();
        Thread.sleep(1000);
        var order = webDriver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/div/a"));
        order.click();
        Thread.sleep(1000);
        var surname = webDriver.findElement(By.id("recipientSurname"));
        surname.sendKeys("Фамилия");
        var name = webDriver.findElement(By.id("recipientName"));
        name.sendKeys("Имя");
        var email = webDriver.findElement(By.id("recipientPatronymic"));
        email.sendKeys("Отчество");
        var number = webDriver.findElement(By.id("recipientTel"));
        number.sendKeys("0661234567");
    }

    //DONE
    @Test
    public void rozetkaTest3() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        var phone = webDriver.findElement(By.partialLinkText("Смартфоны, ТВ"));
        phone.click();
        Thread.sleep(1000);
        var allPhone = webDriver.findElement(By.xpath("//rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]"));
        allPhone.click();
        Thread.sleep(1000);
        var ram = webDriver.findElement(By.xpath("//rz-filter-stack/div[9]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a"));
        ram.click();
        Thread.sleep(1000);
        var rom = webDriver.findElement(By.xpath("//rz-filter-stack/div[20]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[3]/a"));
        rom.click();
        Thread.sleep(1000);
        var model = webDriver.findElement(By.xpath("//section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]"));
        model.click();
        Thread.sleep(1000);
        var service = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/app-additional-services/div/div/ul/li[2]/app-service-item/label"));
        service.click();
        Thread.sleep(1000);
        var buy = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button"));
        buy.click();
        Thread.sleep(1000);
        var order = webDriver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/div/a"));
        order.click();
        Thread.sleep(2000);
        var surname = webDriver.findElement(By.id("recipientSurname"));
        surname.sendKeys("Фамилия");
        var name = webDriver.findElement(By.id("recipientName"));
        name.sendKeys("Имя");
        var email = webDriver.findElement(By.id("recipientPatronymic"));
        email.sendKeys("Отчество");
        var number = webDriver.findElement(By.id("recipientTel"));
        number.sendKeys("0661234567");
        var copyInfo = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-checkout-main/section/rz-checkout-orders/rz-checkout-orders-content/div/form/div/main/rz-checkout-order[1]/div/div[2]/rz-copy-order-button/div/button"));
        copyInfo.click();
    }

    @Test
    public void rozetkaTest4() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        var closeCross = webDriver.findElement(By.xpath("//*[@id=\"rz-banner\"]/span/span"));
        closeCross.click();
        var allPromotions = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/main/main-page-content/top-slider/ul/li/a"));
        allPromotions.click();
        Thread.sleep(1000);
        var promotion = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-promotions/div/main/rz-catalog/div/div/section/rz-grid/ul/li[5]/rz-promotion-tile/a/span/span"));
        promotion.click();
        Thread.sleep(1000);
        var freezer = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-promotion/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]/a[2]/span"));
        freezer.click();
        Thread.sleep(1000);
        var buy = webDriver.findElement(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button"));
        buy.click();
        Thread.sleep(1000);
        var order = webDriver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/div/a"));
        order.click();
        Thread.sleep(2000);
        var surname = webDriver.findElement(By.id("recipientSurname"));
        surname.sendKeys("Фамилия");
        var name = webDriver.findElement(By.id("recipientName"));
        name.sendKeys("Имя");
        var email = webDriver.findElement(By.id("recipientPatronymic"));
        email.sendKeys("Отчество");
        var number = webDriver.findElement(By.id("recipientTel"));
        number.sendKeys("0661234567");
    }

    //DONE
    @Test
    public void rozetkaTest5() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        var languageUA = webDriver.findElement(By.xpath("//rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a"));
        languageUA.click();
        var user = webDriver.findElement(By.xpath("//rz-header/header/div/div/ul/li[3]/rz-user"));
        user.click();
        Thread.sleep(1000);
        var element = webDriver.findElement(By.linkText("Зареєструватися"));
        element.click();
        var name = webDriver.findElement(By.id("registerUserName"));
        name.sendKeys("Имя");
        var surname = webDriver.findElement(By.id("registerUserSurname"));
        surname.sendKeys("Фамилия");
        var number = webDriver.findElement(By.id("registerUserPhone"));
        number.sendKeys("661234567");
        var email = webDriver.findElement(By.id("registerUserEmail"));
        email.sendKeys("email@gmail.com");
        var password = webDriver.findElement(By.id("registerUserPassword"));
        password.sendKeys("password");
    }
}
