package com.qa.tests;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.util.Constant;
import com.qa.util.util;
public class Listner extends BaseTest implements ITestListener {
	ExtentReports extent=ExtentReportNG.extentReportGenerator();
	ExtentTest test;
	util utilobj=new util();

	private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		 test=extent.createTest(result.getMethod().getMethodName());
		 extentTest.set(test);
	}
		


		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailure(result);
//			 test.fail(result.getThrowable());
			Map<String,String> functionality=Constant.getFuncnctionlity(result.getName());
			 for(String key:functionality.keySet()){
				 test.log(Status.FAIL, key+"-"+functionality.get(key)); 
			 }
			extentTest.get().fail(result.getThrowable());
			String dest=utilobj.getScreenshot(driver, result.getMethod().getMethodName());
			try {
				extentTest.get().addScreenCaptureFromPath(dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

		
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestSuccess(result);
			Map<String,String> functionality=Constant.getFuncnctionlity(result.getName());
			 for(String key:functionality.keySet()){
				 test.log(Status.PASS, key+"-"+functionality.get(key)); 
			 }
			 String dest=utilobj.getScreenshot(driver, result.getMethod().getMethodName());
				try {
					extentTest.get().addScreenCaptureFromPath(dest);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			test.log(Status.PASS, "pass");
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
			ITestListener.super.onFinish(context);
			extent.flush();
			
		}

}
