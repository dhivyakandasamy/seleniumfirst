package pack1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {

	
	@Test(groups="One")
	public void t2() throws InterruptedException
	{
		//tab=> move cursor to the next element
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		WebElement ele = ob.findElementByName("user");
		
		Actions ac= new Actions(ob);
		ac.click(ele).sendKeys("hi").build().perform();
		//control+a
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//control+c
			ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//tab
			ac.sendKeys(Keys.TAB).build().perform();
			
			//control+c
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
					
					//tab
		ac.sendKeys(Keys.TAB).build().perform();
		
		//Enter
				ac.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(3000);
				ob.quit();
	}
}
