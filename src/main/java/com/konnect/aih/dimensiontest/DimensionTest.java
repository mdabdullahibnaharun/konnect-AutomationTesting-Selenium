package com.konnect.aih.dimensiontest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DimensionTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
				
		//navigation test
		driver.manage().window().maximize();
		driver.navigate().to("https://konnect.creativesofttechnology.com/teacher/login");
		driver.manage().window().minimize();
		Dimension size = driver.manage().window().getSize();
		System.out.println ("the Size of the Window is" + size);
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("the Height of the Window: " + height);
		int width = driver.manage().window().getSize().getWidth();
		System.out.println("the Width of the Window is!" + width);
		driver.close();
	}

}
