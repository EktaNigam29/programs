package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_134 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//WebElement customer_service= driver.findElement(By.linkText("Customer Service"));
WebElement customer_service= driver.findElement(By.partialLinkText("Service"));
customer_service.click();
//WebElement mobiles= driver.findElement(By.linkText("Mobiles"));
WebElement mobiles= driver.findElement(By.partialLinkText("Mob"));
mobiles.click();


	}

}
