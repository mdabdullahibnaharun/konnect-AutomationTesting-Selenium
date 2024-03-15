package com.konnect.aih.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static void main(String[] args) {
	System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\"");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	
	/*
	1. Java
	2. Java Path Setting
	2. Eclipse
	4. Maven Dependency-Selenium
	5. Driver
	Google Chrome Chrome Driver
	Firefox- Gecko Driver
	Edge Edge Driver
	Opera-Opera Driver
	 */
	}
}