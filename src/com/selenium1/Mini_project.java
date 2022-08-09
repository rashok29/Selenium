package com.selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Mini_project {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.edge.driver", 
			"");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement amazon=driver.findElement(By.name("q"));
    amazon.sendKeys("amazon.in");
    Robot keyboard=new Robot();
    keyboard.keyPress(KeyEvent.VK_ENTER);
     keyboard.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    WebElement click=driver.findElement(By.xpath("//*[@aria-level='3']"));
    click.click();
    Actions right_click=new Actions(driver);
    WebElement mob=driver.findElement(By.xpath("(//a[@tabindex='0'])[6]"));
    right_click.contextClick(mob).build().perform();
     Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
    keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_ENTER);
    keyboard.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    WebElement cust_suport=driver.findElement(By.xpath("(//a[@tabindex='0'])[7]"));
    right_click.contextClick(cust_suport).build().perform();
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
    keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_ENTER);
    keyboard.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    WebElement Todays_deal=driver.findElement(By.xpath("(//a[@tabindex='0'])[8]"));
    right_click.contextClick(Todays_deal).build().perform();
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
    keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_ENTER);
    keyboard.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    WebElement fashions=driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
    right_click.contextClick(fashions).build().perform();
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
    keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_ENTER);
    keyboard.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    WebElement Electronic=driver.findElement(By.xpath("(//a[@tabindex='0'])[10]"));
    right_click.contextClick(Electronic).build().perform();
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
    keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(3000);
    keyboard.keyPress(KeyEvent.VK_ENTER);
    keyboard.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    
    int size=driver.getWindowHandles().size();
    System.out.println("Total number of windows:"+ size);
    String parentwindow=driver.getWindowHandle();
    System.out.println(parentwindow);
    System.out.println("###########################################################################");
    Thread.sleep(3000);
    Set<String>allwindow=driver.getWindowHandles();
    for (String get : allwindow) {
    	String title=driver.switchTo().window(get).getTitle();
    	System.out.println("All windows titles are: "+title);
    			
	}
    Thread.sleep(3000);
        String select_title="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
    for (String get : allwindow) {
		if (driver.switchTo().window(get).getTitle().equals(select_title)) {
			break;
			
		}
	}
    Thread.sleep(3000);
WebElement search_mob=driver.findElement(By.id("twotabsearchtextbox"));
search_mob.sendKeys("Iphone");
WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
search_btn.click();
Thread.sleep(3000);
String actual_title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
TakesScreenshot ts=(TakesScreenshot) driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Screenshot\\Ashok.png");
//Files.copy(source, des);
FileHandler.copy(source, des);
Thread.sleep(3000);
for (String get : allwindow) {
	if(driver.switchTo().window(get).getTitle().equals(actual_title)) {
		break;
		}
		}
WebElement mens_wear=driver.findElement(By.id("twotabsearchtextbox"));
mens_wear.sendKeys("Mens shirt");
WebElement search_wear=driver.findElement(By.id("nav-search-submit-button"));
search_wear.click();
Thread.sleep(3000);
for (String get : allwindow) {
	if(!get.equals(parentwindow)) {
		driver.switchTo().window(get);
		driver.close();
	}
}
}
}
