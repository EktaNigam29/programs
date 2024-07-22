package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_registartion {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("ekta");
		WebElement lastname=driver.findElement(By.name("lname"));
		lastname.sendKeys("nigam");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("nigam.ekta29@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Nissan@2025");
		WebElement female=driver.findElement(By.id("Female"));
		female.click();
		WebElement male=driver.findElement(By.id("male"));
		male.click();
		WebElement present_address=driver.findElement(By.name("Present-Address"));
		present_address.sendKeys("F-1000");
		WebElement permanent_address=driver.findElement(By.name("Permanent-Address"));
		permanent_address.sendKeys("F-202");
		WebElement pincode=driver.findElement(By.name("Pincode"));
		pincode.sendKeys("202001");

		
		driver.get("C:\\Users\\EKTA\\Downloads");
		driver.get("C:\\Users\\EKTA\\Downloads\\GTM Logo.JPG");
		sendkeys(Keys.ENTER);
		
	
	
		WebElement relocate=driver.findElement(By.name("relocate"));
		relocate.click();
		WebElement submit=driver.findElement(By.name("Submit"));
		submit.sendKeys(Keys.ENTER);
		
		
		
		
			

	}

	private static void sendkeys(Keys enter) {
		// TODO Auto-generated method stub
		
	}

}
