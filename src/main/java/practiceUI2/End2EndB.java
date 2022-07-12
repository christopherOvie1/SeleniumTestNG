package practiceUI2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
					//peudo code
					//1..select from otion city to to option city..select current date
					//2 enter passenger informatoion
					
					//going from delhi to chanai wiyth family and friemmds 2 or 3 passengers and click search
					//select one way  input[id*='_Trip_0']

					driver.findElement(By.cssSelector("input[id*='_Trip_0']")).click();
					
					driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
					
					//From
					driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL'] ")).click();	
					Thread.sleep(2000);
			  //To
					driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
					

					driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
					
					//check if return button is disabled
					
					 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
						 System.out.println("it is disabled");
						 Assert.assertTrue(true); 
						 }
					 else {
						 Assert.assertTrue(false);
					 }
					 //select checkbox
					driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
					
					Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
					dropdown.selectByIndex(3);
					
					//driver.findElement(By.id("btnclosepaxoption")).click();	
					//select numbers of passengers
					driver.findElement(By.id("divpaxinfo")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("hrefIncAdt")).click();
					
					for(int i=2;i<5;i++) {
						driver.findElement(By.id("hrefIncAdt")).click();
					}
					
					Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				       
				       
					driver.findElement(By.cssSelector("input[id*='FindFlights'][value='Search']")).click();
					
					
					
					
		
	}

}
