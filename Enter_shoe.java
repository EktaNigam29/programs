package Crossbroswer_parllelbrowser_188_189;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Enter_shoe extends Methods1{
	
	
	
	
	@Test
	public void shoe()
	{
		
	WebElement s1=	driver.findElement(By.id("twotabsearchtextbox"));
	s1.sendKeys("shoe" + Keys.ENTER);
	}


}
