package com.konnect.aih.logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
				
		//navigation test
		driver.manage().window().maximize();
		driver.navigate().to("https://konnect.creativesofttechnology.com/teacher/login");
		
		driver.findElement(By.id("nav-home-tab")).click();
		driver.findElement(By.name("login_phone_number")).sendKeys("01786287766");
		driver.findElement(By.xpath("//*[@id=\"nav-home\"]/form/button")).click();
		driver.findElement(By.name ("login_password")).sendKeys("12345678");
	}
}
