import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class CustomConditionFirst implements ExpectedCondition {
    By first;

    public CustomConditionFirst(By first, WebDriver webDriver){
        this.first = first;
    }

    @NullableDecl
    @Override
    public Object apply(@NullableDecl Object o) {
        return null;
    }
}
