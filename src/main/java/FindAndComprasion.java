import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindAndComprasion {

    @FindBy (xpath = "//input")
    WebElement search;

    @FindBy (xpath = "//rz-header/header/div/div/div/form/button")
    WebElement find;

    @FindBy (xpath = "//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/button")
    WebElement addToCompare;

    @FindBy (xpath = "//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/a/button")
    WebElement compare;

    public void findProducts(String productName){
        search.sendKeys(productName);
        find.click();
    }

    public void addProductToList(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/button")));
        addToCompare.click();
    }

    public void compareProducts(){
        compare.click();
    }

}
