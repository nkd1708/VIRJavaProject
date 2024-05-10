package com.page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class samplefk {
	
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//div[@class='_2SmNnR']/input[@type='text']")).sendKeys("Macbook air m2");
	    driver.findElement(By.xpath("//div[@class='_2SmNnR']/input[@type='text']")).sendKeys(Keys.ENTER);
	    String itemName = driver.findElement(By.xpath("(//div[@class='_2kHMtA']//div[@class='_4rR01T'])[1]")).getText();
	    System.out.println("Product Name "+itemName);
	    driver.findElement(By.xpath("(//div[@class='_2kHMtA']//div[@class='_4rR01T'])[1]")).click();
	    String currentWindow = driver.getWindowHandle();
	    Set<String> handles = driver.getWindowHandles();
	    for(String actual: handles) {
	    	if(!actual.equalsIgnoreCase(currentWindow)) {
	    		System.out.println(driver.switchTo().window(actual).getTitle());
	    		driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg col-5-12 _78xt5Y']/div[2]/div/ul/li/button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	    		driver.findElement(By.xpath("//div[@class='_1psGvi']//a[@class='_3SkBxJ']")).click();
	    		String itemNameInCart = driver.findElement(By.xpath("//div[@class=\"_3fSRat\"]/div[@class='_2-uG6-']/a")).getText();
	    		System.out.println("Item Name "+ itemNameInCart);
	    		if(itemNameInCart.equalsIgnoreCase(itemName)) {
	    			System.out.println("Product Selected is displayed in Cart");
	    		}
	    		
	    		}
	    }
	    
	    driver.switchTo().defaultContent();
	    
	    driver.quit();

  }
}
