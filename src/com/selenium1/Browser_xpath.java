package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");

 WebDriver driver=new EdgeDriver();
 driver.get("https://prochant.greythr.com/uas/portal/auth/login?login_challenge=0d72b469ed06463b8467dedf1afd5045");
 driver.manage().window().maximize();
 
 Thread.sleep(2000);
	
 WebElement login=driver.findElement(By.xpath("//input[@placeholder='Employee No']"));
 login.sendKeys("pi0222910");

 Thread.sleep(2000);
 WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
 password.sendKeys("A$hok@3005");
 Thread.sleep(2000);
 WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
 button.click();
 Thread.sleep(2000);
}
}
