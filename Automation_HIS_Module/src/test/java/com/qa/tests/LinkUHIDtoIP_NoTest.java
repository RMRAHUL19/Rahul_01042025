package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.LinkUHIDtoIP_NoPages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class LinkUHIDtoIP_NoTest extends BaseTest {
	public LinkUHIDtoIP_NoTest() {
		
	}
	String geterror;
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	LinkUHIDtoIP_NoPages LUIP;
	util utilobj=new util();
	SoftAssert softassert=new SoftAssert();
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
		LUIP=hishomepage.donavigatetoLinkUHIDtoIP_NoPages();
	}
	
	@Test(priority = 4)
	public void dotestcaseforInsurenceDetail_Section() {
		LUIP.getGetpatient_detail_textBox().sendKeys("1111111111");
		LUIP.getGetDependentpatient_detail_Button().click();
		LUIP.getList_List_radioButton().click();
		LUIP.getList_List_ButtonSelect().click();
		
	}

	@Test(priority = 5)
	public void dotestcaseforPatientDetail_Section() throws InterruptedException {
		
		Thread.sleep(1000);
		LUIP.getPatientDetail_ImgSearch().click();
		Thread.sleep(1000);
		LUIP.getPatientSearch_DDL().sendKeys("Starts With");
		
		Thread.sleep(1000);
	LUIP.getPatientSearch_uhidTextBox().sendKeys("DUMM");
	LUIP.getPatientSearch_btnSearch().click();
	Thread.sleep(1000);
	softassert.assertTrue(LUIP.getPatientSearch_RadioButton().isDisplayed()==false);
	
//if(LUIP.getPatientSearch_RadioButton().isDisplayed()==true) {
	LUIP.getPatientSearch_RadioButton().click();
	LUIP.getPatientSearch_SelectButton().click();
//}
//
//else {
//	LUIP.getList_List_ClosedButton().click();
//	
//}
	}
	@Test(priority = 6)
	public void toCheckTheFunctionalityOfClearIPDetailButton() throws InterruptedException {
		Thread.sleep(1000);
		LUIP.getInsurancedetail_clearIPDetail().click();
		
	}
	@Test(priority = 7)
	public void toCheckTheFunctionalityOfClearButton() throws InterruptedException {
		Thread.sleep(1000);
		LUIP.getclear_Button().click();
		
	}
	@Test(priority = 7)
	public void tonavigatetoMeargeUHIDDatascreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(LUIP.getregistration(), driver);
		utilobj.JSClick(LUIP.getMerge_UHID(), driver);		
	}
	
	
}
