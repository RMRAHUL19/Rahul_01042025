package com.qa.tests;

import java.io.IOException;
import java.util.Random;

import org.apache.xmlbeans.XmlException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.UHIDPage;
import com.qa.util.util;

public class UHIDPageTest extends BaseTest {

	public UHIDPageTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	UHIDPage uhidpage;
	String typevalue;
	public static String[] ScreenshotNames= new String[100];
	public static int array_increment=0;
	private static Reusable_methods reuse;
	@Test(priority = 0)
	public void doLoginTest() throws InterruptedException, IOException {

		loginpage = new Loginpage(driver);
		
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="Enter the Valid Credential and Click on Submit Button", driver);
	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() throws InterruptedException {
		Thread.sleep(1000);
		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();

		
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() throws IOException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="do navigate to HIS Application", driver);
	}

	@Test(priority = 3)
	public void doNavigateToUHIDcreationLinkTest() throws IOException {
		
		uhidpage = hishomepage.doNavigateToUHIDcreationLink();
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="do navigate to Uhid Creation Screen", driver);
	}
	
	
	@Test(priority = 4)
	public void doUHIDCreationPageTest() throws InterruptedException, IOException {

//		uhidpage.doUHIDCreationPage(prop.getProperty("Title"),prop.getProperty("FirstName"),prop.getProperty("LastName"),
//				prop.getProperty("MaritalStatus"),prop.getProperty("Age"),prop.getProperty("Address"));
		Random F=new Random();
		int Num=F.nextInt(2000);
		System.out.println("Random ="+Num);
		String Fname=Integer.toString(Num);
		Random U=new Random();
		int Num_U= U.nextInt(2000);
		System.out.println("Random ="+Num_U);
		String Lname=Integer.toString(Num_U);
		utilobj.selectDropdown(uhidpage.getTitle(), driver, "Mr.");
		Thread.sleep(2000);
		uhidpage.getFirstName().sendKeys(prop.getProperty("FirstName")+Fname);
		Thread.sleep(2000);
		uhidpage.getLastName().sendKeys(prop.getProperty("LastName")+Lname);
		
		Thread.sleep(2000);
		
		System.out.println(prop.getProperty("MaritalStatus") + uhidpage.getMarriageStatus());
		Thread.sleep(2000);
		utilobj.selectDropdown(uhidpage.getMarriageStatus(), driver, "Single");
		Thread.sleep(2000);
		uhidpage.getAge().sendKeys(prop.getProperty("Age"));
		Thread.sleep(2000);
		uhidpage.getPresentAddres().sendKeys(prop.getProperty("Address"));
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra");
		Thread.sleep(20000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai");
		Thread.sleep(20000);
		driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
		Thread.sleep(2000);
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="doUHIDCreationTest", driver);
		Thread.sleep(2000);
		uhidpage.getSavebutton().click();
		Thread.sleep(2000);
		uhidpage.getbtnYes().click();
		Thread.sleep(2000);
		
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="Success Message", driver);
		Thread.sleep(2000);
		utilobj.JSClick(uhidpage.getUHID_creation_Uhid_succes(), driver);
		//getUHID_creation_Uhid_succes().click();
		
		Thread.sleep(2000);
		System.out.println(uhidpage.getUHID_creation_Uhid_txtbox().getText());	
		Thread.sleep(2000);
		typevalue=uhidpage.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(2000);
		System.out.println(typevalue);
		Thread.sleep(2000);
	}
		@Test(priority = 5)
		public void Check_the_Functionality_Of_OPDNumber_Button_Clear_Button() throws InterruptedException, IOException {
		//functionility of print button
		Thread.sleep(2000);
//		uhidpage.getUHID_creation_printButton().click();
//		Thread.sleep(2000);
//		utilobj.SwitchToChildWindow(driver, "RegistrationPrintReports.aspx");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		utilobj.SwitchToChildWindow(driver, "Registration");
//		Thread.sleep(4000);//opd link functionality
		uhidpage.getUHID_creation_Uhid_OPDNumber().click();
//		Thread.sleep(4000);
//		uhidpage.getpatientCheckInNumberSeviceOkButton().click();
//		Thread.sleep(4000);
//		uhidpage.getpatientCheckInNumberSaveButton().click();
//		Thread.sleep(4000);
//		uhidpage.getpatientCheckInNumberinfoMsgboxcancelbutton().click();
//		Thread.sleep(4000);
		uhidpage.getpatientCheckInNumberRegistration().click();
		Thread.sleep(4000);//clear button functionelity
		utilobj.selectDropdown(uhidpage.getTitle(), driver, prop.getProperty("Title"));
		Thread.sleep(2000);
		uhidpage.getFirstName().sendKeys(prop.getProperty("FirstName"));
		Thread.sleep(2000);
		uhidpage.getLastName().sendKeys(prop.getProperty("LastName"));
		
		Thread.sleep(2000);
		
		System.out.println(prop.getProperty("MaritalStatus") + uhidpage.getMarriageStatus());
		utilobj.selectDropdown(uhidpage.getMarriageStatus(), driver, prop.getProperty("MaritalStatus"));
		Thread.sleep(2000);
		uhidpage.getAge().sendKeys(prop.getProperty("Age"));
		Thread.sleep(2000);
		uhidpage.getPresentAddres().sendKeys(prop.getProperty("Address"));
		Thread.sleep(2000);
		uhidpage.getUHID_creation_clearButton().click();
		Thread.sleep(1000);
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="click onclear Button", driver);
		}
		
		@Test(priority = 6)
		public void To_Check_Functionality_UpdateButton() throws InterruptedException, IOException {
			
		
		Thread.sleep(2000);
		uhidpage.getUHID_creation_IMGsearchUhid().click();//uhid search
		Thread.sleep(2000);
		uhidpage.getUHID_creation_UHIDsearchtxtbox().sendKeys(typevalue);
		Thread.sleep(2000);
		uhidpage.getUHID_creation_UHIDButtonsearch().click();
		Thread.sleep(2000);
		uhidpage.getUHID_creation_UHIDRadiobuttonselect().click();
		Thread.sleep(2000);
		uhidpage.getUHID_creation_UHIDsearchselect().click();
		Thread.sleep(2000);
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="Patient Search By UHID number", driver);
		uhidpage.getUHID_creation_sameaddrescheckbox().click();//update button
		Thread.sleep(2000);
		uhidpage.getUHID_creation_UpdateButton().click();
		Thread.sleep(2000);
		uhidpage.getbtnYes().click();
		Thread.sleep(2000);
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="To_Check_Functionality_UpdateButton", driver);
		Thread.sleep(2000);
		uhidpage.getUHID_creation_Uhid_succesUpdate().click();
		Thread.sleep(3000);
		
		}
		@Test(priority = 7)
		public void Search_Patient_detailBy_IPnumber() throws Exception {
		Thread.sleep(2000);	
		uhidpage.getUHID_creation_InsouranceNOtxtbox().sendKeys("1199900090");//search by ipno change kiya h yha pr
		Thread.sleep(2000);
		uhidpage.getUHID_creation_LivelistLink().click();
		Thread.sleep(2000);
		uhidpage.getUHID_creation_LivelistradioButton().click();
		Thread.sleep(2000);
		uhidpage.getUHID_creation_LivelistSelect().click();
		Thread.sleep(2000);
		reuse.captureScreenshot(ScreenshotNames[array_increment++]="Search_Patient_detailBy_IPnumber", driver);	
		Thread.sleep(2000);
		reuse.saveScreenshotsToWordDocument("UHID Page",ScreenshotNames);
	}
	
}


