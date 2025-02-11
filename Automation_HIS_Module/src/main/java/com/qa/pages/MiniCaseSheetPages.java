package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class MiniCaseSheetPages extends BasePage {
	util utilobj=new util();
	public MiniCaseSheetPages(WebDriver driver) {
		super(driver);
	}
	//element located for patient check in
	private By patientcheck_in_ip_txtbox=By.id("ctl00_cphpage_txtIPNO");
	public WebElement getpatientcheck_in_ip_txtboxLink() {
		return getElement(patientcheck_in_ip_txtbox);
	}
	private By patientcheck_in_LiveList_link=By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getpatientcheck_in_LiveList_linkLink() {
		return getElement(patientcheck_in_LiveList_link);
	}
	private By patientcheck_in_Livelist_select_UHID=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	//ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl04_chkUHID
	public WebElement getpationcheck_in_Livelist_select_UHIDradiobuttonLink() {
		return getElement(patientcheck_in_Livelist_select_UHID);
	}
	private By patientcheck_in_Livelist_Selectbutton=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getpatientcheck_in_Livelist_SelectbuttonLink() {
		return getElement(patientcheck_in_Livelist_Selectbutton);
	}
	private By patientcheckin_registration_selectddl=By.id("ctl00_cphpage_ddlSpecialisation");
	public WebElement getpatientcheckin_registration_selectddlLink() {
		return getElement(patientcheckin_registration_selectddl);
	}
	private By patientcheck_in_registration_okbutton=By.id("ctl00_cphpage_btnOK");
	public WebElement getpatientcheck_in_registration_okbuttonLink() {
		return getElement(patientcheck_in_registration_okbutton);
	}
	private By patientcheck_in_registration_savebutton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getpatientcheck_in_registration_savebuttonLink() {
		return getElement(patientcheck_in_registration_savebutton);
	}
	private By popcancelbutton=By.id("popup_cancel");
	public WebElement getpopcencelbuttonLink() {
		return getElement(popcancelbutton);
	}
	private By popokbutton=By.id("popup_ok");
	public WebElement getpopokbuttonLink() {
		return getElement(popokbutton);
	}
//element located minicase sheet
	private By MiniCaseSheetOpenLink =By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo2");
	public WebElement getMiniCaseSheetOpenLink() {
		return getElement(MiniCaseSheetOpenLink);
	}
	private By minicasesheetcmplatetxt_box=By.id("ctl00_cphpage_txt_complaint");
	public WebElement getminicasesheetcmplatetxt_boxLink() {
		return getElement(minicasesheetcmplatetxt_box);
	}
	
	private By minicasesheetcmplain_autoserch=By.id("Abuse");
	public WebElement getminicasesheetcmplain_autoserchLink() {
		return getElement(minicasesheetcmplain_autoserch);
		
	}
	private By minicasesheetcmplain_remark_explanations=By.id("ctl00_cphpage_txtExplanationsRemarks");
	public WebElement getminicasesheetcmplain_remark_explanationsLink() {
		return getElement(minicasesheetcmplain_remark_explanations);
	}
	private By minicasesheet_addcomplainbutton=By.id("ctl00_cphpage_btn_Add");
	public WebElement getminicasesheet_addcomplainbuttonlink() {
		return getElement(minicasesheet_addcomplainbutton);
	}
	private By minicasesheet_othercomplain=By.id("ctl00_cphpage_txtOtherComplaints");
	public WebElement getminicasesheet_othercomplainlink() {
		return getElement(minicasesheet_othercomplain);
		
	}
private By minicasesheet_pallor_chkbox_yes=By.id("ctl00_cphpage_ChkPallor_0");
public WebElement getminicasesheet_pallor_chkbox_yesLink() {
	return getElement(minicasesheet_pallor_chkbox_yes);
}
private By minicasesheet_caynosis_chkbox_yes=By.id("ctl00_cphpage_rdbCyanosis_0");
public WebElement getminicasesheet_caynosis_chkbox_yesLink() {
	return getElement(minicasesheet_caynosis_chkbox_yes);
}
private By minicasesheet_icterus_chkbox_yes=By.id("ctl00_cphpage_rdlIcterus_0");
public WebElement getminicasesheet_icterus_chkbox_yesLink() {
	return getElement(minicasesheet_icterus_chkbox_yes);
}
private By minicasesheet_clubbing_chkbox_yes=By.id("ctl00_cphpage_chkClubbing_0");
public WebElement getminicasesheet_clubing_chkbox_yesLink() {
	return getElement(minicasesheet_clubbing_chkbox_yes);
}
private By  minicasesheet_pallor_remark_txtbox=By.id("ctl00_cphpage_txtRemark01");
public WebElement getminicasesheet_pallor_remark_txtboxLink() {
	return getElement(minicasesheet_pallor_remark_txtbox);
}
private By minicasesheet_cynosis_remark_txtbox=By.id("ctl00_cphpage_txtRemarksCyanosis");
public WebElement getminicasesheet_cynosis_remark_txtboxLink() {
	return getElement(minicasesheet_cynosis_remark_txtbox);
}
private By minicasesheet_iceterus_remark_txtbox=By.id("ctl00_cphpage_txtRemarkIcterus");
public WebElement getminicasesheet_iceterus_remark_txtboxLink() {
	return getElement(minicasesheet_iceterus_remark_txtbox);
}

private By minicasesheet_clubing_remark_txtbox=By.id("ctl00_cphpage_txtRemarksClubbing");
public WebElement getminicasesheet_clubing_remark_txtboxLink() {
	return getElement(minicasesheet_clubing_remark_txtbox);
}
private By minicasesheet_skinchanges_radiobutton=By.id("ctl00_cphpage_radSkinChanges_0");
public WebElement getminicasesheet_scinchanges_radiobuttonLink() {
	return getElement(minicasesheet_skinchanges_radiobutton);
}
private By minicasesheet_naturetxtbox=By.id("ctl00_cphpage_txtRemarksSkinChanges");
public WebElement getminicasesheet_naturetxtboxLink() {
	return getElement(minicasesheet_naturetxtbox);
}
private By minicasesheet_hydration_status_radiobutton_normal=By.id("ctl00_cphpage_radHydrationStatus_0");
public WebElement getminicasesheet_hydration_status_radiobutton_normalLink() {
	return getElement(minicasesheet_hydration_status_radiobutton_normal);
}
private By minicasesheet_RemarksHydrationStatustxt=By.id("ctl00_cphpage_txtRemarksHydrationStatus");
public WebElement getminicasesheet_RemarksHydrationStatustxtLink() {
	return getElement(minicasesheet_RemarksHydrationStatustxt);
}
private By minicasesheet_heighttxtbox=By.id("ctl00_cphpage_txtHeight");
public WebElement getminicasesheet_heighttxtboxLink() {
	return getElement(minicasesheet_heighttxtbox);
}
private By minicasesheet_weighttxtbox=By.id("ctl00_cphpage_txtWeight");
public WebElement getminicasesheet_weighttxtboxLink() {
	return getElement(minicasesheet_weighttxtbox);
}
private By minicasesheet_Lymphadenopathyradiobutton=By.id("ctl00_cphpage_radLymphadenopathy_1");
public WebElement getminicasesheet_LymphadenopathyradiobuttonLink() {
	return getElement(minicasesheet_Lymphadenopathyradiobutton);
}
private By minicasesheet_radPedalOedemaradiobutton=By.id("ctl00_cphpage_radPedalOedema_1");
public WebElement getminicasesheet_radPedalOedemaradiobuttonLink() {
	return getElement(minicasesheet_radPedalOedemaradiobutton);
}
private By minicasesheet_Pulsextbox=By.id("ctl00_cphpage_txtRatePerMin");
public WebElement getminicasesheet_PulsextboxLink() {
	return getElement(minicasesheet_Pulsextbox);
}
private By minicasesheet_Rhythmradiobutton=By.id("ctl00_cphpage_radRhythm_0");
public WebElement getminicasesheet_RhythmradiobuttonLink() {
	return getElement(minicasesheet_Rhythmradiobutton);
}
private By minicasesheet_AllPulseradiobutton=By.id("ctl00_cphpage_radAllPulse_0");
public WebElement getminicasesheet_AllPulseradiobuttonLink() {
	return getElement(minicasesheet_AllPulseradiobutton);
}
private By minicasesheet_Respirationtxtbox=By.id("ctl00_cphpage_txtRespiration");
public WebElement getminicasesheet_RespirationtxtboxLink() {
	return getElement(minicasesheet_Respirationtxtbox);
}
private By minicasesheet_BPtxtbox=By.id("ctl00_cphpage_txtBP");
public WebElement getminicasesheet_BPtxtboxLink() {
	return getElement(minicasesheet_BPtxtbox);
}
private By minicasesheet_JVPradiobox=By.id("ctl00_cphpage_radJVP_1");
public WebElement getminicasesheet_JVPradioboxLink() {
	return getElement(minicasesheet_JVPradiobox);
}
private By minicasesheet_Thyroidtxtbox=By.id("ctl00_cphpage_txThyroid");
public WebElement getminicasesheet_ThyroidtxtboxLink() {
	return getElement(minicasesheet_Thyroidtxtbox);
}
private By minicasesheet_SNOMED_search=By.id("ctl00_cphpage_txtICDDiagnosis");
public WebElement getminicasesheet_SNOMED_searchLink() {
	return getElement(minicasesheet_SNOMED_search);
}
private By minicasesheet_SNOMED_search_selectAbscess=By.id("128477000$Abscess");
public WebElement getminicasesheet_SNOMED_search_selectAbscessLink() {
	return getElement(minicasesheet_SNOMED_search_selectAbscess);
}
private By minicasesheet_ODDiagnosissearchbox=By.id("ctl00_cphpage_txtODDiagnosis");
public WebElement getminicasesheet_ODDiagnosissearchboxLink() {
	return getElement(minicasesheet_ODDiagnosissearchbox);
}
private By minicasesheet_ODDiagnosisselectdiseases=By.id("12171$Biological agents and infectious or parasitic diseases $OD1.3.");
public WebElement getminicasesheet_ODDiagnosisselectdiseasesLink() {
	return getElement(minicasesheet_ODDiagnosisselectdiseases);
}
private By minicasesheet_FUPbutton=By.id("btnFUP");
public WebElement getminicasesheet_FUPbuttonLink() {
	return getElement(minicasesheet_FUPbutton);
}
private By minicasesheet_FUPcheckselect=By.id("ChkSelect0");
public WebElement getminicasesheet_FUPcheckselectLink() {
	return getElement(minicasesheet_FUPcheckselect);
}
private By minicasesheet_FUPselectButton=By.id("btnSelect");
public WebElement getminicasesheet_FUPselectButtonLink() {
	return getElement(minicasesheet_FUPselectButton);
}
private By minicasesheet_ADDButton=By.id("btnOK");
public WebElement getminicasesheet_ADDButtonLink() {
	return getElement(minicasesheet_ADDButton);
}

private By minicasesheet_Discription=By.id("ctl00_cphpage_txtDescProvisionalDiagnosis");
public WebElement getminicasesheet_DiscriptionLink() {
	return getElement(minicasesheet_Discription);
}
private By minicasesheet_BUTTONSave=By.id("btnSaveDisplay");
public WebElement getminicasesheet_BUTTONSaveLink() {
	return getElement(minicasesheet_BUTTONSave);
}
private By minicasesheet_selectTypeddl=By.id("ctl00_cphpage_ddl_DropDown");
public WebElement getminicasesheet_selectTypeddlLink() {
	return getElement(minicasesheet_selectTypeddl);
}







//test case for patient check in
public void GoToPatient_check_in(String IPnumber) throws InterruptedException {
	Thread.sleep(2000);
	getpatientcheck_in_ip_txtboxLink().sendKeys(IPnumber);
	Thread.sleep(2000);
	getpatientcheck_in_LiveList_linkLink().click();
	Thread.sleep(2000);
	getpationcheck_in_Livelist_select_UHIDradiobuttonLink().click();
	Thread.sleep(2000);
	getpatientcheck_in_Livelist_SelectbuttonLink().click();
	Thread.sleep(2000);
	Select select=new Select(getpatientcheckin_registration_selectddlLink());
	select.selectByVisibleText("ENT (Otorhinolaryngology)");
	Thread.sleep(2000);
	getpatientcheck_in_registration_okbuttonLink().click();
	//utilobj.JSClick(getpatientcheck_in_registration_okbuttonLink(), driver);
	Thread.sleep(2000);
	getpatientcheck_in_registration_savebuttonLink().click();
	//utilobj.JSClick(getpatientcheck_in_registration_savebuttonLink(), driver);
	Thread.sleep(2000);
	//utilobj.JSClick(getpopokbuttonLink(), driver);

	utilobj.JSClick(getpopcencelbuttonLink(), driver);
	//driver.findElement(By.id("popup_cancel")).click();
	Thread.sleep(2000);
	
	
	
	
}
//test casees.....for minicase sheet
public void GoToMiniCaseSheet() throws InterruptedException {
getMiniCaseSheetOpenLink().click();//open minicase sheet
getminicasesheetcmplatetxt_boxLink().sendKeys("abu");//add complain
Thread.sleep(2000);
getminicasesheetcmplain_autoserchLink().click();
Thread.sleep(2000);
getminicasesheetcmplain_remark_explanationsLink().sendKeys("abuse......");///give remarks
Thread.sleep(2000);
getminicasesheet_addcomplainbuttonlink().click();//add complin
Thread.sleep(2000);
getminicasesheet_othercomplainlink().sendKeys(".......Abuse........");//add other complain
Thread.sleep(2000);
getminicasesheet_pallor_chkbox_yesLink().click();//select pallor checkbox
Thread.sleep(2000);
getminicasesheet_pallor_remark_txtboxLink().sendKeys("pallorrrr...");
getminicasesheet_caynosis_chkbox_yesLink().click();//select caynosis
getminicasesheet_cynosis_remark_txtboxLink().sendKeys(".........cynosis......");
getminicasesheet_icterus_chkbox_yesLink().click();//select iceterus
getminicasesheet_iceterus_remark_txtboxLink().sendKeys("...icetrus....");
getminicasesheet_clubing_chkbox_yesLink().click();//select clubing
getminicasesheet_clubing_remark_txtboxLink().sendKeys("....clubing...");
getminicasesheet_scinchanges_radiobuttonLink().click();
getminicasesheet_naturetxtboxLink().sendKeys(".....nature.....");
getminicasesheet_hydration_status_radiobutton_normalLink().click();
getminicasesheet_RemarksHydrationStatustxtLink().sendKeys(".....hydration normal...");
getminicasesheet_heighttxtboxLink().sendKeys("4");
getminicasesheet_weighttxtboxLink().sendKeys("72");
getminicasesheet_LymphadenopathyradiobuttonLink().click();
getminicasesheet_radPedalOedemaradiobuttonLink().click();
getminicasesheet_PulsextboxLink().sendKeys("72");
getminicasesheet_RhythmradiobuttonLink().click();
getminicasesheet_RespirationtxtboxLink().sendKeys("50");
getminicasesheet_BPtxtboxLink().sendKeys("70 to 120");
getminicasesheet_JVPradioboxLink().click();
getminicasesheet_ThyroidtxtboxLink().sendKeys("NO");
getminicasesheet_SNOMED_searchLink().sendKeys("abu");
Thread.sleep(2000);
getminicasesheet_SNOMED_search_selectAbscessLink().click();
Thread.sleep(2000);
//driver.findElement(By.id("ctl00_cphpage_txtICDDiagnosis")).sendKeys("Snapped cord");
//Thread.sleep(2000);
Select select=new Select(getminicasesheet_selectTypeddlLink());
select.selectByVisibleText("Provisional Diagnosis");
Thread.sleep(2000);
getminicasesheet_ODDiagnosissearchboxLink().sendKeys("biological");
Thread.sleep(4000);
getminicasesheet_ODDiagnosisselectdiseasesLink().click();
Thread.sleep(2000);
getminicasesheet_ADDButtonLink().click();

Thread.sleep(2000);
//driver.findElement(By.id("popup_ok")).click();
getminicasesheet_DiscriptionLink().sendKeys("......TestDescription......");
Thread.sleep(2000);
getminicasesheet_BUTTONSaveLink().click();

//utilobj.JSClick(getminicasesheet_FUPbuttonLink(), driver);
//getminicasesheet_FUPbuttonLink().click();
//Thread.sleep(2000);

//24043009$Snotsiekte
//getminicasesheet_FUPcheckselectLink().click();
//Thread.sleep(2000);
//getminicasesheet_FUPselectButtonLink().click();


}
}