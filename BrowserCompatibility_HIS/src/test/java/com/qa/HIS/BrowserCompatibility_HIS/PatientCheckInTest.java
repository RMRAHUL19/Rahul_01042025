package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class PatientCheckInTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PatientCheckInPage patientcheckInpage;
	util utilobj=new util();
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
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
	public void Check_TheFunctionality_IPNumber() throws InterruptedException {

//		patientcheckInpage.doPatientCheckIN(prop.getProperty("IPNumber"),prop.getProperty("specialisationName"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getLnkbtnIPNo()));
		 Thread.sleep(2000);
		patientcheckInpage.	getTxtIPNO().sendKeys("1111111111");
		 Thread.sleep(2000);
		patientcheckInpage.	getLnkbtnIPNo().click();//Registration_Patient Check-in_TC_1
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getHisLiveListControlchkUHID()));
		 patientcheckInpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientcheckInpage.getHisLiveListControlbtnSelect().click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getBtnSaveDisplay()));
		patientcheckInpage.getBtnSaveDisplay().isEnabled();
		Thread.sleep(4000);
//		utilobj.ActionClick(patientcheckInpage.getBtnOK(), driver);
		utilobj.ActionClick(patientcheckInpage.getBtnOK(), driver);
		Thread.sleep(2000);
		patientcheckInpage. getBtnSaveDisplay().click();
			Thread.sleep(2000);
			}
	@Test(priority = 6)
	public void to_checkThe_functionality_PrintButton() throws InterruptedException {
		Thread.sleep(2000);
			//patientcheckInpage.getPatientCheckinNumber();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getPopupmessage()));
			System.out.println(patientcheckInpage.getPopupmessage().getText());
			System.out.println(utilobj.GetCheckinNumberText(patientcheckInpage.getPopupmessage(), driver));

			String strCheckinNumber = utilobj.GetCheckinNumberText(patientcheckInpage.getPopupmessage(), driver);

			//getBtncancel().click();
			patientcheckInpage.getpopokbuttonLink().click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("ctl00_cphpage_btnPrint")).click();
		    
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
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
	public void toCheck_theFunctionality_UHIDSearch() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		patientcheckInpage.getUhidSearchImg().click();
		Thread.sleep(2000);
		patientcheckInpage.getUhidLiveListTextBox().sendKeys("DUMM.0000010131");
		Thread.sleep(2000);
		patientcheckInpage.getUhidLiveListSearchButton().click();
		Thread.sleep(2000);
		patientcheckInpage.getUhidLiveListRadioButton().click();
		Thread.sleep(2000);
		patientcheckInpage.getUhidLiveListSelect().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		patientcheckInpage. getBtnSaveDisplay().click();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		Thread.sleep(2000);
		
	}
	@Test(priority = 8)
	public void doTestRefferls() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getLnkbtnIPNo()));
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
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
			Thread.sleep(10000);
			driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl02_lnkAdmit")).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
			if(patientcheckInpage.getinformation_popup_ok().isDisplayed()) {
				patientcheckInpage.getinformation_popup_ok().click();
				Thread.sleep(3000);
			}
			driver.findElement(By.id("ctl00_lnkbtnChangeHospital")).click();
			Thread.sleep(4000);
	}
	
	@Test(priority = 9)
	@Parameters("browser")
	public void doTestTodays_Appointment_Button(String Browser) throws InterruptedException {
		hishomepage = selecthospitallocationpage.doNavigateToHISHome("Azadpur, DL (ESIC Disp.)", prop.getProperty("facilityName"),Browser);
		patientcheckInpage = hishomepage.doNavigateToPatientCheckIn();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_cphpage_btnShowApptData")).click();
		Thread.sleep(2000);
		
	}

	
	
}
