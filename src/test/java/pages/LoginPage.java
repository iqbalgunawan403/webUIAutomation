package pages;

import static stepDef.BaseTest.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;

public class LoginPage {
    By usernameInput = By.id("user-name");
    By passwordInput = By.id("password");
    By buttonLogin = By.id("login-button");

    public void webLogin(){
        driver.get("https://www.saucedemo.com/v1/");
    }

    public void validateErrorMessage(String errorMessage){
        assertTrue(driver.getPageSource().contains(errorMessage));
    }

    public void inputUsername (String username){
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword (String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(buttonLogin).click();
    }
}
