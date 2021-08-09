package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageUA {

    @FindBy(xpath = "//rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a")
    WebElement languageUA;

    public void change(){
        languageUA.click();
    }
}
