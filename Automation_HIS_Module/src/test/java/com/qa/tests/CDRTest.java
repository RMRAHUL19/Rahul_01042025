package com.qa.tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.itextpdf.text.DocumentException;
import com.qa.pages.CDRPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.ExtentReporterNG;

public class CDRTest extends BaseTest { 

	public CDRTest() {
		// TODO Auto-generated constructor stub
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CDRPage cdrpage;
String	path;
public static String[] ScreenshotNames= new String[100];
public static int array_increment=0;
private static Reusable_methods reuse;

ExtentReporterNG ex;
@Test(priority =1)

public void doLoginTest() throws IOException {
	String datebefore=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	System.out.println(datebefore);
	loginpage = new Loginpage(driver);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="doLoginTest", driver);
	homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));
	
}

@Test(priority =2)
public void doNavigateToSelectHospitalLocationTest() throws IOException {
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="doNavigateToSelectHospitalLocationTest", driver);
	selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	
}

@Test(priority =3)
public void doNavigateToHISHomeTest() throws IOException {
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="doNavigateToHISHome", driver);
	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	
}

@Test(priority =4)
public void doNavigateToCDRTest() throws MalformedURLException, DocumentException, IOException {

	cdrpage = hishomepage.doNavigateToCDRLink();
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="doNavigateToCDRLink", driver);
	
}

@Test(priority =5)
public void testcaseForCDRPage_searchByIP_Number() throws Exception {

	Thread.sleep(1000);
	cdrpage.gettxtIPNumber().sendKeys("1111111111");
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Enter the IP number In Textbox", driver);
	Thread.sleep(1000);
	cdrpage.getSearchBtnUhid().click();
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Search button", driver);
	Thread.sleep(1000);
	
}
@Test(priority =6)
public void testcaseForCDRPage_ViewResult() throws Exception {


	
	Thread.sleep(3000);
	cdrpage.getSelectBtn().click();
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Select Link", driver);
	cdrpage.getmgBtnDetails().click();
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Detail Button", driver);
	cdrpage.gettvCompleteDetailst2().click();
	Thread.sleep(1000);
	cdrpage.getpriscriptionlink().click();
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Prescription Link", driver);
	cdrpage.getviewResult().click();
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on View Result", driver);
	
	Thread.sleep(1000);
	cdrpage.getResultclose().click();
	
	
	
}
@Test(priority =7)
public void testcaseForCDRPage_ChkTheFunctionalityOfSpecilazitionDROPDOWN() throws IOException, InterruptedException {

	
	cdrpage.getSpecilazitionRadiobutton().click();
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Specilazition Radio button", driver);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getSpecilazitionDDL(), driver, "Medicine Casualty / Emergency");
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Select the Medicine Casualty_Emergency ", driver);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getSpecilazitionDDL(), driver, "Orthopaedic Surgery");
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Select the Orthopaedic Surgery ", driver);
	Thread.sleep(1000);
}
@Test(priority = 8)
public void testcaseForCDRPage_ChkTheFunctionalityOfDiagnoseDROPDOWN() throws Exception {
	

	utilobj.JSClick(cdrpage.getDiagnoseRadiobutton(), driver);
	Thread.sleep(5000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Diagnose Radio button", driver);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getDiagnoseDDL(), driver, "Other congenital malaria");
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Select the Other congenital malaria ", driver);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getDiagnoseDDL(), driver, "Viral infection of unspecified site");
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Select the Viral infection of unspecified site ", driver);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getDiagnoseDDL(), driver, "Acne");
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Select the Acne ", driver);
	Thread.sleep(1000);
	utilobj.JSClick(cdrpage.getEpisodeWiseradiobutton(), driver);
	Thread.sleep(2000);
	String title= driver.getTitle();
	Thread.sleep(1000);
	System.out.println(title);
	Thread.sleep(1000);
	reuse.captureScreenshot(ScreenshotNames[array_increment++]="Click on Episode Radio Button", driver);
	Thread.sleep(1000);
	reuse.saveScreenshotsToWordDocument("CDR",ScreenshotNames);
	Thread.sleep(1000);
	System.out.println(title);
	String dateafter=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	System.out.println(dateafter);
	Assert.assertEquals(title, "NoTitle");

	
}


}




