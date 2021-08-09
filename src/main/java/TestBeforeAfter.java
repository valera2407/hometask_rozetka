import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBeforeAfter {
    WebDriver webDriver;

    @BeforeMethod
    public void logIn(){
        webDriver = new ChromeDriver();
        webDriver.get("https://mychords.net/");
        var logIn = webDriver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div[1]/a[1]/button"));
        logIn.click();
        var email = webDriver.findElement(By.name("login"));
        email.sendKeys("valerafatkulin7@gmail.com");
        var password = webDriver.findElement(By.name("password"));
        password.sendKeys("Pi31415");
        var enter = webDriver.findElement(By.xpath("//*[@id=\"b-login-form\"]/input[3]"));
        enter.click();
    }

    @Test
    public void test(){
        var find = webDriver.findElement(By.xpath("//*[@id=\"container\"]/header/div/form/div/input"));
        find.sendKeys("уроки любви");
        find.submit();
    }

    @AfterMethod
    public void logOut(){
        var element = webDriver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div[1]/div/div/div[1]"));
        element.click();
        var logOut = webDriver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div[1]/div/ul/li[4]/a"));
        logOut.click();
        webDriver.quit();
    }
}
