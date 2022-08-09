package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_project1 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"");
 WebDriver driver=new EdgeDriver();
 driver.get("http://automationpractice.com/index.php");
 driver.manage().window().maximize();
 WebElement signin=driver.findElement(By.xpath("//a[@rel='nofollow']"));
 signin.click();
 WebElement email=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
 email.sendKeys("demo11290@gmail.com");
 WebElement create=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
 create.click();
 Thread.sleep(3000);
 WebElement gender=driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
 gender.click();
 WebElement firstname=driver.findElement(By.id("customer_firstname"));
 firstname.sendKeys("Ashok");
 WebElement lastname=driver.findElement(By.id("customer_lastname"));
 lastname.sendKeys("kumar");
 WebElement pass=driver.findElement(By.id("passwd"));
 pass.sendKeys("123456");
 WebElement day=driver.findElement(By.id("days"));
 Select s=new Select(day);
 s.selectByValue("29");
 WebElement month=driver.findElement(By.id("months"));
 Select s1=new Select(month);
 s1.selectByValue("5");
 WebElement year=driver.findElement(By.id("years"));
 Select s2=new Select(year);
 s2.selectByValue("1996");
   driver.findElement(By.name("address1")).sendKeys("20,vinayagar kovil street");
   driver.findElement(By.name("city")).sendKeys("chennai");
   WebElement state = driver.findElement(By.name("id_state"));
   Select s3=new Select(state);
   s3.selectByValue("32");
   driver.findElement(By.id("postcode")).sendKeys("10001");
   driver.findElement(By.id("phone_mobile")).sendKeys("8004579456");
   driver.findElement(By.name("alias")).sendKeys("20 st thomas newyork");
   driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
   driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
   driver.findElement(By.id("email")).sendKeys("demo11290@gmail.com");
   driver.findElement(By.id("passwd")).sendKeys("123456");
      
   WebElement women=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
   Actions Action=new Actions(driver);
   Action.moveToElement(women).perform();
   
   
   }
}
