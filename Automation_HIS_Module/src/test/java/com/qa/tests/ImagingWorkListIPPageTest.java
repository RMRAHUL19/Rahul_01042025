package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.IPCaseSheetPrescriptionPage;
import com.qa.pages.ImagingWorkListIPPage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;

public class ImagingWorkListIPPageTest extends BaseTest {

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	ImagingWorkListIPPage imagingWorkListIPPage;

	IPCaseSheetPrescriptionPage ipCaseSheetPage;
	PatientCheckInPage patientcheckInpage;
 String AdmissionNO;
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

	@Test(priority = 5)
	public void doNavigateToInpatientEmergencyLinkTest() {

		imagingWorkListIPPage = hishomepage.donavigatetoInpatientEmergencyPatientforImaginservices();
		imagingWorkListIPPage.doOpenIPCaseSheet();

	}

	@Test(priority = 6)
	public void doCasesheetprecripstionTest() {

		imagingWorkListIPPage.doIPCasesheetprecripstion(prop.getProperty("orderpackname"));
		AdmissionNO= imagingWorkListIPPage.getAdmissionNo();

	}

	@Test(priority = 7)
	public void doNavigateToImagingWorklistLinkTest() {

		imagingWorkListIPPage = hishomepage.doNavigateToImagingWorklistIPLink();
	}

	@Test(priority = 8)
	public void doImagingWorklistIPFlowTest() {

		imagingWorkListIPPage.doImagingWorklistIPFlow(prop.getProperty("reqPageTitle"),AdmissionNO);

	}

	@Test(priority = 9)
	public void doImagingWorklistIPFlowPATest() {

		imagingWorkListIPPage.doImagingWorklistPA();

	}

	@Test(priority = 10)
	public void doImagingWorklistIPFlowTestPerfTest() {

		imagingWorkListIPPage.doImagingWorklistTestPerf();

	}

	@Test(priority = 11)
	public void doImagingWorklistIPFlowResultEntryTest() {

		imagingWorkListIPPage.doImagingWorklistResultEntry(prop.getProperty("resultText"));

	}

	@Test(priority = 12)
	public void doImagingWorklistOPFlowResultverifyTest() {

		imagingWorkListIPPage.doImagingWorklistResultverify();

	}

	@Test(priority = 13)
	public void doImagingWorklistOPFlowDispatchTest() {

		imagingWorkListIPPage.doImagingWorklistDispatch(prop.getProperty("dispatchname"));

	}

}
