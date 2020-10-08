package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    private By loginLink = By.xpath("//a[@class='login']");
    private WebDriver internaldriver;

    public HomePage(WebDriver driver){
        this.internaldriver = driver;
    }

    public SignUpPage openSignInPage() {
        WebElement element = internaldriver.findElement(loginLink);
        JavascriptExecutor js = (JavascriptExecutor) internaldriver;
        js.executeScript("arguments[0].click()", element);
        return new SignUpPage(internaldriver);

    }
}
