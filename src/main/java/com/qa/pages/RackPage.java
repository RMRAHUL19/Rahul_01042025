package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class RackPage extends BasePage {

	util utilobj = new util();

	public RackPage(WebDriver driver) {
		super(driver);

	}

	private By code = By.id("ctl00_cphpage_txtCode");
	private By rackname = By.id("ctl00_cphpage_txtRackName");
	private By RackbtnSearch = By.id("ctl00_cphpage_imgSearchRackName");
	private By Racksearchfield = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By codesearchfield = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl01_txtCriteria");
	private By searchpopupbtn = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By searchdataentry1 = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By searchdataselect = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By btnSave = By.id("ctl00_cphpage_btnSave");
	private By ClearButton = By.id("ctl00_cphpage_btnClear");
	private By ModifyButton = By.id("ctl00_cphpage_btnModify");
	private By OkButton = By.id("ctl00_cphpage_MessageBoxInfo_ButtonOK");
	
	
	public WebElement getcode() {
		return getElement(code);
	}

	public WebElement getbtnSave() {
		return getElement(btnSave);
	}

	public WebElement getRackbtnSearch() {
		return getElement(RackbtnSearch);
	}

	public WebElement getrackname() {
		return getElement(rackname);
	}

	public WebElement getRacksearchfield() {
		return getElement(Racksearchfield);
	}

	public WebElement getcodesearchfield() {
		return getElement(codesearchfield);
	}

	public WebElement getsearchpopupbtn() {
		return getElement(searchpopupbtn);
	}

	public WebElement getsearchdataentry1() {
		return getElement(searchdataentry1);
	}

	public WebElement getsearchdataselect() {
		return getElement(searchdataselect);
	}

	public WebElement getModifyButton() {
		return getElement(ModifyButton);
	}
	
	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	
	public WebElement getOkButton() {
		return getElement(OkButton);
	}
	
	
}
