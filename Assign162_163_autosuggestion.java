package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
////div[@class='OBMEnb']/ul/li
//twotabsearchtextbox
//
public class Assign162_163_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*WebElement s1=	driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		s1.sendKeys("India");
		Thread.sleep(6000);
		List<WebElement> auto=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count =auto.size();
		System.out.println(count);
		//auto.get(4).click();//5th element
		//auto.get(9).click();//10th element
		//auto.get(0).click();//1st element
		//auto.get(count-10).click();//1st element
		auto.get(count-1).click();//10th element*/
		
		/*WebElement s1=driver.findElement(By.id("twotabsearchtextbox"));
		s1.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> s2=driver.findElements(By.xpath("//div[@class='//div[@class='left-pane-results-container']/div/div']"));

int count=s2.size();
System.out.println(count);
s2.get(count-6).click();*/
		WebElement s1=driver.findElement(By.id("twotabsearchtextbox"));
		s1.sendKeys("lights");
		Thread.sleep(2000);
		List<WebElement> s2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=s2.size();
		s2.get(count-6).click();


	}

}
