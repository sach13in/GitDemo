package TestNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNgClass2 {
	@Test(groups= {"smoke"})
	public void day3()
	{
		System.out.println("2nd class first method");
	}
	@Test
	public void day4()
	{
		System.out.println("2nd class second method");
	}
	// this execute before each test method it will execute like before 1st test method executes this @BeforeMethod executes
	//like "n- test method executes n-@Beforemethod
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This method will execute before each test method");
	}
// this execute after each test method it will execute like after 1st test method executes this @AfterMethod executes 
	//like "n- test method executes n-@Aftermethod
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After each test method execution this execute ");
	}
	

}
