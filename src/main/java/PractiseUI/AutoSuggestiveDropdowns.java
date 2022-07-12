package PractiseUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(3000);
		//generic css  li[class='ui-menu-item']  a
	List<WebElement> options = 	driver.findElements((By.cssSelector("li[class='ui-menu-item'] a")));
	for(WebElement option : options) {
		if(option.getText().equalsIgnoreCase("Indonesia")) {
			option.click();
			break;
		}
		
	}
	}

}
