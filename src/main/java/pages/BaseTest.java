package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void driverSetup() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		options.addArguments("--start-maximized");
		driver = new FirefoxDriver(options);
		
	}
	public void implicitwait()
	{
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void waitforPageLoad()
	{
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

			    wait.until(new ExpectedCondition<Boolean>() {
			        public Boolean apply(WebDriver wdriver) {
			        	boolean result= ((JavascriptExecutor)driver).executeScript(
				                "return document.readyState").equals("complete");
			        	return result;
			        }
			    });
	}
	
	public void launchUrl(String url) {
		
		driver.get(url);
		
	}

	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}
