package com.revature.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LevelOne {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/level-1.html");

        WebElement rand = driver.findElement(By.id("randomString"));
        WebElement name = driver.findElement(By.id("nameInput"));
        WebElement submit = driver.findElement(By.xpath("/html/body/form/button"));

        name.sendKeys(rand.getText());
        submit.click();

        driver.quit();

    }
}