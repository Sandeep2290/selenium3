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

public class Annotationscript1 {
	@BeforeClass
	public void BeforeCls()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMtd()
	{
		System.out.println("BeforeMethod");
	}
	@AfterClass
	public void afterCls()
	{
		System.out.println("afterClass");
	}
	@AfterMethod
	public void aftermtd()
	{
		System.out.println("After Method");
	}
	@Test
	public void tst1()
	{
		System.out.println("Test1");
	}
	@BeforeSuite
	public void beforesut()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void aftersut(){
		System.out.println("After Suite");
	}
	@BeforeTest
	public void beforeTst()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void aftertst()
	{
		System.out.println("After Test");
	}

}
