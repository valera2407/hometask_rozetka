package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Promotions {

    By allPromotions = By.xpath("//main-page-content/top-slider/ul/li/a");
    By promotion = By.xpath("//rz-grid/ul/li[2]/rz-promotion-tile/a/span/span");
    By product = By.xpath("//app-goods-tile-default/div/div[2]/a[2]/span");

    public void findProposition() {
        $(allPromotions).should(Condition.appear).click();
        $(promotion).should(Condition.appear).click();
        $(product).should(Condition.appear).click();
    }
}
