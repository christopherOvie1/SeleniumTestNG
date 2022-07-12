package ecommerceApp;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class End2EndEcomm {

	public static void main(String[] args) throws InterruptedException {
		//  everyday new products are added  check if they are added to cart or not

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
      String promoCode = "rahulshettyacademy";

		// pseudo check whether name extracted is present in array or not
		// 2convert array into arraylist foe rasy search..array take less memmoy..run
		// tome convert to attrraylist
//Brocolli
		String itemsNeeded[] = {"Cucumber", "Brocolli", "Beetroot","Cauliflower","Beans"};//dynamic array
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       // Thread.sleep(3000);
		addItems(driver,itemsNeeded);  //built utilitynadditem accept array of items
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys(promoCode);
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		//target specific element
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		//Select select = new Select(driver.findElement(By.id("")));
		//select.selectByValue(1);
		
		
	    }
	
	
	public static void addItems(WebDriver driver,String []itemsNeeded){
		
		int j = 0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
		
     // format it to get actual vegetable remove the 1kg..trim it
			// Brocolli - 1 Kg....split with hyphen to get two parts..Brocolli and 1KG
			// convert array itemsNeeded to arraylist
  //use //div[@class='product-action'] instead of text xpath bc it changes  //button[text()='ADD TO CART']
			List itemNeededList = Arrays.asList(itemsNeeded);
			

			if (itemNeededList.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (j ==itemsNeeded.length) {
					break;	
				}
				
			}
		
		}

		
	}

}
