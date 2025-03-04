package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage9;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MATest9  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage9 MAPage9;
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

		MAPage9 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks9();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
	
	@Test(priority =5)
	public void TC_MA_005() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		try {
			MAPage9.getbtnNext().click();
			Thread.sleep(2000);
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page2_txtGeneralMedicineAuto"))));
				MAPage9.getbtnNext().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page3_txtMaleMedicalWardAllocatedBed"))));
				MAPage9.getbtnNext().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page4_txtNursingSactioned"))));
				MAPage9.getbtnNext().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page5_ddlFacilityFunctional"))));
				MAPage9.getbtnNext().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionCitizenAvailability"))));
				MAPage9.getbtnNext().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page7_ddlGeneralDrinkingWater"))));
				MAPage9.getbtnNext().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Page8_ddlDepartment1"))));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}
	@Test(priority =6)
	public void TC_MA_006() throws InterruptedException {


		try {
			MAPage9.getbtnNext().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
		@Test(priority =7)
		
		public void TC_MA_007() throws InterruptedException {
			
			MAPage9.getbtnYes1().click();
		}

		
		
}
	