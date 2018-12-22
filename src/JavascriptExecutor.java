import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptExecutor {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/disableddemo.html");
		org.openqa.selenium.JavascriptExecutor je = (org.openqa.selenium.JavascriptExecutor)driver;
		je.executeScript("document.getElementById('t1').value='Sandeep'");
		Thread.sleep(3000);
		WebDriver driver1=new ChromeDriver();
driver1.get("https://www.facebook.com/");
WebElement ele = driver1.findElement(By.xpath("//span[contains(text(),'Facebook')]"));
int xval = ele.getLocation().getX();
int yval = ele.getLocation().getY();
org.openqa.selenium.JavascriptExecutor loc=(org.openqa.selenium.JavascriptExecutor)driver1;
loc.executeScript("window.scrollBy("+xval+","+yval+")");
	}

}
