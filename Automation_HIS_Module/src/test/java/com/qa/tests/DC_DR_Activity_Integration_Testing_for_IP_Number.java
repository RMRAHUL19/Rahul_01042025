package com.qa.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.pages.CDRPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.ExtentReporterNG;
import com.qa.util.util;

public class DC_DR_Activity_Integration_Testing_for_IP_Number extends BaseTest {
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CDRPage cdrpage;
	//ExtentReporterNG ex=new ExtentReporterNG();
	util utilobj = new util();
	String ip="1111111111";
	
	@Test(priority =1)

	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority =2)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority =3)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
		
	}
	@Test(priority = 4)
	public void DoTestCaseforIP_IntegtationToUHIDScreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		driver.findElement(By.linkText("UHID Creation")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		WebElement 	ele=driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl06_chkUHID"));
		
		utilobj.scroolDownintoview(driver, ele);
		Thread.sleep(1000);
		utilobj.getScreenshot(driver, "fail");//1115104063
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnimgClose")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void DoTestCaseforIP_IntegtationToPatientCheckINScreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		driver.findElement(By.linkText("Patient Check-In /Registration")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		WebElement  ele=driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl06_chkUHID"));
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, ele);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnimgClose")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void DoTestCaseforIP_IntegtationToPatientAdmissionScreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		driver.findElement(By.linkText("Patient Admission")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		WebElement  ele=driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl06_chkUHID"));
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, ele);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnimgClose")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 7)
	public void DoTestCaseforIP_IntegtationToEmergancyCheckINScreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		driver.findElement(By.linkText("Emergency Check-In / Registration")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		WebElement  ele=driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl06_chkUHID"));
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, ele);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnimgClose")).click();
		Thread.sleep(1000);
	}

	@Test(priority = 8)
	public void DoTestCaseforIP_IntegtationToCheckINAdmissionReffrelScreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		driver.findElement(By.linkText("Check-In / Admission of Reffered Patients")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl06_chkUHID"));
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, ele);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnimgClose")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 9)
	public void DoTestCaseforIP_IntegtationToSynchronizationDataToHISScreen() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		driver.findElement(By.linkText("Sync Insurance Data to HIS")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl06_chkUHID"));
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, ele);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnimgClose")).click();
		Thread.sleep(1000);
	}
	
}
