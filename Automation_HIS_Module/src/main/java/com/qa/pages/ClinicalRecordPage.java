package com.qa.pages;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;
public class ClinicalRecordPage extends BasePage {
	util utilobj=new util();
	public ClinicalRecordPage(WebDriver driver) {
		super(driver);
	}
	/*Clinical Records Module*/
	private By ClinicalRecordLink=By.linkText("Clinical Records");
	/*Inpatient referral worklist */
	private By InpatientreferralworklistLink=By.linkText("Inpatient referral worklist");
	/*Doctor Worklist */
	private By DoctorWorklistLink=By.linkText("Doctor Worklist");
	/*Inpatients/Emergency Patients */
	private By InpatientsEmergencyPatientsLink=By.linkText("Inpatients/Emergency Patients");
	/*Open Visits */
	private By OpenVisitsLink=By.linkText("Open Visits");
	/*Discharge Summary */
	private By DischargeSummaryLink=By.linkText("Discharge Summary");
	/*Frequently Used packs*/
	private By FrequentlyUsedpacksLink=By.linkText("Frequently Used packs");
	/*Order Packs */
	private By OrderPacksLink=By.linkText("Order Packs");
	/*DosageTypes */
	private By DosageTypesLink=By.linkText("DosageTypes");
	/*Certificate Generation */
	private By CertificateGenerationLink=By.linkText("Certificate Generation");
	/*Certificate Definition */
	private By CertificateDefinitionLink=By.linkText("Certificate Definition");
	/*Maternity Certificate */
	private By MaternityCertificateLink=By.linkText("Maternity Certificate");
	/*ANM Service */
	private By ANMServiceLink=By.linkText("ANM Service");
	/*Copy Order Packs */
	private By CopyOrderPacksLink=By.linkText("Copy Order Packs");
	/*Discharge Intimation */
	private By DischargeIntimationLink=By.linkText("Discharge Intimation");
	/* Investigation Prescriptions*/
	private By InvestigationPrescriptionsLink=By.linkText("Investigation Prescriptions");
	/*Edit Certificate */
	private By EditCertificateLink=By.linkText("Edit Certificate");
	/*e-Referee Worklist */
	private By eRefereeWorklistLink=By.linkText("e-Referee Worklist");
	/*img search*/
	private By ImgUhidSearchLink = By.id("ctl00_cphpage_imgsearchuhid");
	/*Serch Text box*/
	private By UhidSerchTextBoxLink = By.id("ctl00_cphpage_txtUhid");
	/*uhidserch window textbox*/
	private By UhidSerchWindowtextBox = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	/*uhidserch window textbox*/
	private  By UhidSerchWindowSerchButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By  UhidButtonClose= By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnClose");
	/*inpatient_emergency module/ medicine*/
	private By Inpatient_Emergencypatient_Medicine_pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[2]/th[1]/img");
	private By Inpatient_Emergencypatient_Medicine_minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[2]/th[1]/img");
	/*inpatient_emergency module/ Emergency Unit*/
	private By Inpatient_Emergencypatient_EmergencyUnit_pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[26]/th[1]/img");
	private By Inpatient_Emergencypatient_EmergencyUnit_minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[26]/th[1]/img");
	/*inpatient_emergency module/ DumyUnit*/
	private By Inpatient_Emergencypatient_DummyUnit_Pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[29]/th[1]/img");
	private By Inpatient_Emergencypatient_DummyUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[29]/th[1]/img");
	
	/*inpatient_emergency module/ CasualityUnit*/
	private By Inpatient_Emergencypatient_CasualityUnit_Pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[33]/th[1]/img");
	private By Inpatient_Emergencypatient_CasualityUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[33]/th[1]/img");
	/*inpatient_emergency module/ SurgeryUnit*/
	private By Inpatient_Emergencypatient_SurgeryUnit_Pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[35]/th[1]/img");
	private By Inpatient_Emergencypatient_SurgeryUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[35]/th[1]/img");
	/*inpatient_emergency module/ TestingUnit*/
	private By Inpatient_Emergencypatient_TestingUnit_Pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[37]/th[1]/img");
	private By Inpatient_Emergencypatient_TestingUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[37]/th[1]/img");
	
	/*inpatient_emergency module/ L1dcUnit*/
	private By Inpatient_Emergencypatient_l1dcUnit_pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[39]/th[1]/img");
	private By Inpatient_Emergencypatient_l1dcUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[39]/th[1]/img");
	/*inpatient_emergency module/ GynaeUnit*/
	private By Inpatient_Emergencypatient_GyneUnit_pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[41]/th[1]/img");
	private By Inpatient_Emergencypatient_GyneUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[41]/th[1]/img");
	/*inpatient_emergency module/ Gernal_Unit*/
	private By Inpatient_Emergencypatient_GenralUnit_pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[43]/th[1]/img");
	private By Inpatient_Emergencypatient_GenralUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[43]/th[1]/img");
	/*inpatient_emergency module/ IcuUnit*/
	private By Inpatient_Emergencypatient_IcuUnit_Pluse=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[45]/th[1]/img");
	private By Inpatient_Emergencypatient_IcuUnit_Minus=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[45]/th[1]/img");
	
