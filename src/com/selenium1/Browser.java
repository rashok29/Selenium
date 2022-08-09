package com.selenium1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe" );
WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&/");
	driver.manage().window().maximize();
	
    Thread.sleep(2000);
      
    WebElement username=driver.findElement(By.id("ap_email"));
    username.sendKeys("ashokkarthik29@gmail.com");
    Thread.sleep(2000);
    WebElement sign_btn=driver.findElement(By.id("continue"));
    sign_btn.click();
    Thread.sleep(2000);
    WebElement password=driver.findElement(By.name("password"));
    password.sendKeys("ashiva.11");
    Thread.sleep(2000);
    WebElement login_btn=driver.findElement(By.id("signInSubmit"));
    login_btn.click();
    Thread.sleep(8000);
        WebElement auth_sign=driver.findElement(By.id("auth-signin-button"));
    auth_sign.click();
    Thread.sleep(20000);
 }
}
