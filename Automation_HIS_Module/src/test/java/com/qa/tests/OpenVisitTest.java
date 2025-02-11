package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.qa.pages.DoctorWorklistPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OpenVisitPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OpenVisitTest extends BaseTest{
	public OpenVisitTest() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OpenVisitPage OCP;
	
	@Test(priority = 0)
	public void doLoginOpenVisitTest() {

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
	public void doNavigateToOpenVisitTest() {

		
		OCP=hishomepage.doNavigateToOpenVisitPageLink();
		
	}
	@Test(priority = 4)
	public void CheckTheFunctionalityOfClearButton() throws InterruptedException, AWTException {
		OCP.getOpenVisitUHID_search().click();
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Starts With");
		OCP.getOpenVisitUHID_TextBox().sendKeys("DUMM");
		OCP.getOpenVisitUHID_Search().click();
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_RadioButton().click();
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
//		OCP.getOpenVisitUHID_OK().click();
//		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//utilobj.JSClick(OCP.getOpenVisitUHID_Clear(),driver);
		
		
	}
	@Test(priority = 4)
	public void CheckTheFunctionalityOfCloseMRButton() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_search().click();
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Starts With");
		OCP.getOpenVisitUHID_TextBox().sendKeys("DUMM");
		OCP.getOpenVisitUHID_Search().click();
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_RadioButton().click();
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OK().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_CheckBox().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_closeMR().click();
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}
	@Test(priority = 4)
	public void CheckTheFunctionalityOfOpenMRButton() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_search().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Starts With");
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_TextBox().sendKeys("DUMM");
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_Search().click();
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_RadioButton().click();
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OK().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_CheckBox().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OpenMR().click();
		Thread.sleep(2000);
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_ENTER);
		
	}
	@Test(priority = 5)
	public void checkTheFunctionalityOfnavigateToDosageTypepage() {
		OCP=hishomepage.doNavigateToDosageTypePageLink();
		
	}
	@Test(priority = 6)
	public void checkTheFunctionalityOfSaveButtonOfDosageTypepage() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		OCP.getDosageTypeIMG_search().click();
		Thread.sleep(2000);
		OCP.getDosageTypeSearch_TextBox().sendKeys("Test");
		Thread.sleep(2000);
		OCP.getDosageTypeSearch_BTNSearch().click();
		Thread.sleep(2000);
		OCP.getDosageTypeSearch_RadioButton().click();
		OCP.getDosageTypeSearch_SelectButton().click();
		Thread.sleep(2000);
		OCP.getDosageTypeSearch_UpDate().click();
		Thread.sleep(2000);
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_ENTER);

}
}
