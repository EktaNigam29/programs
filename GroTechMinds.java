package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroTechMinds {
	
	
	
	@Test
	public static void brokenlinks() throws IOException
	{
	ChromeDriver driver= new ChromeDriver();

	driver.get("https://grotechminds.com/");
	driver.manage().window().maximize();
	List<WebElement> e1=driver.findElements(By.tagName("a"));
	int count=e1.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		WebElement e2=e1.get(i);
		String url=e2.getAttribute("href");
		System.out.println(url);
		verify(url);
	}

}

public static void verify(String url) throws IOException
{try
{
	URL u1=new URL(url);
	HttpURLConnection  h1=(HttpURLConnection) u1.openConnection();
	if(h1.getResponseCode()==200)
	{
		System.out.println("it is a valid response" + "Response message  "+ h1.getResponseMessage()+ "response code  " + h1.getResponseCode());
	}
	else
	{
		System.out.println(" it is not a valid link"+ "Response message  "+ h1.getResponseMessage()+ "response code  " + h1.getResponseCode());
	}
}
catch(MalformedURLException a1)
{
	System.out.println("handled");
}
catch(ClassCastException a2)
{
	System.out.println("exception handled");
}
}
}
