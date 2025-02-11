package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.Registration_ReportPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.getOP_Patient_FeedbackPages;
import com.qa.util.util;

public class getOP_Patient_FeedbackTest extends BaseTest {
	public getOP_Patient_FeedbackTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	getOP_Patient_FeedbackPages OPFeedback;
	util utilobj=new util();
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	@Test(priority = 3)
	public void DoNatigatetoOP_Patient_Feedback() {
		OPFeedback=hishomepage.donavigatetoOP_Patient_Feedback();
	}
@Test(priority = 4)
public void ToCheckTheFunctionalityofMandatoryField() throws InterruptedException {
	Thread.sleep(2000);
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB1().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB2().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB3().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB4().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB5().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB6().click();
	OPFeedback.getoutpatientFeedBackwaitingTime_ShortRB1().click();
	OPFeedback.getoutpatientFeedBackwaitingTime_ShortRB2().click();
	OPFeedback.getoutpatientFeedBackwaitingTime_ShortRB3().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_Overall().click();
	OPFeedback.getoptionalDetail_address().sendKeys("Test Address");
//	OPFeedback.getoptionalDetail_DistrictDLL().click();
//	utilobj.selectDropdown(OPFeedback.getoptionalDetail_DistrictDLL(), driver, "Maharashtra");
//	OPFeedback.getoptionalDetail_DistrictDLL().click();
//	utilobj.selectDropdown(OPFeedback.getoptionalDetail_StateDLL(), driver, "Mumbai");
//	OPFeedback.getoptionalDetail_PinCode().sendKeys("250001");
	OPFeedback.getoptionalDetail_AnySuggestion().sendKeys("any Test suggestion");
	Thread.sleep(5000);
}
@Test(priority = 5)
public void ToCheckTheFunctionalityofclearbutton() {
	OPFeedback.getfeedback_ClearButton().click();
}
@Test(priority = 6)
public void ToCheckTheFunctionalityofsavebutton() throws InterruptedException {
	Thread.sleep(4000);
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB1().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB2().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB3().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB4().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB5().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_goodRB6().click();
	Thread.sleep(1000);
	OPFeedback.getoutpatientFeedBackwaitingTime_ShortRB1().click();
	OPFeedback.getoutpatientFeedBackwaitingTime_ShortRB2().click();
	OPFeedback.getoutpatientFeedBackwaitingTime_ShortRB3().click();
	OPFeedback.getoutpatientFeedBackSatisfyingLavel_Overall().click();
	OPFeedback.getoptionalDetail_address().sendKeys("Test Address");
	Thread.sleep(2000);
//	utilobj.JSClick(OPFeedback.getoptionalDetail_DistrictDLL(),driver);
//	Thread.sleep(10000);
	utilobj.selectDropdown(OPFeedback.getoptionalDetail_StateDLL(), driver, "Maharashtra");
	Thread.sleep(10000);
	utilobj.selectDropdown(OPFeedback.getoptionalDetail_DistrictDLL(), driver, "Mumbai");
	
	
	Thread.sleep(2000);
	OPFeedback.getoptionalDetail_PinCode().sendKeys("250001");
	Thread.sleep(2000);
	OPFeedback.getoptionalDetail_AnySuggestion().sendKeys("any Test suggestion");
	Thread.sleep(2000);
	OPFeedback.getfeedback_saveButton().click();
	Thread.sleep(2000);
//	OPFeedback.getfeedback_succesOKButton().click();
//	Thread.sleep(2000);
}


	@Test(priority = 7)
public void teardown() {
		driver.quit();
	}
	
}







