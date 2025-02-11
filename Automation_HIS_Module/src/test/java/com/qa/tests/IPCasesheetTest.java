package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.IPCaseSheetPrescriptionPage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class IPCasesheetTest extends BaseTest{
	public IPCasesheetTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	IPCaseSheetPrescriptionPage ipcasesheetprescriotionpage;
	public String orderpack_name="AutomationdummyOrderPack";
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
	@Test(priority = 3)
	public void doNavigatetoIPCaseshet() throws InterruptedException {
	ipcasesheetprescriotionpage=hishomepage.doNavigateToInpatientEmergencyLink();
	ipcasesheetprescriotionpage.DoOpenCaseSheetforlaboratory();
	ipcasesheetprescriotionpage.doIPCasesheetprecripstion(orderpack_name);
	
	
	}
	

}
