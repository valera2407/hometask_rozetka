import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Promotions {

    @FindBy(xpath = "//main-page-content/top-slider/ul/li/a")
    WebElement allPromotions;

    @FindBy(xpath = "//rz-grid/ul/li[2]/rz-promotion-tile/a/span/span")
    WebElement promotion;

    @FindBy(xpath = "//app-goods-tile-default/div/div[2]/a[2]/span")
    WebElement product;

    public void findProposition(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        allPromotions.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-grid/ul/li[2]/rz-promotion-tile/a/span/span")));
        promotion.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-goods-tile-default/div/div[2]/a[2]/span")));
        product.click();
    }
}
