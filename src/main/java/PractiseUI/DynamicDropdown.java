package PractiseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();   
		////div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']   parent/child xpath
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR'] ")).click();
//give white space after parent xpath
		////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] 
		
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']  destination
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  
		////div[@class='dropdownDiv']/ul/li[8]
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
		
		//check if enabled or disabled

	}

}
