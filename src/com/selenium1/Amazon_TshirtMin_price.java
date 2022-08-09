package com.selenium1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Amazon_TshirtMin_price {
	static WebDriver driver;
	static ArrayList<Integer> al = new ArrayList<Integer>();
	public static void browserlaunch() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.get(
				"https://www.amazon.in/s?i=apparel&bbn=1968542031&rh=n%3A1968542031%2Cp_85%3A10440599031%2Cp_36%3A-29900%2Cp_n_feature_nineteen_browse-bin%3A11301357031%2Cp_72%3A1318477031&s=apparel&pf_rd_i=1953602031%2C6648217031&pf_rd_i=6648217031&pf_rd_m=A1K21FY43GMZF8&pf_rd_m=A1VBAL9TL5WCBF%2CA1VBAL9TL5WCBF&pf_rd_p=3df7ce02-d7cc-43a5-b983-89f779b77b38&pf_rd_p=ac5e265f-0e3b-4241-a1ed-27de37037c54%2CpreviewPlacement_mobile-hybrid-1&pf_rd_r=4F0R9C7ZSCA8YW2GT1RY%2CCQVCG252TG5TFWT4AJST&pf_rd_r=ZCQ9H0ETTBTYAJ2XMC77&pf_rd_s=merchandised-search-4%2Cmobile-hybrid-1&pf_rd_s=merchandised-search-5&pf_rd_t=101&pf_rd_t=30901%2C30901&qid=1653653630&rnid=1318475031&ref=sr_nr_p_72_2");
		driver.manage().window().maximize();

	}

	public static void Operation() {

		List<WebElement> allprice = driver
				.findElements(By.xpath("//span[@class='a-price a-text-price']/preceding-sibling::span"));
		
		for (int i = 0; i < allprice.size(); i++) {
			String replaceAll = allprice.get(i).getText().replaceAll("₹", "");
			Integer valueOf = Integer.valueOf(replaceAll);
			al.add(valueOf);
		}
		int size = al.size();
		System.out.println(size);
		System.out.println(Collections.max(al));

	}

	public static void Search_icon_Colour() {
		WebElement searchBox = driver.findElement(By.xpath("(//span[@class='s-color-swatch-inner-circle-fill'])[3]"));		String cssValue = searchBox.getCssValue("color");
		String cssValue1= searchBox.getCssValue("background-color");
		String asHex = Color.fromString(cssValue1).asHex();
		System.out.println(asHex);
		driver.close();
	}

	public static void main(String[] args) {
		browserlaunch();
		Operation();
		Search_icon_Colour();
	}
}
