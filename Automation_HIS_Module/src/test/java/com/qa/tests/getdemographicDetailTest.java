package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.getdemographicDetailPages;
import com.qa.util.util;

public class getdemographicDetailTest extends BaseTest{
	public getdemographicDetailTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	getdemographicDetailPages DDP;
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
	@Test(priority = 3)
	public void DoNatigatetoOP_Patient_Feedback() {
		DDP=hishomepage.donavigatetoUpdateDemographicDetail();
	}
	@Test(priority = 4,description = "Click on admision search and select the addmission And click on Clear Button")
	public void ToCheckTheFunctionalityOfClearButton() throws InterruptedException {
		
			Thread.sleep(1000);
			DDP.getUDD_AdmissionNoIMGSearch().click();
			DDP.getUDD_AdmissionNoTextBox().sendKeys("IP082100018");
			DDP.getUDD_AdmissionNobtnSearch().click();
			DDP.getUDD_AdmissionNoRadioButton().click();
			DDP.getUDD_AdmissionNobtnSelect().click();
			Thread.sleep(15000);
//			WebDriverWait wait=new WebDriverWait(driver, 30);
//			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_btnClear"))));
//			driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
			
			DDP.getUDD_ClearButton().click();
		
		
		
	}
	@Test(priority = 5,description = "Click on admision search and select the addmission And click on Save Button")
	public void ToCheckTheFunctionalityOfSaveButton() {
		try {
			
		Thread.sleep(2000);
		
		DDP.getUDD_AdmissionNoIMGSearch().click();
		DDP.getUDD_AdmissionNoTextBox().sendKeys("IP082100018");
		DDP.getUDD_AdmissionNobtnSearch().click();
		DDP.getUDD_AdmissionNoRadioButton().click();
		DDP.getUDD_AdmissionNobtnSelect().click();
		Thread.sleep(15000);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DDP.getUDD_SaveButton().click();
		DDP.getfeedback_succesOKButton().click();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


}
