package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.FUPPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class FUPTest extends BaseTest {

	public FUPTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	FUPPage   fuppage;
	
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}
	
	@Test(priority = 3)
	public void doNavigateToFUPTest() throws InterruptedException {

		
		fuppage = hishomepage.doNavigateToFUP();
		
		
	}
	
	@Test(priority=4)
	public void doInvesigation() throws InterruptedException{
		
		fuppage.doInvestigation(prop.getProperty("TestName"),prop.getProperty("Quantity"),prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
	}
	@Test(priority = 5)
	public void doMedicationTest() throws InterruptedException
	{
		
		fuppage.DoMedication(prop.getProperty("TestName"),prop.getProperty("Quantity"),prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
	}
	@Test(priority = 6)
	public void DoHealthInterventionTest() throws InterruptedException {
		fuppage.DoHealthIntervention(prop.getProperty("TestName"),prop.getProperty("Quantity"),prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
	}
	@Test(priority = 7)
	public void DoDiagnosisTest() throws InterruptedException {
		fuppage.DoDiagnosis(prop.getProperty("TestName"),prop.getProperty("Quantity"),prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
	}
	

}
