package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_166 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement s1=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		s1.sendKeys("books");
		Thread.sleep(2000);
		List<WebElement> s2=	driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
int count=s2.size();
System.out.println(count);
s2.get(count-8).click();
	}

}
