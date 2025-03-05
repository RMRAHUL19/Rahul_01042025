package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class ShelfPage extends BasePage {
	
	util utilobj = new util();

	public ShelfPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By imgSearchRack = By.id("ctl00_cphpage_imgSearchRack");
	private By hisSearchCriteria = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By btnSearch = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By hisSearchResultGrid = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By btnSelect = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By txtShelfName = By.id("ctl00_cphpage_txtShelfName");
	private By btnSave = By.id("ctl00_cphpage_btnSave");

	
	
	public WebElement gettxtimgSearchRack() {
		return getElement(imgSearchRack);
	}
	
	public WebElement gettxthisSearchCriteria() {
		return getElement(hisSearchCriteria);
	}
	
	public WebElement gettxtbtnSearch() {
		return getElement(btnSearch);
	}
	
	public WebElement gettxthisSearchResultGrid() {
		return getElement(hisSearchResultGrid);
	}
	
	public WebElement gettxtbtnSelect() {
		return getElement(btnSelect);
	}
	
	public WebElement gettxttxtShelfName() {
		return getElement(txtShelfName);
	}
	
	public WebElement gettxtbtnSave() {
		return getElement(btnSave);
	}


	private By imgSearchRackSelectButton=By.id("ctl00_cphpage_imgSearchRack");
	public WebElement getimgSearchRackSelectButton() {
		return getElement(imgSearchRackSelectButton);
	}
	
	private By hisSearchCriteriaSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement gethisSearchCriteriaSelectButton() {
		return getElement(hisSearchCriteriaSelectButton);
	}
	
	private By btnSearchSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	public WebElement getbtnSearchSelectButton() {
		return getElement(btnSearchSelectButton);
	}
	
	private By hisSearchResultGridRadiobutton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement gethisSearchResultGridEnryRadiobutton() {
		return getElement(hisSearchResultGridRadiobutton);
	}
	
	private By btnSelectSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	public WebElement getbtnSelectSelectButton() {
		return getElement(btnSelectSelectButton);
	}
	
	private By txtShelfNameSelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	public WebElement gettxtShelfNameSelectButton() {
		return getElement(txtShelfNameSelectButton);
	}
	
	
	
	private By txtbtnSaveSelectButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getbtnSaveSelectButton() {
		return getElement(txtbtnSaveSelectButton);
	}
	
    

	
	
	}

	
	

