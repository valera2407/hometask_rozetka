package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class Laptops {
    By firstLaptop = By.xpath("//app-goods-tile-default/div/div[2]");
    By anotherLaptops = By.xpath("//rz-product/div/rz-product-top/div/app-breadcrumbs/ul/li[4]/a");
    By secondLaptop = By.xpath("//section/rz-grid/ul/li[3]/app-goods-tile-default/div/div[2]");

    public void openFirst(){
        $(firstLaptop).should(Condition.appear).click();
    }

    public void openSecond() {
        $(anotherLaptops).should(Condition.visible).click();
        $(secondLaptop).should(Condition.appear).click();
    }
}
