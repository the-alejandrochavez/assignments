package com.revature.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class LevelTwo {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/level-2.html");

        Select selDropdown = new Select(driver.findElement(By.name("input1")));
        WebElement checkboxOne = driver.findElement(By.name("checkbox1"));
        WebElement checkboxTwo = driver.findElement(By.name("checkbox2"));
        WebElement checkboxThree = driver.findElement(By.name("checkbox3"));
        List<WebElement> radio = driver.findElements(By.name("radio"));
        WebElement date = driver.findElement(By.name("dateInput"));
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        WebElement dropdownValue = driver.findElement(By.xpath("//dt[text()=\"Dropdown\"]/following-sibling::dd[1]"));
        WebElement radioValue = driver.findElement(By.xpath("//dt[text()=\"Radio\"]/following-sibling::dd[1]"));
        WebElement dateValue = driver.findElement(By.xpath("//dt[text()=\"Date\"]/following-sibling::dd[1]"));
        WebElement buttonValue = driver.findElement(By.xpath("//dt[text()=\"Button to submit\"]/following-sibling::dd[1]"));

        String r_value = radioValue.getText();
        int r_intValue = Integer.parseInt(r_value);

        String d = dateValue.getText();
        String[] newDate = d.split("-");
        d = newDate[1] + "/" + newDate[2] + "/" + newDate[0];

        String b_value = buttonValue.getText();
        int b_intValue = Integer.parseInt(b_value);

        selDropdown.selectByVisibleText(dropdownValue.getText());
        checkboxOne.click();
        checkboxTwo.click();
        checkboxThree.click();
        radio.get(r_intValue - 1).click();
        date.sendKeys(d);
        buttons.get(b_intValue - 1).click();

        driver.quit();

    }
}
