package selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LanguageUA {

    By languageUA = By.xpath("//rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a");

    public void change(){
        $(languageUA).click();
    }
}
