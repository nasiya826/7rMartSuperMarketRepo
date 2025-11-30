package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();
//object is constant because final is used
	public synchronized static ExtentReports createExtentReports() {
	    ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
//to create folder and file
	    reporter.config().setReportName("SevenRMartSuperMarket");

	    extentReports.attachReporter(reporter);
	    extentReports.setSystemInfo("Organization", "Obsqura");
	    extentReports.setSystemInfo("Name", "Nasiya");

	    return extentReports;
	    //to customized html report generate
	
	}

}
