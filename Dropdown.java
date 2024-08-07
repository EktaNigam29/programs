package Crossbroswer_parllelbrowser_188_189;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Methods1 {

	
	@Test
	public static void dropdown()
	{
		
		WebElement s1=	driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s2= new Select(s1);
		s2.selectByVisibleText("Appliances");
		WebElement s3=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		s3.sendKeys("sandwich maker" + Keys.ENTER);
		
		
	}
	
	
	
}
