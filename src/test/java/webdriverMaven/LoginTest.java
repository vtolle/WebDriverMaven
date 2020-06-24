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
		
		driver.get("https://6erpack.sky.de/auth/login");
		driver.findElement(By.id("login_local")).click();
		
		driver.findElement(By.id("email")).sendKeys("hallo@welt.de");
//		driver.findElement(By.id("password")).sendKeys("blabla"); // no error
		driver.findElement(By.id("paword")).sendKeys("blabla"); // cause an error
		
		/*
		 * new comment added
		 */
		
	}

	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
}
