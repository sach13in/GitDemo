package TestNgPackage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgClass7 {
	@Parameters({"url","username"})
	@Test
	public void TwoParameter2(String urlname, String uname)
	{
		System.out.println("TwoParameter2");
		System.out.println(urlname);
		System.out.println(uname);
	}
	@Test(dataProvider="getData")
	public void loan(String usernames ,String passwards)
	{
		System.out.println("loan method need to run 3 times with 3 different data");
		System.out.println(usernames);
		System.out.println(passwards);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
	//1st set of data
		data[0][0]="firstUsername";
		data[0][1]="firstPassward";
	//2nd set of data
		data[1][0]="secondtUsername";
		data[1][1]="secondPassward";
	//3rd set of data
		data[2][0]="thiredUsername";
		data[2][1]="thiredPassward";
		return data;
		
	}
	@Test
public void failingDta()
{
	System.out.println("intentionally failing this method");
	Assert.assertTrue(false);
}
}
