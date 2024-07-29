package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign158_javapopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//button[.='Click']"));
		e1.click();
		
		Thread.sleep(200);
		e1.click();
		driver.switchTo().alert().accept();//accept the java script pop up
		e1.click();
		

}
}
