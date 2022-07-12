package ecommerceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String text= "helloworld";
        
        Actions action = new Actions(driver);
       
        
      WebElement move=  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
     // action.moveToElement(move).build().perform();
      action.moveToElement(move).contextClick(move).build().perform();//right clicking
        //twotabsearchtextbox
      
   WebElement keysAction=driver.findElement(By.id("twotabsearchtextbox"));
   //action.moveToElement(keysAction).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
   
   //requirement to select entire text just double click
   action.moveToElement(keysAction).click().keyDown(Keys.SHIFT).sendKeys(text).doubleClick().build().perform();
        

	}

}
