package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.ImagingWorkListOPPage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.PatientCheckInPageforIMGServices;
import com.qa.pages.SelectHospitalLocationPage;

public class ImagingWorkListOPPageTest extends BaseTest {

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	ImagingWorkListOPPage imagingWorkListOPPage;

	OPCaseSheetPage opCaseSheetPage;
	PatientCheckInPageforIMGServices patientcheckInpage;
String UHID;
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
				prop.getProperty("imagingfacilityname"));
	}

	@Test(priority = 3)
	public void doNavigateToPatientCheckInTest() {

		patientcheckInpage = hishomepage.doNavigateToPatientCheckInforIMGServices();
	}

	@Test(priority = 4)
	public void doPatientCheckINTest() throws InterruptedException {

		patientcheckInpage.doPatientCheckIN(prop.getProperty("Production_IPNUmber"), prop.getProperty("specialisationName"));

	}

	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

		String txtcheckInNumber = patientcheckInpage.getPatientCheckinNumber();
		imagingWorkListOPPage = hishomepage.doNavigateToDoctorWorklistforimagingLink();
		
		imagingWorkListOPPage.doOpenCaseSheet(txtcheckInNumber);
		

	}

	@Test(priority = 6)
	public void doCasesheetprecripstionTest() throws InterruptedException {

		
      UHID=imagingWorkListOPPage.doCasesheetprecripstion(prop.getProperty("orderpackname"));
	}

	@Test(priority = 7)
	public void doNavigateToImagingWorklistLinkTest() {

		imagingWorkListOPPage = hishomepage.doNavigateToImagingWorklistOPLink();
	}

	@Test(priority = 8)
	public void doImagingWorklistOPFlowTest() throws InterruptedException {

		imagingWorkListOPPage.doImagingWorklistOPFlow(prop.getProperty("reqPageTitle"),UHID);

	}

	@Test(priority = 9)
	public void doImagingWorklistOPFlowPATest() {

		imagingWorkListOPPage.doImagingWorklistPA();
		
		
	}

	@Test(priority = 10)
	public void doImagingWorklistOPFlowTestPerfTest() throws InterruptedException {

		imagingWorkListOPPage.doImagingWorklistTestPerf();

	}

	@Test(priority = 11)
	public void doImagingWorklistOPFlowResultEntryTest() throws InterruptedException {

		imagingWorkListOPPage.doImagingWorklistResultEntry(prop.getProperty("resultText"));

	}

	@Test(priority = 12)
	public void doImagingWorklistOPFlowResultverifyTest() {

		imagingWorkListOPPage.doImagingWorklistResultverify();

	}

	@Test(priority = 13)
	public void doImagingWorklistOPFlowDispatchTest() throws InterruptedException {

		imagingWorkListOPPage.doImagingWorklistDispatch(prop.getProperty("dispatchname"));

	}

}
