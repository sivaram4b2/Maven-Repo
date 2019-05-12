package TestNgPractice.TestNgPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	

	
	@BeforeTest
	
	public void BeforeTest()
	{
		System.out.println("1Before Test");
	}
	
	@AfterTest
	
	public void AfterTest()
	{
		System.out.println("1After Test");
	}
	
	
	@Test
	
	public void Test1()
	{
		System.out.println("1Test1 Group");
	}
	
	@Test
	
	public void Test2()
	{
		System.out.println("1Test2 Group");
	}
	
	@BeforeClass
	
	public void BeforeClass()
	{
		System.out.println("1Before class");
	}

     @org.testng.annotations.AfterClass
	
	public void Afterclass()
	{
		System.out.println("1After class");
	}
     
 	@BeforeMethod
	
 	public void BeforeMethod()
 	{
 		System.out.println("1Before Method");
 	} 

	@AfterMethod
	
 	public void AfterMethod()
 	{
 		System.out.println("1After Method");
 	} 


}
