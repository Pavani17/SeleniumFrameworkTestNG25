package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {


	public  static ExtentReports getReportConfig() {
		String filePath = System.getProperty("user.dir") + "//reports//extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
		reporter.config().setDocumentTitle("Sanity Test Results");
		reporter.config().setReportName("Automation results");

		ExtentReports	extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Engineer", "Pavani");
		return extent;

	}
}
