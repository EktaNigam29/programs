package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_153 {

	public static void main(String[] args) {
		

		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
WebElement p=		driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
p.sendKeys("baglore");
p.sendKeys(Keys.CONTROL + "a");
p.sendKeys(Keys.CONTROL + "c");
WebElement p1=		driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));

p1.sendKeys(Keys.CONTROL + "v");
		
		

	}

}
