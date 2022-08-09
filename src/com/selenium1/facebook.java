package com.selenium1;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement emaill=driver.findElement(By.id("email"));
		emaill.sendKeys("ashokkarthik29@gmail.com");
	     
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		
		WebElement create=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		Thread.sleep(3000);
		WebElement first=driver.findElement(By.name("firstname"));
		first.sendKeys("Ashok");
		WebElement last=driver.findElement(By.name("lastname"));
		last.sendKeys("Kumar");
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("7010993078");
		
		WebElement pass1=driver.findElement(By.name("reg_passwd__"));
		pass1.sendKeys("ashiva.11");
		
		WebElement date=driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByValue("30");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("5");
		
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1996");
		
		WebElement sex=driver.findElement(By.xpath("//input[@value='2']"));
		sex.click();	
	}
}
