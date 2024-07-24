package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_157 {

	public static void main(String[] args) throws InterruptedException {
		/*ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/EKTA/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("121"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());*/
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		if(e1.isDisplayed() && e1.isEnabled())
				Thread.sleep(200);
				{
			
			e1.click();
				}
				
	}

}
