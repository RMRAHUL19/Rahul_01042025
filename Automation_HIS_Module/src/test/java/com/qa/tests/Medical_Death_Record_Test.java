package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.Medical_Death_Record_Pages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Medical_Death_Record_Test extends BaseTest {
	public Medical_Death_Record_Test() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Medical_Death_Record_Pages MedicalDeathRecordPages;
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));	

	}	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	@Test(priority = 2)
	public void changeHospitalLocationTest() throws InterruptedException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameMedicalRecordDepartment"));
	}
		@Test(priority = 3)
		public void testcaseforDeathRecrd() throws InterruptedException {
		MedicalDeathRecordPages=hishomepage.donavigatetoMedical_Death_Record_Pages();
		MedicalDeathRecordPages.testcase_for_MedicalDeathRecordPages();
	

}
}