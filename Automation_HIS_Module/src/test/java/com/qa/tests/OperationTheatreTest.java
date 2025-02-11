package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OperationTheatrePage;
import com.qa.pages.SelectHospitalLocationPage;

public class OperationTheatreTest extends BaseTest {
	public OperationTheatreTest()
	{
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OperationTheatrePage operationtheatrepage;
	public String UHID=null;
	public String CHKINno=null;
	
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("OperationTheatreFacility"));
	}
	@Test(priority =3)
	public void doNavigateTopatientCheck_in_Link() throws InterruptedException {
		operationtheatrepage=hishomepage.doNavigateToUHIDcreationOperationtheartreLink();}
	@Test(priority = 4)
		public void doTestForcreatePatientCheck_IN() throws InterruptedException {
			
		
//		operationtheatrepage.testcaseforUhidCreate(prop.getProperty("Title"),prop.getProperty("FirstName"),prop.getProperty("LastName"),
//				prop.getProperty("MaritalStatus"),prop.getProperty("Age"),prop.getProperty("Address"));
//		UHID=operationtheatrepage.getUhid();
		operationtheatrepage.get_CreateCheckINnumber();
		CHKINno=operationtheatrepage.getCHKIN();}
	@Test(priority = 5)
	public void dotestforOT_PAC() throws InterruptedException {
		operationtheatrepage.getdoctorworkList(CHKINno);
		operationtheatrepage.testcaseforSchduling();
		
	}

	

}
