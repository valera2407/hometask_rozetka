import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laptops {

    @FindBy(xpath = "//app-goods-tile-default/div/div[2]")
    WebElement firstLaptop;

    @FindBy(xpath = "//rz-product/div/rz-product-top/div/app-breadcrumbs/ul/li[4]/a")
    WebElement anotherLaptops;

    @FindBy(xpath = "//section/rz-grid/ul/li[3]/app-goods-tile-default/div/div[2]")
    WebElement secondLaptop;

    public void openFirst(){
        firstLaptop.click();
    }

    public void openSecond(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        anotherLaptops.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section/rz-grid/ul/li[3]/app-goods-tile-default/div/div[2]")));
        secondLaptop.click();
    }
}
