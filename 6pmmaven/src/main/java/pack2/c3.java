package pack2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		// multiple options can be selected
		//method1
		
		/*ob.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		
		ob.findElementById("benzcheck").click();
		Thread.sleep(3000);
		
		ob.findElementById("hondacheck").click();
		Thread.sleep(3000);*/
		
		List<WebElement> ele = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		
		for(WebElement x: ele)
		{
			if(x.isDisplayed())
			{
			x.click();
			}
			
			
		}
		Thread.sleep(2000);
		ob.quit();
	}
}
