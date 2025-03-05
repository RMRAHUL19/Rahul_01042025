 package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MAPage7 extends BasePage {

	util utilobj = new util();

	public MAPage7(WebDriver driver) {
		super(driver);

	}
	
	private By Page7_ddlGeneralDrinkingWater=By.id("ctl00_cphpage_Page7_ddlGeneralDrinkingWater");
	public WebElement getPage7_ddlGeneralDrinkingWater() {
		return getElement(Page7_ddlGeneralDrinkingWater);
	}
	private By Page7_ddlGeneralSeatingArrangement=By.id("ctl00_cphpage_Page7_ddlGeneralSeatingArrangement");
	public WebElement getPage7_ddlGeneralSeatingArrangement() {
		return getElement(Page7_ddlGeneralSeatingArrangement);
	}
	private By Page7_ddlGeneralLightingArrangement=By.id("ctl00_cphpage_Page7_ddlGeneralLightingArrangement");
	public WebElement getPage7_ddlGeneralLightingArrangement() {
		return getElement(Page7_ddlGeneralLightingArrangement);
	}
	private By Page7_ddlGeneralAvailRunningWater=By.id("ctl00_cphpage_Page7_ddlGeneralAvailRunningWater");
	public WebElement Page7_ddlGeneralAvailRunningWater() {
		return getElement(Page7_ddlGeneralAvailRunningWater);
	}
	private By Page7_ddlGeneralAvailFunctionalCistern=By.id("ctl00_cphpage_Page7_ddlGeneralAvailFunctionalCistern");
	public WebElement getPage7_ddlGeneralAvailFunctionalCistern() {
		return getElement(Page7_ddlGeneralAvailFunctionalCistern);
	}
	private By Page7_ddlGeneralCleanliness=By.id("ctl00_cphpage_Page7_ddlGeneralCleanliness");
	public WebElement getPage7_ddlGeneralCleanliness() {
		return getElement(Page7_ddlGeneralCleanliness);
	}
	private By Page7_ddlGeneralBrokenSeats=By.id("ctl00_cphpage_Page7_ddlGeneralBrokenSeats");
	public WebElement getPage7_ddlGeneralBrokenSeats() {
		return getElement(Page7_ddlGeneralBrokenSeats);
	}
	private By Page7_ddlGeneralWaterLogging=By.id("ctl00_cphpage_Page7_ddlGeneralWaterLogging");
	public WebElement getPage7_ddlGeneralWaterLogging() {
		return getElement(Page7_ddlGeneralWaterLogging);
	}
	private By Page7_ddlCanteenFacility=By.id("ctl00_cphpage_Page7_ddlCanteenFacility");
	public WebElement getPage7_ddlCanteenFacility() {
		return getElement(Page7_ddlCanteenFacility);
	}
	private By Page7_ddlCanteenCater=By.id("ctl00_cphpage_Page7_ddlCanteenCater");
	public WebElement getPage7_ddlCanteenCater() {
		return getElement(Page7_ddlCanteenCater);
	}
	private By Page7_ddlCanteenFoodKiosk=By.id("ctl00_cphpage_Page7_ddlCanteenFoodKiosk");
	public WebElement getPage7_ddlCanteenFoodKiosk() {
		return getElement(Page7_ddlCanteenFoodKiosk);
	}
	private By Page7_ddlConstructionExistingBuilding=By.id("ctl00_cphpage_Page7_ddlConstructionExistingBuilding");
	public WebElement getPage7_ddlConstructionExistingBuilding() {
		return getElement(Page7_ddlConstructionExistingBuilding);
	}
	private By Page7_ddlConstructionMajorRepairs=By.id("ctl00_cphpage_Page7_ddlConstructionMajorRepairs");
	public WebElement getPage7_ddlConstructionMajorRepairs() {
		return getElement(Page7_ddlConstructionMajorRepairs);
	}
	private By Page7_ddlConstructionProposalSent=By.id("ctl00_cphpage_Page7_ddlConstructionProposalSent");
	public WebElement getPage7_ddlConstructionProposalSent() {
		return getElement(Page7_ddlConstructionProposalSent);
	}
	private By ddlConditionerStatus=By.id("ctl00_cphpage_Page7_ddlConditionerStatus");
	public WebElement getddlConditionerStatus() {
		return getElement(ddlConditionerStatus);
	}
	private By Page7_ddlLiftStatus=By.id("ctl00_cphpage_Page7_ddlLiftStatus");
	public WebElement getPage7_ddlLiftStatus() {
		return getElement(Page7_ddlLiftStatus);
	}
	private By Page7_ddlMiscellaneousStatusCSSD=By.id("ctl00_cphpage_Page7_ddlMiscellaneousStatusCSSD");
	public WebElement getPage7_ddlMiscellaneousStatusCSSD() {
		return getElement(Page7_ddlMiscellaneousStatusCSSD);
	}
	private By Page7_ddlMiscellaneousStatusLaundary=By.id("ctl00_cphpage_Page7_ddlMiscellaneousStatusLaundary");
	public WebElement getPage7_ddlMiscellaneousStatusLaundary() {
		return getElement(Page7_ddlMiscellaneousStatusLaundary);
	}
	private By ddlMiscellaneousStatusManifoldServices=By.id("ctl00_cphpage_Page7_ddlMiscellaneousStatusManifoldServices");
	public WebElement getPage7_ddlMiscellaneousStatusManifoldServices() {
		return getElement(ddlMiscellaneousStatusManifoldServices);
	}
	private By Page7_txtGeneralToiletNumber=By.id("ctl00_cphpage_Page7_txtGeneralToiletNumber");
	public WebElement getPage7_txtGeneralToiletNumber() {
		return getElement(Page7_txtGeneralToiletNumber);
	}
	private By Page7_txtGeneralDivyangToiletNumber=By.id("ctl00_cphpage_Page7_txtGeneralDivyangToiletNumber");
	public WebElement getPage7_txtGeneralDivyangToiletNumber() {
		return getElement(Page7_txtGeneralDivyangToiletNumber);
	}
	private By Page7_txtConditionerFunctionalCount=By.id("ctl00_cphpage_Page7_txtConditionerFunctionalCount");
	public WebElement getPage7_txtConditionerFunctionalCount() {
		return getElement(Page7_txtConditionerFunctionalCount);
	}
	private By Page7_txtLiftFunctionalCount=By.id("ctl00_cphpage_Page7_txtLiftFunctionalCount");
	public WebElement getPage7_txtLiftFunctionalCount() {
		return getElement(Page7_txtLiftFunctionalCount);
	}
	private By Page7_txtConditionerNonFunctionalCount=By.id("ctl00_cphpage_Page7_txtConditionerNonFunctionalCount");
	public WebElement getPage7_txtConditionerNonFunctionalCount() {
		return getElement(Page7_txtConditionerNonFunctionalCount);
	}
	private By Page7_txtLiftNonFunctionalCount=By.id("ctl00_cphpage_Page7_txtLiftNonFunctionalCount");
	public WebElement getPage7_txtLiftNonFunctionalCount() {
		return getElement(Page7_txtLiftNonFunctionalCount);
	}
	private By Page7_txtGeneralRemarks=By.id("ctl00_cphpage_Page7_txtGeneralRemarks");
	public WebElement getPage7_txtGeneralRemarks() {
		return getElement(Page7_txtGeneralRemarks);
	}
	private By Page7_txtCanteenRemarks=By.id("ctl00_cphpage_Page7_txtCanteenRemarks");
	public WebElement getPage7_txtCanteenRemarks() {
		return getElement(Page7_txtCanteenRemarks);
	}
	private By Page7_txtConstructionRemarks=By.id("ctl00_cphpage_Page7_txtConstructionRemarks");
	public WebElement getPage7_txtConstructionRemarks() {
		return getElement(Page7_txtConstructionRemarks);
	}
	private By Page7_txtConditionerRemarks=By.id("ctl00_cphpage_Page7_txtConditionerRemarks");
	public WebElement getPage7_txtConditionerRemarks() {
		return getElement(Page7_txtConditionerRemarks);
	}
	private By Page7_txtLiftRemarks=By.id("ctl00_cphpage_Page7_txtLiftRemarks");
	public WebElement getPage7_txtLiftRemarks() {
		return getElement(Page7_txtLiftRemarks);
	}
	private By txtMiscellaneousRemarksCSSD = By.id("ctl00_cphpage_Page7_txtMiscellaneousRemarksCSSD");
	private By txtMiscellaneousRemarksLaundry = By.id("ctl00_cphpage_Page7_txtMiscellaneousRemarksLaundary");
	private By txtMiscellaneousRemarksManifoldServices = By.id("ctl00_cphpage_Page7_txtMiscellaneousRemarksManifoldServices");
	private By txtHouseKeepingReasonPendency = By.id("ctl00_cphpage_Page7_txtHouseKeepingReasonPendency");
	private By txtSecurityReasonPendency = By.id("ctl00_cphpage_Page7_txtSecurityReasonPendency");
	private By txtARMReasonPendency = By.id("ctl00_cphpage_Page7_txtARMReasonPendency");
	private By txtContractualNursesReasonPendency = By.id("ctl00_cphpage_Page7_txtContractualNursesReasonPendency");
	private By txtContractualDoctorsReasonPendency = By.id("ctl00_cphpage_Page7_txtContractualDoctorsReasonPendency");

	public WebElement getTxtMiscellaneousRemarksCSSD() {
	    return getElement(txtMiscellaneousRemarksCSSD);
	}

	public WebElement getTxtMiscellaneousRemarksLaundry() {
	    return getElement(txtMiscellaneousRemarksLaundry);
	}

	public WebElement getTxtMiscellaneousRemarksManifoldServices() {
	    return getElement(txtMiscellaneousRemarksManifoldServices);
	}

	public WebElement getTxtHouseKeepingReasonPendency() {
	    return getElement(txtHouseKeepingReasonPendency);
	}

	public WebElement getTxtSecurityReasonPendency() {
	    return getElement(txtSecurityReasonPendency);
	}

	public WebElement getTxtARMReasonPendency() {
	    return getElement(txtARMReasonPendency);
	}

	public WebElement getTxtContractualNursesReasonPendency() {
	    return getElement(txtContractualNursesReasonPendency);
	}

	public WebElement getTxtContractualDoctorsReasonPendency() {
	    return getElement(txtContractualDoctorsReasonPendency);
	}
	
	private By txtCanteenUpgraded = By.id("ctl00_cphpage_Page7_txtCanteenUpgraded");
	private By cclCanteenUpgraded_day_2_3 = By.id("ctl00_cphpage_Page7_cclCanteenUpgraded_day_0_4");
	private By txtConstructionPendingDate = By.id("ctl00_cphpage_Page7_txtConstructionPendingDate");
	private By cclConstructionPendingDate_day_2_3 = By.id("ctl00_cphpage_Page7_cclConstructionPendingDate_day_0_4");
	private By txtHouseKeepingPaymentMonth = By.id("ctl00_cphpage_Page7_txtHouseKeepingPaymentMonth");
	private By calendarExtender1_day_2_3 = By.id("ctl00_cphpage_CalendarExtender1_day_0_4");
	private By txtSecurityPaymentMonth = By.id("ctl00_cphpage_Page7_txtSecurityPaymentMonth");
	private By calendarExtender2_day_2_3 = By.id("ctl00_cphpage_CalendarExtender2_day_0_4");
	private By txtARMPaymentMonth = By.id("ctl00_cphpage_Page7_txtARMPaymentMonth");
	private By calendarExtender3_day_2_3 = By.id("ctl00_cphpage_CalendarExtender3_day_0_4");
	private By txtContractualNursesPaymentMonth = By.id("ctl00_cphpage_Page7_txtContractualNursesPaymentMonth");
	private By calendarExtender4_day_2_3 = By.id("ctl00_cphpage_CalendarExtender4_day_0_4");
	private By txtContractualDoctorsPaymentMonth = By.id("ctl00_cphpage_Page7_txtContractualDoctorsPaymentMonth");
	private By calendarExtender5_day_2_3 = By.id("ctl00_cphpage_CalendarExtender5_day_0_4");

	public WebElement getTxtCanteenUpgraded() {
	    return getElement(txtCanteenUpgraded);
	}

	public WebElement getCclCanteenUpgraded_day_2_3() {
	    return getElement(cclCanteenUpgraded_day_2_3);
	}

	public WebElement getTxtConstructionPendingDate() {
	    return getElement(txtConstructionPendingDate);
	}

	public WebElement getCclConstructionPendingDate_day_2_3() {
	    return getElement(cclConstructionPendingDate_day_2_3);
	}

	public WebElement getTxtHouseKeepingPaymentMonth() {
	    return getElement(txtHouseKeepingPaymentMonth);
	}

	public WebElement getCalendarExtender1_day_2_3() {
	    return getElement(calendarExtender1_day_2_3);
	}

	public WebElement getTxtSecurityPaymentMonth() {
	    return getElement(txtSecurityPaymentMonth);
	}

	public WebElement getCalendarExtender2_day_2_3() {
	    return getElement(calendarExtender2_day_2_3);
	}

	public WebElement getTxtARMPaymentMonth() {
	    return getElement(txtARMPaymentMonth);
	}

	public WebElement getCalendarExtender3_day_2_3() {
	    return getElement(calendarExtender3_day_2_3);
	}

	public WebElement getTxtContractualNursesPaymentMonth() {
	    return getElement(txtContractualNursesPaymentMonth);
	}

	public WebElement getCalendarExtender4_day_2_3() {
	    return getElement(calendarExtender4_day_2_3);
	}

	public WebElement getTxtContractualDoctorsPaymentMonth() {
	    return getElement(txtContractualDoctorsPaymentMonth);
	}

	public WebElement getCalendarExtender5_day_2_3() {
	    return getElement(calendarExtender5_day_2_3);
	}
	private By Page7_txtConstructionTotalAreaHospital=By.id("ctl00_cphpage_Page7_txtConstructionTotalAreaHospital");
	public WebElement getPage7_txtConstructionTotalAreaHospital() {
		return getElement(Page7_txtConstructionTotalAreaHospital);
	}
	private By btnNext=By.id("ctl00_cphpage_btnNext");
	public WebElement getbtnNext() {
		return getElement(btnNext);
	}


}