package com.revature.testing.assignment2.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiLangSteps {

    private static WebDriver driver;

    @Given("the user is in the home page")
    public void theUserIsInTheHomePage() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
    }

    @When("the user clicks on the English link")
    public void theUserClicksOnTheEnglishLink() {

        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-en']"));
        link.click();
    }

    @Then("the user should be redirected to the English Wikipedia")
    public void theUserShouldBeRedirectedToTheEnglishWikipedia() {
        System.out.println(driver.getTitle());
    }

    @When("the user clicks on the Spanish link")
    public void theUserClicksOnTheSpanishLink() {

        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-es']"));
        link.click();
    }

    @Then("the user should be redirected to the Spanish Wikipedia")
    public void theUserShouldBeRedirectedToTheSpanishWikipedia() {
        System.out.println(driver.getTitle());
    }

    @When("the user clicks on the Deutsch link")
    public void theUserClicksOnTheDeutschLink() {

        WebElement link = driver.findElement(By.xpath("//*[@id='js-link-box-de']"));
        link.click();
    }

    @Then("the user should be redirected to the Deutsch Wikipedia")
    public void theUserShouldBeRedirectedToTheDeutschWikipedia() {
        System.out.println(driver.getTitle());
    }
}
