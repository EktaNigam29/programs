package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_155 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("shoe");
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);
e1.sendKeys(Keys.ENTER);


	}

}
