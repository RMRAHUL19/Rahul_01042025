package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.IPDFlowPages;
import com.qa.pages.Loginpage;

import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class LabworklistTestIPD extends CrossBrowser{
	public LabworklistTestIPD() {
		
	}
	String parent6 = "";
	Loginpage loginpage;
	String laboratoryresultEntry; 
	String laboratoryresultDispatch; 
	String imaggingresultDispatch;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid=null;
	String Addmision="IP052400018";
	String Addmision2="IP022300066";
	util utilobj = new util();
	IPDFlowPages IPDflowpages;
	String ReqNo;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}
	@Test(priority = 3)
	public void dotestcaseIPDFlowPageUHID() throws InterruptedException, AWTException {

		IPDflowpages=hishomepage.doNavigateToAdmissionIPDFLowLink();

	}
	
	@Test(priority = 4)
	@Parameters("browser")
		public void dotestcaseIPDFlowPagepatientAddmission(String Browser) throws InterruptedException, AWTException {
			
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_txtInsuranceNo")));
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys("1100099900");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		IPDflowpages.getpatientAdmission_permanantsameaspresent().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(IPDflowpages.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(IPDflowpages.getDdlAdmissionSrc(), driver, "Transferred from a private hospital",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(IPDflowpages.getddlSpeciallization(), driver, "General Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(IPDflowpages.getddlUnit(), driver, "Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(IPDflowpages.getddlwardType(), driver, "Male Medical Ward",Browser);
		Thread.sleep(2000);
		IPDflowpages.getpatientAdmission_SaveButton().click();
		Thread.sleep(3000);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getpatientAdmission_informationOKButton()));
			IPDflowpages.getpatientAdmission_informationOKButton().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
		IPDflowpages.getpatientAdmission_succesokbutton().click();
		Thread.sleep(3000);
		Addmision=IPDflowpages.getAdmissionNO();
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void dotestcaseIPDFlowPagepatientInpatientmanagement(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));

		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_lnkbtnChangeHospital")));
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
		
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward",Browser);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(IPDflowpages.getINpatientmanagementLink(), driver);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getINpatientmanagementAllotBedLink(), driver);
		Thread.sleep(3000);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true)
			{
				driver.findElement(By.id("popup_ok")).click();
				System.out.println("popok button is there");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr[2]/td[1]/a")));
		IPDflowpages.getINpatientmanagementAllotbedadmissionNO().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_ddlBedName")));
		utilobj.selectDropdown(IPDflowpages.getINpatientmanagementAllotbed_bedName(), driver, "Dum4",Browser);
		Thread.sleep(500);
		IPDflowpages.getINpatientmanagementAllotbed_bedName().sendKeys("Dum4");
		 Thread.sleep(4000);

		 IPDflowpages.getINpatientmanagementAllotbed_saveButton().click();
			 Thread.sleep(3000);
			 IPDflowpages.getINpatientmanagementAllotbed_Succusokbutton().click();
			 Thread.sleep(3000);
			
				try {
					if(driver.findElement(By.id("popup_ok")).isDisplayed()==true)
					{
						driver.findElement(By.id("popup_ok")).click();
						System.out.println("popok button is there");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			 Thread.sleep(3000);

				
		
		
	}
	@Test(priority = 6)
	@Parameters("browser")
	public void dotestcaseIPDFlowPagepatientIPcasesheetPrecription(String Browser) throws InterruptedException, AWTException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

			Thread.sleep(5000);
			utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
			Thread.sleep(3000);
			selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
					prop.getProperty("facilityName"),Browser);
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Clinical Records")));
			utilobj.MoveElement(IPDflowpages.getClinicalRecordLink(), driver);
			Thread.sleep(500);
			utilobj.JSClick(IPDflowpages.getInpatientEmergancyPatientLink(), driver);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_ImgAdmissionNo")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_ImgAdmissionNo")));
			driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(Addmision);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			int x =0;
			try {
				driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
			} catch (Exception e) {
				x = 1;
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnClose")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[2]/th[1]/img")).click();
				Thread.sleep(2000);
				try {
					driver.findElement(By.id("ctl00_cphpage_lstViewUnit_ctrl0_lstViewUnitBeds_ctrl3_imgComDetails")).click();
				} catch (Exception e1) {
					driver.findElement(By.id("ctl00_cphpage_lstViewUnit_ctrl0_lstViewUnitBeds_ctrl2_imgComDetails")).click();
				}
				
				
			}
			
	
			
			Thread.sleep(3000);

			try {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popup_ok")));
				IPDflowpages.getpopok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(500);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_trvSectionst11")));
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			Thread.sleep(1000);
			IPDflowpages.getlableprecripstionlink().click();
			
			Thread.sleep(3000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtOrdPackSearch")));
			utilobj.JSEnterText(IPDflowpages.gettxtOrdPackSearch(), driver, "test12345");
			Thread.sleep(1000);
			utilobj.JSClick(IPDflowpages.getclickorderpackbutton(), driver);
			

			Thread.sleep(3000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

			utilobj.JSClick(IPDflowpages.getorderpackselection(), driver);

			
			Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

			utilobj.JSClick(IPDflowpages.getbtnISaveClose(), driver);
			Thread.sleep(3000);
			try {
				utilobj.waitForalert(driver);
		
				driver.switchTo().alert().dismiss();
				Thread.sleep(500);
				
				driver.findElement(By.id("btnIClose")).click();
				
				
				Thread.sleep(500);
				driver.switchTo().window(parent3);
		
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				Thread.sleep(500);
				driver.switchTo().window(parent3);
		
				driver.switchTo().defaultContent();
			}
			
			Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popup_ok")));
			IPDflowpages.getpopok().click();
		
			Thread.sleep(3000);
			Assert.assertEquals(x, 0, "New admission numbers are not being updated to Inpatient/Emergency patient search portal");
		}
		
	
	
	@Test(priority = 7)
	@Parameters("browser")
	public void testcaseforLaboratory(String Browser) throws InterruptedException {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		Thread.sleep(5000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_ddlHospital")));
		IPDflowpages.getSelectHospitalLocationDDL();
		Thread.sleep(500);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "LABORATORY SERVICE",Browser);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Laboratory")));
		utilobj.MoveElement(driver.findElement(By.linkText("Laboratory")), driver);
		Thread.sleep(4000);
		utilobj.JSClick(driver.findElement(By.linkText("Lab Worklist")), driver);
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_imgInPatient")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).isDisplayed()==true) {
				Thread.sleep(3000);
				driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_imgInPatient")));
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_imgInPatient")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl08_txtCriteria")).sendKeys(Addmision);
////		Thread.sleep(3000);
////		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
////		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		driver.findElement(By.id("ctl00_cphpage_hyp_0")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.id("ctl00_cphpage_btnLast")).isEnabled()==true) {
			System.out.println("hello");
			driver.findElement(By.id("ctl00_cphpage_btnLast")).click();
			Thread.sleep(2000);
			List<WebElement>RowDateOrder=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println(RowDateOrder.size());
			int rowsize=RowDateOrder.size()+1;
			System.out.println(rowsize);
			
				
				
			
			String parent3 = driver.getWindowHandle();
		   	
			utilobj.Window(driver);
			Thread.sleep(2000);
			
			ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).getText();
			System.out.println(ReqNo);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);
		
		    utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);
			
		   	Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	
		   	Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	utilobj.JSClick(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);
		   	
		   	Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	laboratoryresultEntry = driver.getWindowHandle();
		   	Thread.sleep(2000);
			utilobj.Window(driver);
			utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("5");
			Thread.sleep(3000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			utilobj.scroolDownintoview(driver, IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton());
			utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton(), driver);
			IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			//forresultverification
			Thread.sleep(1000);
			laboratoryresultEntry = driver.getWindowHandle();
			Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
            Thread.sleep(3000);
            IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			utilobj.scroolDownintoview(driver, IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton());
			Thread.sleep(1000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
			Thread.sleep(3000);
			utilobj.scroolDownintoview(driver, IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton());
			Thread.sleep(500);
			IPDflowpages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			Thread.sleep(1000);
			laboratoryresultDispatch=driver.getWindowHandle();
			Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("gvTestOrderItems_ctl02_imgresultDispatch")).click();
			Thread.sleep(1000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
			Thread.sleep(1000);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultDispatch);
			Thread.sleep(1000);
			driver.close();
			
		   	
			
			
		   	driver.switchTo().window(parent3);
			}
		
		
			else {
				
			
			List<WebElement>RowDateOrder=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println(RowDateOrder.size());
			int rowsize=RowDateOrder.size()+1;
		
		System.out.println(rowsize);
		
		String parent3 = driver.getWindowHandle();
	   	
		utilobj.Window(driver);
		Thread.sleep(2000);
		
		ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).getText();
		System.out.println(ReqNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).click();
		
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gvTestOrderItems_ctl02_chksamplecollect")));
		Thread.sleep(2000);
	
		 utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);
			
		   	Thread.sleep(5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	
		   	Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	utilobj.JSClick(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);
		   	
		   	Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	   	laboratoryresultEntry = driver.getWindowHandle();
	   	Thread.sleep(2000);
		utilobj.Window(driver);
		utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
		Thread.sleep(4000);
		utilobj.ChildWindow(driver);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gdvComponents_ctl02_txtControl")));
		IPDflowpages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("5");
		Thread.sleep(3000);
		IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
		Thread.sleep(3000);
		utilobj.scroolDownintoview(driver, IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton());
		utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton(), driver);
		IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(3000);
		driver.switchTo().window(laboratoryresultEntry);
		Thread.sleep(3000);
		laboratoryresultEntry = driver.getWindowHandle();
		Thread.sleep(3000);
		utilobj.Window(driver);
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink())));
			wait.until(ExpectedConditions.attributeToBeNotEmpty(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), "disabled"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gdvSearchResult_ctl02_chkDoctor")));
		IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
		Thread.sleep(3000);
		utilobj.scroolDownintoview(driver, IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton());
		Thread.sleep(1000);
		driver.findElement(By.id("chkResults")).click();
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton());
		Thread.sleep(500);
		IPDflowpages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(laboratoryresultEntry);
		Thread.sleep(6000);
		utilobj.Window(driver);
		Thread.sleep(1000);
			driver.findElement(By.id("gvTestOrderItems_ctl02_imgresultDispatch")).click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			laboratoryresultDispatch=driver.getWindowHandle();
			Thread.sleep(3000);
				driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
				Thread.sleep(3000);
				driver.findElement(By.id("btnSave")).click();


				driver.findElement(By.id("btnClose")).click();

				Thread.sleep(3000);
				driver.switchTo().window(laboratoryresultEntry);
				Thread.sleep(3000);
				driver.findElement(By.id("btnSave")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("btnClose")).click();

			Thread.sleep(3000);
		
	   	driver.switchTo().window(parent3);
		
			}
	}
	@Test(priority = 8)
	@Parameters("browser")
	public void TestcaseforDischageIntimation(String Browser) throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		Thread.sleep(5000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_ddlHospital")));
		IPDflowpages.getSelectHospitalLocationDDL();
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(IPDflowpages.getSelectFacilityLocationDDL())));
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "ADMINISTRATIVE SERVICES",Browser);
		
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimation")), driver);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_ImgBtnAdmin")));
		utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_cphpage_ImgBtnAdmin")));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ImgBtnAdmin")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")).sendKeys(Addmision);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlRequestType")), driver, "Normal Discharge",Browser);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_txtRemarks")).sendKeys("test Remarks");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		//driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
	   	Thread.sleep(3000);
	   	Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward",Browser);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("InPatient Management")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimations")), driver);
		Thread.sleep(3000);
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));

			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	   	try {
			driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1]/span")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   	
		try {
			driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	}
	
	

