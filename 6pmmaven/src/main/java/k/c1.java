package k;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class c1 {
// regsitering :  hub as server : 
// registering :  node with the hub 
	//checking:   http://localhost:4444/grid/console 
	//register to a node   url=> remote system => select 
	// hub=> Desired cpap=> choosing desired os, browser , remove maching
	//       remote webdriver=> machine=> url and desired cap 
	
	WebDriver ob;
	@Test(priority=0)
	public void setup() throws MalformedURLException
	{
		
		String nodeurl="http://192.168.29.63:43568/wd/hub";
		DesiredCapabilities c= DesiredCapabilities.chrome();
				c.setBrowserName("chrome");
		        c.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 ob= new RemoteWebDriver(new URL(nodeurl),c);
		 ob.get("http://www.mycontactform.com");
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{
    ob.findElement(By.id("user")).sendKeys("Dhivyakarthi123");
    ob.findElement(By.id("pass")).sendKeys("12345");
	ob.findElement(By.className("btn_log")).click();
	Thread.sleep(3000);
}}
