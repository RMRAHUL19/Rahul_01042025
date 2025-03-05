package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PM10638_LaboratoryPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class PM10638_LaboratoryTest extends CrossBrowser{
	public PM10638_LaboratoryTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	PM10638_LaboratoryPage SR;
	util utilobj=new util();
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));	

	}
	 
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),"LABORATORY SERVICE",Browser);
	}
	@Test(priority =3)
	public void TC_Store_003() throws InterruptedException, AWTException {
		SR=hishomepage.doNavigatetoLaboratory_Bulk_Result_Screen();
		
	}
	@Test(priority =4)
	public void TC_Store_004() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		utilobj.JSEnterText(SR.getLaboratory_BulkResult_txtFromDateLink(), driver, "21-may-2021");
		Thread.sleep(2000);
		utilobj.JSEnterText(SR.geLaboratory_BulkResult_txtToDate(), driver, "21-may-2021");
		Thread.sleep(2000);
		utilobj.JSClick(SR.getLaboratory_BulkResult_OkButtonLink(), driver);
//		getLaboratory_BulkResult_OkButtonLink().click();
		Thread.sleep(5000);
		SR.getLaboratory_Test_insuranceNotxtbox().sendKeys("1199900090");
		Thread.sleep(5000);
		utilobj.JSClick(SR.getLaboratory_BulkResult_OkButtonLink(), driver);
		 //getLaboratory_BulkResult_OkButtonLink().click();
		 Thread.sleep(5000);	
		 SR.getLaboratory_BulkResult_verifycheckboxLink();

		Thread.sleep(2000);		
//		SR.getLaboratory_BulkResult_privewLink().click();
//		Thread.sleep(5000);
//		utilobj.SwitchToChildWindow(driver, "LabReport");
//		Thread.sleep(5000);
//		driver.close();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver, "TestWiseResultEntry");ctl00_PageUpdateProgress
//		Thread.sleep(5000);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl03_txtControl")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl04_txtControl")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_gdvDoctors_ctl03_chkDoctor")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl03_txtControl")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_gdvSearchResult_ctl04_txtControl")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_gdvDoctors_ctl03_chkDoctor")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		
	}
	
}
