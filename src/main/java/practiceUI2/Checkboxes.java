package practiceUI2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public Checkboxes() {

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	}

}
