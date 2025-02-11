package com.qa.tests;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportNG {
	
		static	ExtentReports extent;
		
			public static ExtentReports extentReportGenerator() {
			
				String Path=System.getProperty("user.dir")+"\\Reports\\"+File.separator+"extent.html";
				ExtentSparkReporter reporter=new ExtentSparkReporter(Path);
				reporter.config().setReportName("Extent Report");
				reporter.config().setDocumentTitle("Extent Report");
				extent=new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Kulvir singh", "Automation Tester");
				return extent;
			}

		

}
