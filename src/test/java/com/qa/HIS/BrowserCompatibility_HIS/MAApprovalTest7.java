package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage7;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MAApprovalTest7  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage7 MAPage7;
	String EntryNo;
	util utilobj=new util();
	

	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void doNavigateToMALetterGenerationforHosptitaslLinks() {

		MAPage7 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks7();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
	@Test(priority =5)
	public void TC_MA_Page_7_all_dropdown() throws InterruptedException {
		utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralDrinkingWater(), driver, "RO", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralSeatingArrangement(), driver, "Adequate", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralLightingArrangement(), driver, "Inadequate", "firefox");
        utilobj.selectDropdown(MAPage7.Page7_ddlGeneralAvailRunningWater(), driver, "Yes", "firefox");
        utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralAvailFunctionalCistern(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralCleanliness(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralBrokenSeats(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlGeneralWaterLogging(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlCanteenFacility(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlCanteenCater(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlCanteenFoodKiosk(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlConstructionExistingBuilding(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlConstructionMajorRepairs(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlConstructionProposalSent(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage7.getddlConditionerStatus(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlLiftStatus(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlMiscellaneousStatusCSSD(), driver, "Available", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlMiscellaneousStatusLaundary(), driver, "Not Available", "firefox");
		utilobj.selectDropdown(MAPage7.getPage7_ddlMiscellaneousStatusManifoldServices(), driver, "Available", "firefox");
}
	@Test(priority =6)
	public void TC_MA_Page_7_all_numeric() throws InterruptedException {
		
		String txt="87547123";
		
		MAPage7.getPage7_txtGeneralToiletNumber().clear();
		MAPage7.getPage7_txtGeneralDivyangToiletNumber().sendKeys(txt);
		MAPage7.getPage7_txtConditionerFunctionalCount().sendKeys(txt);
		MAPage7.getPage7_txtLiftFunctionalCount().sendKeys(txt);
		MAPage7.getPage7_txtConditionerNonFunctionalCount().sendKeys(txt);
		MAPage7.getPage7_txtLiftNonFunctionalCount().sendKeys(txt);

	}
	@Test(priority =7)
	public void TC_MA_Page_7_all_remarks_50_and_100_char() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		String txt50 = "129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi ";
		MAPage7.getPage7_txtGeneralRemarks().clear();
		MAPage7.getPage7_txtCanteenRemarks().clear();
		MAPage7.getPage7_txtConstructionRemarks().clear();
		MAPage7.getPage7_txtConditionerRemarks().clear();
		MAPage7.getPage7_txtLiftRemarks().clear();
		MAPage7.getPage7_txtLiftNonFunctionalCount().clear();
		MAPage7.getTxtMiscellaneousRemarksCSSD().clear();
		MAPage7.getTxtMiscellaneousRemarksLaundry().clear();
		MAPage7.getTxtMiscellaneousRemarksManifoldServices().clear();
		MAPage7.getTxtHouseKeepingReasonPendency().clear();
		MAPage7.getTxtSecurityReasonPendency().clear();
		MAPage7.getTxtARMReasonPendency().clear();
		MAPage7.getTxtContractualNursesReasonPendency().clear();
		MAPage7.getTxtContractualDoctorsReasonPendency().clear();
		MAPage7.getPage7_txtGeneralRemarks().sendKeys(txt);
		MAPage7.getPage7_txtCanteenRemarks().sendKeys(txt);
		MAPage7.getPage7_txtConstructionRemarks().sendKeys(txt);
		MAPage7.getPage7_txtConditionerRemarks().sendKeys(txt);
		MAPage7.getPage7_txtLiftRemarks().sendKeys(txt);
		MAPage7.getPage7_txtLiftNonFunctionalCount().sendKeys(txt);
		MAPage7.getTxtMiscellaneousRemarksCSSD().sendKeys(txt);
		MAPage7.getTxtMiscellaneousRemarksLaundry().sendKeys(txt);
		MAPage7.getTxtMiscellaneousRemarksManifoldServices().sendKeys(txt);
		MAPage7.getTxtHouseKeepingReasonPendency().sendKeys(txt);
		MAPage7.getTxtSecurityReasonPendency().sendKeys(txt);
		MAPage7.getTxtARMReasonPendency().sendKeys(txt);
		MAPage7.getTxtContractualNursesReasonPendency().sendKeys(txt);
		MAPage7.getTxtContractualDoctorsReasonPendency().sendKeys(txt);
		assertEquals(MAPage7.getPage7_txtGeneralRemarks().getAttribute("value"), txt);
		assertEquals(MAPage7.getPage7_txtCanteenRemarks().getAttribute("value"), txt);
		assertEquals(MAPage7.getPage7_txtConstructionRemarks().getAttribute("value"), txt);
		assertEquals(MAPage7.getPage7_txtConditionerRemarks().getAttribute("value"), txt);
		assertEquals(MAPage7.getPage7_txtLiftRemarks().getAttribute("value"), txt);
		assertEquals(MAPage7.getPage7_txtLiftNonFunctionalCount().getAttribute("value"), txt);
		assertEquals(MAPage7.getTxtMiscellaneousRemarksCSSD().getAttribute("value"), txt50);
		assertEquals(MAPage7.getTxtMiscellaneousRemarksLaundry().getAttribute("value"), txt50);
		assertEquals(MAPage7.getTxtMiscellaneousRemarksManifoldServices().getAttribute("value"), txt50);
		assertEquals(MAPage7.getTxtHouseKeepingReasonPendency().getAttribute("value"), txt);
		assertEquals(MAPage7.getTxtSecurityReasonPendency().getAttribute("value"), txt);
		assertEquals(MAPage7.getTxtARMReasonPendency().getAttribute("value"), txt);
		assertEquals(MAPage7.getTxtContractualNursesReasonPendency().getAttribute("value"), txt);
		assertEquals(MAPage7.getTxtContractualDoctorsReasonPendency().getAttribute("value"), txt);


}
	@Test(priority =8)
	public void TC_MA_Page_7_all_datepicker() throws InterruptedException {
		
		
		MAPage7.getTxtCanteenUpgraded().click();
		MAPage7.getCclCanteenUpgraded_day_2_3().click();
		MAPage7.getTxtConstructionPendingDate().click();
		MAPage7.getCclConstructionPendingDate_day_2_3().click();
		MAPage7.getTxtHouseKeepingPaymentMonth().click();
		MAPage7.getCalendarExtender1_day_2_3().click();
		MAPage7.getTxtSecurityPaymentMonth().click();
		MAPage7.getCalendarExtender2_day_2_3().click();
		MAPage7.getTxtARMPaymentMonth().click();
		MAPage7.getCalendarExtender3_day_2_3().click();
		MAPage7.getTxtContractualNursesPaymentMonth().click();
		MAPage7.getCalendarExtender4_day_2_3().click();
		MAPage7.getTxtContractualDoctorsPaymentMonth().click();
		MAPage7.getCalendarExtender5_day_2_3().click();
}
	@Test(priority =9)
	public void TC_MA_Page_7_all_float() throws InterruptedException {
		
		String txt="885.3497349";
		MAPage7.getPage7_txtConstructionTotalAreaHospital().clear();
		MAPage7.getPage7_txtConstructionTotalAreaHospital().sendKeys(txt);
		assertEquals(MAPage7.getPage7_txtConstructionTotalAreaHospital().getAttribute("value"), txt);

}
	
	
	@Test(priority =10)

public void TC_MA_mandatory_alert_check() throws InterruptedException, IOException {
	
		
		try {
			MAPage7.getbtnNext().click();
			MAPage7.getbtnNext().sendKeys(Keys.ENTER);
		    Alert alert = driver.switchTo().alert();
		    // You can get the text of the alert and handle it accordingly
		    System.out.println("Alert message: " + alert.getText());
		    assertEquals(alert.getText(), "Please enter General Toilet Number.");
		    
		    // You can dismiss the alert using the dismiss() method
		    alert.dismiss();
		    // Or you can accept it using the accept() method
		    // alert.accept();
		    
		    // Continue with your test script
		} catch (UnhandledAlertException e) {
		    // Log the exception or handle it appropriately
		    e.printStackTrace();
		}}
	
	@Test(priority =11)
	public void TC_MA_mandatory_field() throws InterruptedException {
		
		String txt="87547123";
		MAPage7.getPage7_txtGeneralToiletNumber().sendKeys(txt);
		}
	
	
	@Test(priority =12)
	public void TC_MA_Page_6_save_and_next_and_previous() throws InterruptedException {
		
		
		MAPage7.getbtnNext().click();
		
}
}	
