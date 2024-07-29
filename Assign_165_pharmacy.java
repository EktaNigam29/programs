package basics.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign_165_pharmacy {
public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		WebElement s1=driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-igKcZLf-css']"));
	s1.click();
WebElement s2=driver.findElement(By.id("topBarInput"));
	s2.sendKeys("soaps");
	Thread.sleep(5000);
	List<WebElement> e1=driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iioqier-css']/a"));
	int count=e1.size();
	e1.get(count-8).click();
	System.out.println(count);
	}
}

