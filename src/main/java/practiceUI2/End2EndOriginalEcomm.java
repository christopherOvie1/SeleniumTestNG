package practiceUI2;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class End2EndOriginalEcomm {

	public static void main(String[] args) throws InterruptedException {
		//  everyday new products are added  check if they are added to cart or not

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
     	int j = 0;

		// pseudo check whether name extracted is present in array or not
		// 2convert array into arraylist foe rasy search..array take less memmoy..run
		// tome convert to attrraylist
//Brocolli
		String itemsNeeded[] = {"Cucumber", "Brocolli", "Beetroot","Cauliflower","Beans"};//dynamic array
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
Thread.sleep(3000);
		// add cucumber to ur cart a goal

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
