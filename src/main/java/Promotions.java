import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Promotions {

    @FindBy(xpath = "//main-page-content/top-slider/ul/li/a")
    WebElement allPromotions;

    @FindBy(xpath = "//rz-grid/ul/li[2]/rz-promotion-tile/a/span/span")
    WebElement promotion;

    @FindBy(xpath = "//app-goods-tile-default/div/div[2]/a[2]/span")
    WebElement product;

    public void findProposition() throws InterruptedException {
        allPromotions.click();
        Thread.sleep(1000);
        promotion.click();
        Thread.sleep(3000);
        product.click();
    }
}
