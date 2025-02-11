package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.getSynInsurancedataToHISPages;

import com.qa.util.util;

public class getSynInsurancedataToHISTest extends BaseTest {
	public getSynInsurancedataToHISTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	getSynInsurancedataToHISPages SIDH;
	util utilobj=new util();
	
	@Test(priority =0,description ="Enter User Name and Pasword and click on Submit Button")
	public void doLoginForOP_PatientFeedBackScreenTest() {

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
	@Test(priority = 3,description = "Go to Registration Link And click on Syncronize Insurance Data to HIS Link")
	public void ToNavigateTOSyncronize_Insurance_Data_to_HIS() {
		SIDH=hishomepage.donavigatetoSynInsuranceDataToHis();
		
	}
	
		
	@Test(priority = 4,description = "Select the Data By IP Number ")
	public void ToCheckTheFunctionalityOf_SIDH_ClearButton() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.JSEnterText(SIDH.getSIDH_insuranceNOTextBox(),driver,"1199900090");
		//SIDH.getSIDH_insuranceNOTextBox().sendKeys("1111111111");
		SIDH.getSIDH_LiveList().click();
		SIDH.getSIDH_SelcetButton().click();
		SIDH.getSIDH_ClearButton().click();
		
	}
	@Test(priority = 5,description = "Select the Data By IP Number ")
	public void ToCheckTheFunctionalityOf_SIDH_SaveButton() throws InterruptedException {
		Thread.sleep(1000);
		SIDH.getSIDH_insuranceNOTextBox().sendKeys("1199900090");
		SIDH.getSIDH_LiveList().click();
		SIDH.getSIDH_SelcetButton().click();
		Thread.sleep(1000);
		SIDH.getSIDH_UpdatePatientDemograpiDetailButton().click();
		
	}

}
