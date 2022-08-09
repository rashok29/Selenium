package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class browser1 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe" );
WebDriver driver= new EdgeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
    Thread.sleep(2000);
      
    WebElement search=driver.findElement(By.name("search_query"));
    search.click();
        
    
    WebElement song=driver.findElement(By.name("search_query"));
    song.sendKeys("Arabic kuthu");
    
    WebElement button=driver.findElement(By.id("search-icon-legacy"));
    button.click();
    
    WebElement search1=driver.findElement(By.id("video-title"));
    search1.click();
    
   
    WebElement play=driver.findElement(By.id("img"));
    play.click();
 }
}
