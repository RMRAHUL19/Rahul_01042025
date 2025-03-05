package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class GatePassPage extends BasePage {
	
	util utilobj = new util();

	public GatePassPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By imgSupplier = By.id("ctl00_cphpage_imgSupplier");
	private By txtCriteria = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By hisDataSearchCtrl = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By rdbTemp = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By btnSelect = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By txtItem = By.id("ctl00_cphpage_grdSearchResults_ctl02_txtItem");
	private By txtQty = By.id("ctl00_cphpage_grdSearchResults_ctl02_txtQty");
	private By txtRemarks = By.id("ctl00_cphpage_grdSearchResults_ctl02_txtRemarks");
	private By btnSave = By.id("ctl00_cphpage_btnSave");
	


	
	
	public WebElement gettxtimgSupplier() {
		return getElement(imgSupplier);
	}
	
	public WebElement gettxttxtCriteria() {
		return getElement(txtCriteria);
	}
	
	public WebElement gettxthisDataSearchCtrl() {
		return getElement(hisDataSearchCtrl);
	}
	
	public WebElement gettxtrdbTemp() {
		return getElement(rdbTemp);
	}
	
	public WebElement gettxtbtnSelect() {
		return getElement(btnSelect);
	}
	
	public WebElement gettxtItemSelect() {
		return getElement(txtItem);
	}
	
	public WebElement gettxtQtySelect() {
		return getElement(txtQty);
	}
	
	public WebElement gettxtRemarksSelect() {
		return getElement(txtRemarks);
	}
	
	public WebElement gettxtbtnSaveSelect() {
		return getElement(btnSave);
	}



	private By imgSupplierSelectButton=By.id("ctl00_cphpage_imgSupplier");
	public WebElement getimgSupplierSelectButton() {
		return getElement(imgSupplierSelectButton);
	}
	
	private By txtCriteriaSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement gettxtCriteriaSelectButton() {
		return getElement(txtCriteriaSelectButton);
	}
	
	private By hisDataSearchCtrlSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	public WebElement gethisDataSearchCtrlSelectButton() {
		return getElement(hisDataSearchCtrlSelectButton);
	}
	
	private By rdbTempSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getrdbTempSelectButton() {
		return getElement(rdbTempSelectButton);
	}
	
	private By btnSelectSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	public WebElement getbtnSelectSelectButton() {
		return getElement(btnSelectSelectButton);
	}
	
	private By txtItemSelectButton=By.id("ctl00_cphpage_grdSearchResults_ctl02_txtItem");
	public WebElement gettxttxtItem() {
		return getElement(txtItemSelectButton);
	}

	private By txtQtySelectButton=By.id("ctl00_cphpage_grdSearchResults_ctl02_txtQty");
	public WebElement gettxttxtQty() {
		return getElement(txtQtySelectButton);
	}
	
	private By txtRemarksSelectButton=By.id("ctl00_cphpage_grdSearchResults_ctl02_txtRemarks");
	public WebElement gettxttxtRemarks() {
		return getElement(txtRemarksSelectButton);
	}
	
	private By btnSaveSelectButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getbtnSave() {
		return getElement(btnSaveSelectButton);
	}
	}
	

    

	
	

	
	

