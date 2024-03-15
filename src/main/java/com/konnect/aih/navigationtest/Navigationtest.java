package com.konnect.aih.navigationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigationtest {


	public static void main(String[] args) {
		// Driver Setup
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//navigation test
		driver.get ("https://www.google.com/");
		driver.navigate().to("https://konnect.creativesofttechnology.com/");
		driver.navigate ().back();
		driver.navigate().forward();
	}
}
