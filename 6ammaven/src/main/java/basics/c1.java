package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	//file=> new=> project=> mave=> maven project=> create a simple maven
	// groupid, artifact id=> finish
	
	// project=> right click=> new=> package=> finish
	// package=> rightclick=> new => class=> finish
	
	// pom.xml => create <dependencies> </dependencies>
	//mvnrepository.com => selenium hq server standalone =>3.141.59=> copy
	// paste it inbetween dependencies tag
	@Test
	public void imp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println("hi");
		// get the screenshot : step 1
		// to perform copy paste=> FileUtils => apache directory studio common io
		// add dependency code of apache directory....   : step2 
		// copy paste the code                           : step3 
		File f = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\6ammaven\\screenshots\\before.png"));
		ob.findElementByLinkText("Images").click();
		File f1 = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\hp\\eclipse-workspace\\6ammaven\\screenshots\\after.png"));
		ob.quit();
	}
}
