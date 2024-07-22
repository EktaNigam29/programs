package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_138 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//WebElement sign=driver.findElement(By.xpath("(//input)[5]"));
//sign.sendKeys("shoes");
//sign.sendKeys(Keys.ENTER);
//WebElement search=driver.findElement(By.xpath("(//input)[6]"));
//search.click();
//Amazon
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//WebElement sign_in=driver.findElement(By.xpath("(//input)[9]"));
		//sign_in.sendKeys("nigam.ekta29@gmail.com");
		//WebElement cont=driver.findElement(By.xpath("(//input)[12]"));
		//cont.sendKeys(Keys.ENTER);
		//facebook
		driver.get("https://www.facebook.com/");
		WebElement sign_in=driver.findElement(By.xpath("(//input)[3]"));
		sign_in.sendKeys("nigam.ekta29@gmail.com");
		WebElement pass=driver.findElement(By.xpath("(//input)[4]"));
		pass.sendKeys("Nissan@2024");
		WebElement log_in=driver.findElement(By.xpath("//button[@name='login']"));
		log_in.sendKeys(Keys.ENTER);
		

	}

}
