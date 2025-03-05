package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Check_In_Admission_of_Reffered_PatientsPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class Check_In_Admission_of_Reffered_PatientsTest extends CrossBrowser {
	public Check_In_Admission_of_Reffered_PatientsTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Check_In_Admission_of_Reffered_PatientsPages CheckInAdmissionofRefferedPatientsPages;
	util utilobj=new util();
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(2);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)//AP01.0005004545 OPGENE082000108
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	
	@Test(priority =3)
	public void doNavigateToCheck_In_Admission_of_Reffered_PatientsLink() throws InterruptedException {

		CheckInAdmissionofRefferedPatientsPages = hishomepage.donavigateToCheck_In_Admission_of_Reffered_Patients();
	}
	
	@Test(priority = 4)
	@Parameters("browser")
	public void Registration_Check_in_Admission_to_Referred_Patients_TC_1(String Browser) throws InterruptedException{
		Thread.sleep(1000);		
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_UHID_imageSearch().click();
		Thread.sleep(2000);	
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria")), driver, "Starts With",Browser);
		Thread.sleep(1000);	
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_UHIDSearchTextBox().sendKeys("DUMM");
		Thread.sleep(1000);		
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_UHIDSearchButton().click();
		Thread.sleep(2000);		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		//String message="Problem occurred While fetching the search results";	
		List<WebElement>Row=driver.findElements(By.xpath("//*[@id='ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList']//tbody//tr"));
		Thread.sleep(1000);	
		System.out.println(Row.size());
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_UHIDPopUp_closeButton().click();
	}
	@Test(priority = 5)
	public void Registration_Check_in_Admission_to_Referred_Patients_TC_2() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.elementToBeClickable(CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceNotxtbox()));
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceNotxtbox().sendKeys("1111111111");
		Thread.sleep(1000);
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceLivelistLink().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cphpage_hisLiveListControl_gdvInsurance']//tbody//tr")));
		List<WebElement>Row=driver.findElements(By.xpath("//*[@id='ctl00_cphpage_hisLiveListControl_gdvInsurance']//tbody//tr"));
		System.out.println(Row.size());
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void Registration_Check_in_Admission_to_Referred_Patients_TC_3() throws InterruptedException {
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_Livelist_chkboxselect().click();
		Thread.sleep(2000);
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_LiveList_selectButton().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(CheckInAdmissionofRefferedPatientsPages.getCIAORP_Admit_Link()));
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_Admit_Link().click();
	}
	@Test(priority = 7)
	public void Registration_Check_in_Admission_to_Referred_Patients_TC_5() throws InterruptedException {
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		if (driver.findElement(By.linkText("Registration")).isEnabled()) {
		try {
			utilobj.MoveElement(hishomepage.getRegistrationLink(), driver);
		Thread.sleep(1000);
		utilobj.JSClick(driver.findElement(By.linkText("Check-In / Admission of Reffered Patients")), driver);
		} catch (Exception e) {
			try {
				driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			while (!driver.findElement(By.linkText("Registration")).isDisplayed()) {
			    Thread.sleep(1000);
			}
			utilobj.MoveElement(driver.findElement(By.linkText("Stores")), driver);
			utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
			Thread.sleep(1000);
			utilobj.JSClick(driver.findElement(By.linkText("Check-In / Admission of Reffered Patients")), driver);
			e.printStackTrace();
		}}
		Thread.sleep(2000);
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceNotxtbox().sendKeys("1111111111");
		Thread.sleep(1000);			
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceLivelistLink().click();
		Thread.sleep(4000);
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_Livelist_chkboxselect().click();
		Thread.sleep(1000);
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_LiveList_selectButton().click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(CheckInAdmissionofRefferedPatientsPages.getCIAORP_Admit_UhidClearbutton()));
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_Admit_UhidClearbutton().click();//clr button
		Thread.sleep(2000);
		
	}
	@Test(priority = 8)
	public void Registration_Check_in_Admission_to_Referred_Patients_TC_6() throws InterruptedException {
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceNotxtbox().sendKeys("abcd122434");
		Thread.sleep(1000);			
		CheckInAdmissionofRefferedPatientsPages.getCIAORP_InsuranceLivelistLink().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		String invalidMessage=driver.findElement(By.xpath("//*[@id='ctl00_cphpage_hisLiveListControl_uSplCustomGrid']//h1//span[@id='ctl00_cphpage_hisLiveListControl_lblMsg']")).getText();
	System.out.println(invalidMessage);	
	}
}