package sample_proj;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample_proj {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
    	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
    	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"E:\\selenium-logs.txt");
    	WebDriver driver = new FirefoxDriver();

    	driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("cat");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cat");
            }
        });
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
