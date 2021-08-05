import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void findPhoneWithFilters(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        phone.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]")));
        allPhone.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-filter-stack/div[9]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a")));
        ramFilter.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-filter-stack/div[20]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[3]/a")));
        romFilter.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]")));
        modelWithFilters.click();
    }
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath()));
    public void findSamsung(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        phone.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Смартфоны Samsung S-серии")));
        samsung.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section/rz-grid/ul/li[9]/app-goods-tile-default/div/div[2]")));
        samsungModel.click();

    }
}
