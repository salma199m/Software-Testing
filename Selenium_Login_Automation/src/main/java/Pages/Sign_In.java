package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sign_In {

    WebDriver driver;
    public Sign_In(WebDriver driver1){
        this.driver = driver1;
    }

    //Elements
    By username = By.id("inputUsername");
    By password = By.name("inputPassword");
    By checkbox1 = By.xpath("//*[@id=\"chkboxOne\"]");
    By checkbox2 = By.xpath("//*[@id=\"chkboxTwo\"]");
    By signin = By.xpath("//*[@id=\"container\"]/div[2]/form/button");;

    By forgotpass = By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a");

    //methods
    public String SignIn(String usr, String pass) {
        driver.findElement(username).sendKeys(usr); ;
        String correctusr = driver.findElement(username).getAttribute("value");;
        driver.findElement(password).sendKeys(pass);
        driver.findElement(checkbox1).click();
        driver.findElement(checkbox2).click();
        driver.findElement(signin).click();
        driver.findElement(forgotpass).click();

        return correctusr;

    }

}
