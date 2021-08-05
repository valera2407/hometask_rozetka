package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class FindAndComprasion {
    By search = By.xpath("//input");
    By find = By.xpath("//rz-header/header/div/div/div/form/button");
    By addToCompare = By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/button");
    By compare = By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[3]/ul/li[1]/app-compare-button/a/button");


    public void findProducts(String productName){
        $(search).sendKeys(productName);
        $(find).click();
    }

    public void addProductToList(){
        $(addToCompare).should(Condition.appear).click();
    }

    public void compareProducts(){
        $(compare).click();
    }

}
