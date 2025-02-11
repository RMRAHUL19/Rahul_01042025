package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MaternityCertificatepages;
import com.qa.pages.SelectHospitalLocationPage;

public class MaternityCertificateTest extends BaseTest {
	public MaternityCertificateTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	MaternityCertificatepages maternitycertificapages;
	
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
	@Test(priority =3)
	public void doNavigateToClinicalRecord_genrate_Maternitiy_certificate() throws InterruptedException {
		maternitycertificapages=hishomepage.doNavigatematernitycertificagte();
	maternitycertificapages.testCaseForeMaternityCertification();
	

	}


}
