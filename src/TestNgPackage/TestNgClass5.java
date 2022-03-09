package TestNgPackage;

import org.testng.annotations.Test;

public class TestNgClass5 {
	@Test(enabled=false)
	public void MobileLoan()
	{
		System.out.println("mobile loan");
	}
	
	@Test
	public void CarLoan()
	{
		System.out.println("car loan");
	}
	@Test(dependsOnMethods= {"HomeLoan","CarLoan"})
	public void TwoWheelerLoan()
	{
		System.out.println("two wheeler loan");
	}
	
	
	@Test
	public void HomeLoan(String urlname, String uname)
	{
		System.out.println("home loan");
		System.out.println(urlname);
		System.out.println(uname);
	}

}
