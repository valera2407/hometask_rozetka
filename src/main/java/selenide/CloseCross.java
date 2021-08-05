package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class CloseCross {

    By cross = By.xpath("//*[@id=\"rz-banner\"]/span/span");

    public void close(){
        $(cross).should(Condition.appear).click();
    }
}
