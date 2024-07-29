package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_registartion_and_160 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("ekta");
		WebElement lastname=driver.findElement(By.name("lname"));
		lastname.sendKeys("nigam");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("nigam.ekta29@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Nissan@2025");
		
		WebElement female=driver.findElement(By.id("Female"));
		female.click();
		//boolean b=female.isSelected();
		//System.out.println(b);
		WebElement male=driver.findElement(By.id("male"));
		male.click();
		//WebElement skills=driver.findElement(By.xpath("//label[.='Skills']"));
		//skills.click();
		/*WebElement skill=driver.findElement(By.id("Skills"));
		Select s1=new Select(skill);
		s1.selectByVisibleText("Select an Skill");
		s1.selectByValue("Technical Skills");*/
	
		WebElement present_address=driver.findElement(By.name("Present-Address"));
		present_address.sendKeys("F-1000");
		WebElement permanent_address=driver.findElement(By.name("Permanent-Address"));
		permanent_address.sendKeys("F-202");
		WebElement pincode=driver.findElement(By.name("Pincode"));
		pincode.sendKeys("202001");
		WebElement chosefile =driver.findElement(By.name("file"));
		chosefile.sendKeys("C:\\Users\\EKTA\\Downloads\\GTM Logo.JPG");//location\\filename\\ext
		//chosefile.sendKeys("C:\\Users\\EKTA\\Downloads\\department table.png");
		//Thread.sleep(200);
//driver.navigate().refresh();
		
		//driver.get("C:\\Users\\EKTA\\Downloads");
		//driver.get("C:\\Users\\EKTA\\Downloads\\GTM Logo.JPG");
		//sendkeys(Keys.ENTER);
		
	
	
		/*WebElement relocate=driver.findElement(By.name("relocate"));
		relocate.click();
		WebElement submit=driver.findElement(By.name("Submit"));
		submit.sendKeys(Keys.ENTER);*/
		
		
		
		
			

	}

	private static void sendkeys(Keys enter) {
		// TODO Auto-generated method stub
		
	}

}
