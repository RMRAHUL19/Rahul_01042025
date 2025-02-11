package com.qa.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.IPCaseSheetPrescriptionPage;
import com.qa.pages.Laboratory_WorklistInpatientPages;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class Laboratory_WorklistInpatientTest extends BaseTest {
	public Laboratory_WorklistInpatientTest() {
		
	}
	util utilobj = new util();


Loginpage loginpage;
HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
BedStatusPage bedstatuspage;
Laboratory_WorklistInpatientPages LaboratoryWorklistInpatientPages;
IPCaseSheetPrescriptionPage ipcasesheetprescriotionpage;
PatientCheckInPage patientcheckinpage;
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
public void doNavigatetoIPCaseshetForLab() throws InterruptedException {
	ipcasesheetprescriotionpage=hishomepage.doNavigateToInpatientEmergencyLink();
	//ipcasesheetprescriotionpage.doOpenIPCaseSheet();
	ipcasesheetprescriotionpage.DoOpenCaseSheetforlaboratory();
	ipcasesheetprescriotionpage.doIPCasesheetprecripstion(orderpack_name);
	
	


}
@Test(priority = 4)
public void doNavigatetoChangeLocation() throws InterruptedException {
	ipcasesheetprescriotionpage.doChangeHospitalLocation();
	//LaboratoryWorklistInpatientPages.doChangeHospitalLocation();
	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICE"));
	LaboratoryWorklistInpatientPages=hishomepage.donavigatetoLaboratoryInpatient();
	
	
		
	
}

@Test(priority = 5)
public void doNavigateToTestCaseForLabWorkListInpatient() throws InterruptedException {
	LaboratoryWorklistInpatientPages.testcaseforInpatientworkList();
	
}



}

