package com.revature.testing.assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWikiLang {

    private static WebDriver driver;

    @BeforeEach
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("English Link")
    public void englishLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-en']"));
        link.click();
        Assertions.assertEquals("Wikipedia, the free encyclopedia", driver.getTitle());
    }

    @Test
    @DisplayName("Spanish Link")
    public void spanishLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-es']"));
        link.click();
        Assertions.assertEquals("Wikipedia, la enciclopedia libre", driver.getTitle());
    }

    @Test
    @DisplayName("Deutsch Link")
    public void deutschLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-de']"));
        link.click();
        Assertions.assertEquals("Wikipedia – Die freie Enzyklopädie", driver.getTitle());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
