package ecommerceApp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
      driver.get("https://rahulshettyacademy.com/loginpagePractise/");
      
      
   //   String emailId= "mentor@rahulshettyacademy.com";
      driver.findElement(By.cssSelector("a[class='blinkingText'")).click();
      
      //give knowledge to selenium to switch to another window or new tab..new tab treated by selenium as new windows only
      //get numners of windows
    Set <String> windows=  driver.getWindowHandles(); //parentid and childid window
    
    //switch to child to get emailid..to get the child window use iterator
   Iterator <String> it= windows.iterator();  //the variable it goes to extract the value present in set collection
  String parentId= it.next();  //first next control goes to zero index or parent
 String childId= it.next();
    driver.switchTo().window(childId);
  System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0]);
   String emailId= driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
   driver.switchTo().window(parentId);
   driver.findElement(By.id("username")).sendKeys(emailId);
    
    
	}

}
