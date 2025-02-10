package Frameworks25.ExtentReports25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	ExtentReports extent;
	@BeforeTest
	public void reportConfig()
	{
		String filePath =System.getProperty("user.dir")+"//reports//extentreport.html";
		ExtentSparkReporter reporter =new  	ExtentSparkReporter(filePath);
		reporter.config().setDocumentTitle("Sanity Test Results");
		reporter.config().setReportName("Automation results");
		
 extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Engineer","Pavani");
		
	}
	@Test
	public void initialDemo()
	{
		ExtentTest test=extent.createTest("InitialDemo Test");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		test.fail("results not match");
		extent.flush();
		
	}

}
