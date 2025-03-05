package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientAdmissionPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.UHIDPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class PatientAdmissionTest extends CrossBrowser {
	
	public PatientAdmissionTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PatientAdmissionPage patientAdmissionpage;
	String typevalue;
	String admissionNumber;
	org.slf4j.Logger logger = LoggerFactory.getLogger(PatientAdmissionTest.class);
	@Test(priority = 0)
	public void doLoginTest() throws InterruptedException, IOException {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
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
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 3)
	public void doNavigateToPatientAdmissionTest() throws IOException {
		
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void Registration_Patient_Admission_TC_1(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtInsuranceNo")));
		patientAdmissionpage.getTxtIPNO().sendKeys(prop.getProperty("IPnumber2"));
		Thread.sleep(2000);
		patientAdmissionpage.getLnkbtnIPNo().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID")));

		patientAdmissionpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlbtnSelect().click();
		utilobj.JSClick(patientAdmissionpage.getPermanentSameAsPresentRadiobutton(), driver);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Male Medical Ward", Browser);
		Thread.sleep(2000);
		patientAdmissionpage.getBtnSave().click();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void Registration_Patient_Admission_TC_2(String Browser) throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
		Thread.sleep(2000);
		patientAdmissionpage.getTxtIPNO().sendKeys(prop.getProperty("IPnumber2"));
		Thread.sleep(1000);
		patientAdmissionpage.getLnkbtnIPNo().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getHisLiveListControlchkUHID()));
		patientAdmissionpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getddlReligion()));
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlReligion(), driver, "BUDHISM", Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Male Medical Ward", Browser);
		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getBtnSave(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getMyMessageBoxSuccusButtonYes(), driver);
		Thread.sleep(2000);
		admissionNumber=patientAdmissionpage.getAdmissionNoTextBox().getText();//IP042100003IP102100048
		Thread.sleep(2000);
		System.out.println(admissionNumber);
	}
	@Test(priority = 6)
	public void Registration_Patient_Admission_TC_3() throws InterruptedException {
		
		
			
			 
		utilobj.JSClick(patientAdmissionpage.getpritnButton(), driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	}
	@Test(priority = 7)
	public void	Registration_Patient_Admission_TC_5() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		org.slf4j.Logger logger = LoggerFactory.getLogger(PatientAdmissionTest.class);
		Thread.sleep(2000);
		String mainWindowHandle = driver.getWindowHandle();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_cphpage_btnDepositDetails")));
		

		patientAdmissionpage.getpatientAdmission_UHIDDepositedetail().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		logger.info("title");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtamt"))));
		driver.findElement(By.id("txtamt")).sendKeys("2000");
		Thread.sleep(1000);	
		driver.findElement(By.id("btnSaveDepositDetails")).click();
		
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		}
	@Test(priority = 8)
	@Parameters("browser")
	public void Registration_Patient_Admission_TC_7(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		String dateName=new SimpleDateFormat("ddMMyyyy").format(new Date());
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		Thread.sleep(2000);
		patientAdmissionpage.getnewBornCheckBox().click();
		utilobj.Window(driver);
		Thread.sleep(2000);
		patientAdmissionpage.getnewBornImgBtn().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		patientAdmissionpage.getnewBornImgMotherAdmissionSearch().click();
		Thread.sleep(2000);
		patientAdmissionpage.getnewBornImgMotherAdmissionTextbox().sendKeys("pooja");
		//IP032200087 	
		patientAdmissionpage.getnewBornImgMotherAdmissionBtnSearch().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(3000);
		patientAdmissionpage.getnewBornImgMotherAdmissionRadioButton().click();
		Thread.sleep(2000);
		patientAdmissionpage.getnewBornImgMotherAdmissionSelectButton().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("rbl_0"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("rbl_0"))));
		driver.findElement(By.id("rbl_0")).click();
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ddlBabyGender")), driver, "Male", "firefox");
		Thread.sleep(2000);
		driver.findElement(By.id("txtDOB")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtDob_CalendarExtender2_today")).click();
		Thread.sleep(2000);
		patientAdmissionpage.getnewBornImgMotherAdmissionOkButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		patientAdmissionpage.getnewBornDOB().sendKeys(dateName);
//		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getPermanentSameAsPresentRadiobutton(), driver);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "Medicine",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Female medical ward", Browser);
		Thread.sleep(2000);
		patientAdmissionpage.getBtnSave().click();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		
		
		
	}
	@Test(priority = 9)
	public void Registration_Patient_Admission_TC_9() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		Thread.sleep(2000);
		admissionNumber=(patientAdmissionpage.getAdmissionNoTextBox().getAttribute("value"));
		Thread.sleep(1000);
		System.out.println(patientAdmissionpage.getAdmissionNoTextBox().getAttribute("value"));
		System.out.println(admissionNumber);
		logger.info(patientAdmissionpage.getAdmissionNoTextBox().getAttribute("value"));
		logger.info("number");
		logger.info(admissionNumber);
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getAdmissionSearchImage()));
		wait.until(ExpectedConditions.elementToBeClickable(patientAdmissionpage.getAdmissionSearchImage()));
		patientAdmissionpage.getAdmissionSearchImage().click();
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchtextbox().sendKeys(admissionNumber);
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchButton().click();
		patientAdmissionpage.getAdmissionSearchRadioButton().click();
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchSelectButton().click();
	}
	
	@Test(priority = 10)
	public void Registration_Patient_Admission_TC_6() throws InterruptedException
	{
		Thread.sleep(2000);	
		patientAdmissionpage.getAdmissionCancelButton().click();
		Thread.sleep(2000);	
		patientAdmissionpage.getMyMessageBoxSuccusButtonYes().click();
	}
}
