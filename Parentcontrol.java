package Crossbroswer_parllelbrowser_188_189;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Parentcontrol extends Methods1{
	
	
	
	@Test
	public void parentcontrol()
	{
		
		WebElement s1=	driver.findElement(By.id("twotabsearchtextbox"));
		s1.sendKeys("shoe" + Keys.ENTER);
		WebElement s2= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		s2.click();
		Set<String> s3=driver.getWindowHandles();
		Iterator<String> s5=	s3.iterator();
		String s6=s5.next();
		String s7=s5.next();
		driver.switchTo().window(s7);
		WebElement s8=	driver.findElement(By.id("add-to-cart-button"));
		s8.sendKeys(Keys.ENTER);
		WebElement s9=	driver.findElement(By.name("proceedToRetailCheckout"));
		s9.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
