import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPage {

    @FindBy(xpath = "//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button")
    WebElement buy;

    @FindBy(xpath = "//single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/div/a")
    WebElement order;

    @FindBy(id = "recipientSurname")
    WebElement surname;

    @FindBy(id = "recipientName")
    WebElement name;

    @FindBy(id = "recipientPatronymic")
    WebElement patronymic;

    @FindBy(id = "recipientTel")
    WebElement number;

    @FindBy(xpath = "//rz-checkout-orders-content/div/form/div/main/rz-checkout-order[1]/div/div[2]/rz-copy-order-button/div/button")
    WebElement copyInfo;

    public void buyProduct() throws InterruptedException {
        buy.click();
        Thread.sleep(1000);
        order.click();
        Thread.sleep(1000);
        surname.sendKeys("Фамилия");
        name.sendKeys("Имя");
        patronymic.sendKeys("Отчество");
        number.sendKeys("0661234567");
    }

    public void buyAndCopy() throws InterruptedException {
        buy.click();
        Thread.sleep(1000);
        order.click();
        Thread.sleep(1000);
        surname.sendKeys("Фамилия");
        name.sendKeys("Имя");
        patronymic.sendKeys("Отчество");
        number.sendKeys("0661234567");
        copyInfo.click();
    }
}
