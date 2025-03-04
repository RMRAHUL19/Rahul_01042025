package com.qa.HIS.BrowserCompatibility_HIS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPDFlowPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.UHIDPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class LabworklistTestOPD extends CrossBrowser{
	
	public LabworklistTestOPD() {
		
	}
	String parent6 = "";
	String laboratoryresultEntry; 
	String laboratoryresultDispatch; 
	String imaggingresultDispatch;
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid=null;
	String checkIN=null;
	OPDFlowPages opdflowPages;
	String sheduledateTime;
	String Orderdate;
	String date;
	String splitdate;
	String splitOrderdate;
	String ReqNo;
	util utilobj = new util();
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {// 	OPGENE042100042

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 3)
	public void doNavigateToPatientCheckinLinkTest() {

		opdflowPages = hishomepage.doNavigateToPatientCheck_InforOPDFLowLink();
	}
	
	
	@Test(priority = 4)
	public void doCreateCheckInPageTest() throws InterruptedException {

		
		//opdflowPages.getgenratechekIn();	
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_txtIPNO")));
		 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1199900090");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
			
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
			wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));
			
			Thread.sleep(4000);
			//opdflowPages.getpatientCheckInNumberSeviceOkButton().click();
			utilobj.JSClick(opdflowPages.getpatientCheckInNumberSeviceOkButton(), driver);
		Thread.sleep(4000);
		// 
		opdflowPages.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);
		System.out.println(opdflowPages.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver));

		checkIN = utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver);

		
		
		
				
	}
	@Test(priority = 5)
	public void dodoctorworklist() throws InterruptedException {
		
		opdflowPages.getBtncancel().click();
		Thread.sleep(1000);
		getUhid= opdflowPages.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(getUhid);
		
		Thread.sleep(1000);
		utilobj.MoveElement(opdflowPages.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		opdflowPages.getDoctorWorklistLink().click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtCheckinno")));
		Thread.sleep(2000);
		utilobj.JSEnterText(opdflowPages.getdoctorworklist_checkintextBox(), driver, checkIN);
		Thread.sleep(2000);
//		getdoctorworklist_checkintextBox().sendKeys(checkin);
//		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
//Thread.sleep(2000);
//getDoctorworklistCheckINno().click();

		
			Thread.sleep(2000);

			try {
				opdflowPages.getpopupok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			opdflowPages.getlableprecripstionlink().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtOrdPackSearch")));
			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(opdflowPages.gettxtOrdPackSearch(), driver, "test");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));


			utilobj.JSClick(opdflowPages.getclickorderpackbutton(), driver);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));


			Thread.sleep(3000);

			utilobj.JSClick(opdflowPages.getorderpackselection(), driver);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));


			Thread.sleep(5000);
			//sheduledateTime=opdflowPages.getcasesheetDateTime().getText();
			utilobj.JSClick(opdflowPages.getbtnISaveClose(), driver);

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
			try {
				opdflowPages.getpopupok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(4000);
		     utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("//*[@id=\"ctl00_cphpage_divPrescription\"]/table[1]/tbody/tr[1]/td/span")));
			Thread.sleep(5000);
			date=driver.findElement(By.xpath("//*[@id=\"ctl00_cphpage_divPrescription\"]/table[1]/tbody/tr[2]/td/a")).getText();
			System.out.println(date);
			splitdate=date.substring(0, 17);
			System.out.println(splitdate);
			
			
			try {
				opdflowPages.getpopupok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Thread.sleep(1000);
		

		

	}
	
	@Test(priority = 8)
	@Parameters("browser")
	public void doNavigateToHISHomeTestforLaboratoryworklist(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		opdflowPages.getchange_facility_location_linkLink().click();
		Thread.sleep(2000);
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityNameLABORATORYSERVICE"),Browser);//ok
		
	}
	@Test(priority = 9)
	public void testcaseforLaboratoryworkListOPD() throws InterruptedException {
		
		Thread.sleep(2000);
		utilobj.MoveElement(opdflowPages.getlaboratoryLink(), driver);
		Thread.sleep(2000);
		opdflowPages.getlabWorkListLink().click();
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl07_txtCriteria")));
		opdflowPages.LaboratoryOPworkListTxtboxsearch().sendKeys(getUhid);
		Thread.sleep(2000);
		
		opdflowPages.getlaboratoryWorklistOKButton().click();
		wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));
		Thread.sleep(4000);
		boolean ok = false;
		boolean next = false;
		try {
			next = driver.findElement(By.id("ctl00_cphpage_btnNext")).isEnabled();
			
		} catch (Exception e) {
			ok = driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).isEnabled();
			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			Thread.sleep(2000);
			utilobj.MoveElement(opdflowPages.getlaboratoryLink(), driver);
			Thread.sleep(2000);
			opdflowPages.getlabWorkListLink().click();
			Thread.sleep(4000);
			
		} finally {
			Assert.assertEquals(ok, false, "new entries not forming in worklist, database issue.");
			Thread.sleep(3000);
		}
		if(next==true) {
			System.out.println("hello");
			driver.findElement(By.id("ctl00_cphpage_btnNext")).click();
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
			
		    utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox(), driver);
			
		   	Thread.sleep(5000);
		   	utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
		   	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		   	Thread.sleep(5000);
		   	utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink(), driver);
		   	
		   	Thread.sleep(2000);
		   	utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
		   	Thread.sleep(2000);
		   	laboratoryresultEntry = driver.getWindowHandle();
		   	Thread.sleep(2000);
			utilobj.Window(driver);
			utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("13");
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
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
			utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
            Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
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
		//String ReqNo=getlabotatory_reqnoLink().getText();
		//opdflowPages.getlabotatory_reqnoLink().click();
		ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).getText();
		System.out.println(ReqNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).click();
		
		utilobj.ChildWindow(driver);
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox()));
		Thread.sleep(2000);
	
	    utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox(), driver);
		
	   	Thread.sleep(5000);
	   	utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
	   	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	   	Thread.sleep(5000);
	   	utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink(), driver);
	   	
	   	Thread.sleep(2000);
	   	utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
	   	Thread.sleep(2000);
	   	laboratoryresultEntry = driver.getWindowHandle();
	   	Thread.sleep(2000);
		utilobj.Window(driver);
		utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gdvComponents_ctl02_txtControl")));
		Thread.sleep(3000);
		opdflowPages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("13");
		Thread.sleep(3000);
		opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
		Thread.sleep(3000);
		opdflowPages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(1000);
		driver.switchTo().window(laboratoryresultEntry);
		//forresultverification
		laboratoryresultEntry = driver.getWindowHandle();

		utilobj.Window(driver);
		utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("chkResults")));
		opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.visibilityOf(opdflowPages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox()));
			opdflowPages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		opdflowPages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(laboratoryresultEntry);
	Thread.sleep(1000);
		laboratoryresultDispatch=driver.getWindowHandle();
		Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);	
			try {
				driver.findElement(By.id("gvTestOrderItems_ctl02_imgresultDispatch")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
			try {
				utilobj.ChildWindow(driver);
			} catch (Exception e) {
				e.printStackTrace();
			}

		try {
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

			try {
				opdflowPages.getbtnSave().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
           
			Thread.sleep(1000);
			
			wait.until(ExpectedConditions.visibilityOf(opdflowPages.getbtnclose()));
			opdflowPages.getbtnclose().click();
			
			Thread.sleep(1000);
			//driver.switchTo().window(laboratoryresultDispatch);
			
		
		
	   	driver.switchTo().window(parent3);
		
			}
	   	Thread.sleep(3000);
	   	
    	
	
		
	}
	
		
	
	
	
}
