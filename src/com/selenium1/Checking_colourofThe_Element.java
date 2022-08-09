package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Checking_colourofThe_Element {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	driver.get("https://www.myntra.com/men-casual-shirts");
	driver.manage().window().maximize();
	String expected="#282c3f";
	WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[1]/a"));
	String cssValue = logo.getCssValue("color");
	System.out.println(cssValue);
	driver.close();
	String Actualcolour = Color.fromString(cssValue).asHex();
	System.out.println("Expected colour is:"+expected);
	System.out.println("The actual colour is:"+Actualcolour);
	if (Actualcolour.equals(expected)) {
		System.out.println("Both matched");
	}
	else {
		System.out.println("not");
	}
}
}