	/*inpatient_emergency module*/
	public WebElement getInpatient_Emergencypatient_Medicine_pluselink() {
		return getElement(Inpatient_Emergencypatient_Medicine_pluse);
	}
	private WebElement getInpatient_Emergencypatient_Medicine_minusLink() {
		return getElement(Inpatient_Emergencypatient_Medicine_minus);
	}
	
	public WebElement getInpatient_Emergencypatient_EmergencyUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_EmergencyUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_EmergencyUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_EmergencyUnit_minus);
	}
	public WebElement getInpatient_Emergencypatient_DummyUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_DummyUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_DummyUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_DummyUnit_Minus);
	}
	public WebElement getInpatient_Emergencypatient_CasualityUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_CasualityUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_CasualityUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_CasualityUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_SurgeryUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_SurgeryUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_SurgeryUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_SurgeryUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_TestingUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_TestingUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_TestingUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_TestingUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_l1dcUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_l1dcUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_l1dcUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_l1dcUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_GyneUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_GyneUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_GyneUnit_Minuslink() {
		return getElement(Inpatient_Emergencypatient_GyneUnit_Minus);
		
	}
	
	public WebElement getInpatient_Emergencypatient_GenralUnit_pluselink() {
		return getElement(Inpatient_Emergencypatient_GenralUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_GenralUnit_Minuslink() {
		return getElement(Inpatient_Emergencypatient_GenralUnit_Minus);
		
	}	
	public WebElement getInpatient_Emergencypatient_IcuUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_IcuUnit_Pluse);
	}
	public WebElement getInpatient_Emergencypatient_IcuUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_IcuUnit_Minus);
	}

	/*Certificate genration Uhid search*/
	 public WebElement getUhidSerchWindowSerchButtonLink() {
		 return getElement(UhidSerchWindowSerchButton);
	 }
	public WebElement getUhidSerchWindowtextBoxLink(){
		return getElement(UhidSerchWindowtextBox);
	}
public WebElement getImgUhidSearchLink(){
	return getElement(ImgUhidSearchLink);
	
}
public WebElement getUhidSerchTextBoxLink() {
	return getElement(UhidSerchTextBoxLink);
}
public void  dogenratecertification(String UHIDNO) {
	getUhidSerchTextBoxLink().sendKeys(UHIDNO);
}

	
	public WebElement getClinicalRecord() {
		return getElement(ClinicalRecordLink);

	}
	public WebElement getInpatientreferralworklis() {
		return getElement(InpatientreferralworklistLink);
	}
	public WebElement getDoctorWorklis() {
		return getElement(DoctorWorklistLink);
	}
	public WebElement getInpatientsEmergencyPatients() {
		return getElement(InpatientsEmergencyPatientsLink);
		
	}
	public WebElement getOpenVisits() {
		return getElement(OpenVisitsLink);
	}
	public WebElement getDischargeSummary() {
		return getElement(DischargeSummaryLink);
		
	}
	public WebElement getFrequentlyUsedpacks() {
		return getElement(FrequentlyUsedpacksLink);
	}
