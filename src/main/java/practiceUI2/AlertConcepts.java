package practiceUI2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertConcepts {

	public static void main(String[] args) throws InterruptedException {

		// first declare a string..

		String text = "chris";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");

		// input[id='name']

		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(text);
		// alertbtn
		driver.findElement(By.id("alertbtn")).click();
		// accept the alert

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		// Assert.assertEquals("driver.switchTo().alert().getText()", "Hello chris,
		// share this practice page and share your knowledge");

		// go to confirm
		driver.findElement(By.id("confirmbtn")).click();
		// reuse same step
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
