package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettilte_129 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();//not important
		System.out.println(driver.getTitle());
		

	}

}
