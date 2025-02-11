package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.SupplierManufactureBrandPages;

public class SupplierManufactureBrandTest extends BaseTest {
	public SupplierManufactureBrandTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	SupplierManufactureBrandPages suppliermanufacturebrandpages;
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
				prop.getProperty("facilityNamepurchase"));
	}
	
	@Test(priority = 3)
	public void doTestToSupplierManufactuereBrandTest() throws InterruptedException  {
		
		suppliermanufacturebrandpages = hishomepage.doNavigateToSupplierManufactureBrandLink();
		suppliermanufacturebrandpages.dotestcaseforsupplier();
		suppliermanufacturebrandpages.dotestcaseforManufacture();
		suppliermanufacturebrandpages.testcaseforBrand();
	}
	

}
