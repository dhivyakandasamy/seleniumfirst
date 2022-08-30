package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c1 {
	
	// file=> new => project=> maven=> maven project-> create a simple=> groupid, artifct id=> finish
		// rightclick=> package-> class=> name=> finish
		//pom.xml=> create dependencies tag 
		// visit mvnrepository.com
		// search it as selenium hq server standalone
		// selenium java=> 3.141.59=> copy 
		// paste it inbetween dependencies tag 
	
	
	
	@Test(groups="One")
	public void t1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//step1: taking screenshot and storing it in a file 
		//step2: adding apache directory studio common io jar in pom.xl 
		//step3: copy pasting
		//FileUtils=> static 
		File f = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\6pmmaven\\screenshots\\before.png"));
		
		WebElement ele = ob.findElementByName("q");
		
		Actions ac= new Actions(ob);
		ac.click(ele).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
		
		File f1 = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\hp\\eclipse-workspace\\6pmmaven\\screenshots\\after.png"));
	    Thread.sleep(3000);
	    ob.quit();
	}

	
	
}
