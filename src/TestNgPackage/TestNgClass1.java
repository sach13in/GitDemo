package TestNgPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;


public class TestNgClass1 {
	@Test
	public void parameter(String urlname)
	{
		System.out.println("parameter method");
		System.out.println(urlname);
		
	}
	@AfterTest
// this code will execute after execution completion the whole test module ,
	//i,e the module where "@AfterTest" is there not wait to complete anothe test module
//example: this @AfterTest present "pesonal loan" module it will execute After test case execution of "personal loan
	
// @AfterTest will not execute after "car loan" test module 
//because its scope is for that "specific test module'
	public void Lastexecution()
	{
		System.out.println("if you write at first line of class but it will execute at last");
	}
@Test(groups= {"smoke"})
public void day1()
{
	System.out.println("1st class 1st method");
}
@Test
public void day2()
{
	System.out.println("1st class 2nd method");
}
@AfterSuite
// this code will execute after execution of all test modules i,e whole test case execution
//the scope of "@AfterSuite" will be entire xml file
public void AfterSuite()
{
	System.out.println("after test suite execute after execution of all test modules");
}
}
