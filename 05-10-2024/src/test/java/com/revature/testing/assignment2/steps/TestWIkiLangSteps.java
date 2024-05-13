package com.revature.testing.assignment2.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWIkiLangSteps {

    private static WebDriver driver;

    @Given("the user is in the home page")
    public void theUserIsInTheHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Assertions.assertEquals("https://www.wikipedia.org/", driver.getCurrentUrl());
    }

    @When("the user clicks on the English link")
    public void theUserClicksOnTheEnglishLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-en']"));
        link.click();
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page", driver.getCurrentUrl());
    }

    @Then("the user should be redirected to the English Wikipedia")
    public void theUserShouldBeRedirectedToTheEnglishWikipedia() {
        Assertions.assertEquals("Wikipedia, the free encyclopedia", driver.getTitle());
        driver.quit();
    }

    @When("the user clicks on the Spanish link")
    public void theUserClicksOnTheSpanishLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-es']"));
        link.click();
        Assertions.assertEquals("https://es.wikipedia.org/wiki/Wikipedia:Portada", driver.getCurrentUrl());
    }


    @Then("the user should be redirected to the Spanish Wikipedia")
    public void theUserShouldBeRedirectedToTheSpanishWikipedia() {
        Assertions.assertEquals("Wikipedia, la enciclopedia libre", driver.getTitle());
        driver.quit();
    }

    @When("the user clicks on the Deutsch link")
    public void theUserClicksOnTheDeutschLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-de']"));
        link.click();
        Assertions.assertEquals("https://de.wikipedia.org/wiki/Wikipedia:Hauptseite", driver.getCurrentUrl());
    }

    @Then("the user should be redirected to the Deutsch Wikipedia")
    public void theUserShouldBeRedirectedToTheDeutschWikipedia() {
        Assertions.assertEquals("Wikipedia – Die freie Enzyklopädie", driver.getTitle());
        driver.quit();
    }
}