package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\Driver1\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
driver.get("http://leafground.com/pages/table.html");
//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
//Alert a=driver.switchTo().alert();
//Thread.sleep(3000);
//a.accept();
//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
//Thread.sleep(3000);
//a.dismiss();
//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
//a.sendKeys("Ashok");
//a.accept();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement t = driver.findElement(By.xpath("//table/tbody/tr/td[2]"));	
System.out.println(t.getText());
driver.close();
	
	
}
}
