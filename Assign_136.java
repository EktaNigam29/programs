package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_136 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		//WebElement First_name=driver.findElement(By.name("firstName"));
		//First_name.sendKeys("Ekta");
		//WebElement First_name=driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[1]"));
		//First_name.sendKeys("Ekta");(//input)[2]
				WebElement First_name=driver.findElement(By.xpath("(//input)[2]"));
				First_name.sendKeys("Ekta");
		
		WebElement last_name=driver.findElement(By.name("lastName"));
		last_name.sendKeys("Nigam");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("nigam.ekta29@gmail.com");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9899542311");
		WebElement aadhaar=driver.findElement(By.name("aadhaar"));
		aadhaar.sendKeys("98995423112356");
		WebElement pan=driver.findElement(By.name("pan"));
		pan.sendKeys("989954231123563");
		WebElement submit=driver.findElement(By.name("terms"));
		submit.click();
		

	}

}
