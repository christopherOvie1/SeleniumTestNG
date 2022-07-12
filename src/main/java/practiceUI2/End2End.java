package practiceUI2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Testng will be used to build roobust utilities with framework..check whatever selenium returns is tryue or false

public class End2End {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		driver.manage().window().maximize();
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());		

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

//count number of checkboxes  find common locator  

driver.findElements(By.xpath("//div[@id='discount-checkbox']/div")).size();
System.out.println(driver.findElements(By.xpath("//div[@id='discount-checkbox']/div")).size());

//common css locator for all even in future
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(3000);
driver.findElement(By.id("hrefIncAdt")).click();

  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
  
  for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
  
  driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
