package testNGDemo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {

	@Test (groups= {"smoke"})
	public void WebLoginHomeLoan() {
		System.out.println("weblogin home loan");
	}

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("mobile home loan");
	}

	@Test(dependsOnMethods={"WebLoginHomeLoan","MobileLoginHomeLoan"})
	public void APILoginHomeLoan() 
	{
		System.out.println(" API login home loan");
	}
	
	@BeforeSuite
	public void suitebeforeTest()
	{
	System.out.println("No 1 executes first before suite and before test folders");	
	}
	@Parameters({"URLloc","APIKey"})
	@Test
	public void getParameters(String URLlocname,String key)
	{
		System.out.println(URLlocname);
		System.out.println(key);
	}
	
}
