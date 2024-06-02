package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static stepDef.BaseTest.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    By productName = By.xpath("//*[@id=\"item_4_img_link\"]/div");
    By buttonAddCart = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
    By buttonRemoveCart = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
    By buttonShoppingCart = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    public void validateHomePage(){
        WebElement productElement = driver.findElement(productName);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void clickButtonAddCart(){
        WebElement buttonAdd = driver.findElement(buttonAddCart);
        buttonAdd.click();
    }

    public void shopingCart(){
        WebElement productElement1 = driver.findElement(buttonShoppingCart);
        assertTrue(productElement1.isDisplayed());
        assertEquals("1", productElement1.getText());
    }

    public void clickButtonRemoveCart(){
        driver.findElement(buttonRemoveCart).click();
    }

    public void removeCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement productElement2 = driver.findElement(buttonAddCart);
        assertTrue(productElement2.isDisplayed());
    }
}
