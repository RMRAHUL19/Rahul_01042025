package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class Medical_Birth_Registration_Pages extends BasePage {

	public Medical_Birth_Registration_Pages(WebDriver driver) {
		super(driver);
	}
	util utilobj = new util();
	private By Birth_register_MotherDetail_Admission=By.id("ctl00_cphpage_imgbtnadmissionno");
	public WebElement getBirth_register_MotherDetail_Admission() {
		return getElement(Birth_register_MotherDetail_Admission);
	}
	private By Birth_register_MotherDetail_Admission_searchTextxbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getBirth_register_MotherDetail_Admission_searchTextxbox() {
		return getElement(Birth_register_MotherDetail_Admission_searchTextxbox);
	}
	private By Birth_register_MotherDetail_Admission_searchButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	public WebElement getBirth_register_MotherDetail_Admission_searchButton() {
		return getElement(Birth_register_MotherDetail_Admission_searchButton);
	}
	private By Birth_register_MotherDetail_Admission_radioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getBirth_register_MotherDetail_Admission_radioButton() {
		return getElement(Birth_register_MotherDetail_Admission_radioButton);
	}
	private By Birth_register_MotherDetail_Admission_selectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getBirth_register_MotherDetail_Admission_selectButton() {
		return getElement(Birth_register_MotherDetail_Admission_selectButton);
	}		
private By Birth_registr_BabyDetail_Weigth=By.id("ctl00_cphpage_txtWeightkg");
public WebElement getBirth_registr_BabyDetail_Weigth() {
	return getElement(Birth_registr_BabyDetail_Weigth);
}
private By Birth_registr_BabyDetail_WeigthGm=By.id("ctl00_cphpage_txtWeightgm");
public WebElement getBirth_registr_BabyDetail_WeigthGm() {
	return getElement(Birth_registr_BabyDetail_WeigthGm);
}
private By Birth_registr_HPD_DCB=By.id("ctl00_cphpage_ddlDeliveryby1");
public WebElement getBirth_registr_HPD_DCB() {
	return getElement(Birth_registr_HPD_DCB);
}
private By Birth_register_HPD_Place_of_birth=By.id("ctl00_cphpage_txtPlaceofBirth");
public WebElement getBirth_register_HPD_Place_of_birth() {
	return getElement(Birth_register_HPD_Place_of_birth);
}
private By Birth_register_methodofDelivery=By.id("ctl00_cphpage_ddlMethodofDel");
public WebElement getBirth_register_methodofDelivery() {
	return getElement(Birth_register_methodofDelivery);
}
private By Birth_register_birthsequence=By.id("ctl00_cphpage_txtBirthseq");
public WebElement getBirth_register_birthsequence() {
	return getElement(Birth_register_birthsequence);
}
private By Birth_register_buttinPrint=By.id("ctl00_cphpage_btnPrint");
public WebElement getBirth_register_buttinPrint() {
	return getElement(Birth_register_buttinPrint);
}
private By Birth_register_medicalofficername=By.id("ctl00_cphpage_txtName1");
public WebElement getBirth_register_medicalofficername() {
	return getElement(Birth_register_medicalofficername);
}
private By Birth_register_buttonSave=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[5]/div/input[1]");

public WebElement getBirth_register_buttonSave() {
	return getElement(Birth_register_buttonSave);
}
private By Birth_register_buttonClear=By.id("ctl00_cphpage_btn_Clear");
public WebElement getBirth_register_buttonClear() {
	return getElement(Birth_register_buttonClear);
}
private By Birth_register_msgokButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
public WebElement getBirth_register_msgokButton() {
	return getElement(Birth_register_msgokButton);
}



public void testCaseForBirthRegistration() throws InterruptedException {
	Thread.sleep(1000);
	//getBirth_register_birthsequence().sendKeys("1");
	Thread.sleep(2000);
	utilobj.selectDropdown(getBirth_register_methodofDelivery(), driver, "Normal");
	Thread.sleep(2000);
	getBirth_register_HPD_Place_of_birth().sendKeys("TEST ESIC Hospital");
	Thread.sleep(2000);
	utilobj.selectDropdown(getBirth_registr_HPD_DCB(), driver, "Medical Officer");
	Thread.sleep(2000);
	getBirth_registr_BabyDetail_Weigth().sendKeys("2");
	Thread.sleep(2000);
	getBirth_registr_BabyDetail_WeigthGm().sendKeys("600");	
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_searchTextxbox().sendKeys("IP061900013");
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_searchButton().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_radioButton().click();
	Thread.sleep(2000);
	utilobj.JSClick(getBirth_register_MotherDetail_Admission_selectButton(),driver);
	//getBirth_register_MotherDetail_Admission_selectButton().click();
	Thread.sleep(20000);
	getBirth_register_birthsequence().clear();
	Thread.sleep(2000);
	getBirth_register_birthsequence().sendKeys("1");
	Thread.sleep(2000);
	getBirth_register_medicalofficername().sendKeys("Dr Test.");
	Thread.sleep(2000);
	getBirth_register_buttonClear().click();//check the functionality of clear button
	Thread.sleep(2000);
	Thread.sleep(2000);
	utilobj.selectDropdown(getBirth_register_methodofDelivery(), driver, "Normal");
	Thread.sleep(2000);
	getBirth_register_HPD_Place_of_birth().sendKeys("TEST ESIC Hospital");
	Thread.sleep(2000);
	utilobj.selectDropdown(getBirth_registr_HPD_DCB(), driver, "Medical Officer");
	Thread.sleep(2000);
	getBirth_registr_BabyDetail_Weigth().sendKeys("2");
	Thread.sleep(2000);
	getBirth_registr_BabyDetail_WeigthGm().sendKeys("600");	
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_searchTextxbox().sendKeys("IP061900013");
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_searchButton().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_radioButton().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_selectButton().click();
	Thread.sleep(2000);
	getBirth_register_birthsequence().clear();
	Thread.sleep(2000);
	getBirth_register_birthsequence().sendKeys("1");
	Thread.sleep(2000);
	
	getBirth_register_medicalofficername().sendKeys("Dr Test.");
	Thread.sleep(2000);
	
	getBirth_register_buttonSave().click();
	Thread.sleep(20000);
	getBirth_register_msgokButton().click();
	Thread.sleep(20000);
	getBirth_register_buttinPrint().click();
	Thread.sleep(20000);
	utilobj.SwitchToChildWindow(driver, "  ");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	Thread.sleep(2000);
//	utilobj.JSClick(getBirth_register_buttonSave(), driver);
//	Thread.sleep(2000);
//	getBirth_register_msgokButton().click();
    
}
}
