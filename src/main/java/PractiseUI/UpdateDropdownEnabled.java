package PractiseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdownEnabled {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());//false	
		  //before clicking round button
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
 //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
  
  
 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

 
 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
	 System.out.println("its enabled");
	 Assert.assertTrue(true); 
	 }
 else {
	 Assert.assertFalse(false);
 }
	}

}
