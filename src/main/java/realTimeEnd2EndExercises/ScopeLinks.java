package realTimeEnd2EndExercises;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
       
       //requiremet is 1..give me the count of the links of the page....
       //know every link has a tag or anchor a..use the logic to get 
       
       
       System.out.println(driver.findElements(By.tagName("a")).size());
       driver.findElements(By.tagName("a"));
       
       //2nd requirement  get count of links in footer page
       
    WebElement footerDriver=   driver.findElement(By.id("gf-BIG"));
    System.out.println(footerDriver.findElements(By.tagName("a")).size());
    
    
   List<WebElement> links= footerDriver.findElements(By.tagName("a"));
   
   //get all links
   for(int i=0;i<links.size();i++) {
	   System.out.println(links.get(i).getText());
   }
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
   //requirement  number 3   get links of first column
   WebElement columnDriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
  System.out.println(columnDriver.findElements(By.tagName("a")).size());
   
  //4 requirement click on each link on the cpolumn and check if page is opening or links are working
  //what if site is dynamic
  for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++) {
   
	 String clickOnLink= Keys.chord(Keys.CONTROL,Keys.ENTER);    //open a link select control an..
	 //let it open on different tabs...keyboard events..whenever there is keyboard events pass them ion sendkeyds
	  columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink); 
	  
	  //requirement 2..get  the title of each page and print it
	  
	  Thread.sleep(5000);
  }
          //open all tabs
	       Set<String> abc=  driver.getWindowHandles();
	   Iterator<String> it=    abc.iterator();   //iterator helps to move to every window
	   //it has 5 windows now   //while continues executing loop until condion is false
	  while(it.hasNext()){  //put while loop so it keeps increasing //hasnext tells if window is present or not
		 
		 driver.switchTo().window(it.next());    //it.next moves to next index oer window
		 System.out.println(driver.getTitle());
		 
	  }
	   
	   //interview questio  how did you optimise  or outsnding..we had 30 links and had to validate all 30 links
	  //we have a script to click every links and wait 5 minutes i brought concept like this where every link is opening in seperate tabs and gradually
	  //decreased the time from 15 minutes to one minute
	   
	  
  	  
	
 
 
  
  
	}
}
