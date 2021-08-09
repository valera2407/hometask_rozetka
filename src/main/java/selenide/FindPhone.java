package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class FindPhone {
    By phone = By.partialLinkText("Смартфоны, ТВ");
    By allPhone = By.xpath("//rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]");
    By ramFilter = By.xpath("//rz-filter-stack/div[9]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a");
    By romFilter = By.xpath("//rz-filter-stack/div[20]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[3]/a");
    By modelWithFilters = By.xpath("//section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]");
    By samsung = By.linkText("Смартфоны Samsung S-серии");
    By samsungModel = By.xpath("//section/rz-grid/ul/li[9]/app-goods-tile-default/div/div[2]");


    public void findPhoneWithFilters() {
        $(phone).should(Condition.appear).click();
        $(allPhone).should(Condition.visible).click();
        $(ramFilter).should(Condition.appear).click();
        $(romFilter).should(Condition.appear).click();
        $(modelWithFilters).should(Condition.appear).click();
    }

    public void findSamsung() {
        $(phone).should(Condition.appear).click();
        $(samsung).should(Condition.appear).click();
        $(samsungModel).should(Condition.appear).click();

    }
}
