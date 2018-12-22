import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_WindowHandles {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
Set<String> add = driver.getWindowHandles();
System.out.println(add);
for(String loop:add)
{
	driver.switchTo().window(loop);
	String pagetitle = driver.getTitle();
	System.out.println(pagetitle);
	if(pagetitle.equals("Fullerton"))
	{
		driver.close();
	}
}
	}

}
