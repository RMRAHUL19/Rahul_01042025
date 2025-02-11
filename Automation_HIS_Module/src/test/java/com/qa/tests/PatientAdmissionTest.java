package com.qa.tests;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientAdmissionPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.UHIDPage;
import com.qa.util.util;

public class PatientAdmissionTest extends BaseTest {
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
	@Test(priority = 0)
	public void doLoginTest() throws InterruptedException, IOException {

		loginpage = new Loginpage(driver);
		
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() throws InterruptedException {
		Thread.sleep(1000);
		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();

		
	}

	@Test(priority = 2)

	public void doNavigateToHISHomeTest() throws IOException, InterruptedException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}

	@Test(priority = 3)
	public void doNavigateToPatientAdmissionTest() throws IOException {
		
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
	}
	@Test(priority = 4)
	
	public void Registration_Patient_Admission_TC_1() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getTxtIPNO()));
		patientAdmissionpage.getTxtIPNO().sendKeys(prop.getProperty("Production_IPNUmber"));
		Thread.sleep(2000);
		patientAdmissionpage.getLnkbtnIPNo().click();
//		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getHisLiveListControlchkUHID()));
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlbtnSelect().click();

				Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getPermanentSameAsPresentRadiobutton()));		
		utilobj.JSClick(patientAdmissionpage.getPermanentSameAsPresentRadiobutton(), driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(patientAdmissionpage.getDdlAdmissionType()));
		
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral");
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary");
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine");
		Thread.sleep(4000);
		
		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "MEDICINE");
		Thread.sleep(4000);
		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		
		patientAdmissionpage.getBtnSave().click();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
	}
	@Test(priority = 5)
	
	public void Registration_Patient_Admission_TC_2() throws InterruptedException {
		
		Thread.sleep(4000);
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
		WebDriverWait wait=new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(4000);
		patientAdmissionpage.getTxtIPNO().sendKeys(prop.getProperty("Production_IPNUmber"));
		Thread.sleep(4000);
		patientAdmissionpage.getLnkbtnIPNo().click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlbtnSelect().click();
		
		Thread.sleep(4000);
		utilobj.selectDropdown(patientAdmissionpage.getddlReligion(), driver, "BUDHISM");
		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getBtnSave(), driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getMyMessageBoxSuccusButtonYes(), driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		admissionNumber=patientAdmissionpage.getAdmissionNoTextBox().getText();//IP042100003IP102100048
		Thread.sleep(2000);
	System.out.println(admissionNumber);
	}
	@Test(priority = 6)
public void Registration_Patient_Admission_TC_3() throws InterruptedException {
		
		Thread.sleep(2000);
			
			 
				utilobj.JSClick(patientAdmissionpage.getpritnButton(), driver);
				WebDriverWait wait=new WebDriverWait(driver, 300);
				 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
				 Thread.sleep(120000);
			 utilobj.SwitchToChildWindow(driver, "PrintReports.aspx");
			 Thread.sleep(6000);
			 driver.close();
			 Thread.sleep(6000);
			 utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	}
//	@Test(priority = 7)
//	public void	Registration_Patient_Admission_TC_5() throws InterruptedException {
//		Thread.sleep(8000);	
//		patientAdmissionpage.getpatientAdmission_UHIDDepositedetail().click();
//		WebDriverWait wait=new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//	utilobj.SwitchToChildWindow(driver, " 	DepositDetails-Dhanwantri ");
//	Thread.sleep(6000);		
////	/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]
//	driver.findElement(By.id("txtamt")).sendKeys("2000");
//	Thread.sleep(2000);	
//	driver.findElement(By.id("btnSaveDepositDetails")).click();
//	
//	Thread.sleep(10000);
//	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//	}
//	@Test(priority = 8)
//	
//	public void Registration_Patient_Admission_TC_7() throws InterruptedException {
//		Thread.sleep(4000);
//		String dateName=new SimpleDateFormat("ddMMyyyy").format(new Date());
//		Thread.sleep(4000);
//		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornCheckBox().click();
//		Thread.sleep(4000);
//		String parent3 = driver.getWindowHandle();
//		utilobj.Window(driver);
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgBtn().click();
//		Thread.sleep(8000);
//		utilobj.ChildWindow(driver);
//		Thread.sleep(4000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionSearch().click();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionTextbox().sendKeys("test");
//		Thread.sleep(4000);//IP032200087 	
//		patientAdmissionpage.getnewBornImgMotherAdmissionBtnSearch().click();
//		WebDriverWait wait=new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		Thread.sleep(120000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionRadioButton().click();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionSelectButton().click();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionOkButton().click();
//		Thread.sleep(4000);
//		driver.switchTo().window(parent3);
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornDOB().sendKeys(dateName);
//		Thread.sleep(4000);
//		utilobj.JSClick(patientAdmissionpage.getPermanentSameAsPresentRadiobutton(), driver);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral");
//		Thread.sleep(2000);
//		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary");
//		Thread.sleep(2000);
//		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine");
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "MEDICINE");
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Female medical ward");
//	
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		patientAdmissionpage.getBtnSave().click();
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
//	
//		
//		
//	}
//	@Test(priority = 9)
//	public void Registration_Patient_Admission_TC_9() throws InterruptedException {
//		Thread.sleep(2000);
//		patientAdmissionpage.getAdmissionSearchImage().click();
//		WebDriverWait wait=new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		Thread.sleep(2000);
//		patientAdmissionpage.getAdmissionSearchtextbox().sendKeys(admissionNumber);
//		Thread.sleep(2000);
//		patientAdmissionpage.getAdmissionSearchButton().click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		patientAdmissionpage.getAdmissionSearchRadioButton().click();
//		Thread.sleep(2000);
//		patientAdmissionpage.getAdmissionSearchSelectButton().click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//	}
//	
//	@Test(priority = 10)
//	public void Registration_Patient_Admission_TC_6() throws InterruptedException
//	{
//		Thread.sleep(2000);	
//		patientAdmissionpage.getAdmissionCancelButton().click();
//		Thread.sleep(2000);	
//	patientAdmissionpage.getMyMessageBoxSuccusButtonYes().click();
//	Thread.sleep(2000);	
//	}
}
