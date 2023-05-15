package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class multiwindow {
//	Parallel testing
	WebDriver driver ;
	public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" ;
	@Parameters("mybrowser")
	@BeforeTest()
	
	public void setup(String mybrowser) {
		
		
		if( mybrowser.equalsIgnoreCase("firefox") ) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if( mybrowser.equalsIgnoreCase("edge") ) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver() ;
		}else if(  mybrowser.equalsIgnoreCase("chrome") ) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
	}
	
	
	@Test()
	public void tc1() {
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get(url);
	    
//	    fill out the correct details
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
//	    submit
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	    
	}
}
