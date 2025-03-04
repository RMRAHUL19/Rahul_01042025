package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage4;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MAApprovalTest4  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage4 MAPage4;
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

		MAPage4 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks4();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
	
	 @Test(priority =5)
		public void TC_MA_Page4_SanctionedA() throws InterruptedException, IOException {
			
			String txt="123471234";
			MAPage4.gettxtNursingSactioned().sendKeys(txt);
			MAPage4.gettxtParamedicalLabSactioned().sendKeys(txt);
			MAPage4.gettxtParamedicalOTCSSDSactioned().sendKeys(txt);
			MAPage4.gettxtParamedicalRadiologySactioned().sendKeys(txt);
			MAPage4.gettxtParamedicalOthersSactioned().sendKeys(txt);
			MAPage4.gettxtPharmacistSactioned().sendKeys(txt);
			MAPage4.gettxtMinisterialSactioned().sendKeys(txt);
			
	 }
			
			@Test(priority =6)
			public void TC_MA_Page4_Regular_Contractual() throws InterruptedException, IOException {
				
				String txt="12347124";
			
			MAPage4.gettxtNursingRegular().sendKeys(txt);
			MAPage4.gettxtParamedicalLabRegular().sendKeys(txt);
			MAPage4.gettxtParamedicalOTRegular().sendKeys(txt);
			MAPage4.gettxtParamedicalRadiologyRegular().sendKeys(txt);
			MAPage4.gettxtParamedicalOthersRegular().sendKeys(txt);
			MAPage4.gettxtPharmacistRegular().sendKeys(txt);
			MAPage4.gettxtMinisterialRegular().sendKeys(txt);
			
			
			
			MAPage4.gettxtNursingContractual().sendKeys(txt);
			MAPage4.txttxtParamedicalLabContractual().sendKeys(txt);
			MAPage4.gettxtParamedicalOTContractual().sendKeys(txt);
			MAPage4.gettxtParamedicalRadiologyContractual().sendKeys(txt);
			MAPage4.gettxtParamedicalOthersContractual().sendKeys(txt);
			MAPage4.gettxtPharmacistContractual().sendKeys(txt);
			MAPage4.gettxtMinisterialContractual().sendKeys(txt);
			
			
}
	 @Test(priority =7)
		public void TC_MA_remarks_plus_check() throws InterruptedException, IOException {
			
			String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			
			MAPage4.gettxtNursingRemarks().sendKeys(txt);
			MAPage4.gettxtParamedicalLabRemarks().sendKeys(txt);
			MAPage4.gettxtParamedicalOTRemarks().sendKeys(txt);
			MAPage4.gettxtParamedicalRadiologyRemarks().sendKeys(txt);
			MAPage4.gettxtParamedicalOthersRemarks().sendKeys(txt);
			MAPage4.gettxtPharmacistRemarks().sendKeys(txt);
			MAPage4.gettxtMinisterialRemarks().sendKeys(txt);
			MAPage4.gettxtNursingRemarks().clear();

}
	 
	 @Test(priority =8)
		public void TC_MA_Page_3_8_status_drugs_autofetch_check() throws InterruptedException, IOException {
		
		String txt="-7";

			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtNursingVacant")).getAttribute("value"), txt);
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtParamedicalLabVacant")).getAttribute("value"), txt);
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtParamedicalOTVacant")).getAttribute("value"), txt);
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtParamedicalRadiologyVacant")).getAttribute("value"), txt);
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtParamedicalOthersVacant")).getAttribute("value"), txt);
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtPharmacistVacant")).getAttribute("value"), txt);
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page4_txtMinisterialVacant")).getAttribute("value"), txt);

	}
	 
	 @Test(priority =9)
		public void TC_MA_Page4_Sanctioned() throws InterruptedException, IOException {
		 Thread.sleep(1000);
			String txt="123471234";
			
			MAPage4.getTxtAnatomySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtPhysiologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtBiochemistrySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtPharmacologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtPathologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtMicrobiologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtFMTSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtStatisticianSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtPaediatricsSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtDermatologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtPsychiatrySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtGeneralSurgerySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtOphthalmologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtOBGYSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtDentistrySpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationSpecialistSactioned().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineSpecialistSactioned().sendKeys(txt);
			
			
			MAPage4.getTxtAnatomySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtPhysiologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtBiochemistrySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtPharmacologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtPathologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtMicrobiologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtFMTSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtStatisticianSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtPaediatricsSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtDermatologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtPsychiatrySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtGeneralSurgerySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtOphthalmologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtOBGYSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtDentistrySpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationSpecialistPositionRegular().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineSpecialistPositionRegular().sendKeys(txt);
			
			MAPage4.getTxtAnatomySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtPhysiologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtBiochemistrySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtPharmacologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtPathologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtMicrobiologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtFMTSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtStatisticianSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtPaediatricsSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtDermatologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtPsychiatrySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtGeneralSurgerySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtOphthalmologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtOBGYSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtDentistrySpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationSpecialistPositionContractual().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineSpecialistPositionContractual().sendKeys(txt);
	 }
			
			
			
			
			
			 @Test(priority =10) 
		public void TC_MA_Page4_Teaching() throws InterruptedException, IOException {
			 Thread.sleep(1000);
			 
			 String txt="123471234";
			 
				 	
			MAPage4.getTxtAnatomyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtPhysiologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtBiochemistryTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtPharmacologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtPathologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtMicrobiologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtFMTTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtStatisticianTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtPaediatricsTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtDermatologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtPsychiatryTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtGeneralSurgeryTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtOphthalmologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtOBGYTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologyTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtDentistryTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationTeachingSactioned().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineTeachingSactioned().sendKeys(txt);
			
			MAPage4.getTxtAnatomyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtPhysiologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.gettxtBiochemistryTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtPharmacologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtPathologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.gettxtMicrobiologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtFMTTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtStatisticianTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtPaediatricsTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtDermatologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtPsychiatryTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtGeneralSurgeryTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtOphthalmologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtOBGYTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologyTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtDentistryTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationTeachingPositionRegular().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineTeachingPositionRegular().sendKeys(txt);
			
			MAPage4.getTxtAnatomyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtPhysiologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtBiochemistryTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtPharmacologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtPathologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtMicrobiologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtFMTTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtStatisticianTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtPaediatricsTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtDermatologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtPsychiatryTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtGeneralSurgeryTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtOphthalmologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtOBGYTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologyTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtDentistryTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationTeachingPositionContractual().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineTeachingPositionContractual().sendKeys(txt);
			 }
			
			
		
		 @Test(priority =11)
		 
			public void TC_MA_Page4_GDMO() throws InterruptedException, IOException {
			 Thread.sleep(1000);
				 
				 String txt="123471234";
			MAPage4.getTxtAnatomyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtPhysiologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtBiochemistryGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtPharmacologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtPathologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtMicrobiologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtFMTGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtStatisticianGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtPaediatricsGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtDermatologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtPsychiatryGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtGeneralSurgeryGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtOphthalmologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtOBGYGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologyGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtDentistryGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationGDMOSactioned().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineGDMOSactioned().sendKeys(txt);
			
			MAPage4.getTxtAnatomyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtPhysiologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtBiochemistryGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtPharmacologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtPathologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtMicrobiologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtFMTGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtStatisticianGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtPaediatricsGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtDermatologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtPsychiatryGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtGeneralSurgeryGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtOtorhinolaryngologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtOphthalmologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtOBGYGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtAnaesthesiologyGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtDentistryGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtEmergencyMedicineGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineRehabilitationGDMOPositionRegular().sendKeys(txt);
			MAPage4.getTxtTransfusionMedicineGDMOPositionRegular().sendKeys(txt);
			
			
			MAPage4.getTxtAnatomyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtPhysiologyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtBiochemistryGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtPharmacologyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtPathologyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtMicrobiologyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtFMTGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtCommunityMedicineGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtStatisticianGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtGeneralMedicineGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtPaediatricsGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtDermatologyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtPsychiatryGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtRespiratoryMedicineGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtGeneralSurgeryGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtOrthopaedicsGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtOtorhinoGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtOphthalGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtOBGYGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtAnaesthesGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtRadioDiagnosisGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtDentistryGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtEmergencyGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtPhysicalMedicineGDMOPositionContractual().sendKeys(txt);
			MAPage4.getTxtTransfusionGDMOPositionContractual().sendKeys(txt);
			
			
			
			
			
}
		 @Test(priority =12)
	   	public void TC_MA_Page_4_10_2_doctors_extra_fields() throws InterruptedException {
	   		
	    	String txt="test1289918bxyusbx wuevwu";
	    	String num="123471234";
	   		
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsDelete1")).click();
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsAdd1")).click();
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtDoctorValue1")).sendKeys(txt);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistSactioned1")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionRegular1")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionContractual1")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned1")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionContractual1")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOSactioned1")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionRegular1")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionContractual1")).sendKeys(num);
			
		
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsDelete2")).click();
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsAdd2")).click();
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtDoctorValue2")).sendKeys(txt);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistSactioned2")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionRegular2")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionContractual2")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned2")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionContractual2")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOSactioned2")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionRegular2")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionContractual2")).sendKeys(num);
			
		
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsDelete3")).click();
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsAdd3")).click();
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtDoctorValue3")).sendKeys(txt);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistSactioned3")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionRegular3")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionContractual3")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned3")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionContractual3")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOSactioned3")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionRegular3")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionContractual3")).sendKeys(num);
			
	
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsDelete4")).click();
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsAdd4")).click();
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtDoctorValue4")).sendKeys(txt);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistSactioned4")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionRegular4")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionContractual4")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned4")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionContractual4")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOSactioned4")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionRegular4")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionContractual4")).sendKeys(num);
			
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsDelete5")).click();
			driver.findElement(By.id("ctl00_cphpage_Page4_btnDoctorsAdd5")).click();
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtDoctorValue5")).sendKeys(txt);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistSactioned5")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionRegular5")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSpecialistPositionContractual5")).sendKeys(num);
	   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned5")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionContractual5")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOSactioned5")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionRegular5")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtGDMOPositionContractual5")).sendKeys(num);
			
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionRegular1")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionRegular2")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionRegular3")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionRegular4")).sendKeys(num);
			driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingPositionRegular5")).sendKeys(num);
	 }
	 
		 
			@Test(priority =13)
			public void TC_MA_switching_availability_ofsuperspeciality() throws InterruptedException {
				utilobj.selectDropdown(MAPage4.getddlAvailableSuperSpecialfacility(), driver, "No", "firefox");
				utilobj.selectDropdown(MAPage4.getddlAvailableSuperSpecialfacility(), driver, "Yes", "firefox");

			}
			
			@Test(priority =14)
			public void TC_MA_Page4_super_specialist_redo() throws InterruptedException {
				
				String txt="212347123";
				MAPage4.getTxtNephrologySanctioned().sendKeys(txt);
				MAPage4.getTxtMedicalOncologySanctioned().sendKeys(txt);
				MAPage4.getTxtCardiologySanctioned().sendKeys(txt);
				MAPage4.getTxtNeonatologySanctioned().sendKeys(txt);
				MAPage4.getTxtNeurologySanctioned().sendKeys(txt);
				MAPage4.getTxtUrologySanctioned().sendKeys(txt);
				MAPage4.getTxtNeurosurgerySanctioned().sendKeys(txt);
				MAPage4.getTxtEndocrinologyMetabolismSanctioned().sendKeys(txt);
				MAPage4.getTxtGastroenterologySanctioned().sendKeys(txt);
				MAPage4.getTxtSurgicalGastroenterologySanctioned().sendKeys(txt);
				MAPage4.getTxtSurgicalOncologySanctioned().sendKeys(txt);
				MAPage4.getTxtBurnsPlasticSurgerySanctioned().sendKeys(txt);
				MAPage4.getTxtCardiothoracicSurgerySanctioned().sendKeys(txt);
				MAPage4.getTxtInterventionalRadiologySanctioned().sendKeys(txt);
				MAPage4.getTxtHematologySanctioned().sendKeys(txt);
				MAPage4.getTxtTraumaEmergencySanctioned().sendKeys(txt);
				MAPage4.getTxtPediatricSurgerySanctioned().sendKeys(txt);
				MAPage4.getTxtPhysicalMedicineSanctioned().sendKeys(txt);
				MAPage4.gettxtRadiotherapySanctioned().sendKeys(txt);
				MAPage4.getTxtReproductiveMedicineSurgerySanctioned().sendKeys(txt);
				MAPage4.getTxtRheumatologySanctioned().sendKeys(txt);
				MAPage4.getTxtCardiacNeuroAnesthesiaSanctioned().sendKeys(txt);
				
				
				MAPage4.getTxtNephrologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtOncologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtCardiologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtNeonatologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtNeurologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtUrologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtNeurosurgeryPostitionRegular().sendKeys(txt);
				MAPage4.getTxtEndocrinologyMetabolismPostitionRegular().sendKeys(txt);
				MAPage4.getTxtGastroenPostitionRegular().sendKeys(txt);
				MAPage4.getTxtSurgicalGastroenterologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtSurgicalOncologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtBurnsSurgeryPostitionRegular().sendKeys(txt);
				MAPage4.getTxtCardiothoracicPostitionRegular().sendKeys(txt);
				MAPage4.getTxtInterventionalRadiologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtHematologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtTraumaPostitionRegular().sendKeys(txt);
				MAPage4.getTxtPediatricSurgeryPostitionRegular().sendKeys(txt);
				MAPage4.getTxtPhysicalMedicinePostitionRegular().sendKeys(txt);
				MAPage4.getTxtRadiotherapyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtReproductiveMedicinePostitionRegular().sendKeys(txt);
				MAPage4.getTxtRheumatologyPostitionRegular().sendKeys(txt);
				MAPage4.getTxtCardiacNeuroAnesthesiaPostitionRegular().sendKeys(txt);
				
				MAPage4.getTxtNephrologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtOncologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtCardiologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtNeonatologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtNeurologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtUrologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtNeurosurgeryPostitionContractual().sendKeys(txt);
				MAPage4.getTxtEndocrinologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtGastroenPostitionContractual().sendKeys(txt);
				MAPage4.getTxtSurgicalGastroenPostitionContractual().sendKeys(txt);
				MAPage4.getTxtSurgicalOncologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtBurnsSurgeryPostitionContractual().sendKeys(txt);
				MAPage4.getTxtCardiothoracicPostitionContractual().sendKeys(txt);
				MAPage4.getTxtInterventionalRadiologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtHematologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtTraumaPostitionContractual().sendKeys(txt);
				MAPage4.getTxtPediatricSurgeryPostitionContractual().sendKeys(txt);
				MAPage4.getTxtPhysicalMedicinePostitionContractual().sendKeys(txt);
				MAPage4.getTxtRadiotherapyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtReproductiveMedicinePostitionContractual().sendKeys(txt);
				MAPage4.getTxtRheumatologyPostitionContractual().sendKeys(txt);
				MAPage4.getTxtCardiacNeuroAnesthesiaPostitionContractual().sendKeys(txt);
			}
			
			 @Test(priority =15)
			 public void TC_MA_Page_4_10_3_super_specialits_extra_fields_redo() throws InterruptedException {
			   		
				 String txt="test1289918bxyusbx wuevwu";
			    	String num="123471234";
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist1")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue1")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned1")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular1")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual1")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned1")).sendKeys(num);
					driver.findElement(By.id("ctl00_cphpage_Page4_btnDeleteSuperSpecialist1")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist1")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue1")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned1")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular1")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual1")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned1")).sendKeys(num);
					
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist2")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue2")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned2")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular2")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual2")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned2")).sendKeys(num);
					driver.findElement(By.id("ctl00_cphpage_Page4_btnDeleteSuperSpecialist2")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist2")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue2")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned2")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular2")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual2")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned2")).sendKeys(num);
			   		
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist3")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue3")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned3")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular3")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual3")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned3")).sendKeys(num);
					driver.findElement(By.id("ctl00_cphpage_Page4_btnDeleteSuperSpecialist3")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist3")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue3")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned3")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular3")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual3")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned3")).sendKeys(num);
			   		
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist4")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue4")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned4")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular4")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual4")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned4")).sendKeys(num);
					driver.findElement(By.id("ctl00_cphpage_Page4_btnDeleteSuperSpecialist4")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist4")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue4")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned4")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular4")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual4")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned4")).sendKeys(num);
			   		
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist5")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue5")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned5")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular5")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual5")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned5")).sendKeys(num);
					driver.findElement(By.id("ctl00_cphpage_Page4_btnDeleteSuperSpecialist5")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_btnAddSuperSpecialist5")).click();
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistValue5")).sendKeys(txt);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistSanctioned5")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistRegular5")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtSuperSpecialistContractual5")).sendKeys(num);
			   		driver.findElement(By.id("ctl00_cphpage_Page4_txtTeachingSactioned5")).sendKeys(num);
			   		
			   		
				}

				

				@Test(priority =16)
				public void TC_MA_Page_4_senior_junior() throws InterruptedException {
					
					String txt="2123471234";
				
				
				MAPage4.gettxtSeniorInPosition().sendKeys(txt);
				MAPage4.gettxtJuniorSanctioned().sendKeys(txt);
				MAPage4.gettxtJuniorInPosition().sendKeys(txt);
				MAPage4.gettxtSeniorSanctioned().clear();
				
							}
				
				@Test(priority =17)

				public void TC_MA_mandatory_alert_check() throws InterruptedException, IOException {
					
						
						try {
							MAPage4.getbtnNext().click();
							MAPage4.getbtnNext().sendKeys(Keys.ENTER);
						    Alert alert = driver.switchTo().alert();
						    // You can get the text of the alert and handle it accordingly
						    System.out.println("Alert message: " + alert.getText());
						    assertEquals(alert.getText(), "Please enter Senior Sanctioned Staff.");
						    
						    // You can dismiss the alert using the dismiss() method
						    alert.dismiss();
						    // Or you can accept it using the accept() method
						    // alert.accept();
						    
						    // Continue with your test script
						} catch (UnhandledAlertException e) {
						    // Log the exception or handle it appropriately
						    e.printStackTrace();
						}

					
				}
				

				@Test(priority =18)
				public void TC_MA_Page_4_senior_field() throws InterruptedException, IOException {
						
						String txt="121212347";
						MAPage4.gettxtSeniorSanctioned().sendKeys(txt);
				 }
				
				@Test(priority =19)
				public void TC_MA_Page_4_save_and_next_and_previous() throws InterruptedException {
				
					
					MAPage4.getbtnNext().click();
}}
