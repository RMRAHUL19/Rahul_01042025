package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OrderPacksPage;
import com.qa.pages.SelectHospitalLocationPage;

public class OrderPacksTest extends BaseTest {

	public OrderPacksTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OrderPacksPage   orderpackspage;
	
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
	public void doNavigateToOrderPacksTest()  {
		
		orderpackspage = hishomepage.doNavigateToOrderPacks();
	}
	
	@Test(priority=4)
	public void doOrderPacksTest() throws InterruptedException{
		
		orderpackspage.doOrderPacks(prop.getProperty("OrderPacks"),prop.getProperty("TestName"),prop.getProperty("Quantity"),prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),
				       prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
		
	}
	

}
