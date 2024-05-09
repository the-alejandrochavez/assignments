package com.revature.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LevelFour {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/level-4.html");

        WebElement input = driver.findElement(By.cssSelector("[minlength='100']"));
        WebElement submit = driver.findElement(By.tagName("button"));
        Alert alert;

        for (int i = 0; i < 100; i++) {
            input.sendKeys("h");
            driver.switchTo().alert().accept();
        }
        submit.click();
    }
}
