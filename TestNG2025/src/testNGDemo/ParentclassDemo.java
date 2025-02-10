package testNGDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ParentclassDemo {
	
	@BeforeTest
	
	public void beforeRunParent()
	{
		System.out.println("from parent class before method");
	}
	
	public void dothisParent()
	{
		System.out.println("from parent class method");
	}
	
	
	@AfterTest
	public void afterRunParent()
	{
		System.out.println("run me last");
	}

}
