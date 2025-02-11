package ESIC_HIS.ProductionScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

import com.qa.pages.PM10639_printAndCutomizedPrint_SubsituteItemPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class PM10639_printAndCutomizedPrint_SubsituteItemTest extends CrossBrowser {
public PM10639_printAndCutomizedPrint_SubsituteItemTest() {
		
	}
   String parent2;
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
	PM10639_printAndCutomizedPrint_SubsituteItemPage PM10639;
	String sheduledateTime;
	String Orderdate;
	String date;
	String splitdate;
	String splitOrderdate;
	String ReqNo;
	String Patient_Name;
	String Print_Patient_Name;
	String Age_Gender;
	String Print_AgeGender;
	String UHID_Number;
	String Print_UHID;
	String IP_number;
	String Print_IPNumber;
	String Check_In_Number;
	String PrintCheck_INNumber;
	String Check_in_Date;
	String PrintCheck_IN_Date;
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

		PM10639 = hishomepage.doNavigateToPatientCheck_InforPM10639();
	}
	@Test(priority = 4)
	public void do_CreateCheckIn() throws InterruptedException {

		
		//PM10639.getgenratechekIn();	
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1100099900");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
			
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
			wait.until(ExpectedConditions.invisibilityOf(PM10639.getBlackOverlay()));
			
			Thread.sleep(4000);
			//PM10639.getpatientCheckInNumberSeviceOkButton().click();
			utilobj.JSClick(PM10639.getpatientCheckInNumberSeviceOkButton(), driver);
		Thread.sleep(4000);
		// w
		PM10639.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);
		
		System.out.println(PM10639.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(PM10639.getPopupmessage(), driver));

		checkIN = utilobj.GetCheckinNumberText(PM10639.getPopupmessage(), driver);

}
	@Test(priority = 5)
	@Parameters("browser")
	public void dodoctorworklist(String Browser) throws InterruptedException {
		PM10639.getBtncancel().click();
		Thread.sleep(1000);
		getUhid= PM10639.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(getUhid);
		
		Thread.sleep(1000);
		utilobj.MoveElement(PM10639.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		PM10639.getDoctorWorklistLink().click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(PM10639.getdoctorworklist_checkintextBox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(PM10639.getdoctorworklist_checkintextBox(), driver, checkIN);
		Thread.sleep(2000);

utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);


		
			Thread.sleep(2000);

			PM10639.getpopupok().click();
			//get demographic details from casesheet
			Patient_Name=PM10639.getCasesheet_PatientNameLable().getText();
			Age_Gender=PM10639.getCasesheet_AgeGenderLable().getText();
			UHID_Number=PM10639.getCasesheet_UHIDLable().getText();
			IP_number=PM10639.getCasesheet_IPLable().getText();
			Check_In_Number=PM10639.getCasesheet_CheckInNumberLable().getText();
			Check_in_Date=PM10639.getCasesheet_DateTimeLableLable().getText();
			
			// end of get demographic details from casesheet

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			PM10639.getlableprecripstionlink().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(PM10639.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");

			utilobj.JSClick(PM10639.getclickorderpackbutton(), driver);

			
			Thread.sleep(3000);

			utilobj.JSClick(PM10639.getorderpackselection(), driver);

			Thread.sleep(5000);
			PM10639.getprescriptiondeletemedicineButtonLink().click();
			Thread.sleep(1000);
           utilobj.waitForalert(driver);
           Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			//
			driver.findElement(By.id("btnADDM")).click();
			Thread.sleep(1000);
			PM10639.getMedicationTExtSearchLink().sendKeys("Dicyclomine");
			Thread.sleep(2000);
			PM10639.getDrugButtonLink().click();
			Thread.sleep(2000);
			PM10639.getSearchMedicineNameLink().click();
			Thread.sleep(2000);
			PM10639.getDrugDoseTextLink().clear();
			Thread.sleep(2000);
			PM10639.getDrugDoseTextLink().sendKeys("5");
			Thread.sleep(2000);
			utilobj.selectDropdown(PM10639.getDrugDoseDDLLink(), driver, "Tablet(s)", Browser);
			Thread.sleep(2000);
			utilobj.selectDropdown(PM10639.getddlFrequencyLink(), driver, "1X - Once", Browser);
			Thread.sleep(2000);
			PM10639.getDurationTextBoxLink().sendKeys("5");
			Thread.sleep(2000);
			PM10639.getMEdicationQuantityTextBoxLink().sendKeys("5");
			Thread.sleep(2000);
			utilobj.selectDropdown(PM10639.getMedicationDDLQuantityUOMLink(), driver, "Tablet(s)", Browser);
			Thread.sleep(2000);
			utilobj.JSClick(PM10639.getMedicationOKButtonLink(), driver);
			Thread.sleep(2000);
			utilobj.JSClick(driver.findElement(By.id("btnM")), driver);
			
			Thread.sleep(2000);
			//
			utilobj.JSClick(PM10639.getbtnISaveClose(), driver);
			Thread.sleep(1000);
			utilobj.waitForalert(driver);
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().window(parent3);
			Thread.sleep(1000);
			PM10639.getpopupok().click();
			Thread.sleep(4000);
			utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[1]/tbody/tr[1]/td/span")));
			Thread.sleep(5000);
			date=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[2]/tbody/tr[2]/td/a[1]")).getText();
			System.out.println(date);
			splitdate=date.substring(0, 17);
			System.out.println(splitdate);
			Thread.sleep(1000);
			

//to find the cordinate of any element
//Point point=PM10639.getDrugDoseTextLink().getLocation();
//point.getX();
//point.getY();
//to find the width and Hieght of web element
//Dimension dim=PM10639.getDrugDoseTextLink().getSize();
//System.out.println(dim.getHeight()+""+dim.getWidth());


		}
	@Test(priority = 6)
	public void Do_Test_Print_Button() throws InterruptedException, AWTException {
//		Thread.sleep(2000);
//		PM10639.getCasesheet_PrintButton().click();
		
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		
		PM10639.getCasesheet_PrintButton().click();
		
		Thread.sleep(20000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
//		Thread.sleep(2000);
//		Print_Patient_Name=PM10639.getCasesheet_Print_PatientNameLable().getText();
//		Thread.sleep(2000);
//		Print_AgeGender=PM10639.getCasesheet_Print_AgeGenderLable().getText();
//		Thread.sleep(2000);
//		Print_UHID=PM10639.getCasesheet_Print_UHIDLable().getText();
//		Thread.sleep(2000);
//		Print_IPNumber=PM10639.getCasesheet_Print_IPNumberLable().getText();
//		Thread.sleep(2000);
//		PrintCheck_INNumber =PM10639.getCasesheet_Print_Check_INNumberLable().getText();
//		Thread.sleep(2000);
//		PrintCheck_IN_Date=PM10639.getCasesheet_Print_Check_IN_DateLableLable().getText();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
	}
	@Test(priority = 7)
	public void Do_Test_For_DemographicDetailMatchingCaseSheetToPrintWindow() throws InterruptedException {

	
		
		System.out.println("CaseSheet Demographic Detail:-"+Patient_Name+"\n "+Age_Gender+"\n "+UHID_Number+"\n"+IP_number+"\n"+Check_In_Number+"\n"+Check_in_Date);
		
		//System.out.println("print Window Demographic Detail:-"+Print_Patient_Name+"\n"+Print_AgeGender+"\n"+Print_UHID+"\n"+Print_IPNumber+"\n"+PrintCheck_INNumber+"\n"+PrintCheck_IN_Date);

	}
	@Test(priority = 8)
	public void Do_Test_For_CustomizedPrintButton() throws InterruptedException {
		PM10639.getCasesheet_CustomizedPrint().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(PM10639.getCasesheet_CustomizedPrint_UncheckAllButton()));
		
	}
	@Test(priority = 9)
	public void Do_Test_For_CustomizedPrint_UncheckAllButton() throws InterruptedException { 
		Thread.sleep(2000);
		PM10639.getCasesheet_CustomizedPrint_UncheckAllButton().click();
		Thread.sleep(5000);	
}
	@Test(priority = 10)
	public void Do_Test_For_CustomizedPrint_checkAllButton() throws InterruptedException {
		PM10639.getCasesheet_CustomizedPrint_CheckAllButton().click();
		Thread.sleep(5000);	
	}
	@Test(priority = 11)
	public void Do_Test_For_CustomizedPrint_PrintButton() throws InterruptedException, AWTException {
		PM10639.getCasesheet_CustomizedPrint_ChiefCompalinCheckBox().click();
		Thread.sleep(2000);
	String	 parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);	
		PM10639.getCasesheet_CustomizedPrint_PrintButton().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(2000);
		
		driver.switchTo().window(parent3);
		
		
		
	}
	@Test(priority = 12)
	@Parameters("browser")
	public void Do_Test_for_ChaangeLocationForStoreServices(String Browser) throws InterruptedException {
		
		Thread.sleep(2000);	
		PM10639.getchange_facility_location_linkLink().click();//click on change Location
		Thread.sleep(2000);	
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),prop.getProperty("StoreServices"),Browser);//select location and facility
		Thread.sleep(2000);	
		PM10639=hishomepage.doNavigateToPharmacyIssueforPM10639();//navigate to pharmacy issue
		Thread.sleep(2000);	
		
		
	}
	@Test(priority = 13)
	public void Do_Test_for_pharmacyIssueSubsituteItem() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		PM10639.getStoreUhidTextBox().sendKeys(checkIN);
		Thread.sleep(2000);
		PM10639.getStoreUhidImgSerch().click();
		wait.until(ExpectedConditions.invisibilityOf(PM10639.getBlackOverlay()));
		PM10639.getStoreUhidIssueQuantity().clear();
		Thread.sleep(4000);
		//susitute item 
		String	 parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);	
		PM10639.getpharmacyIsuueSubsituteItemLink().click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);	
		System.out.println(driver.getTitle());
		PM10639.getSubsituteScreenCheckBoxLink().click();
		PM10639.getSubsituteScreenSelectButtonLink().click();
		driver.switchTo().window(parent3);
		Thread.sleep(10000);
		PM10639.getStoreUhidIssueQuantity().sendKeys("3");
		Thread.sleep(2000);
		PM10639.getStoreUhidIssueSaveButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		Thread.sleep(2000);
		
	}
	
}