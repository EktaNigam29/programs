package basics.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchofUrl 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());

}
}
