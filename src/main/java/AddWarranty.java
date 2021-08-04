import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWarranty {

    @FindBy(xpath = "//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/app-additional-services/div/div/ul/li[2]/app-service-item/label")
    WebElement warranty;

    public void add(){
        warranty.click();
    }
}
