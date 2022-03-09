package TestNgPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgClass6 {
	@Test
	@Parameters({"url","username"})
	public void twoParameter(String urlname,String uname)
	{
		System.out.println("twoParameter");
		System.out.println(urlname);
		System.out.println(uname);
	}

}
