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
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage2;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MAApprovalTest2  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage2 MAPage2;
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

		MAPage2 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks2();
	}

	
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
	@Test(priority =5)
	public void TC_MA_Page2_All_checkbox() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(MAPage2.getSixOneGeneral_MedicineChkBx()));
		MAPage2.getSixOneGeneral_MedicineChkBx().click();
		MAPage2.getSixOneGeneral_SurgeryChkBx().click();
		MAPage2.getSixOnePaediatricsChkBx().click();
		MAPage2.getSixOneOrthopaedicsChkBx().click();
		MAPage2.getSixOneObstetrics_GynaecologyChkBx().click();
		MAPage2.getSixOneDentalChkBx().click();
		MAPage2.getSixOneOphthalmologyChkBx().click();
		MAPage2.getSixOneSkin_VDChkBx().click();
		MAPage2.getSixOnePulmonologyChkBx().click();
		MAPage2.getSixOneENTChkBx().click();
		MAPage2.getSixOneAnesthesiaChkBx().click();
		MAPage2.getSixOnePsychiatryChkBx().click();
		MAPage2.getSixOneNephrologyChkBx().click();
		MAPage2.getSixOneMedical_OncologyChkBx().click();
		MAPage2.getSixOneCardiologyChkBx().click();
		MAPage2.getSixOneNeonatologyChkBx().click();
		MAPage2.getSixOneNeurologyChkBx().click();
		MAPage2.getSixOneUrologyChkBx().click();
		MAPage2.getSixOneNeurosurgeryChkBx().click();
		MAPage2.getSixOneEndocrinology_MetabolismChkBx().click();
		MAPage2.getSixOneGastroenterologyChkBx().click();
		MAPage2.getSixOneSurgical_GastroenterologyChkBx().click();
		MAPage2.getSixOneSurgical_OncologyChkBx().click();
		MAPage2.getSixOneBurns_Plastic_SurgeryChkBx().click();
		MAPage2.getSixOneCardiothoracic_SurgeryChkBx().click();
		MAPage2.getSixOneInterventional_RadiologyChkBx().click();
		MAPage2.getSixOneHematologyChkBx().click();
		MAPage2.getSixOneTrauma_EmergencyChkBx().click();
		MAPage2.getSixOnePediatric_SurgeryChkBx().click();
		MAPage2.getSixOnePhysical_Medicine_RehabilitationChkBx().click();
		MAPage2.getSixOneRadiotherapyChkBx().click();
		MAPage2.getSixOneReproductive_Medicine_SurgeryChkBx().click();
		MAPage2.getSixOneRheumatologyChkBx().click();
		MAPage2.getSixOneCardiac_Neuro_AnesthesiaChkBx().click();
		
			
			
	}
		
		@Test(priority =6)
		public void TC_MA_Page2_Redo_All_checkbox() throws InterruptedException {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(MAPage2.getSixOneGeneral_MedicineChkBx()));
			MAPage2.getSixOneGeneral_MedicineChkBx().click();
			MAPage2.getSixOneGeneral_SurgeryChkBx().click();
			MAPage2.getSixOnePaediatricsChkBx().click();
			MAPage2.getSixOneOrthopaedicsChkBx().click();
			MAPage2.getSixOneObstetrics_GynaecologyChkBx().click();
			MAPage2.getSixOneDentalChkBx().click();
			MAPage2.getSixOneOphthalmologyChkBx().click();
			MAPage2.getSixOneSkin_VDChkBx().click();
			MAPage2.getSixOnePulmonologyChkBx().click();
			MAPage2.getSixOneENTChkBx().click();
			MAPage2.getSixOneAnesthesiaChkBx().click();
			MAPage2.getSixOnePsychiatryChkBx().click();
			MAPage2.getSixOneNephrologyChkBx().click();
			MAPage2.getSixOneMedical_OncologyChkBx().click();
			MAPage2.getSixOneCardiologyChkBx().click();
			MAPage2.getSixOneNeonatologyChkBx().click();
			MAPage2.getSixOneNeurologyChkBx().click();
			MAPage2.getSixOneUrologyChkBx().click();
			MAPage2.getSixOneNeurosurgeryChkBx().click();
			MAPage2.getSixOneEndocrinology_MetabolismChkBx().click();
			MAPage2.getSixOneGastroenterologyChkBx().click();
			MAPage2.getSixOneSurgical_GastroenterologyChkBx().click();
			MAPage2.getSixOneSurgical_OncologyChkBx().click();
			MAPage2.getSixOneBurns_Plastic_SurgeryChkBx().click();
			MAPage2.getSixOneCardiothoracic_SurgeryChkBx().click();
			MAPage2.getSixOneInterventional_RadiologyChkBx().click();
			MAPage2.getSixOneHematologyChkBx().click();
			MAPage2.getSixOneTrauma_EmergencyChkBx().click();
			MAPage2.getSixOnePediatric_SurgeryChkBx().click();
			MAPage2.getSixOnePhysical_Medicine_RehabilitationChkBx().click();
			MAPage2.getSixOneRadiotherapyChkBx().click();
			MAPage2.getSixOneReproductive_Medicine_SurgeryChkBx().click();
			MAPage2.getSixOneRheumatologyChkBx().click();
			MAPage2.getSixOneCardiac_Neuro_AnesthesiaChkBx().click();
			
				
				
		}
		
		@Test(priority =7)
		public void TC_MA_Page2_Redo_All_Dropdown() throws InterruptedException {
			
			utilobj.selectDropdown(MAPage2.getSixOneGeneral_Medicineddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneGeneral_Surgeryddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOnePaediatricsddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneOrthopaedicsddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneSixOneObsGynaeddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneDentalddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneOphthalmologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneSkin_VDddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOnePulmonologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneENTddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneAnesthesiaddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOnePsychiatryddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneNephrologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneMedical_Oncologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneCardiologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneNeonatologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneNeurologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneUrologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneNeurosurgeryddl(), driver, "Partially using Dhanwantri Application", "firefox");
	        utilobj.selectDropdown(MAPage2.getSixOneEndocrinology_Metabolismddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneGastroenterologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneSurgical_Gastroenterologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneSurgical_Oncologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneBurns_Plastic_Surgeryddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneCardiothoracic_Surgeryddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneInterventional_Radiologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneHematologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneTrauma_Emergencyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOnePediatric_Surgeryddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOnePhysical_Medicine_Rehabilitationddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneRadiotherapyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneReproductive_Medicine_Surgeryddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneRheumatologyddl(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getSixOneCardiac_Neuro_Anesthesiaddl(), driver, "Partially using Dhanwantri Application", "firefox");
	       
		}
		
		
			
			@Test(priority =8)
			public void TC_MA_Page2_Redo_All_entries() throws InterruptedException, IOException {
				
				String txt="123471234";
				MAPage2.getSixOneGeneral_Medicinetxt().sendKeys(txt);
				MAPage2.getSixOneGeneral_Surgerytxt().sendKeys(txt);
				MAPage2.getSixOnePaediatricstxt().sendKeys(txt);
				MAPage2.getSixOneOrthopaedicstxt().sendKeys(txt);
				MAPage2.getSixOneObstetrics_Gynaecologytxt().sendKeys(txt);
				MAPage2.getSixOneDentaltxt().sendKeys(txt);
				MAPage2.getSixOneOphthalmologytxt().sendKeys(txt);
				MAPage2.getSixOneSkin_VDtxt().sendKeys(txt);
				MAPage2.getSixOnePulmonologytxt().sendKeys(txt);
				MAPage2.getSixOneENTtxt().sendKeys(txt);
				MAPage2.getSixOneAnesthesiatxt().sendKeys(txt);
				MAPage2.getSixOnePsychiatrytxt().sendKeys(txt);
				MAPage2.getSixOneNephrologytxt().sendKeys(txt);
				MAPage2.getSixOneMedical_Oncologytxt().sendKeys(txt);
				MAPage2.getSixOneCardiologytxt().sendKeys(txt);
				MAPage2.getSixOneNeonatologytxt().sendKeys(txt);
				MAPage2.getSixOneNeurologytxt().sendKeys(txt);
				MAPage2.getSixOneUrologytxt().sendKeys(txt);
				MAPage2.getSixOneNeurosurgerytxt().sendKeys(txt);
				MAPage2.getSixOneEndocrinology_Metabolismtxt().sendKeys(txt);
				MAPage2.getSixOneGastroenterologytxt().sendKeys(txt);
				MAPage2.getSixOneSurgical_Gastroenterologytxt().sendKeys(txt);
				MAPage2.getSixOneSurgical_Oncologytxt().sendKeys(txt);
				MAPage2.getSixOneBurns_Plastic_Surgerytxt().sendKeys(txt);
				MAPage2.getSixOneCardiothoracic_Surgerytxt().sendKeys(txt);
				MAPage2.getSixOneInterventional_Radiologytxt().sendKeys(txt);
				MAPage2.getSixOneHematologytxt().sendKeys(txt);
				MAPage2.getSixOneTrauma_Emergencytxt().sendKeys(txt);
				MAPage2.getSixOnePediatric_Surgerytxt().sendKeys(txt);
				MAPage2.getSixOnePhysical_Medicine_Rehabilitationtxt().sendKeys(txt);
				MAPage2.getSixOneRadiotherapytxt().sendKeys(txt);
				MAPage2.getSixOneReproductive_Medicine_Surgerytxt().sendKeys(txt);
				MAPage2.getSixOneRheumatologytxt().sendKeys(txt);
				MAPage2.getSixOneCardiac_Neuro_Anesthesiatxt().sendKeys(txt);
	           


		}
		@Test(priority =9)
		public void TC_MA_Page2_add_new_field() throws InterruptedException {				
				
			String txt="enthropology1234567788";				
			String num="123471234";
			MAPage2.getAddnewfielddelete().click();
			MAPage2.getAddnewfield().click();
			MAPage2.getAddnewfieldtxt().sendKeys(txt);
			MAPage2.getAddnewfieldint().sendKeys(num);
			assertEquals(MAPage2.getAddnewfieldtxt().getAttribute("value"), txt);

			
			}
			
		@Test(priority =10)
		public void TC_MA_Page2_new_field_2() throws InterruptedException {
			
				
				
			String txt="enthropology1234567788";				
			String num="123471234";
			MAPage2.getAddnewfielddelete2().click();
			MAPage2.getAddnewfield2().click();
			MAPage2.getAddnewfieldtxt2().sendKeys(txt);
			MAPage2.getAddnewfieldint2().sendKeys(num);
			assertEquals(MAPage2.getAddnewfieldtxt2().getAttribute("value"), txt);

			
			}
		
		@Test(priority =11)
		public void TC_MA_Page2_add_new_field3() throws InterruptedException {
			
				
				
			String txt="enthropology1234567788";				
			String num="123471234";
			MAPage2.getAddnewfielddelete3().click();
			MAPage2.getAddnewfield3().click();
			MAPage2.getAddnewfieldtxt3().sendKeys(txt);
			MAPage2.getAddnewfieldint3().sendKeys(num);
			assertEquals(MAPage2.getAddnewfieldtxt().getAttribute("value"), txt);

			
			}
		
		@Test(priority =12)
		public void TC_MA_Page2_add_new_field4() throws InterruptedException {
			
			
			
			String txt="enthropology1234567788";				
			String num="124471244";
			MAPage2.getAddnewfielddelete4().click();
			MAPage2.getAddnewfield4().click();
			MAPage2.getAddnewfieldtxt4().sendKeys(txt);
			MAPage2.getAddnewfieldint4().sendKeys(num);
			assertEquals(MAPage2.getAddnewfieldtxt().getAttribute("value"), txt);

			
			}
		
		@Test(priority =13)
		public void TC_MA_Page2_add_new_field5() throws InterruptedException {
			
			
			
			String txt="enthropology1234567788";				
			String num="125471254";
			MAPage2.getAddnewfielddelete5().click();
			MAPage2.getAddnewfield5().click();
			MAPage2.getAddnewfieldtxt5().sendKeys(txt);
			MAPage2.getAddnewfieldint5().sendKeys(num);
			assertEquals(MAPage2.getAddnewfieldtxt().getAttribute("value"), txt);

			
			}
			
		@Test(priority =14)
		public void TC_MA_Page2_new_field_2_delete() throws InterruptedException {
			
			MAPage2.getAddnewfielddelete2().click();
			
		
		}
			

        @Test(priority =15)
        public void TC_MA_Page2_Is_Ayush_available() throws InterruptedException {
		
        	utilobj.selectDropdown(MAPage2.getddlAyushAvailFacilities(), driver, "No", "firefox");
        	utilobj.selectDropdown(MAPage2.getddlAyushAvailFacilities(), driver, "Yes", "firefox");

        }
	        

        @Test(priority =16)
        public void TC_MA_Ayush_checkbox() throws InterruptedException {


	         MAPage2.getchkAttendanceAyurveda().click();
	         MAPage2.getchkOPDAttendancePanchKarma().click();
	         MAPage2.getchkOPDAttendanceKsharSutra().click();
	         MAPage2.getchkOPDAttendanceKsharSutraCasePerformed().click();
	         MAPage2.getchkOPDAttendanceYoga().click();
	         MAPage2.getchkOPDAttendanceHomeo().click();
        }
             
         @Test(priority =17)
     	public void TC_MA_Ayush_dropdown() throws InterruptedException {
     		
     		utilobj.selectDropdown(MAPage2.getddlOPDAttendanceAyurveda(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getddlOPDAttendancePanchKarma(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getddlOPDAttendanceKsharSutra(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getddlOPDAttendanceKsharSutraCasePerformed(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getddlOPDAttendanceYoga(), driver, "Partially using Dhanwantri Application", "firefox");
			utilobj.selectDropdown(MAPage2.getddlOPDAttendanceHomeo(), driver, "Partially using Dhanwantri Application", "firefox");

}
             
         @Test(priority =18)
 		public void TC_MA_Ayush_entry() throws InterruptedException, IOException {
 			
 			String txt="123471234";
 			

 			MAPage2.gettxtOPDAttendancePanchKarmaManual().sendKeys(txt);
 			MAPage2.gettxtWorkingDaysPanchKarmaManual().sendKeys(txt);
 			MAPage2.gettxtOPDAttendanceAyurvedaManual().clear();
 			MAPage2.gettxtWorkingDaysAyurvedaManual().sendKeys(txt);
 			MAPage2.gettxtOPDAttendanceKsharSutraManual().sendKeys(txt);
 			MAPage2.gettxtWorkingDaysKsharSutraManual().sendKeys(txt);
 			MAPage2.gettxtOPDAttendanceKsharSutraCasePerformedManual().sendKeys(txt);
 			MAPage2.gettxtOPDAttendanceYogaManual().sendKeys(txt);
 			MAPage2.gettxtWorkingDaysYogaManual().sendKeys(txt);
 			MAPage2.gettxtOPDAttendanceHomeoManual().sendKeys(txt);
 			MAPage2.gettxtWorkingDaysHomeoManual().sendKeys(txt);
 			MAPage2.gettxtOPDAttendancePanchKarmaManual().sendKeys(txt);
 			Thread.sleep(2000);
 			
                
}
         @Test(priority =19)
         public void TC_MA_Ayush_unchecking() throws InterruptedException {

 	
	         MAPage2.getchkAttendanceAyurveda().click();
	         MAPage2.getchkOPDAttendancePanchKarma().click();
	         MAPage2.getchkOPDAttendanceKsharSutra().click();
	         MAPage2.getchkOPDAttendanceKsharSutraCasePerformed().click();
	         MAPage2.getchkOPDAttendanceYoga().click();
	         MAPage2.getchkOPDAttendanceHomeo().click();
 }
         @Test(priority =20)
         public void TC_MA_Ayush_Redo_checkbox() throws InterruptedException {


	         MAPage2.getchkAttendanceAyurveda().click();
	         MAPage2.getchkOPDAttendancePanchKarma().click();
	         MAPage2.getchkOPDAttendanceKsharSutra().click();
	         MAPage2.getchkOPDAttendanceKsharSutraCasePerformed().click();
	         MAPage2.getchkOPDAttendanceYoga().click();
	         MAPage2.getchkOPDAttendanceHomeo().click();
 }
              
          @Test(priority =21)
      	public void TC_MA_Ayush_Redo_dropdown() throws InterruptedException {
      		
      		utilobj.selectDropdown(MAPage2.getddlOPDAttendanceAyurveda(), driver, "Partially using Dhanwantri Application", "firefox");
      		utilobj.selectDropdown(MAPage2.getddlOPDAttendancePanchKarma(), driver, "Partially using Dhanwantri Application", "firefox");
      		utilobj.selectDropdown(MAPage2.getddlOPDAttendanceKsharSutra(), driver, "Partially using Dhanwantri Application", "firefox");
      		utilobj.selectDropdown(MAPage2.getddlOPDAttendanceKsharSutraCasePerformed(), driver, "Partially using Dhanwantri Application", "firefox");
      		utilobj.selectDropdown(MAPage2.getddlOPDAttendanceYoga(), driver, "Partially using Dhanwantri Application", "firefox");
      		utilobj.selectDropdown(MAPage2.getddlOPDAttendanceHomeo(), driver, "Partially using Dhanwantri Application", "firefox");

 }
          
          @Test(priority =22)
  		public void TC_MA_Ayush_Redo_entry() throws InterruptedException, IOException {
  			
  			String txt="123471234";
  			
 
  			MAPage2.gettxtOPDAttendancePanchKarmaManual().sendKeys(txt);
  			MAPage2.gettxtWorkingDaysPanchKarmaManual().sendKeys(txt);
  			MAPage2.gettxtWorkingDaysAyurvedaManual().sendKeys(txt);
  			MAPage2.gettxtOPDAttendanceKsharSutraManual().sendKeys(txt);
  			MAPage2.gettxtWorkingDaysKsharSutraManual().sendKeys(txt);
  			MAPage2.gettxtOPDAttendanceKsharSutraCasePerformedManual().sendKeys(txt);
  			MAPage2.gettxtOPDAttendanceYogaManual().sendKeys(txt);
  			MAPage2.gettxtWorkingDaysYogaManual().sendKeys(txt);
  			MAPage2.gettxtOPDAttendanceHomeoManual().sendKeys(txt);
  			MAPage2.gettxtWorkingDaysHomeoManual().sendKeys(txt);
  			MAPage2.gettxtOPDAttendancePanchKarmaManual().sendKeys(txt);
  			Thread.sleep(2000);
  			
                 
          }
         @Test(priority =23)
  		public void TC_MA_Ayush_entry_Autocheck() throws InterruptedException, IOException {
        	 
        	 Assert.assertEquals(MAPage2.getAverageOPDAttendancePanchkarmaManual().getAttribute("value"),"1");
		
	         Assert.assertEquals(MAPage2.getAverageOPDAttendanceKsharSutraManual().getAttribute("value"),"1");
			
	         Assert.assertEquals(MAPage2.getAverageOPDAttendanceYogaManual().getAttribute("value"),"1");
			
	         Assert.assertEquals(MAPage2.getAverageOPDAttendanceHomeoManual().getAttribute("value"),"1");
	        	 
         }
      		
             
  
         
         @Test(priority =24)
     	public void TC_MA_Page_2_mandatory_alert_check() throws InterruptedException, IOException {
     		
         			
     			try {
     				MAPage2.getbtnNext().click();
     				MAPage2.getbtnNext().sendKeys(Keys.ENTER);
     			    Alert alert = driver.switchTo().alert();
     			    // You can get the text of the alert and handle it accordingly
 			    System.out.println("Alert message: " + alert.getText());
 			   assertEquals(alert.getText(), "Please enter OPD Attendance in Ayurveda.");
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
         
         @Test(priority =25)
  		public void TC_MA_Page_1_AttendanceAyurveda_plus_AverageAttendanceAyurveda_autocheck() throws InterruptedException, IOException {
  			
  			String txt="123471234";
  			MAPage2.gettxtOPDAttendanceAyurvedaManual().sendKeys(txt);
  			MAPage2.gettxtOPDAttendancePanchKarmaManual().sendKeys(txt);
  			Thread.sleep(500);
            Assert.assertEquals(MAPage2.getAverageOPDAttendanceAyurvedaManual().getAttribute("value"),"1");

}
     	@Test(priority =26)
    	public void TC_MA_Page_2_save_and_next_and_previous() throws InterruptedException, IOException {
    		
        		
			MAPage2.getbtnNext().click();
			Thread.sleep(2000);
        		
        }
}

           


	
	

