package basics.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign168_controlnaukri {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		WebElement s1=driver.findElement(By.xpath("//span[.='Google']"));
		s1.click();
		System.out.println(driver.getWindowHandles());
		Set<String>s3=	driver.getWindowHandles();
		Iterator<String>	s4=s3.iterator();
		String parenttab=	s4.next();
		String childtab=s4.next();
		driver.switchTo().window(childtab);
		//driver.close();
WebElement s2=	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		s2.sendKeys("ekta@grotechminds.com");
		s2.sendKeys(Keys.ENTER);
		

	}

}
