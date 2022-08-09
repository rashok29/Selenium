package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class irctc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement ok=driver.findElement(By.xpath("//button[@type='submit']"));
	ok.click();
	
	WebElement from=driver.findElement(By.xpath("//input[@autocomplete='off']"));
	from.sendKeys("Chennai");
	
}
}
