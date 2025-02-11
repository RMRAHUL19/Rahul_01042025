package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.LinkUHIDtoIP_NoPages;
import com.qa.pages.Loginpage;
import com.qa.pages.Registration_ReportPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

import io.qameta.allure.Description;

public class Registration_ReportTest extends BaseTest {
	public Registration_ReportTest() {
		// TODO Auto-generated constructor stub
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Registration_ReportPages RRP;
	util utilobj=new util();
	@Test(priority =0,description ="Enter User Name and Pasword and click on Submit Button")
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	
	@Test(priority =1,description = "Navigate to Hospital Location Page")
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2,description = "select the Location And Facility(Administrative services)")
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	@Test(priority = 3)
	public void DoNatigatetoLinkUHIDtoIP_NoPages() {
		RRP=hishomepage.donavigatetoRegistration_Report();
	}
	@Test(priority = 4)
	@Description("1:-To check the the functionality of dispensery Report Fo List,"+"\n"+"a:-check the functionality of preview button,b:-check the functionality of report,c:-check the functionality of clear Button ")
	
	public void ChecktheFuntionalityOfDispenceryReportFO_List() throws InterruptedException, AWTException {
		RRP.getDispensary_ReportPluseButton().click();
		RRP.getDispensary_Report_FO_List().click();
		utilobj.JSEnterText(RRP.getDispensary_Report_FO_List_RegistrationDate(), driver, "08-Sep-2021");
		RRP.getDispensary_Report_FO_List_previewButton().click();
		Thread.sleep(1000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportREport().click();
		utilobj.ChildWindow(driver);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Crystal Reports (RPT)");
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Word");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Excel 97-2000");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Excel 97-2000 (Data Only)");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Rich Text Format");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r4=new Robot();
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Acrobat Format (PDF)");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		
		driver.switchTo().window(parent3);
		Thread.sleep(1000);
		System.out.println("title is:-"+driver.getTitle());
		RRP.getDispensary_Report_FO_List_ClearButton().click();
	}
	@Test(priority = 5)
	public void ChecktheFuntionalityOfMainHospitalreport() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		RRP.getMainHosp_ReportPluseButton().click();
		RRP.getMainHosp_ReportFO_List().click();
		Thread.sleep(1000);
		utilobj.JSEnterText(RRP.getDispensary_Report_FO_List_RegistrationDate(), driver, "01-Aug-2021");
		utilobj.selectDropdown(RRP.getMainHosp_ReportFO_List_WardDLL(), driver, "CASUALTY / EMERGENCY");
		RRP.getDispensary_Report_FO_List_previewButton().click();
//		RRP.getDispensary_Report_FO_List_ExportREport().click();
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportREport().click();
		utilobj.ChildWindow(driver);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Crystal Reports (RPT)");
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Word");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Excel 97-2000");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Excel 97-2000 (Data Only)");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r3=new Robot();	
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Rich Text Format");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r4=new Robot();
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Acrobat Format (PDF)");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		
		driver.switchTo().window(parent3);
		Thread.sleep(1000);
		System.out.println("title is:-"+driver.getTitle());
		RRP.getDispensary_Report_FO_List_ClearButton().click();
		Thread.sleep(1000);
		
		
	}
	@Test(priority = 6)
	public void DoNatigatetoLinkUHIDtoIP_NoPagesagain() {
		RRP=hishomepage.donavigatetoRegistration_Report();
	}
	@Test(priority = 7)
	public void ChecktheFuntionalityOfList_of_CheckIN_for_day() throws InterruptedException, AWTException {
		
		
		//RRP.getList_of_Check_In_for_a_Day_Link().click();
		System.out.println(RRP.getList_of_Check_In_for_a_Day_Link().getAttribute("title"));
		Thread.sleep(5000);
		utilobj.JSClick(RRP.getList_of_Check_In_for_a_Day_Link(),driver);
		utilobj.JSEnterText(RRP.getDispensary_Report_FO_List_RegistrationDate(), driver, "08-Sep-2021");
		RRP.getDispensary_Report_FO_List_previewButton().click();
		Thread.sleep(1000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportREport().click();
		utilobj.ChildWindow(driver);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Crystal Reports (RPT)");
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Word");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000); 
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Excel 97-2000");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "MS Excel 97-2000 (Data Only)");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Rich Text Format");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Robot r4=new Robot();
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r4.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Acrobat Format (PDF)");
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		
		driver.switchTo().window(parent3);
		Thread.sleep(1000);
		System.out.println("title is list of check in a day:-"+driver.getTitle());
		//RRP.getDispensary_Report_FO_List_ClearButton().click();
		
		
	}
	

}
