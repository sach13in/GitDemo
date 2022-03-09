package TestNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNgClass4 {
	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("class 4 first method");
	}
	@Test
	public void method2()
	{
		System.out.println("class 4 second method");
	}
	@Test
	public void method3()
	{
		System.out.println("class 4 thired method");
	}
	@Test
	public void method4()
	{
		System.out.println("class 4 fourth method");
	}
	@BeforeClass
//this code executes before these 4 methods execute
	public void BeforeClass()
	{
		System.out.println("befor class execute before execution of all method present in this class");
	}
	@AfterClass
//this code executes after these 4 methods execute
	public void AfterClass()
	{
		System.out.println("After class execute after execution of all method present in this class");
	}
	//the two annotation depends on 'class level-- scope class level
	//1) @BeforeMethod, @AfterMethod
	//2) @BeforeClass,@AfterClass
	
// @BeforeSuite,@AfterSuite and @BeforeTest,@AfterTest depends on TestNG xml file-- scope on testng xml file
	
//  @BeforeTest,@AfterTest--scope in xml file only that test module where these before and after test was declared
	// @BeforeSuite,@AfterSuite--scope oon whole xml file--all test modules comes under suite
}
