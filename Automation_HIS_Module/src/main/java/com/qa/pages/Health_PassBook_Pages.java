package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Health_PassBook_Pages extends BasePage {

	public Health_PassBook_Pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
util utillobj=new util();
private By IP_NO_textBox=By.id("ctl00_cphpage_txtIPNO");
private By LiveList_Link=By.id("ctl00_cphpage_lnkbtnIPNo");
private By LiveList_superSpecility_Button=By.id("ctl00_cphpage_hisLiveListControl_btnSuperSpeciality");
private By LiveList_btnSuperSpecClose=By.id("ctl00_cphpage_hisLiveListControl_btnSuperSpecClose");
private By LiveList_RadioButton=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
private By LiveList_btnSelect=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
private By LiveList_btnPrintHealthPassbook=By.id("ctl00_cphpage_btnPrint");
private By btnbtnClear=By.id("ctl00_cphpage_btnClear");
private By btnPrint=By.id("ctl00_cphpage_btnPrint");


public WebElement getIP_NO_textBox() {
	return getElement(IP_NO_textBox);
}
public WebElement getLiveList_Link() {
	return getElement(LiveList_Link);
}
public WebElement getLiveList_superSpecility_Button() {
	return getElement(LiveList_superSpecility_Button);
}
public WebElement getLiveList_btnSuperSpecClose() {
	return getElement(LiveList_btnSuperSpecClose);
}
public WebElement getLiveList_RadioButton() {
	return getElement(LiveList_RadioButton);
}
public WebElement getLiveList_btnSelect() {
	return getElement(LiveList_btnSelect);
}
public WebElement getLiveList_btnPrintHealthPassbook() {
	return getElement(LiveList_btnPrintHealthPassbook);
}
public WebElement getbtnbtnClear() {
	return getElement(btnbtnClear);
}
public WebElement getbtnPrint() {
	return getElement(btnPrint);
}

}
