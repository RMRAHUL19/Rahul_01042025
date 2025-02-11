package ESIC_HIS.ProductionScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.C13622_MISC_Change_In_HIS_ITR2_Page;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class C13622_MISC_Change_In_HIS_ITR2_Test extends CrossBrowser {


HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
String getUhid=null;
String checkIN=null;
Loginpage loginpage;
C13622_MISC_Change_In_HIS_ITR2_Page MISC2;
String PresentPrimaryMobileNumberLableText;
String PermanantPrimaryMobileNumberLableText;
String PresentAlternativeMobileNumberLableText;
String PermanantAlternativeMobileNumberLableText;
String getMobileNumber;
String getMobileNumberpermanant;
util utilobj = new util();
String date;
String splitdate;
String splitOrderdate;
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
public void DoTestForGotoCheckInScreen() {
	MISC2=hishomepage.doNavigateToCheckIn_SCreenForMISC_Change_In_HISITR2();
}
@Test(priority = 4)
public void HIS_ClinicalRecord_Casesheet_TC_3() throws InterruptedException {
	

	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
	MISC2.getUHIDScreen_clearButton().click();
	Thread.sleep(2000);
	MISC2.getPatientCheckIn_IPtextBox().sendKeys("5217002015");
	Thread.sleep(2000);
	MISC2.getLiveListLink().click();
	wait.until(ExpectedConditions.visibilityOf(MISC2.getLiveListSelfRadioButton()));
	MISC2.getLiveListSelfRadioButton().click();
	Thread.sleep(2000);
	MISC2.getLiveListSelectButton().click();

	
	wait.until(ExpectedConditions.invisibilityOf(MISC2.getBlackOverlay()));
	
	Thread.sleep(4000);
	//PM10639.getpatientCheckInNumberSeviceOkButton().click();
	utilobj.JSClick(MISC2.getpatientCheckInNumberSeviceOkButton(), driver);
Thread.sleep(4000);
// 
MISC2.getpatientCheckInNumberSaveButton().click();
Thread.sleep(4000);

System.out.println(MISC2.getPopupmessage().getText());
System.out.println(utilobj.GetCheckinNumberText(MISC2.getPopupmessage(), driver));

checkIN = utilobj.GetCheckinNumberText(MISC2.getPopupmessage(), driver);
}
@Test(priority = 14)
@Parameters("browser")
public void dodoctorworklist(String Browser) throws InterruptedException {
	MISC2.getBtncancel().click();
	Thread.sleep(1000);
	getUhid= MISC2.getUHID_creation_Uhid_txtbox().getAttribute("value");
	Thread.sleep(3000);
	System.out.println(getUhid);
	
	Thread.sleep(1000);
	utilobj.MoveElement(MISC2.getClinicalRecordsLink(), driver);
	Thread.sleep(2000);
	MISC2.getDoctorWorklistLink().click();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.visibilityOf(MISC2.getdoctorworklist_checkintextBox()));
	Thread.sleep(2000);
	utilobj.JSEnterText(MISC2.getdoctorworklist_checkintextBox(), driver, checkIN);
	Thread.sleep(2000);

utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);


	
		Thread.sleep(2000);

		//MISC.getpopupok().click();
		
		
	

		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		MISC2.getlableprecripstionlink().click();

		Thread.sleep(2000);

		
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		
		System.out.println(driver.getTitle());

		utilobj.JSEnterText(MISC2.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");

		utilobj.JSClick(MISC2.getclickorderpackbutton(), driver);

		
		Thread.sleep(3000);

		utilobj.JSClick(MISC2.getorderpackselection(), driver);

		
		utilobj.JSClick(MISC2.getbtnISaveClose(), driver);
		Thread.sleep(1000);
		utilobj.waitForalert(driver);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().window(parent3);
//		Thread.sleep(1000);
//		MISC.getpopupok().click();
		Thread.sleep(4000);
		utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[1]/tbody/tr[1]/td/span")));
		Thread.sleep(5000);
		date=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[2]/tbody/tr[2]/td/a[1]")).getText();
		System.out.println(date);
		splitdate=date.substring(0, 17);
		System.out.println(splitdate);
		Thread.sleep(1000);
}
}