package com.konnect.aih.regetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegestrationTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
				
		//navigation test
		driver.get ("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://konnect.creativesofttechnology.com/teacher/login");
		
		driver.findElement(By.name("name")).sendKeys("SQA ABdullah");
		driver.findElement(By.name("email")).sendKeys("mdabdullahih13426@mail.com");
		driver.findElement(By.name("phone_number")).sendKeys ("01786287766");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement (By.name("password_confirmation")).sendKeys("12345678");
//		driver.findElement(By.className("btn btn-primary login-btn float-end")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/button")).click();
		
	}

}
