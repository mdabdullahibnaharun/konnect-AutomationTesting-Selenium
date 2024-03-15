package com.konnect.aih.scrolltest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://konnect.creativesofttechnology.com/student/login") ;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrol1By(0,500)");
		driver.manage().window().setSize(new Dimension(1101, 550));
		driver.close();
	}
}
