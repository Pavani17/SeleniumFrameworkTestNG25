package testNGDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test (groups= {"smoke"})
	public void demo2()
	{
		System.out.println("from demo2 method in demo2 class");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("will execute first from this test folder before executing any class file");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data =new Object[3][2];
		data[0][0]="fname";
		data[0][1]="fpwd";
		data[1][0]="sname";
		data[1][1]="spwd";
		data[2][0]="tname";
		data[2][1]="tpwd";
		return data;
	}
	@Test(dataProvider="getData")
	public void Login(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}

}
