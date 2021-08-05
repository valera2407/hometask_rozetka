package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccount {
    By user = By.xpath("//rz-header/header/div/div/ul/li[3]/rz-user");
    By create = By.linkText("Зареєструватися");
    By name = By.id("registerUserName");
    By surname = By.id("registerUserSurname");
    By number = By.id("registerUserPhone");
    By email = By.id("registerUserEmail");
    By password = By.id("registerUserPassword");


    public void createUser(String name,
                           String surname,
                           String number,
                           String email,
                           String password) {
        $(user).should(Condition.appear).click();
        $(create).should(Condition.appear).click();
        $(this.name).should(Condition.appear).sendKeys(name);
        $(this.surname).sendKeys(surname);
        $(this.number).sendKeys(number);
        $(this.email).sendKeys(email);
        $(this.password).sendKeys(password);
    }
}
