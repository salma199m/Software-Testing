package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgot_Password {
    WebDriver driver;

    public Forgot_Password(WebDriver driver1) {
        this.driver = driver1;
    }


    //Elements
    By name = By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]");
    By email = By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]");
    By phone = By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]");
    By reset = By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]");

//Methods
    public void forgot_pass(String usrname, String usremail, String usrphone){
        driver.findElement(name).sendKeys(usrname);
        driver.findElement(email).sendKeys(usremail);
        driver.findElement(phone).sendKeys(usrphone);
        driver.findElement(reset).click();

    }

}