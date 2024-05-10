import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/drag-and-drop.html");
        WebElement drag = driver.findElement(By.id("toDrag"));
        WebElement drop = driver.findElement(By.xpath("/html/body/div"));

        Actions builder = new Actions(driver);

        builder.dragAndDrop(drag,drop).perform();
    }
}
