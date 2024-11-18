package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reset_Password {
    WebDriver driver;
    public Reset_Password(WebDriver driver1){
        this.driver = driver1;
    }

    // Elements
    By msg = By.xpath("//*[@id=\"container\"]/div[1]/form/p");
    By gotologin = By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]");

    // methods
    public String getpass(){
        String complete_msg = driver.findElement(msg).getText();
        String correct_pass = complete_msg.split("'")[1].split("'")[0];
        driver.findElement(gotologin).click();
        return correct_pass;

    }
}
