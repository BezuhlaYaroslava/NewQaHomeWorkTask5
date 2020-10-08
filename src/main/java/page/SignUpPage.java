package page;

import fields.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

    private WebDriver driver;
    private WebElement emailField;
    private WebElement createAnAccount;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage typeEmail(String email){
        emailField = waitOnElement("//*[@id='email_create']");
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage clickCreateAnAccount(){
        createAnAccount = waitOnElement("//*[@id='SubmitCreate']");
        createAnAccount.click();
        return new RegistrationPage(driver);
    }

    private WebElement waitOnElement(String xpath) {
        return (new WebDriverWait(driver, 60)).until(
                ExpectedConditions.elementToBeClickable(By.xpath(xpath))
        );
    }


    public RegistrationPage writeEmailAndClick(Registration registration) {

        this.typeEmail(registration.getEmail());
        this.clickCreateAnAccount();
        return new RegistrationPage(driver);
    }
}
