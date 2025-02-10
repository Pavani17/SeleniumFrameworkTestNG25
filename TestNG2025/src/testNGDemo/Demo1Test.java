package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1Test {
	@BeforeMethod
	public void beforemethodTest()
	{
		System.out.println("I am method executes before every method of this class");
	}
	
	@AfterMethod
	public void aftermethodTest()
	{
		System.out.println("I am method executes after every method of this class");
	}
	@AfterTest
	public void lastexecution()
	{
		System.out.println("will execute last in this test folder");
	}
	@Test (groups= {"smoke"})
	public void demo1() {
		System.out.println("Hello TestNG");
	}

	@Test
	public void secondTest() {
		System.out.println("I am from second testcase in testng class");
	}
	
	@Test
	public void testfailListener()
	{
		Assert.assertTrue(false);
	}
	
}
