import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindPhone {

    @FindBy(partialLinkText = "Смартфоны, ТВ")
    WebElement phone;

    @FindBy(xpath = "//rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]")
    WebElement allPhone;

    @FindBy(xpath = "//rz-filter-stack/div[9]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a")
    WebElement ramFilter;

    @FindBy(xpath = "//rz-filter-stack/div[20]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[3]/a")
    WebElement romFilter;

    @FindBy(xpath = "//section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]")
    WebElement modelWithFilters;

    @FindBy(linkText = "Смартфоны Samsung S-серии")
    WebElement samsung;

    @FindBy(xpath = "//section/rz-grid/ul/li[9]/app-goods-tile-default/div/div[2]")
    WebElement samsungModel;

    public void findPhoneWithFilters() throws InterruptedException {
        phone.click();
        Thread.sleep(1000);
        allPhone.click();
        Thread.sleep(1000);
        ramFilter.click();
        Thread.sleep(1000);
        romFilter.click();
        Thread.sleep(1000);
        modelWithFilters.click();
        Thread.sleep(1000);
    }

    public void findSamsung() throws InterruptedException {
        phone.click();
        Thread.sleep(1000);
        samsung.click();
        Thread.sleep(1000);
        samsungModel.click();
        Thread.sleep(1000);
    }
}
