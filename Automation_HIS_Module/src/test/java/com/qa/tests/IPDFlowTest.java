package com.qa.tests;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.IPDFlowPages;
import com.qa.pages.Loginpage;
import com.qa.pages.OPDFlowPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class IPDFlowTest extends BaseTest{
	public IPDFlowTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid=null;
	String Addmision=null;
	util utilobj = new util();
	IPDFlowPages IPDflowpages;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}
	@Test(priority = 3)
	public void dotestcaseIPDFlowPageUHID() throws InterruptedException, AWTException {

		IPDflowpages=hishomepage.doNavigateToUHIDcreationforIPDFLowLink();
//		IPDflowpages.testcaseforIPDFlowPagesUHID(prop.getProperty("Title"),prop.getProperty("FirstName"),prop.getProperty("LastName"),
//				prop.getProperty("MaritalStatus"),prop.getProperty("Age"),prop.getProperty("Address"));
//		getUhid =IPDflowpages.testcasegetUhid();
	}
	@Test(priority = 4)
		public void dotestcaseIPDFlowPagepatientAddmission() throws InterruptedException, AWTException {
			
		//IPDflowpages.testcaseforIPDFlowPagesUHIDPatientAdmission(getUhid);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys("1100000034");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
		Thread.sleep(3000);
		IPDflowpages.getpatientAdmission_permanantsameaspresent().click();
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getDdlAdmissionType(), driver, "On Transfer/Referral");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getDdlAdmissionSrc(), driver, "Transferred from a private hospital");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getddlSpeciallization(), driver, "General Medicine");
		Thread.sleep(4000);
		utilobj.selectDropdown(IPDflowpages.getddlUnit(), driver, "MEDICINE");
		Thread.sleep(4000);
		utilobj.selectDropdown(IPDflowpages.getddlwardType(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		IPDflowpages.getpatientAdmission_SaveButton().click();
		Thread.sleep(3000);
		IPDflowpages.getpatientAdmission_informationOKButton().click();
		Thread.sleep(3000);
		
		IPDflowpages.getpatientAdmission_succesokbutton().click();
		Thread.sleep(3000);
		Addmision=IPDflowpages.getAdmissionNO();
	}
	@Test(priority = 5)
	public void dotestcaseIPDFlowPagepatientInpatientmanagement() throws InterruptedException {
		
		//IPDflowpages.testcaseforINPAtientMangement();
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
		//getchange_facility_location_linkLink().click();
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward");
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(IPDflowpages.getINpatientmanagementLink(), driver);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getINpatientmanagementAllotBedLink(), driver);
		Thread.sleep(3000);
		
		IPDflowpages.getINpatientmanagementAllotbedadmissionNO().click();
		Thread.sleep(5000);

		utilobj.selectDropdown(IPDflowpages.getINpatientmanagementAllotbed_bedName(), driver, "MMW8");
		 Thread.sleep(3000);

		 IPDflowpages.getINpatientmanagementAllotbed_saveButton().click();
			 Thread.sleep(3000);
			 IPDflowpages.getINpatientmanagementAllotbed_Succusokbutton().click();
			 Thread.sleep(3000);
			 boolean popupdisplay=driver.findElement(By.id("popup_ok")).isDisplayed();
				if(popupdisplay==true)
				{
					driver.findElement(By.id("popup_ok")).click();
					System.out.println("popok button is there");
				}
			// driver.findElement(By.id("popup_ok")).click();
			 Thread.sleep(3000);
			 utilobj.MoveElement(IPDflowpages.getINpatientmanagementLink(), driver);
				Thread.sleep(3000);
				utilobj.JSClick(IPDflowpages.getINpatientmanagementUpdateStatus(), driver);
				Thread.sleep(3000);
				utilobj.selectDropdown(IPDflowpages.getINpatientmanagementUpdateStatus_bednametxtDDL(), driver, "MMW8");

				
      			Thread.sleep(3000);
				utilobj.selectDropdown(IPDflowpages.getINpatientmanagementUpdateStatus_changetostatusddl(), driver, "Occupied");
				Thread.sleep(3000);
				IPDflowpages.getINpatientmanagementUpdateStatus_saveButton().click();
				Thread.sleep(3000);
				utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
				
				Thread.sleep(3000);
				utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
				Thread.sleep(3000);
		
		
	}
	@Test(priority = 6)//OPGENE122100001
	public void dotestcaseIPDFlowPagepatientIPcasesheetPrecription() throws InterruptedException, AWTException {
		
	
		//IPDflowpages.doIPCasesheetprecripstion(prop.getProperty("orderpackname"),Addmision);
		try

		{
			Thread.sleep(3000);
			utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
			Thread.sleep(3000);
			utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "ADMINISTRATIVE SERVICES");
			
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
			Thread.sleep(3000);
			Thread.sleep(3000);
			utilobj.MoveElement(IPDflowpages.getClinicalRecordLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getInpatientEmergancyPatientLink(), driver);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(Addmision);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp"));
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
			
//			utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitpluebuuton(), driver);
//			
//			Thread.sleep(3000);
//			utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitBedIMG(), driver);
			
			
			Thread.sleep(5000);

			IPDflowpages.getpopok().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			IPDflowpages.getlableprecripstionlink().click();

			Thread.sleep(3000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(IPDflowpages.gettxtOrdPackSearch(), driver, prop.getProperty("orderpackname"));
			Thread.sleep(1000);
			utilobj.JSClick(IPDflowpages.getclickorderpackbutton(), driver);

			

			Thread.sleep(3000);

			utilobj.JSClick(IPDflowpages.getorderpackselection(), driver);

			
			Thread.sleep(5000);

			utilobj.JSClick(IPDflowpages.getbtnISaveClose(), driver);
			Thread.sleep(3000);
			utilobj.waitForalert(driver);
			Thread.sleep(3000);

			driver.switchTo().alert().accept();
			Thread.sleep(3000);

			driver.switchTo().window(parent3);		
			Thread.sleep(3000);
			IPDflowpages.getpopok().click();
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
			Thread.sleep(3000);
		}
		catch (Exception ex) {
			System.err.println(ex);
		}}
	@Test(priority = 7)
	public void testcaseforInpatientIssues() throws InterruptedException {
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward");
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		
		utilobj.MoveElement(driver.findElement(By.linkText("Stores")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Inpatient Issues")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgBtnAdmissionNo")),driver);
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")), driver, Addmision);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_btnSearch")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_btnSelect")),driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnOK")), driver);
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty")), driver, "");
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty")), driver, "3");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
		Thread.sleep(3000);
	}
	@Test(priority = 8)
	public void testcaseforLaboratory() throws InterruptedException {
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "LABORATORY SERVICE");
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("Laboratory")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Lab Worklist")), driver);
		Thread.sleep(3000);
		//driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_imgInPatient")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl08_txtCriteria")).sendKeys(Addmision);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
		
		Thread.sleep(3000);
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		IPDflowpages.getreqNoLink().click();
	    System.out.println(IPDflowpages.getreqNoLink().getText());
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		
		
		utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);//click on sc
		
		Thread.sleep(2000);
		utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click save button
		
		Thread.sleep(2000);
		utilobj.JSClick(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);//click on SA
		Thread.sleep(2000);
		utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click on save button
		Thread.sleep(2000);
		Thread.sleep(2000);
		IPDflowpages.getRequisition_close_buttonLink().click();		
      Thread.sleep(2000);
	   	driver.switchTo().window(parent3);
	   	Thread.sleep(3000);
