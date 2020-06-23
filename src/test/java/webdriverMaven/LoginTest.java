package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "/home/vtolle/eclipse-workspace/external_jars/geckodriver");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://valkotolle.de/wp/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys("vtadmin");
		driver.findElement(By.id("user_pass")).sendKeys("blabla");
		
	}

	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
}
