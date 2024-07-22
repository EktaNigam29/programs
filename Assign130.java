package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign130 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();//google search next step ElementNotInteractableException
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
/*
 first launchbrowser
  second launch website
  third maximize which is optional
 fourth type India in search component
 fifth click on google search as getting exception
 sixth use key functionality to get imaginary keyboard and use Enter
 
  
 */
 
	}

}
