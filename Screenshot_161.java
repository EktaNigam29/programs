package basics.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_161 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot a1=driver;
		File source= a1.getScreenshotAs(OutputType.FILE);//using which method we take ss in a selinum whuch is one of abstract method of takesscreenshot interface
		//File destination =new File("C:\\Users\\EKTA\\Downloads\\Screenshots\\ekta.png");
		File destination =new File("C:\\Users\\EKTA\\Downloads\\Screenshots\\ekta"+Math.random()+".png");
		FileHandler.copy(source, destination);//static method();

	}

}
