package selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddWarranty {
    By warranty = By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/app-additional-services/div/div/ul/li[2]/app-service-item/label");

    public void add(){
        $(warranty).click();
    }
}
