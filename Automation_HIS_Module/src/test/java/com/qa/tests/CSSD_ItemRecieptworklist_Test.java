package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.CSSD_ItemRecieptworklist_Pages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class CSSD_ItemRecieptworklist_Test extends BaseTest {
	public CSSD_ItemRecieptworklist_Test() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	
	CSSD_ItemRecieptworklist_Pages CSSDItemRecieptworklistPages;
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));	

	}	

	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	@Test(priority = 2)
	public void changeHospitalLocationTest() throws InterruptedException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameCSSD"));
		CSSDItemRecieptworklistPages=hishomepage.donavigatetoCSSD_ItemRecieptworklist_Pages();
		CSSDItemRecieptworklistPages.testcaseforCssdItemRecieptWorkList();

}
}
