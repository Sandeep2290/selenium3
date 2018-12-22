import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
		public static void main(String[] args) throws Throwable {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			org.openqa.selenium.TakesScreenshot t=(org.openqa.selenium.TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File des = new File("./Screenshots/facebook.png");
			FileUtils.copyFile(src, des);

	}

}
