package sample_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Sample_binary_proj {
	protected static WebDriver driver;
	
	@BeforeSuite
	public static void setup() throws Exception{
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
    	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
    	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"E:\\selenium-logs.txt");
    	driver = new FirefoxDriver();
    	driver.get("https://www.binaryfountain.com/");	
    }
	
	@Test
	public static void test1() throws Exception {
		System.out.println("Page title is: " + driver.getTitle());
        WebElement element = driver.findElement(By.partialLinkText("Reputation Management"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(3000);
        //List<WebElement> childs = element.
    
        
	}
	
	@AfterSuite
	public static void teardown() {
		driver.close();
	}

}
