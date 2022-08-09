package com.selenium1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Myntra_demo {
	static WebDriver driver;
	static List<Integer> allpriceList = new ArrayList<>();

	public static void browserLaunch() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
	}

	public static void lowestPrice() {
		// List<WebElement> alldisprice =
		// driver.findElements(By.xpath("//li[@class='product-base']/a/div[@class='product-productMetaInfo']/div/span/span[@class='product-discountedPrice']"));
		List<WebElement> alldisprice = driver.findElements(By.xpath(
				"//li[@class=\"product-base\"]/a/div[@class='product-productMetaInfo']/div/span/span[@class='product-discountedPrice']"));
		for (WebElement disprice : alldisprice) {
			String replace = disprice.getText().replace("Rs.", "");
			Integer price = Integer.valueOf(replace);
			allpriceList.add(price);
		}
		System.out.println("Total dresses with discount price:" + allpriceList.size());
		System.out.println("Lowest price:" + Collections.min(allpriceList));
       
	}
      public static void productnameofLowestprice() {
         Integer integer = allpriceList.get(0);
        
         System.out.println(integer);
	}
	public static void main(String[] args) {
		browserLaunch();
		lowestPrice();
	productnameofLowestprice();
	}
}
