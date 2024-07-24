package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_156 {

	public static void main(String[] args) {
		FirefoxDriver driver = new 	FirefoxDriver ();
		driver.navigate().to("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
	e1.click();
	boolean g=	e1.isSelected();
	System.out.println(g);
		

	}

}
