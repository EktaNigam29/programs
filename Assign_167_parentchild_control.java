package basics.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_167_parentchild_control {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement s2=driver.findElement(By.id("twotabsearchtextbox"));
		s2.sendKeys("shoe");
		s2.sendKeys(Keys.ENTER);
		WebElement s1=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	s1.click();
	Set<String> s3=driver.getWindowHandles();
	
	Iterator<String> id=	s3.iterator();
	String pc=id.next();
	String cc=id.next();
	driver.switchTo().window(cc);
	//driver.close();
	
	
	
	}

}
