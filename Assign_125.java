package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_125 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("ektamurarka81@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Nissan@2025");
		WebElement login=driver.findElement(By.name("login"));
		//login.sendKeys(Keys.ENTER);
		login.click();
		
		
		
		
	}

}
