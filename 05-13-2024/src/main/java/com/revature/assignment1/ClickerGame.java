package com.revature.assignment1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClickerGame {

    private static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://orteil.dashnet.org/cookieclicker/");
        driver.manage().window().maximize();

        List<WebElement> upgrades;
        List<WebElement> upgrades_2;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lang = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div#langSelect-EN")));
        lang.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement cookie = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("button#bigCookie")));

        while(true) {

            cookie.click();

            upgrades_2 = driver.findElements(By.cssSelector("div#upgrades > *"));
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(150));

            if(upgrades_2.size() > 4) {
                for(WebElement j : upgrades_2) {
                    if(j.getAttribute("class").contains("enabled")) {
                        j.click();
                        break;
                    }
                }
            }

            upgrades = driver.findElements(By.cssSelector("div.product"));
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(150));

            for(WebElement i : upgrades) {
                if(i.getAttribute("class").contains("enabled")) {
                    i.click();
                    break;
                }
            }
        }
    }
}