package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.Check_In_Admission_of_Reffered_PatientsPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class Check_In_Admission_of_Reffered_PatientsTest extends BaseTest {
	public Check_In_Admission_of_Reffered_PatientsTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Check_In_Admission_of_Reffered_PatientsPages CheckInAdmissionofRefferedPatientsPages;
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)//AP01.0005004545 OPGENE082000108
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	
	@Test(priority =3)
	public void doNavigateToCheck_In_Admission_of_Reffered_PatientsLink() throws InterruptedException {

		CheckInAdmissionofRefferedPatientsPages = hishomepage.donavigateToCheck_In_Admission_of_Reffered_Patients();
	}
	@Test(priority = 4)
	public void doTestcaseforCheck_In_Admission_of_Reffered_PatientsLink() throws InterruptedException {
		
		CheckInAdmissionofRefferedPatientsPages.testcaseforCheck_In_Admission_of_Reffered_PatientsPages();
	

}

}
