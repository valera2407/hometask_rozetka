package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class BuyPage {

    By buy = By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button");
    By order = By.xpath("//single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/div/a");
    By surname = By.id("recipientSurname");
    By name = By.id("recipientName");
    By patronymic = By.id("recipientPatronymic");
    By number = By.id("recipientTel");
    By copyInfo = By.xpath("//rz-checkout-orders-content/div/form/div/main/rz-checkout-order[1]/div/div[2]/rz-copy-order-button/div/button");


    public void buyProduct() {
        $(buy).should(Condition.appear).click();
        $(order).should(Condition.appear).click();
        $(surname).should(Condition.appear).sendKeys("Фамилия");
        $(name).sendKeys("Имя");
        $(patronymic).sendKeys("Отчество");
        $(number).sendKeys("0661234567");
    }

    public void buyAndCopy() {
        $(buy).should(Condition.appear).click();
        $(order).should(Condition.appear).click();
        $(surname).should(Condition.appear).sendKeys("Фамилия");
        $(name).sendKeys("Имя");
        $(patronymic).sendKeys("Отчество");
        $(number).sendKeys("0661234567");
        $(copyInfo).click();
    }
}
