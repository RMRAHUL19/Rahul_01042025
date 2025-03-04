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
import com.qa.pages.MAPage6;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

	@SuppressWarnings("unused")
	public class MAApprovalTest6  extends CrossBrowser {
	
		
		Loginpage loginpage;
		HomePage homepage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		MAPage6 MAPage6;
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
	
			MAPage6 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks6();
		}
	
				
		@Test(priority =4)
		public void TC_MA_004() throws InterruptedException, IOException {
			String path=System.getProperty("user.dir")+"\\ExcelTestdata";
	
		}
		@Test(priority =5)
		public void TC_MA_Page_6_19_dropdown() throws InterruptedException {
			
			
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionCitizenAvailability(), driver, "Yes", "firefox");
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionEmergency(), driver, "Yes", "firefox");
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionHelpDesk(), driver, "Yes", "firefox");
	        utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionUserCharges(), driver, "Yes", "firefox");
	        Thread.sleep(1000);
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionAvailDrugs(), driver, "No", "firefox");
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionDepertmentalSignage(), driver, "No", "firefox");
	        utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionMandateInfo(), driver, "Yes", "firefox");
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionComplaintBox(), driver, "No", "firefox");
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionSafetyCaution(), driver, "No", "firefox");
			utilobj.selectDropdown(MAPage6.getPage6_ddlPatientSatisfactionConsentPracticed(), driver, "Yes", "firefox");
	
	
	
			
	}
		@Test(priority =6)
		public void TC_MA_Page_6_19_alphanumeric() throws InterruptedException {
			
			String txt="212gufegyu347 hbwuxiuq7182 bsuqywuzq8712";
			MAPage6.getPage6_txtPatientSatisfactionWaitingtime().clear();
			MAPage6.getPage6_txtPatientSatisfactionOPDConsultation().clear();
			MAPage6.getPage6_txtPatientSatisfactionWaitingtime().sendKeys(txt);
			MAPage6.getPage6_txtPatientSatisfactionOPDConsultation().sendKeys(txt);
			assertEquals(MAPage6.getPage6_txtPatientSatisfactionWaitingtime().getAttribute("value"), txt);
			assertEquals(MAPage6.getPage6_txtPatientSatisfactionOPDConsultation().getAttribute("value"), txt);		
	
		
	}
		@Test(priority =7)
		public void TC_MA_Page_6_19_numeric() throws InterruptedException {
			
			String txt="212347673";
			
			MAPage6.getPage6_txtPatientSatisfactionSuggestionReceived().sendKeys(txt);
			MAPage6.getPage6_txtPatientSatisfactionComplaintReceived().clear();
	
	
		
	}
		@Test(priority =8)
		public void TC_MA_Page_6_21_1_numeric() throws InterruptedException {
			
			
			String txt="212347357";
			MAPage6.getPage6_txtReferralSecondaryCount().sendKeys(txt);
			MAPage6.getPage6_txtReferralTertiaryCount().sendKeys(txt);
			MAPage6.getPage6_txtReferralAfterCount().sendKeys(txt);
	
	
		
	}
		@Test(priority =9)
		public void TC_MA_Page_6_21_1_remarks() throws InterruptedException {
			
			
			String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			MAPage6.getPage6_txtReferralSecondaryRemarks().clear();
			MAPage6.getPage6_txtReferralTertiaryRemarks().clear();
			MAPage6.getPage6_txtReferralAfterRemarks().clear();
			MAPage6.getPage6_txtReferralSecondaryRemarks().sendKeys(txt);
			MAPage6.getPage6_txtReferralTertiaryRemarks().sendKeys(txt);
			MAPage6.getPage6_txtReferralAfterRemarks().sendKeys(txt);
			assertEquals(MAPage6.getPage6_txtReferralSecondaryRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getPage6_txtReferralTertiaryRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getPage6_txtReferralAfterRemarks().getAttribute("value"), txt);
	
			
	}
		@Test(priority =10)
		public void TC_MA_Page_6_20_dropdown() throws InterruptedException {
			
			utilobj.selectDropdown(MAPage6.getPage6_ddlFireSysWhetherSignagase(), driver, "Yes", "firefox");
			Thread.sleep(500);
			utilobj.selectDropdown(MAPage6.getPage6_ddlFireSysStatusNOC(), driver, "Yes", "firefox");
			Thread.sleep(500);
			utilobj.selectDropdown(MAPage6.getPage6_ddlFireSysExtinguisher(), driver, "No", "firefox");
			Thread.sleep(500);
			utilobj.selectDropdown(MAPage6.getPage6_ddlFireSysAvailDrugs(), driver, "No", "firefox");
			Thread.sleep(500);
			utilobj.selectDropdown(MAPage6.getPage6_ddlFireSysOpenWindows(), driver, "No", "firefox");
			
			
	}
		
		
		@Test(priority =11)
		public void TC_MA_Page_6_20_datepicker() throws InterruptedException {
			
			MAPage6.getPage6_txtFireSysMockDrill().click();
		    MAPage6.getPage6_txtcclFireSysMockDrill_day_0_4().click();
	}
		
		
		@Test(priority =12)
		public void TC_MA_Page_6_19_remarks() throws InterruptedException {
			
			String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			
			MAPage6.getPage6_txtFireSysRemarks().clear();
			MAPage6.getPage6_txtPatientSatisfactionRemarks().clear();
			MAPage6.getPage6_txtFireSysRemarks().sendKeys(txt);
			MAPage6.getPage6_txtPatientSatisfactionRemarks().sendKeys(txt);
			assertEquals(MAPage6.getPage6_txtFireSysRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getPage6_txtPatientSatisfactionRemarks().getAttribute("value"), txt);

			
	}
	
		@Test(priority =13)
		public void TC_MA_Page_6_21_2_numeric() throws InterruptedException {
			
			String txt="177549754";
			
			MAPage6.getTxtReferralDeptCardiologyRemarks().clear();
			MAPage6.getTxtReferralDeptCTVSRemarks().clear();
			MAPage6.getTxtReferralDeptNeurologyRemarks().clear();
			MAPage6.getTxtReferralDeptNeurosurgeryRemarks().clear();
			MAPage6.getTxtReferralDeptNephrologyRemarks().clear();
			MAPage6.getTxtReferralDeptUrologyRemarks().clear();
			MAPage6.getTxtReferralDeptOncologyRemarks().clear();
			MAPage6.getTxtReferralDeptOncosurgeryRemarks().clear();
			MAPage6.getTxtReferralDeptRadiotherapyRemarks().clear();
			MAPage6.getTxtReferralDeptGastroenterologyRemarks().clear();
			MAPage6.getTxtReferralDeptRadioUltraRemarks().clear();
			MAPage6.getTxtReferralDeptRadioCTRemarks().clear();
			MAPage6.getTxtReferralDeptRadioMRIRemarks().clear();
			MAPage6.getTxtReferralDeptRadioPETRemarks().clear();
			MAPage6.getTxtReferralDeptRadioOtherRemarks().clear();
			MAPage6.getTxtReferralDeptLabRemarks().clear();
			MAPage6.getTxtReferralDeptCardiologyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptCTVSValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptNeurologyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptNeurosurgeryValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptNephrologyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptUrologyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptOncologyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptOncosurgeryValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiotherapyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptGastroenterologyValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiologyUltrasoundValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiologyCTScanValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiologyMRIValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiologyPETScanValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiologyOthersValue().sendKeys(txt);
			MAPage6.getTxtReferralDeptLaboratoryInvestigationsValue().sendKeys(txt);
			
	
	}
		@Test(priority =14)
		public void TC_MA_Page_6_21_2_remarks() throws InterruptedException {
			
			String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			
			MAPage6.getTxtReferralDeptCardiologyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptCTVSRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptNeurologyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptNeurosurgeryRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptNephrologyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptUrologyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptOncologyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptOncosurgeryRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadiotherapyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptGastroenterologyRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadioUltraRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadioCTRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadioMRIRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadioPETRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptRadioOtherRemarks().sendKeys(txt);
			MAPage6.getTxtReferralDeptLabRemarks().sendKeys(txt);
			assertEquals(MAPage6.getTxtReferralDeptCardiologyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptCTVSRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptNeurologyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptNeurosurgeryRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptNephrologyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptUrologyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptOncologyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptOncosurgeryRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptRadiotherapyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptGastroenterologyRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptRadioUltraRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptRadioCTRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptRadioMRIRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptRadioPETRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptRadioOtherRemarks().getAttribute("value"), txt);
			assertEquals(MAPage6.getTxtReferralDeptLabRemarks().getAttribute("value"), txt);

			
	
	}
		@Test(priority =15)
		public void TC_MA_Page_6_21_2_add_new() throws InterruptedException {
			
			
			
			MAPage6.getPage6_btnAddReferral1().click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral2")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral3")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral4")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral5")).click();
	
		}
	
	
		@Test(priority =16)
		public void TC_MA_Page_6_21_2_add_new_string() throws InterruptedException {
			
			String txt="testing gufegyu hbwuxiuq bsuqywuzq";
			
			MAPage6.getPage6_txtExtraReferralValue1().sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue2")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue3")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue4")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue5")).sendKeys(txt);
			

		}
	
	
		@Test(priority =17)
		public void TC_MA_Page_6_21_2_add_new_numeric() throws InterruptedException {
			
			
			String txt="754971254";
			
			MAPage6.getPage6_txtReferralValue1().sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue2")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue3")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue4")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue5")).sendKeys(txt);

		}
		
		
		@Test(priority =18)
		public void TC_MA_Page_6_21_2_add_new_remarks() throws InterruptedException {
			
			
			String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			
			MAPage6.getPage6_txtReferralRemarks().clear();
			MAPage6.getPage6_txtReferralRemarks1().sendKeys(txt);
			MAPage6.getPage6_txtReferralRemarks().sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks2")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks3")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks4")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks5")).sendKeys(txt);
			assertEquals(MAPage6.getPage6_txtReferralRemarks().getAttribute("value"), txt);

			
		}
		
		@Test(priority =19)
		public void TC_MA_Page_6_21_2_add_new_redo() throws InterruptedException {
			
			
			driver.findElement(By.id("ctl00_cphpage_Page6_btnDeleteReferral1")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnDeleteReferral2")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnDeleteReferral3")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnDeleteReferral4")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnDeleteReferral5")).click();

			MAPage6.getPage6_btnAddReferral1().click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral2")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral3")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral4")).click();
			driver.findElement(By.id("ctl00_cphpage_Page6_btnAddReferral5")).click();
			
			String txt="testing gufegyu hbwuxiuq bsuqywuzq";
			
			MAPage6.getPage6_txtExtraReferralValue1().sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue2")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue3")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue4")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtExtraReferralValue5")).sendKeys(txt);
			
			String number="754971254";
			
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue1")).sendKeys(number);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue2")).sendKeys(number);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue3")).sendKeys(number);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue4")).sendKeys(number);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralValue5")).sendKeys(number);
			
			String remarks="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			
			MAPage6.getPage6_txtReferralRemarks1().sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks2")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks3")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks4")).sendKeys(txt);
			driver.findElement(By.id("ctl00_cphpage_Page6_txtReferralRemarks5")).sendKeys(txt);
	
		}
		
		@Test(priority =20)
		public void TC_MA_Page_6_22_numeric() throws InterruptedException {
			
			
			String txt="426666666";
			
			MAPage6.getPage6_txtTieUpBillflowSecondary().sendKeys(txt);
			MAPage6.getPage6_txtTieUpBillClearedSecondary().sendKeys(txt);
			MAPage6.getPage6_txtTieUpBillInflowTertiary().sendKeys(txt);
            MAPage6.getPage6_txtTieUpBillClearedTertiary().sendKeys(txt);
            
            
		}
		
		@Test(priority =21)
		public void TC_MA_Page_6_22_remarks() throws InterruptedException {
			
			
			String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
			
			MAPage6.getPage6_txtTieUpBillInflowRemarks().sendKeys(txt);
			MAPage6.getPage6_txtTieUpBillClearedRemarks().sendKeys(txt);
			MAPage6.getPage6_txtTieUpBillPendencyRemarks().sendKeys(txt);
            
			
		}
		
		@Test(priority =22)
		public void TC_MA_Page_6_22_autofetch_check() throws InterruptedException {
			
						
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page6_txtTieUpBillPendencySecondary")).getAttribute("value"), "0");
			assertEquals(driver.findElement(By.id("ctl00_cphpage_Page6_txtTieUpBillPendencyTertiary")).getAttribute("value"), "0");

			
            
		}
			
		@Test(priority =23)
		public void TC_MA_mandatory_alert_check() throws InterruptedException, IOException {
			
				
			try {
				MAPage6.getbtnNext().click();
				MAPage6.getbtnNext().sendKeys(Keys.ENTER);
			    Alert alert = driver.switchTo().alert();
			    // You can get the text of the alert and handle it accordingly
			    System.out.println("Alert message: " + alert.getText());
			    assertEquals(alert.getText(), "Please enter No. of Complaints received.");

			    
			    // You can dismiss the alert using the dismiss() method
			    alert.dismiss();
			    // Or you can accept it using the accept() method
			    // alert.accept();
			    
			    // Continue with your test script
			} catch (UnhandledAlertException e) {
			    // Log the exception or handle it appropriately
			    e.printStackTrace();
			}}



		@Test(priority =24)
		public void TC_MA_mandatory_field() throws InterruptedException {
			
			
			String txt="212341237";
			MAPage6.getPage6_txtPatientSatisfactionComplaintReceived().sendKeys(txt);
		
			
		}
		
		
		@Test(priority =25)
		public void TC_MA_Page_6_save_and_next_and_previous() throws InterruptedException {
			
			MAPage6.getbtnNext().click();
}}

			

