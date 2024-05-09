package com.revature.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.time.Duration;


public class LevelThree {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://127.0.0.1:5500/level-3.html");

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        WebElement submit = driver.findElement(By.tagName("button"));

        for(WebElement i : inputs) {
            wait.until(ExpectedConditions.elementToBeClickable(i)).sendKeys("a");
        }

        submit.click();

        driver.quit();

    }
}
