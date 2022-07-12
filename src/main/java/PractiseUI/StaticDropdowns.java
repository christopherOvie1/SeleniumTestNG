package PractiseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropdown.selectByIndex(3);
	}

}
