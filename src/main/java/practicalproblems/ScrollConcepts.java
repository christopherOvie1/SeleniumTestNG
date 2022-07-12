package practicalproblems;

import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");
		//driver.get("http://automationpractice.com/index.php");
		
		
		//cast driver to javascript esexacutor so driver can go ahead and execute javascript
		
		JavascriptExecutor  js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0, 500)");
		
		//scroll on the table i
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//sum them
		
	List<WebElement>	value=driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
	
	int sum =0;
	for(int i =0;i<value.size();i++) {
		value.get(i).getText();                  //get the integer bc it returns a string''convert to intreger and sum..convert string  to integer
		
	sum=sum+Integer.parseInt(value.get(i).getText());
	//	System.out.println(Integer.parseInt(value.get(i).getText()));  it is working	
	//System.out.println(sum);
	}
		System.out.println(sum);
		driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
		driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim(); //still a string..now convert to integer
		
int total=Integer.parseInt(driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());
System.out.println(total);
Assert.assertEquals(sum, total);
	
	//String str = "7";
	
	 // int number = Integer.parseInt(str);
      //System.out.println(number);
	}

}
