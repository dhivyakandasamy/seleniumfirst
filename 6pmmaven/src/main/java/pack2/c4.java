package pack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c4 {
	
	@Test(groups="Two")
	public void t4() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		
		//2 types of sliders
		
		// horizontal slider:  move along x axis, y value will be 0
		// vertical slider  :  move along y axis, x value will be 0
		
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		
		WebElement ele = ob.findElementById("slider");
		
		ac.dragAndDropBy(ele, 40, 0).build().perform();
		Thread.sleep(3000);
		ob.quit();
	}

}
