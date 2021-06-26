package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@Test
	public void homepage(){
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Lenovo\\Framework\\POM\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	}

}
