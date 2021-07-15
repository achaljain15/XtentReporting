package ExtentReportingHTML;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting {
	
	static String path="C:\\Users\\ssand\\eclipse-workspace\\ExtentReporting\\Reports\\Report.html";
	
	
	public static void main (String args[]) {
	ExtentHtmlReporter reporter= new ExtentHtmlReporter(path);
	ExtentReports repo = new ExtentReports();
	repo.attachReporter(reporter);
	
	ExtentTest test1=repo.createTest("Bakwaas");
	test1.pass("1 pass");
	test1.fail("2 fail");
	test1.skip("3 skipped");
	
	repo.flush();
}
}