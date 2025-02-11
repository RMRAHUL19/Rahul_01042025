package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PhysicalStockEntryPage;
import com.qa.pages.SelectHospitalLocationPage;

public class PhysicalStockEntryTest  extends BaseTest {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PhysicalStockEntryPage physicalStockEntrypage;
	
	
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
	public void doNavigateToPhysicalStockEntryLink() {

		physicalStockEntrypage = hishomepage.doNavigateToPhysicalStockEntryLink();
	}

			
	@Test(priority =4)
	public void doPhysicalStockEntryTest() {

		physicalStockEntrypage.doPhysicalStockEntry(prop.getProperty("itemname"));
		
	}
	
	
	
}
