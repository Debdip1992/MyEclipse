package demo;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mozila {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\a07208trng_b4b.04.24\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://hdfcbank.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  
	 Actions act1=new Actions(driver);
	 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']")));
	 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']")));
	 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().perform();
	 Assert.assertTrue(driver.getTitle().startsWith("Demat"));
  }
}
