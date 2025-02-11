package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

public class HomePageTest extends BaseTest{

	Loginpage loginpage;
	HomePage homepage;
	
	@Test
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	@Test
	public void doNavigateToSelectHospitalLocationTest() {

		homepage.doNavigateToSelectHospitalLocation();
	}

}
