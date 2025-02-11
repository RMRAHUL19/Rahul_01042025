package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.CSSD_SterilizationRequest_Pages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class CSSD_SterilizationRequestTest extends BaseTest {
public	CSSD_SterilizationRequestTest() {
	
}
util utilobj = new util();
Loginpage loginpage;
HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
CSSD_SterilizationRequest_Pages CSSDSterilizationPages;
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
//	CSSDSterilizationPages=hishomepage.donavigatetoCSSD_SterilizationRequest_Pages();
//	CSSDSterilizationPages.testCaseForCSSD_Sterilization_Pages();
	CSSDSterilizationPages=hishomepage.donavigatetoCSSD_SterilizationRequestworkList_Pages();
	CSSDSterilizationPages.testCaseForCSSD_SterilizationRequestWorklist_Pages();
	
	
}
}
