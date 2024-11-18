package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver1){
        this.driver = driver1;
    }

    // Elements
    By logout = By.xpath("//*[@class= \"logout-btn\"]");
    //*[@id="root"]/div/div/div/button

    // method
    public void Logout(){
        driver.findElement(logout).click();
    }

    // Verify if the login is successful after password reset
//    public boolean IsLogoutDisplayed(){
//        boolean result = driver.findElement(logout).isDisplayed();
//        return result;
//    }

    public boolean IsLogoutDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='logout-btn']")));
            return driver.findElement(By.xpath("//button[@class='logout-btn']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
