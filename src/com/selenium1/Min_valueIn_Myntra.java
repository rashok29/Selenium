package com.selenium1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Min_valueIn_Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		List<WebElement> allPrice = driver
				.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < allPrice.size(); i++) {
			String replaceAll = allPrice.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.valueOf(replaceAll);
			a.add(parseInt);

		}
		int size = a.size();
		driver.close();
		System.out.println("The total number of shirts: "+size);
		System.out.println("The minimum value of the shirt is: "+Collections.min(a));

	}
}
