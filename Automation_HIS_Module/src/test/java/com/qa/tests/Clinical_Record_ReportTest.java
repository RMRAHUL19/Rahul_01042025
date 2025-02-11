package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.qa.pages.Clinical_Record_ReportPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


public class Clinical_Record_ReportTest extends BaseTest {
	public  Clinical_Record_ReportTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Clinical_Record_ReportPages CRR;
	util utilobj=new util();
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}

	@Test(priority = 3)
	public void doNavigateToPatientCheckInTest() {

		
		CRR=hishomepage.doNavigateToClinical_Record_Reports();
	}
	@Test(priority = 4)
	public void checkTheFunctionalityOfItemMasterdata() throws InterruptedException {
		CRR.getItem_Master_Data().click();
		Thread.sleep(1000);
		
	}
	@Test(priority = 4)
	public void checkTheFunctionalityOfprescreption_itemIssue() throws InterruptedException  {
		
		CRR.getprescreption_itemIssue().click();
		Thread.sleep(1000);
		
	}
	@Test(priority = 6)
	public void checkTheFunctionalityOfStockStatus_StationWise() throws InterruptedException {
		Thread.sleep(1000);
		CRR.getStockStatus_StationWise().click();	
		Thread.sleep(1000);
	}
	
	@Test(priority = 7)
	public void checkTheFunctionalityOfExportReport() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		CRR.getZeroStock_Item().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES");
		Thread.sleep(1000);
		CRR.getPreviewButton().click();
		Thread.sleep(1000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		CRR.getExprotReport().click();
		Thread.sleep(1000);
		utilobj.ChildWindow(driver);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "Crystal Reports (RPT)");
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(1000);
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
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Excel 97-2000");
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Word");
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(1000);
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
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "Acrobat Format (PDF)");
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(parent3);
	}
		@Test(priority = 8)
		public void ChecktheFunctionalityofOpenTheReport() throws InterruptedException, AWTException {
			Thread.sleep(1000);
			CRR.getZeroStock_Item().click();
			Thread.sleep(1000);
			utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES");
			Thread.sleep(1000);
			CRR.getPreviewButton().click();
			Thread.sleep(1000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		CRR.getExprotReport().click();
		Thread.sleep(1000);
		utilobj.ChildWindow(driver);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Excel 97-2000");
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(1000);
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.switchTo().window(parent3);
		
		
	}
}
