package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jogamp.newt.event.KeyEvent;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

import ch.qos.logback.classic.Logger;

@SuppressWarnings("unused")
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
	public void verifyPatientCheckInPageTitleTest() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getLnkbtnIPNo()));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getLnkbtnIPNo()));
		String PatientCheckInTitle= patientcheckInpage.verifyPatientCheckInPageTitle();
		Assert.assertEquals(PatientCheckInTitle, prop.getProperty("patientcheckintitle"),"PatientCheckInTitle is Not matching");
	}
	
	@Test(priority =5)
	public void Check_TheFunctionality_IPNumber() throws InterruptedException {

//		patientcheckInpage.doPatientCheckIN(prop.getProperty("IPNumber"),prop.getProperty("specialisationName"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getLnkbtnIPNo()));
		 Thread.sleep(2000);
		patientcheckInpage.	getTxtIPNO().sendKeys("1115104753");
		Thread.sleep(2000);
		patientcheckInpage.	getLnkbtnIPNo().click();//Registration_Patient Check-in_TC_1
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getHisLiveListControlchkUHID()));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getHisLiveListControlchkUHID()));
		 patientcheckInpage.getHisLiveListControlchkUHID().click();
		 Thread.sleep(2000);
		 patientcheckInpage.getHisLiveListControlbtnSelect().click();
		 Thread.sleep(2000);
		 System.out.println(patientcheckInpage.getBtnOK().isEnabled());
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		 wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getBtnOK()));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getBtnOK()));
		utilobj.ActionClick(patientcheckInpage.getBtnOK(), driver);
//		patientcheckInpage.getBtnOK().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getBtnSaveDisplay()));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getBtnSaveDisplay()));
		patientcheckInpage. getBtnSaveDisplay().click();
			
			    //patientcheckInpage.getBtncancel().click();
			
		}
	@Test(priority = 6)
	public void to_checkThe_functionality_PrintButton() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(2000);
		//patientcheckInpage.getPatientCheckinNumber();
	wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getPopupmessage()));
		System.out.println(patientcheckInpage.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(patientcheckInpage.getPopupmessage(), driver));

		String strCheckinNumber = utilobj.GetCheckinNumberText(patientcheckInpage.getPopupmessage(), driver);
		try 
		{
		//getBtncancel().click();
		patientcheckInpage.getBtncancel().click();
		Thread.sleep(2000);
		}
		catch (Exception e) {
	    // If an exception occurs while trying to click
	    // Handle the exception, and then perform the alternative action
	    utilobj.SwitchToChildWindow(driver, "Patient_CheckIn");
	        
		}
		
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ctl00_cphpage_btnPrint"))));
			driver.findElement(By.id("ctl00_cphpage_btnPrint")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		utilobj.SwitchToChildWindow(driver, "Patient_CheckIn");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage. getclearbuttonLink()));
			patientcheckInpage. getclearbuttonLink().click();
	    System.out.println(strCheckinNumber);
	    Thread.sleep(2000);
}
	
	@Test(priority = 7)
	public void toCheck_theFunctionality_UHIDSearch() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		patientcheckInpage.getUhidSearchImg().click();
		Thread.sleep(2000);
		patientcheckInpage.getUhidLiveListTextBox().sendKeys("DUMM.0000000030");
		Thread.sleep(2000);
		patientcheckInpage.getUhidLiveListSearchButton().click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getUhidLiveListRadioButton()));
		patientcheckInpage.getUhidLiveListRadioButton().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		patientcheckInpage.getUhidLiveListSelect().click();
		Thread.sleep(1000);
		patientcheckInpage. getBtnSaveDisplay().click();
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		Thread.sleep(2000);
		
	}
	@Test(priority = 8)
	public void doTestRefferls() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getrefferlsLink()));
		wait.until(ExpectedConditions.elementToBeClickable(patientcheckInpage.getrefferlsLink()));
		patientcheckInpage.getrefferlsLink().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getTxtIPNO()));
		patientcheckInpage.	getTxtIPNO().sendKeys("1199900090");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(patientcheckInpage.getLnkbtnIPNo()));
		patientcheckInpage.	getLnkbtnIPNo().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
			patientcheckInpage.getHisLiveListControlbtnSelect().click();			
			Thread.sleep(4000);
			driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl02_lnkAdmit"));
			wait.until(ExpectedConditions.elementToBeClickable((driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl02_lnkAdmit")))));
			driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl02_lnkAdmit")).click();
			Thread.sleep(2000);
			try  {
				patientcheckInpage.getinformation_popup_ok().click();
				Thread.sleep(3000);
				driver.findElement(By.id("ctl00_lnkbtnChangeHospital")).click();
			}
			catch (Exception e) {
			driver.findElement(By.id("ctl00_lnkbtnChangeHospital")).click();
			Thread.sleep(2000);}
	}
	
	@Test(priority = 9)
	@Parameters("browser")
	public void doTestTodays_Appointment_Button(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_ddlHospital"))));
		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
		hishomepage = selecthospitallocationpage.doNavigateToHISHome("Azadpur, DL (ESIC Disp.)", prop.getProperty("facilityName"),Browser);
		patientcheckInpage = hishomepage.doNavigateToPatientCheckIn();
		driver.findElement(By.id("ctl00_cphpage_btnShowApptData")).click();
		Thread.sleep(2000);
		
	}

	
	
}