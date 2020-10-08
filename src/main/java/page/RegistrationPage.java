package page;

import fields.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    private WebDriver driver;

    private WebElement oneFirstNameField;
    private WebElement oneLastNameField;
    private WebElement passwordField;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement companyField;
    private WebElement oneAddressField;
    private WebElement twoAddressField;
    private WebElement cityField;
    private WebElement stateField;
    private WebElement postalCodeField;
    private WebElement countryField;
    private WebElement infoField;
    private WebElement homePhoneField;
    private WebElement mobilePhoneField;
    private WebElement aliasField;
    private WebElement clickRegister;


    public RegistrationPage(WebDriver driver) { this.driver = driver; }

    public RegistrationPage typeOneFirstName(String firstName){
        oneFirstNameField = waitOnElement("//input[@id='customer_firstname']");
        oneFirstNameField.clear();
        oneFirstNameField.sendKeys(firstName);
        return this;
    }

    public RegistrationPage typeOneLastName(String lastName){
        oneLastNameField = waitOnElement("//input[@id='customer_lastname']");
        oneLastNameField.clear();
        oneLastNameField.sendKeys(lastName);
        return this;
    }

    public RegistrationPage typePassword(String password){
        passwordField = waitOnElement("//input[@id='passwd']");
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    private void selectDay(String day) {
        WebElement dayDropDown = driver.findElement(By.id("days"));
        Select value = new Select(dayDropDown);
        value.selectByValue(day);
    }

    private void selectMonth(String month) {
        WebElement monthDropDown = driver.findElement(By.id("months"));
        Select value = new Select(monthDropDown);
        value.selectByValue(month);
    }

    private void selectYear(String year) {
        WebElement yearDropDown = driver.findElement(By.id("years"));
        Select value = new Select(yearDropDown);
        value.selectByValue(year);
    }

    public RegistrationPage typeFirstName(String firstName){
        firstNameField = waitOnElement("//input[@id='customer_firstname']");
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegistrationPage typeLastName(String lastName){
        lastNameField = waitOnElement("//input[@id='customer_lastname']");
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegistrationPage typeCompany(String company){
        companyField = waitOnElement("//input[@id='company']");
        companyField.clear();
        companyField.sendKeys(company);
        return this;
    }

    public RegistrationPage typeOneAddress(String addressOne){
        oneAddressField = waitOnElement("//input[@id='address1']");
        oneAddressField.clear();
        oneAddressField.sendKeys(addressOne);
        return this;
    }

    public RegistrationPage typeTwoAddress(String addressTwo){
        twoAddressField = waitOnElement("//input[@id='address2']");
        twoAddressField.clear();
        twoAddressField.sendKeys(addressTwo);
        return this;
    }

    public RegistrationPage typeCity(String city){
        cityField = waitOnElement("//input[@id='city']");
        cityField.clear();
        cityField.sendKeys(city);
        return this;
    }

    public RegistrationPage typeState(String state){
        stateField = waitOnElement("//input[@id='postcode']");
        stateField.clear();
        stateField.sendKeys(state);
        return this;
    }

    public RegistrationPage typePostalCode(String postalCode){
        postalCodeField = waitOnElement("//input[@id='postcode']");
        postalCodeField.clear();
        postalCodeField.sendKeys(postalCode);
        return this;
    }
    public RegistrationPage typeCountry(String  country){
        countryField = waitOnElement("//input[@id='other']");
        countryField.clear();
        countryField.sendKeys(country);
        return this;
    }

    public RegistrationPage typeInfo(String info){
        infoField = waitOnElement("//input[@id='other']");
        infoField.clear();
        infoField.sendKeys(info);
        return this;
    }
    public RegistrationPage typeHomePhone(String  homePhone){
        homePhoneField = waitOnElement("//input[@id='phone']");
        homePhoneField.clear();
        homePhoneField.sendKeys(homePhone);
        return this;
    }

    public RegistrationPage typeMobilePhone(String mobilePhone){
        mobilePhoneField = waitOnElement("//input[@id='phone_mobile']");
        mobilePhoneField.clear();
        mobilePhoneField.sendKeys(mobilePhone);
        return this;
    }

    public RegistrationPage typeAlias(String alias){
        aliasField = waitOnElement("//input[@id='alias']");
        aliasField.clear();
        aliasField.sendKeys(alias);
        return this;
    }

    public RegistrationPage clickRegister(){
        clickRegister = waitOnElement("(//i[@class='icon-chevron-right right'])[3]");
        clickRegister.click();
        return new RegistrationPage(driver);
    }

    private WebElement waitOnElement(String xpath) {
        return (new WebDriverWait(driver, 60)).until(
                ExpectedConditions.elementToBeClickable(By.xpath(xpath))
        );
    }

    public MyAccountPage writeRegistrationAndClick(Registration registration) {

        this.typeOneFirstName(registration.getFirstName());
        this.typeOneLastName(registration.getOneLastName());
        this.typePassword(registration.getPassword());
        this.typeFirstName(registration.getFirstName());
        this.typeLastName(registration.getLastName());
        this.typeCompany(registration.getCompany());
        this.typeOneAddress(registration.getOneAddress());
        this.typeTwoAddress(registration.getTwoAddress());
        this.typeCity(registration.getCity());
        this.typeState(registration.getState());
        this.typePostalCode(registration.getPostcode());
        this.typeMobilePhone(registration.getPhoneMobile());
        this.typeHomePhone(registration.getPhoneHome());
        this.typeAlias(registration.getAlias());
        this.clickRegister();
        return new MyAccountPage(driver);


    }

    public String getActualResult() {
        WebElement element = driver.findElement(By.xpath("//div[@class='alert alert-danger']/p"));
        element.getText();
        return element.getText();
    }
}
