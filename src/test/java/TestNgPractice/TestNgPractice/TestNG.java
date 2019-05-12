package TestNgPractice.TestNgPractice;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	
	@BeforeSuite
	
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	
	public void AfterSuite()
	{
		System.out.println("After suite");
	}
	
	@BeforeTest
	
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	
	@Test
	
	public void Test1()
	{
		System.out.println("Test1 Group");
	}
	
	@Test
	
	public void Test2()
	{
		System.out.println("Test2 Group");
	}
	
	@BeforeClass
	
	public void BeforeClass()
	{
		System.out.println("Before class");
	}

     @org.testng.annotations.AfterClass
	
	public void Afterclass()
	{
		System.out.println("After class");
	}
     
 	@BeforeMethod
	
 	public void BeforeMethod()
 	{
 		System.out.println("Before Method");
 	} 

	@AfterMethod
	
 	public void AfterMethod()
 	{
 		System.out.println("After Method");
 	} 

}
