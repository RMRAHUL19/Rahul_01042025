package com.qa.tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.LaboratoryPrescriptionPages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;
public class LaboratoryPrescriptionTest extends BaseTest {
	

public LaboratoryPrescriptionTest() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	LaboratoryPrescriptionPages laboratoryprescriptionpages;
//public String IPNO="1199900090";
	public String IPNO="1115812178";
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICE"));
	}
	@Test(priority = 3)
	public void donavigateTolaboratoryPrescriptionTest() throws InterruptedException, AWTException {
		laboratoryprescriptionpages=hishomepage.donavigatetolaboratoryprescriptiontest();
		
		laboratoryprescriptionpages.doLabPrescriptionPageTest(IPNO,prop.getProperty("DoctorName"),prop.getProperty("Prescription"));
	}
}