public WebElement getOrderPacks() {
	return getElement(OrderPacksLink);
}
public WebElement getDosageTypes() {
	return getElement(DosageTypesLink);
}
public WebElement getCertificateGeneration() {
	
	return getElement(CertificateGenerationLink);
}
public WebElement getCertificateDefinition() {
	return getElement(CertificateDefinitionLink);
}
public WebElement getMaternityCertificate() {
	return getElement(MaternityCertificateLink);
}
public WebElement getANMService() {
	return getElement(ANMServiceLink);
}
public WebElement getCopyOrderPacks() {
	return getElement(CopyOrderPacksLink);
}
public WebElement getDischargeIntimation() {
	return getElement(DischargeIntimationLink);
}
public WebElement getInvestigationPrescriptions() {
	return getElement(InvestigationPrescriptionsLink);
}
public WebElement getEditCertificate() {
	return getElement(EditCertificateLink);
	
}
public WebElement geteRefereeWorklist() {
	return getElement(eRefereeWorklistLink);
}
public WebElement getUhidSerchCloseButton() {
	return getElement(UhidButtonClose);
}
private By insuranceNo_searchimgbutton=By.id("ctl00_cphpage_imgbtnInsuranceno");
public WebElement getinsuranceNo_searchimgbuttonLink() {
	return getElement(insuranceNo_searchimgbutton);
}
private By insuranceNoWindow_serchTxtbox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
public WebElement getinsuranceNoWindow_serchTxtboxLink() {
	return getElement(insuranceNoWindow_serchTxtbox);
}
private By insuranceNowindow_serchbutton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
public WebElement getinsuranceNowindow_serchbuttonLink() {
	return getElement(insuranceNowindow_serchbutton);
	
}
private By insuranceNowindow_radioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
public WebElement getinsuranceNowindow_radioButtonLink() {
	return getElement(insuranceNowindow_radioButton);
}
private By insuranceNowindow_selectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
public WebElement getinsuranceNowindow_selectButtonLink() {
	return getElement(insuranceNowindow_selectButton);
}
private By insuranceNo_certificateType=By.id("ctl00_cphpage_ddlCertificatetype");
public WebElement getinsuranceNo_certificateTypeLink() {
	return getElement(insuranceNo_certificateType);
}
private By MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander=By.id("ctl00_cphpage_txtStartDateOfSpell");
public WebElement getMedicalCertificateFirstAndFinal_CreateDateOfSpell_callanderLink() {
	return getElement(MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander);
}
private By MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_date=By.id("ctl00_cphpage_CalendarExtender3_day_1_2");
public WebElement getMedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_dateLink() {
	return getElement(MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_date);
}
private By medicalCertificate_leveRecommendationImgTitlePanel5=By.id("ctl00_cphpage_imgTitlePanel5");
public WebElement getmedicalCertificate_leveRecommendationLink() {
	return getElement(medicalCertificate_leveRecommendationImgTitlePanel5);
}
private By medicalCertifiacteLeveRecommendation_leaveRequire=By.id("ctl00_cphpage_txtTotalleaveavailed");
public WebElement getmedicalCertifiacteLeveRecommendation_leaveRequireLink() {
	return getElement(medicalCertifiacteLeveRecommendation_leaveRequire);
}

//certification Genration
public void testCaseofCertificationGenration() throws InterruptedException {
	getinsuranceNo_searchimgbuttonLink().click();
	getinsuranceNoWindow_serchTxtboxLink().sendKeys("1199900090");
	getinsuranceNowindow_serchbuttonLink().click();
	getinsuranceNowindow_radioButtonLink().click();
	Thread.sleep(2000);
	getinsuranceNowindow_selectButtonLink().click();
	Thread.sleep(2000);
	Select select=new Select(getinsuranceNo_certificateTypeLink());
	select.selectByVisibleText("Medical Certificate-First And Final");
	Thread.sleep(2000);
	utilobj.JSClick(getMedicalCertificateFirstAndFinal_CreateDateOfSpell_callanderLink(), driver);
	utilobj.JSClick(getMedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_dateLink(),driver);
	Thread.sleep(2000);
	getmedicalCertificate_leveRecommendationLink().click();
	getmedicalCertifiacteLeveRecommendation_leaveRequireLink().sendKeys("3");
	getmedicalCertifiacteLeveRecommendation_leaveRequireLink().sendKeys(Keys.ENTER);
	utilobj.scroolDown(driver);
	
	
	
	
	
	
	}
public void testcaseofmaternitycertificate() {
	
	
	
}
public void testCaseforInpatientsEmergencyPatients() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_Medicine_pluselink().click();//
	getInpatient_Emergencypatient_Medicine_minusLink().click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_EmergencyUnit_pluseLink().click();
	getInpatient_Emergencypatient_EmergencyUnit_MinusLink().click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_DummyUnit_PluseLink().click();
	getInpatient_Emergencypatient_DummyUnit_MinusLink().click();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_CasualityUnit_PluseLink().click();
	getInpatient_Emergencypatient_CasualityUnit_MinusLink().click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_SurgeryUnit_PluseLink().click();
	getInpatient_Emergencypatient_SurgeryUnit_MinusLink().click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_TestingUnit_PluseLink().click();
	getInpatient_Emergencypatient_TestingUnit_MinusLink().click();
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_l1dcUnit_pluseLink().click();
	getInpatient_Emergencypatient_l1dcUnit_MinusLink().click();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_GyneUnit_pluseLink().click();
	getInpatient_Emergencypatient_GyneUnit_Minuslink().click();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	getInpatient_Emergencypatient_GenralUnit_pluselink().click();
	getInpatient_Emergencypatient_GenralUnit_Minuslink().click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	getInpatient_Emergencypatient_IcuUnit_PluseLink().click();
	getInpatient_Emergencypatient_IcuUnit_MinusLink().click();
	
	
	
	
}







}
