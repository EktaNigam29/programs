package Crossbroswer_parllelbrowser_188_189;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Hoverover extends Methods1{
		@Test
		public void hoverover()
		{
			
		WebElement s1=	driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(s1).perform();
		
	
	
		}
	
	

}
