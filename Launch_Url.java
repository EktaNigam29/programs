package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Url {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		//driver.quit();
		System.out.println(driver.getWindowHandle());
System.out.println(driver.getWindowHandles());

	}

}
