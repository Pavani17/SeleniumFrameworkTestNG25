package testNGDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {

	@Test(timeOut=4000)
	public void WebLoginPersonalLoan() {
		System.out.println("weblogin personal loan");
	}

	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("mobile personal loan");
	}
@Parameters({"URL"})
	@Test
	public void APILoginPersonalLoan(String urlname) {
		System.out.println(" API login personal loan");
		System.out.println(urlname);
	}

	@Test (groups= {"smoke"})
	public void testingTest() {
		System.out.println("trail test");
	}

	@AfterSuite
	public void aftersuiteTest() {
		System.out.println("executes after suite and after execution of all test folders in suite");
	}
}
