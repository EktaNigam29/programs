package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_141 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
	WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
	firstname.sendKeys("Ekta");
	firstname.click();
	WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
	lastname.sendKeys("Nigam");
	lastname.click();
	WebElement middleman=driver.findElement(By.xpath("//input[@id='MiddleName']"));
	 middleman.sendKeys("Abhishek");
	 middleman.click();
	 WebElement work_place=driver.findElement(By.xpath("//textarea[@id='Work-Place-Address']"));
	 work_place.sendKeys("grotechminds banglore");
	 work_place.click();
	 WebElement home=driver.findElement(By.xpath("//textarea[@id='home-address']"));
	 home.sendKeys("F-202");
	 home.click();
	 WebElement email1=driver.findElement(By.xpath("//input[@id='Personal-Email']"));
	 email1.sendKeys("ektamurarka81@gmail.com");
	 email1.click();
	 WebElement email=driver.findElement(By.xpath("//input[@id='Corporate-email']"));
	 email.sendKeys("ekta@grotechminds.com");
	 email.click();
	 WebElement number=driver.findElement(By.xpath("//input[@id='tel']"));
	number.sendKeys("9560044390");
	number.click();
	 WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	
	submit.click();
	 
	 

	}

}
