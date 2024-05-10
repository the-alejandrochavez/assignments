import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementInView {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/element-in-view.html");

        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        builder.scrollByAmount(0, 200).perform();

        WebElement paragraph = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Now you see me']")));

        builder.scrollToElement(paragraph).perform();

        builder.scrollByAmount(0, 200).perform();
    }
}
