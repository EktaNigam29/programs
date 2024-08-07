package Crossbroswer_parllelbrowser_188_189;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Autosuggestion extends Methods1{
	
	
	
	
	@Test
	public void autoshoe() throws InterruptedException
	{
		
	WebElement s1=	driver.findElement(By.id("twotabsearchtextbox"));
	s1.sendKeys("shoe");
	Thread.sleep(2000);
	List<WebElement> s2=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	
	int count=s2.size();
	System.out.println(count);
	s2.get(count-5).click();
	
	}

}
