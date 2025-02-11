package com.qa.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.pages.AdjustmentLBStoreConsumptionPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class AdjustmentTest  extends BaseTest {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AdjustmentLBStoreConsumptionPage adjustmentpage;
	
	
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"));
	}
	
			
	@Test(priority = 3)
	public void doNavigateAdjustmentLinkTest() {

		adjustmentpage = hishomepage.doNavigateAdjustmentLink();
	}

			
	@Test(priority =4)
	public void doAdjustmentTest() {

		adjustmentpage.doAdjustmentLBStoreConsumption();
		
	}
	
	
	
}
