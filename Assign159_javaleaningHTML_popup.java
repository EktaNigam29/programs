package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign159_javaleaningHTML_popup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/EKTA/OneDrive/Desktop/learningHTML1.html");
		driver.switchTo().alert().accept();
		WebElement e2=driver.findElement(By.name("fname"));
		e2.sendKeys("ekta");

	}

}
