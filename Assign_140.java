package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_140 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
	WebElement card=	driver.findElement(By.xpath("//input[@name='cardNumber']"));
card.sendKeys("123456789");
card.click();
		WebElement date=	driver.findElement(By.xpath("//input[@name='expiryDate']"));
		date.sendKeys("12/2017");
		date.sendKeys(Keys.ENTER);
		WebElement c1=	driver.findElement(By.xpath("//input[@name='cvv']"));
		c1.sendKeys("2356");
		c1.sendKeys(Keys.ENTER);
		WebElement amount1=	driver.findElement(By.xpath("//input[@name='amount']"));
		amount1.sendKeys("235678");
		amount1.sendKeys(Keys.ENTER);
		
		WebElement amount=	driver.findElement(By.xpath("//input[@name='currency']"));
		amount.sendKeys("12000");
		amount.sendKeys(Keys.ENTER);
		WebElement check=	driver.findElement(By.xpath("//input[@name='saveCard']"));
		check.click();
		WebElement payment=	driver.findElement(By.xpath("(//input)[8]"));
		payment.click();
		
		
	}

}