//	   	utilobj.JSClick(getchange_facility_location_linkLink(), driver);
//	   	Thread.sleep(3000);
		//IPDflowpages.testcaseforinpatientIssues(Addmision);
	}
	@Test(priority = 9)
	public void TestcaseforImaggingServices() throws InterruptedException {
		Thread.sleep(3000);
   		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
   		Thread.sleep(3000);
	utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
	Thread.sleep(3000);
	utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "IMAGING SERVICES");
	Thread.sleep(3000);
	utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
	Thread.sleep(3000);
	utilobj.MoveElement(driver.findElement(By.linkText("IMAGING SERVICES")), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.linkText("Worklist")), driver);
	Thread.sleep(3000);
	//driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
	//Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgInPatient")), driver);
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl07_txtCriteria")).sendKeys(Addmision);
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
    String parent3 = driver.getWindowHandle();

   	
	utilobj.Window(driver);
	Thread.sleep(3000);
	IPDflowpages.getimagingWorklist_ReqNO().click();
	Thread.sleep(3000);
	utilobj.ChildWindow(driver);
	Thread.sleep(3000);
    utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailPAcheckBox(),driver);
	
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailSaveButton(),driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE(),driver);
   	
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPcheckBox(),driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPInformationyesButton(),driver);
   	Thread.sleep(3000);
   	utilobj.selectDropdown(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ITEMddl(), driver, "Dry Lase Film 14 into 17 inch");
   	Thread.sleep(3000);
   	utilobj.selectDropdown(IPDflowpages.getimageWorkListReqDetailTP_NOFU_BATCHddl(), driver, "bv32");
   	Thread.sleep(3000);
   	utilobj.JSEnterText(IPDflowpages.getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
   	Thread.sleep(3000);
	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailSaveButton(),driver);
   	
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE(),driver);
   	Thread.sleep(3000);
   	driver.close();
   	Thread.sleep(1000);
   	driver.switchTo().window(parent3);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
   	Thread.sleep(3000);
   	}
	@Test(priority = 10)
	public void TestcaseforDischageIntimation() throws InterruptedException {
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "ADMINISTRATIVE SERVICES");
		
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimation")), driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ImgBtnAdmin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")).sendKeys(Addmision);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")).click();
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
		Thread.sleep(3000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlRequestType")), driver, "Normal Discharge");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_txtRemarks")).sendKeys("test Remarks");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		//driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
	   	Thread.sleep(3000);
	   	Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward");
		Thread.sleep(3000);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("InPatient Management")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimations")), driver);
		Thread.sleep(3000);
	   	driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1]/span")).click();
	   	Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
	}
		//IPDflowpages.testcaseforImagingWorkList(Addmision);
		//IPDflowpages.testcaseforImagingWorkList("IP062100064");
		//IPDflowpages.testcaseforgenrateIntimationsummery();
		//IPDflowpages.ChildWindowforclinicalsummery(driver);
		
	}
	
	

