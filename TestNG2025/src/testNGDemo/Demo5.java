package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo5 {
	@Test
	public void MobileLogin() {
		System.out.println("Mobile login");
	}

	@Test
	public void MobileLogout() {
		System.out.println("Mobile logout");
	}
	
	@Test
	public void MobileSearch()
	{
		System.out.println("mobile search");
	}
	
	
	@Test(enabled=false)
	public void WebTest()
	{
		System.out.println("webtest");
	}
	
	@Test (groups= {"smoke"})
	public void demoTest()
	{
		System.out.println("demo test");
	}
	
	@BeforeClass
	public void beforeclassTest()
	{
		System.out.println("executes first in class before execution of methods in class");
	}
	
	@AfterClass
	public void afterclassTest()
	{
		System.out.println("executes last in class after execution of  all methods in class");
	}
}
