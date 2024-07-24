package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign144_hover_over {

	public static void main(String[] args) throws InterruptedException {
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[.='Hello, sign in'])")); 
		//WebElement login=driver.findElement(By.xpath("//span[.='Login'])")); 
			Actions a1=new Actions(driver);
			a1.moveToElement(login).perform();*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]//span"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement((e1)).moveToElement(e2).click().perform();

		

	}

}
