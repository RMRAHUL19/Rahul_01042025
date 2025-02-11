package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;

public class PatientCheckInTest  extends BaseTest {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PatientCheckInPage patientcheckInpage;
	
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
	
	@Test(priority =3)
	public void doNavigateToPatientCheckInTest() {

		patientcheckInpage = hishomepage.doNavigateToPatientCheckIn();
	}
	
	@Test(priority =4)
	public void verifyPatientCheckInPageTitleTest() {

		String PatientCheckInTitle= patientcheckInpage.verifyPatientCheckInPageTitle();
		Assert.assertEquals(PatientCheckInTitle, prop.getProperty("patientcheckintitle"),"PatientCheckInTitle is Not matching");
	}
	
	@Test(priority =5)
	public void doPatientCheckINTest() throws InterruptedException {

//		patientcheckInpage.doPatientCheckIN(prop.getProperty("IPNumber"),prop.getProperty("specialisationName"));
		 Thread.sleep(2000);
		patientcheckInpage.	getTxtIPNO().sendKeys("1100099900");
		 Thread.sleep(2000);
		patientcheckInpage.	getLnkbtnIPNo().click();
		 WebDriverWait wait=new WebDriverWait(driver,300);
		 wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getHisLiveListControlchkUHID()));
		 
		 patientcheckInpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientcheckInpage.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getBtnSaveDisplay()));
		patientcheckInpage.getBtnSaveDisplay().isEnabled();
		Thread.sleep(2000);
		utilobj.ActionClick(patientcheckInpage.getBtnOK(), driver);
		Thread.sleep(2000);
		patientcheckInpage. getBtnSaveDisplay().click();
			Thread.sleep(2000);
			}
	@Test(priority = 6)
	public void dogetPatientChekIn() throws InterruptedException {
		Thread.sleep(2000);
			//patientcheckInpage.getPatientCheckinNumber();
			System.out.println(patientcheckInpage.getPopupmessage().getText());
			System.out.println(utilobj.GetCheckinNumberText(patientcheckInpage.getPopupmessage(), driver));

			String strCheckinNumber = utilobj.GetCheckinNumberText(patientcheckInpage.getPopupmessage(), driver);

			//getBtncancel().click();
			patientcheckInpage.getpopokbuttonLink().click();
		    Thread.sleep(5000);
		    utilobj.SwitchToChildWindow(driver, "RegistrationPrintReports.aspx");
		    Thread.sleep(5000);
		    driver.close();
		    Thread.sleep(5000);
		    utilobj.SwitchToChildWindow(driver, "Patient_CheckIn");
		    Thread.sleep(10000);
		    patientcheckInpage. getclearbuttonLink().click();
		    Thread.sleep(1000);
		    System.out.println(strCheckinNumber);
		    Thread.sleep(2000);
	}
	@Test(priority = 7)
	public void doTestRefferls() throws InterruptedException {
		Thread.sleep(2000);
		patientcheckInpage.getrefferlsLink().click();
		Thread.sleep(2000);
		patientcheckInpage.	getTxtIPNO().sendKeys("1199900090");
		Thread.sleep(2000);
		patientcheckInpage.	getLnkbtnIPNo().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID")).click();
			Thread.sleep(2000);
			patientcheckInpage.getHisLiveListControlbtnSelect().click();
			Thread.sleep(10000);
			driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl02_lnkAdmit")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_lnkbtnChangeHospital")).click();
			Thread.sleep(1000);
	}
	
	@Test(priority = 8)
	public void doTestTodays_Appointment_Button() throws InterruptedException {
		hishomepage = selecthospitallocationpage.doNavigateToHISHome("Azadpur, DL (ESIC Disp.)", prop.getProperty("facilityName"));
		patientcheckInpage = hishomepage.doNavigateToPatientCheckIn();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_btnShowApptData")).click();
		Thread.sleep(1000);
		
	}

	
	
}
