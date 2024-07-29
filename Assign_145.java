package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_145 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com"); 
		WebElement e1=driver.findElement(By.xpath("//span[.='Login']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.xpath("(//li)[1]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(e2).perform();
		e2.click();

	}

}
