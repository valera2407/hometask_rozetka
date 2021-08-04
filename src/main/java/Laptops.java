import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void openSecond() throws InterruptedException {
        anotherLaptops.click();
        Thread.sleep(1000);
        secondLaptop.click();
    }
}
