package com.webdriver.helper;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {
	//singleton design pattern
	/*
	 * 1constructor should be private so no other class can create object of the class
	 * 
	 * 2,..to get the instance of the ..use getinstance 
	 */
private static BrowserHelper browserHelper; 
private WebDriver driver;
//because of private restruiction cannot create object of this class
private BrowserHelper(WebDriver driver)
		{
	this.driver=driver;
		}
//reason made getInstance static bc so that it can be accesssed by classname BrowserHelper
//and return yrttype is browser helper
public static BrowserHelper getInstance(WebDriver driver) {

	if(browserHelper==null)
		browserHelper = new BrowserHelper(driver);
	return browserHelper;
}
public void moveForward() {
	driver.navigate().forward();	
}
public void moveBackward() {
	driver.navigate().back();	
}
public void refresh() {
	driver.navigate().refresh();	
}
public void maximise() {
	driver.manage().window().maximize();	
}
}
