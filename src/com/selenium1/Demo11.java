package com.selenium1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo11 {
public static <string> void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\Driver1\\msedgedriver.exe");
   WebDriver driver=new EdgeDriver();
   driver.get("https://www.amazon.in/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']")).click();;
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
   Thread.sleep(3000);
   driver.findElement(By.id("nav-search-submit-button")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
   Thread.sleep(3000);
   Set<String> All_window = driver.getWindowHandles();
   
//   System.out.println(All_window);
   ArrayList l=new ArrayList(All_window);
      driver.switchTo().window((String) l.get(1));
//   driver.switchTo().window((String) l.get(0));
    JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,400);");
	driver.findElement(By.id("buy-now-button")).click();






}
}
