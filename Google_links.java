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

public class Google_links {
	
	@Test
	public static void brokenlinks() throws IOException
	{
	ChromeDriver driver= new ChromeDriver();
	//driver.get("https://www.googlom");
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	List<WebElement> e1=driver.findElements(By.tagName("a"));
int count=	e1.size();
System.out.println(count);

for(int i=0;i<count;i++)
{
	WebElement e4=	e1.get(i);
	String url=e4.getAttribute("href");
	
	//System.out.println(url);
	verify(url);
}

}


public static void verify(String url) throws IOException
{
	try{
		URL u1=new URL(url);
	
	HttpURLConnection h1=(HttpURLConnection) u1.openConnection();//start connecting connection with each url
	
	if(h1.getResponseCode()==200)
	{
		System.out.println("It is valid link"+"RESPONSE MESSGAE   "+ h1.getResponseMessage()+ "RESPONSESTATUSCODE   "+h1.getResponseCode());
	}
	else
	{
		System.out.println("It is NOT valid link"+"RESPONSE MESSGAE   "+ h1.getResponseMessage()+ "RESPONSESTATUSCODE   "+h1.getResponseCode());
	}
}
catch(MalformedURLException a1)
{
	System.out.println("hadled");
}
}

}
