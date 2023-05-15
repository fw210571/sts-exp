	package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01<WebDriver> {
	
	@Test() 
	
	public void justTesting() {
//		driver.findElement(By.name("username")).sendKeys("Admin");
//	    driver.findElement(By.name("password")).sendKeys("admin123");
//	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	
	
	@Test(enabled = false)
	public void data_test() {
		// code
		System.out.println("exclude");
	}
	
	
	@AfterTest()
	public void afterTesting() {
//		 quit/close the website 
		System.out.println("close the website (after the test)");
//		driver.close();
	}
	
	
	@BeforeTest()
	public void before_test( ) {
//		start/get the website
//		System.out.println("start the website (before testing)");
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver() ;
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
}
