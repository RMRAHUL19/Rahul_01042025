package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.ClinicalRecordPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MiniCaseSheetPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class MiniCaseSheetTest extends BaseTest{
	 
		util utilobj=new util();
		 public MiniCaseSheetTest() {
			// TODO Auto-generated constructor stub
		}
			
		
		Loginpage loginpage;
		HomePage homepage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		BedStatusPage bedstatuspage;
		ClinicalRecordPage clinicalrecord;
		MiniCaseSheetPages minicasesheetpages;
		//private WebDriver driver=null;
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
		public void doNavigateToHISHomeTest() {

			hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
		}
		@Test(priority = 3)
		public void donavigateToPatientCheckIn() throws InterruptedException
		{
			minicasesheetpages=hishomepage.doNavigateToPatientCheckInForMinicasesheet();
			minicasesheetpages.GoToPatient_check_in(prop.getProperty("Production_IPNUmber"));
		}
		@Test(priority = 4)
		public void doNavigateToDoctorWorkListAndSelectMiniCaseSheet() throws InterruptedException {
			
			
			minicasesheetpages=hishomepage.doNavigateToDoctorWorklistLinkforMiniCaseSheet();
			minicasesheetpages.GoToMiniCaseSheet();
			
				}
	   

	}

