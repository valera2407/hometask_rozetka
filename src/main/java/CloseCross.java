import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseCross {
    @FindBy(xpath = "//*[@id=\"rz-banner\"]/span/span")
    WebElement cross;

    public void close(){
        cross.click();
    }
}
