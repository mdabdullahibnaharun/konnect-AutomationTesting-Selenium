package com.konnect.aih.titleverefication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerefication {
	public static void main(String[] args) {
		// Driver Setup
		System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
				
		//navigation test
		driver.get ("https://www.google.com/");
		driver.navigate().to("https://konnect.creativesofttechnology.com/");
//		driver.navigate ().back();
//		driver.navigate().forward();
		
		if(driver.getTitle() == "Konnect-CHT") {
			System.out.println("Title matched --TRUE");
//			return true;
		}else {
			System.out.println("Title did not matched --FALSE");
		}
		
		driver.manage().window().maximize();
		try {
			driver.manage().wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
