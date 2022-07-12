package ecommerceApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptimisedCalender {

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
        //arrow for next month
        
      //  driver.findElement(By.cssSelector("div[class= 'datepicker-days']  th[class='datepicker-switch']")).getText().contains("June");

        while(!driver.findElement(By.cssSelector("div[class= 'datepicker-days']  th[class='datepicker-switch']")).getText().contains("June")) {
        	driver.findElement(By.xpath("div[class='datepicker-days'] th[class='next']")).click();
        }
    List<WebElement> dates= driver.findElements(By.cssSelector("td[class='new day']"));
    
    
    //get common attribute put into list and iterate
    //get count of alldates
          System.out.println(driver.findElements(By.cssSelector("td[class='new day']")).size());
       int count=   driver.findElements(By.cssSelector("td[class='new day']")).size();
          
          for(int i =0;i<count;i++) {
        String text= driver.findElements(By.cssSelector("td[class='new day']")).get(i).getText();
        if(text.equals("31")) {
        	driver.findElements(By.cssSelector("td[class='new day']")).get(i).click();
        	break;    //while iterating to waste execution time  optimise your code
        }
          }
  
    //https://jqueryui.com/datepicker/#date-range   fior date

	}

}
