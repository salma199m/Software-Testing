import Pages.Forgot_Password;
import Pages.HomePage;
import Pages.Reset_Password;
import Pages.Sign_In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class Login {

    //WebDriverManager.ChromeDriver().Setup();
    WebDriver driver;

    HomePage HP;
    Sign_In SI;
    Forgot_Password FP;
    Reset_Password RE;


    @BeforeMethod
    public void initialization() {
        // Initialize WebDriverWait with a timeout of 10 seconds

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

    }

    @DataProvider(name = "LoginData")
    public Object[][] LoginData() {
        return new Object[][]{
                {"Salma", "12345", "saloma@gmail.com", "01152681209"},
               // {"testuser", "password123", "testuser@example.com", "0123456789"}
        };

}

@Test(dataProvider = "LoginData")
public void login(String usrname, String Pass, String email, String phone){
    SI = new Sign_In(driver);;
    FP = new Forgot_Password(driver);
    // Wait for the username input to be visible
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputUsername")));
    String loggedInUser  = SI.SignIn(usrname, Pass );
    FP.forgot_pass(usrname, email, phone);

    RE = new Reset_Password(driver);
    String TempPass = RE.getpass();
    String temporaryUser = SI.SignIn(loggedInUser,TempPass);

    HP = new HomePage(driver);


    // Wait for logout button to be displayed
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='logout-btn']")));

    // Assert that logout button is displayed
    Assert.assertTrue(logoutButton.isDisplayed(), "Second login with temporary password failed");

}

@AfterMethod
    public void teardown(){
    driver.quit();
}



}
