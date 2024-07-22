package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_135_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/EKTA/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("(/html/body/input)[1]"));
username.sendKeys("Ekta");
WebElement Hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
Hint.sendKeys("Nigam");
WebElement password=driver.findElement(By.xpath("(/html/body/input)[3]"));
password.sendKeys("Nissan@2024");
WebElement Your_First_name=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
Your_First_name.sendKeys("Ekta");
//WebElement Your_Last_name=driver.findElement(By.xpath("((/html/body/form)/input)[2]"));
//Your_Last_name.sendKeys("Nigam");
//WebElement submit=driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
//submit.click();

WebElement boy=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
boy.click();
WebElement girl=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
girl.click();
WebElement baby=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
baby.click();
//WebElement submit=driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));
//submit.click();
WebElement male=driver.findElement(By.xpath("(/html/body/input)[4]"));
male.click();
WebElement female=driver.findElement(By.xpath("(/html/body/input)[5]"));
female.click();
WebElement locate=driver.findElement(By.xpath("(/html/body/input)[6]"));
locate.click();
WebElement know =driver.findElement(By.linkText("Click to know about us"));
know.click();



}

}
