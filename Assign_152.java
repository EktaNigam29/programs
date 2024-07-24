package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_152 {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
	for(int i=1; i<=12;i++)
	{e1.sendKeys(Keys.ARROW_DOWN);
	}
	
	//e1.sendKeys(Keys.ARROW_DOWN);
	//e1.sendKeys(Keys.ARROW_DOWN);
	//e1.sendKeys(Keys.ARROW_DOWN);
	
	
WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
e2.sendKeys("action and adventure");
e2.sendKeys(Keys.ENTER);

	
}
}

