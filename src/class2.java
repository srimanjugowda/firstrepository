import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class class2 {
	WebDriver driver;
  @Test
 
	  public void Alerts() throws InterruptedException {
	  
		  
		  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");	
		  driver.findElement(By.xpath("//input[@value='1']")).click();
		  driver.findElement(By.xpath("//input[@value='2']")).click();
		  driver.findElement(By.xpath("//input[@value='3']")).click();
		  driver.findElement(By.xpath("//input[@value='4']")).click();
	        driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    
	        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
	        driver.findElement(By.xpath("//span[text()='System Alerts']")).click();
	        driver.findElement(By.xpath("//input[@value='46']")).click();
	        
	        Thread.sleep(3000);
	              
	       // driver.findElement(By.xpath("//input[@value='Select all']")).click();
	        driver.findElement(By.xpath("//input[@value='Select none']")).click();
	        driver.findElement(By.xpath("//input[@value='Remove selected']")).click();
	        
	        Thread.sleep(3000);
	        
	        driver.switchTo().alert().accept();
	        String expected = "Nothing Selected";
	        Alert alert = driver.switchTo().alert();
	        String actual = alert.getText();
	        System.out.println(actual);
	     assertTrue(actual.contains(expected));
	        alert.accept();
	  }   
  
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("textcase is executed....");
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			 driver.get(" http://localhost:8585/");
  }

  @AfterTest
  public void afterTest() {
  }

}