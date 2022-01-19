package co.fb.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Testng1 {
	public WebDriver driver;
	
	
  @Test
  public void main() {
	  
	  driver.findElement(By.id("email")).sendKeys("clovek7890@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Delete@9");
	  driver.findElement(By.id("u_0_h_l/")).click();
	  // after login , at search button.
	  driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("edureka");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe" );
	    driver = new ChromeDriver();
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // get url
	    driver.get("https://www.facebook.com/");
	    
	    
	    
	    
	    
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
