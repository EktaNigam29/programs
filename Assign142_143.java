package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign142_143 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
WebElement c1=driver.findElement(By.id("searchDropdownBox"));
Select s1=new Select(c1);
s1.selectByVisibleText("Books");
WebElement search=driver.findElement(By.id("nav-search-submit-button"));
search.click();

//s1.selectByValue("search-alias=appliances");
//s1.selectByIndex(1);



	}

}
