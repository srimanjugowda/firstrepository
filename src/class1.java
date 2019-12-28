import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class class1 {
	
	WebDriver driver;
  @Test
  public void Alerts() {
	  /*String expTitle = "Cyclos";
      String actTitle=driver.getTitle();
      assertEquals(actTitle,expTitle);*/
	 
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
     //   driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        driver.findElement(By.xpath("//span[text()='System Alerts']")).click();
      //  driver.findElement(By.className("subMenuText")).click();
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
      driver.findElement(By.xpath("//span[text()='System Alerts']")).click();
     driver.findElement(By.xpath("//span[text()='System Alerts']")).click();
     // Assert.assertTrue(driver.findElement(By.xpath("//span[text()='System Alerts']"))).isclick();
  }   
 
@BeforeMethod
  public void beforeMethod() {
	  driver.get(" http://localhost:8585/");
 }	

  @AfterMethod
  public void afterMethod() {
	
	  System.out.println("textcase is executed....");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		  }
		

  @AfterTest
  public void afterTest() {
	  
  }

}
