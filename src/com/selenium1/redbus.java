package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class redbus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement from=driver.findElement(By.id("src"));
	from.sendKeys("chennai");
	
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("Nagercoil");
	

}
}
