package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.xmlbeans.XmlException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jogamp.newt.Window;
import com.jogamp.newt.event.KeyEvent;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.AbhaNumberAndAbhaAddressPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class AbhaNumberAndAbhaAddressTest extends CrossBrowser {

	public AbhaNumberAndAbhaAddressTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AbhaNumberAndAbhaAddressPage AbhaNumberAndAbhaAddressPage;
	String typevalue;
	public static String[] ScreenshotNames= new String[100];
	public static int array_increment=0;
	String parent3= null ;
	String parent4= null ;
	String checkIN=null;
	
	
	@Test(priority =0)
	public void doLoginTest() throws InterruptedException, IOException {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() throws InterruptedException {
		Thread.sleep(1000);
		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();

		
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws IOException, InterruptedException {
		System.out.println(Browser);
		driver.manage().window().maximize();
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName4"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 3)
	public void doNavigateToHomeSampleCollectionSchedulerLink() throws IOException {
		
		AbhaNumberAndAbhaAddressPage = hishomepage.doNavigateToPatientcheckin_AbhaNumberAndAbhaAddressLink();
	}
	@Test(priority = 4)
	public void doCreateCheckInPageTest() throws InterruptedException {
		
		//opdflowPages.getgenratechekIn();	
		Thread.sleep(500);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtIPNO")));
		 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1115104628");
		 Thread.sleep(500);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_lnkbtnIPNo")));
			driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOf(AbhaNumberAndAbhaAddressPage.getBlackOverlay()));
			
			Thread.sleep(4000);
			//opdflowPages.getpatientCheckInNumberSeviceOkButton().click();
			utilobj.JSClick(AbhaNumberAndAbhaAddressPage.getpatientCheckInNumberSeviceOkButton(), driver);
		Thread.sleep(4000);
		AbhaNumberAndAbhaAddressPage.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(AbhaNumberAndAbhaAddressPage.getPopupmessage()));
		System.out.println(AbhaNumberAndAbhaAddressPage.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(AbhaNumberAndAbhaAddressPage.getPopupmessage(), driver));
		checkIN = utilobj.GetCheckinNumberText(AbhaNumberAndAbhaAddressPage.getPopupmessage(), driver);
		System.out.println(checkIN);
		Thread.sleep(2000);
		AbhaNumberAndAbhaAddressPage.getBtncancel().click();
		
				
	
	}
	@Test(priority = 5)
	public void ProvisionToViewABHANumberandAadharAvailabilityStatusonPatientcasesheet() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(AbhaNumberAndAbhaAddressPage.getClinicalRecordsLink()));
		
		utilobj.MoveElement(AbhaNumberAndAbhaAddressPage.getClinicalRecordsLink(), driver);
		Thread.sleep(1000);
		AbhaNumberAndAbhaAddressPage.getDoctorWorklistLink().click();
		//System.out.println(checkIN);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtCheckinno")));
		try {
			  Thread.sleep(1000);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
				driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		  Thread.sleep(2000);
		  
		 AbhaNumberAndAbhaAddressPage.getbtnConsultantSpcf().click();

		//AbhaNumberAndAbhaAddressPage.getTxtboxCheckInno().sendKeys(checkIN);
		AbhaNumberAndAbhaAddressPage.getTxtboxCheckInno().click();
		Thread.sleep(3000);
		//AbhaNumberAndAbhaAddressPage.getimgCheckinnosearch().click();
		//Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOf(AbhaNumberAndAbhaAddressPage.getOpenStanderdCaseSheet()));
	//	AbhaNumberAndAbhaAddressPage.getOpenStanderdCaseSheet().click();
		//Thread.sleep(500);
		//try {
			//AbhaNumberAndAbhaAddressPage.getpopup_ok().click();
	//	} catch (Exception e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		
		AbhaNumberAndAbhaAddressPage.getcomplaint().click();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "TemplateDesigner");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("TemplatePreviewControl_txtHistoryofPresentIllness")));

		AbhaNumberAndAbhaAddressPage.gettxt_complaint().sendKeys("Sizeofuriclefinding");
		Thread.sleep(2000);
		
		AbhaNumberAndAbhaAddressPage.getbtn_Submit().click();
		Thread.sleep(5000);
		utilobj.SwitchToChildWindow(driver, "CaseSheetM");
		Thread.sleep(5000);
		try {
			AbhaNumberAndAbhaAddressPage.getpopup_ok().click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        String abhaNumber = null;

          
        abhaNumber = driver.findElement(By.id("ctl00_cphpage_Lbabhanumber")).getText();
		System.out.println(abhaNumber);
        Assert.assertEquals(abhaNumber, "Available");

   
}



		
		
 
   @Test(priority = 6)
	public void ProvisionofABHANumberandABHAAddressinthePDFreports() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_btnPrint")));
		
        AbhaNumberAndAbhaAddressPage.getbtnPrint().click();
        Thread.sleep(5000);
      
}
}