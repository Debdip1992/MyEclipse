package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testClearTrip {
  @Test
  public void testClearTrip() throws InterruptedException {
  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.cleartrip.com/");
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  WebElement from =driver.findElement(By.id("FromTag"));
	  
	  Actions act1= new Actions(driver);
	  act1.keyDown(from,Keys.SHIFT).perform();
	  Thread.sleep(2000);
	 // act1.sendKeys(Keys.ENTER)
	  
	  
  }
}
