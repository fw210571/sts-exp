package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsClick {
	public static void main(String[] args) {
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver() ;
			WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(7)) ;
	//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://demoqa.com/alerts");
		    driver.findElement(By.id("timerAlertButton")).click();
		    
	//	    Soft assertion - will not block the code like Hard assertion
		    SoftAssert soft = new SoftAssert() ;
		    
		    wait.until(ExpectedConditions.alertIsPresent()) ;
		    soft.assertTrue(false) ;
	
		    driver.switchTo().alert().accept();
		    
		    soft.assertAll();
		    
	}
}
