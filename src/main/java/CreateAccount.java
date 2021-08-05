import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {

    @FindBy(xpath = "//rz-header/header/div/div/ul/li[3]/rz-user")
    WebElement user;

    @FindBy(linkText = "Зареєструватися")
    WebElement create;

    @FindBy(id = "registerUserName")
    WebElement name;

    @FindBy(id = "registerUserSurname")
    WebElement surname;

    @FindBy(id = "registerUserPhone")
    WebElement number;

    @FindBy(id = "registerUserEmail")
    WebElement email;

    @FindBy(id = "registerUserPassword")
    WebElement password;

    public void createUser(String name,
                           String surname,
                           String number,
                           String email,
                           String password,
                           WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        user.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Зареєструватися")));
        create.click();
        this.name.sendKeys(name);
        this.surname.sendKeys(surname);
        this.number.sendKeys(number);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }
}
