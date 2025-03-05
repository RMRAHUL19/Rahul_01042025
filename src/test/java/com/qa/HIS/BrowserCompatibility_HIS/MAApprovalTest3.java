package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage3;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MAApprovalTest3  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage3 MAPage3;
	String EntryNo;
	util utilobj=new util();
	

	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
		
	}

	@Test(priority = 3)
	public void doNavigateToMALetterGenerationforHosptitaslLinks() {

		MAPage3 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks3();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
	
	 
    @Test(priority =5)
	public void TC_MA_Page_3_7_IPD_Attendance() throws InterruptedException, IOException {
		
		String txt="123471234";
		MAPage3.gettxtMaleMedicalWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtFemaleMedicalWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtMalePulmonaryWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtFemalePulmonaryWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtMaleSurgicalWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtFemaleSurgicalWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtMaleOrthWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtFemaleOrthoWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtDermatologyWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtPsychiatryWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtPaediatricWardAllocatedBed().sendKeys(txt);
		MAPage3.gettxtGynaecologyWardAllocatedBed().sendKeys(txt);
        MAPage3.gettxtObstetricWardAllocatedBed().sendKeys(txt);
        MAPage3.gettxtEyeWardAllocatedBed().sendKeys(txt);
        MAPage3.gettxtENTAllocatedBed().sendKeys(txt);
        MAPage3.gettxtAyurvedaWardAllocatedBed().sendKeys(txt);
        MAPage3.gettxtEmergencyWardAllocatedBed().sendKeys(txt);
        MAPage3.gettxtICUAllocatedBed().sendKeys(txt);
        MAPage3.gettxtNICUAllocatedBed().sendKeys(txt);
        MAPage3.gettxtHDUAllocatedBed().sendKeys(txt);
        MAPage3.gettxtDayCareAllocatedBed().sendKeys(txt);
        
        MAPage3.gettxtMaleMedicalWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtFemaleMedicalWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtMalePulmonaryWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtFemalePulmonaryWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtMaleSurgicalWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtFemaleSurgicalWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtMaleOrthoWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtFemaleOrthoWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtDermatologyWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtPsychiatryWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtPaediatricWardTotalAdmission().sendKeys(txt);
		MAPage3.gettxtGynaecologyWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtObstetricWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtEyeWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtENTWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtAyurvedaWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtEmergencyWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtICUWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtNICUWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtHDUWardTotalAdmission().sendKeys(txt);
        MAPage3.gettxtDayCareWardTotalAdmission().sendKeys(txt);
        
        
        MAPage3.gettxtMaleMedicalWardDischarge().sendKeys(txt);
		MAPage3.gettxtFemaleMedicalWardDischarge().sendKeys(txt);
		MAPage3.gettxtMalePulmonaryWardDischarge().sendKeys(txt);
		MAPage3.gettxtFemalePulmonaryWardDischarge().sendKeys(txt);
		MAPage3.gettxtMaleSurgicalWardDischarge().sendKeys(txt);
		MAPage3.gettxtFemaleSurgicalWardDischarge().sendKeys(txt);
		MAPage3.gettxtMaleOrthoWardDischarge().sendKeys(txt);
		MAPage3.gettxtFemaleOrthoWardDischarge().sendKeys(txt);
		MAPage3.gettxtDermatologyWardDischarge().sendKeys(txt);
		MAPage3.gettxtPsychiatryWardDischarge().sendKeys(txt);
		MAPage3.gettxtPaediatricWardDischarge().sendKeys(txt);
		MAPage3.gettxtGynaecologyWardDischarge().sendKeys(txt);
        MAPage3.gettxtObstetricWardDischarge().sendKeys(txt);
        MAPage3.gettxtEyeWardDischarge().sendKeys(txt);
        MAPage3.gettxtENTWardDischarge().sendKeys(txt);
        MAPage3.gettxtAyurvedaWardDischarge().sendKeys(txt);
        MAPage3.gettxtEmergencyWardDischarge().sendKeys(txt);
        MAPage3.gettxtICUWardDischarge().sendKeys(txt);
        MAPage3.gettxtNICUWardDischarge().sendKeys(txt);
        MAPage3.gettxtHDUWardDischarge().sendKeys(txt);
        MAPage3.gettxtDayCareWardDischarge().sendKeys(txt);
        
        MAPage3.gettxtMaleMedicalWardDeath().sendKeys(txt);
		MAPage3.gettxtFemaleMedicalWardDeath().sendKeys(txt);
		MAPage3.gettxtMalePulmonaryWardDeath().sendKeys(txt);
		MAPage3.gettxtFemalePulmonaryWardDeath().sendKeys(txt);
		MAPage3.gettxtMaleSurgicalWardDeath().sendKeys(txt);
		MAPage3.gettxtFemaleSurgicalWardDeath().sendKeys(txt);
		MAPage3.gettxtMaleOrthoWardDeath().sendKeys(txt);
		MAPage3.gettxtFemaleOrthoWardDeath().sendKeys(txt);
		MAPage3.gettxtDermatologyWardDeath().sendKeys(txt);
		MAPage3.gettxtPsychiatryWardDeath().sendKeys(txt);
		MAPage3.gettxtPaediatricWardDeath().sendKeys(txt);
		MAPage3.gettxtGynaecologyWardDeath().sendKeys(txt);
        MAPage3.gettxtObstetricWardDeath().sendKeys(txt);
        MAPage3.gettxtEyeWardDeath().sendKeys(txt);
        MAPage3.gettxtENTWardDeath().sendKeys(txt);
        MAPage3.gettxtAyurvedaWardDeath().sendKeys(txt);
        MAPage3.gettxtEmergencyWardDeath().sendKeys(txt);
        MAPage3.gettxtICUWardDeath().sendKeys(txt);
        MAPage3.gettxtNICUWardDeath().sendKeys(txt);
        MAPage3.gettxtHDUWardDeath().sendKeys(txt);
        MAPage3.gettxtDayCareWardDeath().sendKeys(txt);
        
}
    @Test(priority =6)
	public void TC_MA_Page_3_7_Extra_field_add_delete() throws InterruptedException {
		
    	String txt="test1289918bxyusbx wuevwu";
    	String num="123471234";
 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataDelete1")).click();
 		MAPage3.getPage3_btnExtraDataAdd1().click();
		MAPage3.getPage3_txtExtraDataValue1().sendKeys(txt);
		MAPage3.getPage3_txtExtraAllocatedBed1().sendKeys(num);
 		MAPage3.getPage3_txtExtraTotalAdmission1().sendKeys(num);
 		MAPage3.getPage3_txtExtraDischarge1().sendKeys(num);
 		MAPage3.getPage3_txtExtraDayCare1().sendKeys(num);

 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataDelete2")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataAdd2")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDataValue2")).sendKeys(txt);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraAllocatedBed2")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraTotalAdmission2")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDischarge2")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDayCare2")).sendKeys(num);
 		

 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataDelete3")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataAdd3")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDataValue3")).sendKeys(txt);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraAllocatedBed3")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraTotalAdmission3")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDischarge3")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDayCare3")).sendKeys(num);
 		

 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataDelete4")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataAdd4")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDataValue4")).sendKeys(txt);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraAllocatedBed4")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraTotalAdmission4")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDischarge4")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDayCare4")).sendKeys(num);
 		

 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataDelete5")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraDataAdd5")).click();
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDataValue5")).sendKeys(txt);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraAllocatedBed5")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraTotalAdmission5")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDischarge5")).sendKeys(num);
 		driver.findElement(By.id("ctl00_cphpage_Page3_txtExtraDayCare5")).sendKeys(num);
 		
		
	}
    
    @Test(priority =7)
	public void TC_MA_Page_3_7_2_super_speciality_availability() throws InterruptedException {
		
		utilobj.selectDropdown(MAPage3.getddlIPDServicesAvailable(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage3.getddlIPDServicesAvailable(), driver, "Yes", "firefox");


    }
    
    @Test(priority =8)
 	public void TC_MA_Page_3_7_2_super_speciality_entries() throws InterruptedException, IOException {
 		
 		String txt="123471234";
 		
 		MAPage3.gettxtNephrologyWardAllocatedBed().sendKeys(txt);
 		MAPage3.gettxtOncologyWardAllocatedBed().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardAllocatedBed().sendKeys(txt);
 		
 		MAPage3.gettxtNephrologyWardTotalAdmissions().sendKeys(txt);
 		MAPage3.gettxtOncologyWardTotalAdmissions().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardTotalAdmissions().sendKeys(txt);
 		
 		MAPage3.gettxtNephrologyWardDischarge().sendKeys(txt);
 		MAPage3.gettxtOncologyWardDischarge().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardDischarge().sendKeys(txt);
 		

 		MAPage3.gettxtNephrologyWardDeath().sendKeys(txt);
 		MAPage3.gettxtOncologyWardDeath().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardDeath().sendKeys(txt);
}
    
    @Test(priority =9)
   	public void TC_MA_Page_3_7_2_super_speciality_extra_fields() throws InterruptedException {
   		
    	String txt="test1289918bxyusbx wuevwu";
    	String num="123471234";
   		MAPage3.getbtnExtraIncludedAdd1().click();
   		MAPage3.gettxtExtraIncludedValue1().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed1().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath1().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete1")).click();
		MAPage3.getbtnExtraIncludedAdd1().click();
   		MAPage3.gettxtExtraIncludedValue1().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed1().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath1().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd2().click();
   		MAPage3.gettxtExtraIncludedValue2().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed2().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath2().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete2")).click();
		MAPage3.getbtnExtraIncludedAdd2().click();
   		MAPage3.gettxtExtraIncludedValue2().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed2().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath2().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd3().click();
   		MAPage3.gettxtExtraIncludedValue3().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed3().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath3().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete3")).click();
		MAPage3.getbtnExtraIncludedAdd3().click();
   		MAPage3.gettxtExtraIncludedValue3().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed3().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath3().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd4().click();
   		MAPage3.gettxtExtraIncludedValue4().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed4().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath4().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete4")).click();
		MAPage3.getbtnExtraIncludedAdd4().click();
   		MAPage3.gettxtExtraIncludedValue4().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed4().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath4().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd5().click();
   		MAPage3.gettxtExtraIncludedValue5().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed5().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath5().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete5")).click();
		MAPage3.getbtnExtraIncludedAdd5().click();
   		MAPage3.gettxtExtraIncludedValue5().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed5().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath5().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd6().click();
   		MAPage3.gettxtExtraIncludedValue6().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed6().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath6().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete6")).click();
		MAPage3.getbtnExtraIncludedAdd6().click();
   		MAPage3.gettxtExtraIncludedValue6().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed6().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath6().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd7().click();
   		MAPage3.gettxtExtraIncludedValue7().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed7().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath7().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete7")).click();
		MAPage3.getbtnExtraIncludedAdd7().click();
   		MAPage3.gettxtExtraIncludedValue7().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed7().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath7().sendKeys(num);
   		
   	}
    @Test(priority =10)
	public void TC_MA_Page_3_7_2_super_speciality_availability_no() throws InterruptedException {
		
		utilobj.selectDropdown(MAPage3.getddlIPDServicesAvailable(), driver, "No", "firefox");
		Thread.sleep(1000);
		utilobj.selectDropdown(MAPage3.getddlIPDServicesAvailable(), driver, "Yes", "firefox");

}
    
    @Test(priority =11)
 	public void TC_MA_Page_3_7_2_super_speciality_entries_redo() throws InterruptedException, IOException {
 		
 		String txt="123471234";
 		
 		MAPage3.gettxtNephrologyWardAllocatedBed().sendKeys(txt);
 		MAPage3.gettxtOncologyWardAllocatedBed().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardAllocatedBed().sendKeys(txt);
 		
 		MAPage3.gettxtNephrologyWardTotalAdmissions().sendKeys(txt);
 		MAPage3.gettxtOncologyWardTotalAdmissions().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardTotalAdmissions().sendKeys(txt);
 		
 		MAPage3.gettxtNephrologyWardDischarge().sendKeys(txt);
 		MAPage3.gettxtOncologyWardDischarge().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardDischarge().sendKeys(txt);
 		

 		MAPage3.gettxtNephrologyWardDeath().sendKeys(txt);
 		MAPage3.gettxtOncologyWardDeath().sendKeys(txt);
 		MAPage3.gettxtCardiologyWardDeath().sendKeys(txt);
}
    
    @Test(priority =12)
   	public void TC_MA_Page_3_7_2_super_speciality_extra_fields_redo() throws InterruptedException {
   		
    	String txt="test1289918bxyusbx wuevwu";
    	String num="123471234";
   		MAPage3.getbtnExtraIncludedAdd1().click();
   		MAPage3.gettxtExtraIncludedValue1().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed1().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath1().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete1")).click();
		MAPage3.getbtnExtraIncludedAdd1().click();
   		MAPage3.gettxtExtraIncludedValue1().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed1().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge1().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath1().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd2().click();
   		MAPage3.gettxtExtraIncludedValue2().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed2().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath2().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete2")).click();
		MAPage3.getbtnExtraIncludedAdd2().click();
   		MAPage3.gettxtExtraIncludedValue2().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed2().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge2().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath2().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd3().click();
   		MAPage3.gettxtExtraIncludedValue3().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed3().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath3().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete3")).click();
		MAPage3.getbtnExtraIncludedAdd3().click();
   		MAPage3.gettxtExtraIncludedValue3().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed3().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge3().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath3().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd4().click();
   		MAPage3.gettxtExtraIncludedValue4().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed4().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath4().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete4")).click();
		MAPage3.getbtnExtraIncludedAdd4().click();
   		MAPage3.gettxtExtraIncludedValue4().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed4().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge4().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath4().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd5().click();
   		MAPage3.gettxtExtraIncludedValue5().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed5().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath5().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete5")).click();
		MAPage3.getbtnExtraIncludedAdd5().click();
   		MAPage3.gettxtExtraIncludedValue5().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed5().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge5().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath5().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd6().click();
   		MAPage3.gettxtExtraIncludedValue6().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed6().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath6().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete6")).click();
		MAPage3.getbtnExtraIncludedAdd6().click();
   		MAPage3.gettxtExtraIncludedValue6().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed6().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge6().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath6().sendKeys(num);
		
		MAPage3.getbtnExtraIncludedAdd7().click();
   		MAPage3.gettxtExtraIncludedValue7().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed7().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath7().sendKeys(num);
		driver.findElement(By.id("ctl00_cphpage_Page3_btnExtraIncludedDelete7")).click();
		MAPage3.getbtnExtraIncludedAdd7().click();
   		MAPage3.gettxtExtraIncludedValue7().sendKeys(txt);
   		MAPage3.gettxtExtraIncludedAllocatedBed7().sendKeys(num);
		MAPage3.gettxtExtraIncludedTotalAdmission7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDischarge7().sendKeys(num);
		MAPage3.gettxtExtraIncludedDeath7().sendKeys(num);
   		
   	
    }
    
     
       @Test(priority =13)
   	public void TC_MA_Page_3_7_uncheck() throws InterruptedException {
   		
   		MAPage3.getchkBedOccupancy().click();
   		MAPage3.getchkBedTurnover().click();
   		MAPage3.getchkAverageLengthALOS().click();
   		MAPage3.getchkNurseBedRatio().click();
   		
   	}
       
       @Test(priority =14)
  	public void TC_MA_Page_3_7_recheck() throws InterruptedException {
  		
  		MAPage3.getchkBedOccupancy().click();
  		MAPage3.getchkBedTurnover().click();
  		MAPage3.getchkAverageLengthALOS().click();
  		MAPage3.getchkNurseBedRatio().click();
  		
  	}
       @Test(priority =15)
   	public void TC_MA_Page_3_7_dropdown_redo() throws InterruptedException {
   		
   		utilobj.selectDropdown(MAPage3.getddlBedOccupancy(), driver, "Partially using Dhanwantri Application", "firefox");
   		utilobj.selectDropdown(MAPage3.getddlBedTurnover(), driver, "Partially using Dhanwantri Application", "firefox");
   		utilobj.selectDropdown(MAPage3.getddlAverageLengthALOS(), driver, "Partially using Dhanwantri Application", "firefox");
   		utilobj.selectDropdown(MAPage3.getddlNurseBedRatio(), driver, "Partially using Dhanwantri Application", "firefox");
   }
       

       @Test(priority =16)
	public void TC_MA_Page_3_7_entries_redo() throws InterruptedException, IOException {
		
		String txt="123471234";
		
		MAPage3.gettxtBedOccupancy().sendKeys(txt);
   		MAPage3.gettxtBedTurnover().sendKeys(txt);
   		MAPage3.gettxtAverageLengthALOS().sendKeys(txt);
   		MAPage3.gettxtNurseBedRatio().sendKeys(txt);
		

}
       @Test(priority =17)
   	public void TC_MA_Page_3_remarks() throws InterruptedException, IOException {

   	String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.129.47jhdgh";
   	
   		MAPage3.gettxtIPDAttendanceRemarks().sendKeys(txt);
   		driver.findElement(By.id("ctl00_cphpage_Page3_txtPharmacyRemarks")).sendKeys(txt);
   }

	@Test(priority =18)
	public void TC_MA_Page_3_8_status_drugs_float() throws InterruptedException, IOException {
	
	String txt="12347.12341";
	
		MAPage3.gettxtDrugExpiredFloatAllopathy().sendKeys(txt);
		MAPage3.gettxtDrugExpiredFloatAyurvedic().sendKeys(txt);
		MAPage3.gettxtDrugExpiredFloatHomeopathy().sendKeys(txt);

		
	

	}

	@Test(priority =19)
	public void TC_MA_Page_3_8_status_drugs_numeric() throws InterruptedException, IOException {
	
	String txt="123471234";
	String num="123471";
	
		MAPage3.gettxtRCDrugAllopathy().sendKeys(txt);
		MAPage3.gettxtRCDrugAyurvedic().sendKeys(txt);
		MAPage3.gettxtRCDrugHomeopathy().sendKeys(txt);
		MAPage3.gettxtRCDrugAvailableAllopathy().sendKeys(num);
		MAPage3.gettxtRCDrugAvailableAyurvedic().sendKeys(num);
		MAPage3.gettxtRCDrugAvailableHomeopathy().sendKeys(num);
		
	

}
	
	
	@Test(priority =20)
	public void TC_MA_Page_3_8_GEM_NONGEM_float_plus_numeric() throws InterruptedException, IOException {
	
		String num = "12347.12341";
		String txt="123471234";
		MAPage3.gettxtGemPurchaseDrugs().clear();
		MAPage3.gettxtNonGemPurchaseDrugs().sendKeys(num);
		MAPage3.gettxtGemPurchaseLab().sendKeys(txt);
		MAPage3.gettxtNonGemPurchaseLab().sendKeys(txt);
		MAPage3.gettxtGemPurchaseEquipment().sendKeys(txt);
		MAPage3.gettxtNonGemPurchaseEquipment().sendKeys(txt);
		
}
	
	
	@Test(priority =21)
	public void TC_MA_Page_3_8_status_drugs_autofetch_check() throws InterruptedException, IOException {
	
	String txt="100.00";

		assertEquals(driver.findElement(By.id("ctl00_cphpage_Page3_txtRCDrugsAvailablePercentageAllopathy")).getAttribute("value"), txt);
		assertEquals(driver.findElement(By.id("ctl00_cphpage_Page3_txtRCDrugsAvailablePercentageAyurvedic")).getAttribute("value"), txt);
		assertEquals(driver.findElement(By.id("ctl00_cphpage_Page3_txtRCDrugsAvailablePercentageHomeopathy")).getAttribute("value"), txt);
		
}

	

	@Test(priority =22)
	public void TC_MA_Page_3_8_LPRCDrugsAmount_float() throws InterruptedException, IOException {
	
		String txt="12347.12341";
		
		MAPage3.gettxtLPRCDrugsAmount().sendKeys(txt);

}

	@Test(priority =23)
	public void TC_MA_Page_3_8_LPRCDrugsReason_alphanumeric_plus_special_characters() throws InterruptedException, IOException {
		
		MAPage3.gettxtLPRCDrugsReason().clear();

}
	@Test(priority =24)
	public void TC_MA_Page_3_8_LPNonRCDrugs_numeric_amount() throws InterruptedException, IOException {
	
		String txt="12912345.47jhdgh'.;][32 bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		
		MAPage3.gettxtNONLPRCDrugs().sendKeys(txt);
		MAPage3.gettxtNONLPRCLab().sendKeys(txt);
		MAPage3.gettxtNONLPRCEquipments().sendKeys(txt);
}

	@Test(priority =25)
	public void TC_MA_Page_3_8_RCNonRCExpenditure_float() throws InterruptedException, IOException {
	
		String txt="12347.12341";
		
		MAPage3.gettxtExpRCDrugAyurveda().sendKeys(txt);
		MAPage3.gettxtExpRCDrugHomeo().sendKeys(txt);
		MAPage3.gettxtExpRCDrugYoga().sendKeys(txt);
		MAPage3.gettxtExpNonRCDrugAyurveda().sendKeys(txt);
	    MAPage3.gettxtExpNonRCDrugHomeo().sendKeys(txt);
	    MAPage3.gettxtExpNonRCDrugYoga().sendKeys(txt);

    
}
	
	
	@Test(priority =29)
	public void TC_MA_Page_3_9_ICUHDUNICU_unchecking() throws InterruptedException {
		
		MAPage3.getchkTotalICUBeds().click();
		MAPage3.getchkTotalHDUBeds().click();
		MAPage3.getchkTotalNICUBeds().click();
}
	
	
	@Test(priority =30)
	public void TC_MA_Page_3_9_ICUHDUNICU_redo_Checkbox() throws InterruptedException {
		
		MAPage3.getchkTotalICUBeds().click();
		MAPage3.getchkTotalHDUBeds().click();
		MAPage3.getchkTotalNICUBeds().click();
}

	
	@Test(priority =31)
	public void TC_MA_Page_3_9_ICUHDUNICU_redo_Dropdown() throws InterruptedException {
		
		utilobj.selectDropdown(MAPage3.getddlTotalICUBeds(), driver, "Partially using Dhanwantri Application", "firefox");
		utilobj.selectDropdown(MAPage3.getddlTotalHDUBeds(), driver, "Partially using Dhanwantri Application", "firefox");
		utilobj.selectDropdown(MAPage3.getddlTotalNICUBeds(), driver, "Partially using Dhanwantri Application", "firefox");
}

	@Test(priority =32)
	public void TC_MA_Page_3_9_ICUHDUNICU_redo_entries() throws InterruptedException, IOException {
		
		String txt="123471234";
		
		MAPage3.gettxtTotalICUBeds().sendKeys(txt);
		MAPage3.gettxtTotalHDUBeds().sendKeys(txt);
		MAPage3.gettxtTotalNICUBeds().sendKeys(txt);
	}


	@Test(priority =33)
	public void TC_MA_Page_3_mandatory_alert_check() throws InterruptedException, IOException {
		
		
		Thread.sleep(1000);
		try {
			MAPage3.getbtnNext().click();
			MAPage3.getbtnNext().sendKeys(Keys.ENTER);
		    Alert alert = driver.switchTo().alert();
		    // You can get the text of the alert and handle it accordingly
		    System.out.println("Alert message: " + alert.getText());
			assertEquals(alert.getText(), "Please enter GeM Purchase Drugs.");
		    
		    // You can dismiss the alert using the dismiss() method
		    alert.dismiss();
		    // Or you can accept it using the accept() method
		    // alert.accept();
		    
		    // Continue with your test script
		} catch (NoAlertPresentException e) {
		    // Log the exception or handle it appropriately
		    e.printStackTrace();
		}

	
	}

	@Test(priority =34)
	public void TC_MA_Page_3_8_GemPurchaseDrugs_float() throws InterruptedException, IOException {
		
		String txt="12347.12341";
		
		MAPage3.gettxtGemPurchaseDrugs().sendKeys(txt);
	
	}
	
	@Test(priority =35)
	public void TC_MA_Page_3_save_and_next() throws InterruptedException {
		
		MAPage3.getbtnNext().click();
	}
	}