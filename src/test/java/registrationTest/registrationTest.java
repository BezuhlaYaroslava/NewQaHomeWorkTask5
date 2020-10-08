package registrationTest;

import fields.Registration;
import fields.RegistrationBuild;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.MyAccountPage;
import page.RegistrationPage;
import page.SignUpPage;

public class registrationTest {

    private SignUpPage signUpPage;
    private Registration registration;
    private RegistrationPage registrationPage;
    private WebDriver driver;
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private String actualResult;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/");
    }

    @Before
    public void date(){
    registration = new RegistrationBuild()
            .withEmail("byaw@ukgr.net")
            .withOneFirstName("Юзер")
            .withOneLastName("User")
            .withPassword("password")
            .withFirstName("Юзер")
            .withLastName("User")
            .withCompany("Company")
            .withOneAddress("oneAddress")
            .withTwoAddress("twoAddress2")
            .withCity("City")
            .withZipCode("04001")
            .withPhoneMobile("099000000")
            .withPhoneHome("088000000")
            .withAliasAddress("alias")
            .build();
        homePage = new HomePage(driver);
    }

    @Test
    public void canOpenPage() {
        signUpPage = homePage.openSignInPage();
        registrationPage = signUpPage.writeEmailAndClick(registration);
        myAccountPage = registrationPage.writeRegistrationAndClick(registration);

        String actualResult = registrationPage.getActualResult();
        String expectedResult = "There is 1 error";  //одно обязательное выпадающее поле

        Assert.assertEquals("There are 1 errors", expectedResult, actualResult);



    }



}
