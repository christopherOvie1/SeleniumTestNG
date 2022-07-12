package ecommerceApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameConceptTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
       //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
     driver.get("https://jqueryui.com/droppable/");
     
    System.out.println(driver.findElements(By.tagName("iframe")).size());//count number of frame
    driver.switchTo().frame(0);  //0 index is ist frame   now only one frame present
    // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
     
     
     Actions  action = new Actions(driver);
     
    
     
              WebElement source=driver.findElement(By.id("draggable"));
                WebElement target=driver.findElement(By.id("droppable"));
                
                action.dragAndDrop(source, target).build().perform();
                
                driver.switchTo().defaultContent();
     
     
	}

}
