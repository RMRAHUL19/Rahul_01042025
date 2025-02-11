package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.SterilizationReceiptWorklist_Pages;
import com.qa.util.util;

public class SterilizationReceiptWorklist_Test extends BaseTest{
public SterilizationReceiptWorklist_Test(){
		
	}
util utilobj = new util();
Loginpage loginpage;
HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
SterilizationReceiptWorklist_Pages SterilizationReceiptWorklistPages;
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
	SterilizationReceiptWorklistPages=hishomepage.donavigatetoSterilizationReceiptWorklist_Pages();
	SterilizationReceiptWorklistPages.testcaseforSterilizationReceiptWorklist_Pages();
	
}

}
