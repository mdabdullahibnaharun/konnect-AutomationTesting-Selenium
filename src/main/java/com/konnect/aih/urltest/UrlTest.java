package com.konnect.aih.urltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		if(driver.getCurrentUrl().equals("https://www.google.com/")) {
			System.out.println("Url Correct -TRUE");
		}else {
			System.out.println("Url Invalid -FALSE");
		}
		Thread.sleep(50000);
		driver.close();
	}
}
