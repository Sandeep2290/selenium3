package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@Test(priority=3)//fourth
	public void tst1()
	{
		System.out.println("Script 1");
	}
	@Test(priority=4)//fifth
	public void tst5()
	{
		System.out.println("Script 5");
	}
	
	@Test(dependsOnMethods={"tst4","tst2"})//third
	public void tst3()
	{
		System.out.println("Script 3");
	
	}
	@Test(priority=1)//first
	public void tst2()
	{
		System.out.println("Script 2");
	}
	@Test(priority=2)//second
	public void tst4()
	{
		System.out.println("Script 4");
	}
	

}
