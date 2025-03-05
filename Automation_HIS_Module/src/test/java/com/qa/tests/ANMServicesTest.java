package com.qa.tests;
// import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.pages.ANMServicesPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class ANMServicesTest extends BaseTest {

	public ANMServicesTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OPCaseSheetPage opCaseSheetPage;
	PatientCheckInPage patientcheckInpage;
    ANMServicesPage anmservicespage;
    String txtcheckInNumber;
    util utilobj = new util();

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
	public void doNavigateToPatientCheckInTest() {

		anmservicespage = hishomepage.doNavigateToPatientCheckInforANMServices();
	}
	
	@Test(priority = 4)
	public void doPatientCheckINTest() throws InterruptedException {

		anmservicespage.doPatientCheckIN(prop.getProperty("IPNumber"), prop.getProperty("specialisationName"));
		txtcheckInNumber =anmservicespage.getPatientCheckinNumber();
	}

	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

			
		Thread.sleep(2000);
		utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")) , driver);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Doctor Worklist")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys(txtcheckInNumber);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgCheckinno")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")).click();
		Thread.sleep(2000);
		
		
		
	}
	
	@Test(priority = 6)
	public void doCasesheetprecripstionTest() throws InterruptedException {
		
		anmservicespage.doCasesheetprecripstion(prop.getProperty("orderpackname"));
	}
		
	@Test(priority=7)
	public void doANMServicesTest() throws InterruptedException{	
		
		
		
		
		anmservicespage = hishomepage.doNavigateTogetANMServicesPageLink();
		
		
	}
	@Test(priority = 8)
	public void doanmservicesTest() {
		
		anmservicespage.doANMServices(prop.getProperty("ActionTaken"),txtcheckInNumber);
		
	}
	
}
