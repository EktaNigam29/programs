package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_164_rightclick_notworking {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	WebElement a1=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
a1.click();
WebElement a2=	driver.findElement(By.id("username"));
a2.sendKeys("ekta");
a2.click();
WebElement a3=	driver.findElement(By.id("label2"));
a3.sendKeys("ekta");
a3.click();

	}

}
