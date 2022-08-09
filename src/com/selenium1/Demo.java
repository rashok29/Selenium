package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.name("username"));
	email.sendKeys("ashokkarthik29@gmail.com");
	Thread.sleep(2000);
	//WebElement password=driver.findElement(By.id("pass"));
	//password.sendKeys("123456");
	Thread.sleep(2000);
	WebElement create=driver.findElement(By.xpath("//*[@data-testid='sign-up-link']"));
	create.click();
	
	
}
}

