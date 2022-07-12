package ecommerceApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //provide month name and date name..break it into chains.
        
        //click on search bar to open it
        //ez-accept-all
        
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.id("travel_date")).click();

    List<WebElement> dates= driver.findElements(By.cssSelector("td[class='new day']"));
    
    //get count of alldates
          System.out.println(driver.findElements(By.cssSelector("td[class='new day']")).size());
       int count=   driver.findElements(By.cssSelector("td[class='new day']")).size();
          
          for(int i =0;i<count;i++) {
        String text= driver.findElements(By.cssSelector("td[class='new day']")).get(i).getText();
        if(text.equals("30")) {
        	driver.findElements(By.cssSelector("td[class='new day']")).get(i).click();
        	break;    //while iterating to waste execution time  optimise your code
        }
          }
  
    
    
	}

}
