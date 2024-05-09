import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickKeys {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/click-keys.html");
        WebElement character = driver.findElement(By.id("characterIndicator"));
        WebElement prog = driver.findElement(By.id("progress"));

        Actions builder = new Actions(driver);

        int val = Integer.parseInt(prog.getAttribute("value"));

        while(val != 100) {
            System.out.println(character.getText());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            Action multipleAction = builder
                    .sendKeys(character, character.getText())
                    .build();

            multipleAction.perform();
            prog = driver.findElement(By.id("progress"));
            val = Integer.parseInt(prog.getAttribute("value"));
        }
    }
}

