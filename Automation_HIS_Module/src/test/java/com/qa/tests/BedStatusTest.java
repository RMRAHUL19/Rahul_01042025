package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class BedStatusTest extends BaseTest {

	public BedStatusTest() {
		// TODO Auto-generated constructor stub
	}

	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	
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
	public void doNavigateToBedStatusLink() throws InterruptedException {

		bedstatuspage = hishomepage.doNavigateToBedStatusLink();
		
		
	}
	@Test(priority = 4)
	public void dotestcaseforBedStatusPage() throws InterruptedException {

		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		//bedstatuspage.testcaseforBedStatusPage();
		utilobj.selectDropdown(bedstatuspage.getBedStatus_selectview(), driver, "Icons");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Female Surgical Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "female ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Female ward 1");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Female ward 888");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "general ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "HYD Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "ICCU");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "immunization ");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "MiscWard");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "ONCOLOGY MALE WARD");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Female Surgical Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[2]/td/div/div/div/fieldset/table/tbody/tr/td[17]/input")).click();
//		Thread.sleep(4000);
//		
//		bedstatuspage.getBedStatus_bedDetail().click();

	}


}
