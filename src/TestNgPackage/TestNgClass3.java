package TestNgPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class TestNgClass3 {
	
	@Test
	
	public void WebLoginCarLoan(String urname, String unmae)

	{
		System.out.println("Web login car loan ");
		System.out.println(urname);
		System.out.println(unmae);
	}
	@Test
	public void MobileLoginCarLoanA()

	{
		System.out.println("Mobile login car loan 1");
	}
	@Test
	public void MobileLoginCarLoanB()

	{
		System.out.println("Mobile login car loan 2");
	}

	@Test
	public void MobileLoginCarLoanC()

	{
		System.out.println("Mobile login car loan 3");
	}

//	@Test(dependsOnMethods={"WebLoginCarLoan"})
	public void APILoginCarLoan()

	{
		System.out.println("API login car loan");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("it will execute first any condition than other test cases");
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("before test suite execute before execution of all test modules");
	}
}
