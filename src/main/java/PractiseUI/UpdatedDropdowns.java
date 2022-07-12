package PractiseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().timeouts().implicitlyWait(Time)
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncAdt")).click();
	//difference betw forloop and whileloop ibstead of writing in pieces wroite in one single line
		
	/*	int i =1;    //initialise then2..compare..3  increment 
		while(i<5) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}*/
		//before loop check how many adult selected
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=2;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
       driver.findElement(By.id("btnclosepaxoption")).click();		

     //after loop check how many adult selected
       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       
	}

}
