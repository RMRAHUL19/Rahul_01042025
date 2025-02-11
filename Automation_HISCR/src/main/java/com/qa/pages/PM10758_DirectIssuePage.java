package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PM10758_DirectIssuePage extends BasePage {

	public PM10758_DirectIssuePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By IPTextBox = By.id("ctl00_cphpage_txtIPNO");
	private By StoreUhidImgSerch = By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getIPTextBox() {
		return getElement(IPTextBox);

	}
	public WebElement getStoreUhidImgSerch() {
		return getElement(StoreUhidImgSerch);

	}
	private By LiveListLink = By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getLiveListLink() {
		return getElement(LiveListLink);

	}
	
	private By DirectIssueCheckIssue = By.id("ctl00_cphpage_chkManual");
	public WebElement getDirectIssueCheckIssue() {
		return getElement(DirectIssueCheckIssue);

	}
	private By BeneficiaryRadioButton = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	public WebElement getBeneficiaryRadioButton() {
		return getElement(BeneficiaryRadioButton);

	}
	private By LiveListSelectButton = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getLiveListSelectButton() {
		return getElement(LiveListSelectButton);

	}
	
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By StoreIssueQuantityTextBox = By.id("ctl00_cphpage_grdIssueDetails_ctl02_txtIssueQty");
	public WebElement getStoreIssueQuantityTextBox() {
		return getElement(StoreIssueQuantityTextBox);

	}
	private By StoreUhidIssueSaveButton = By.id("ctl00_cphpage_btnSave");
	public WebElement getStoreUhidIssueSaveButton() {
		return getElement(StoreUhidIssueSaveButton);

	}
	
	private By ItemSearchImageButton= By.id("ctl00_cphpage_grdIssueDetails_ctl02_imgbtnSearchItemNew");
	public WebElement getItemSearchImageButton() {
		return getElement(ItemSearchImageButton);

	}
	private By ItemScreen_itemsearchTxtbox= By.id("txtName");
	public WebElement getItemScreen_itemsearchTxtbox() {
		return getElement(ItemScreen_itemsearchTxtbox);

	}
	private By ItemScreen_itemsearchButton= By.id("btnSearch");
	public WebElement getItemScreen_itemsearchButton() {
		return getElement(ItemScreen_itemsearchButton);

	}
	private By ItemScreen_itemCheckbox= By.id("ChkSelect0");
	public WebElement getItemScreen_itemCheckbox() {
		return getElement(ItemScreen_itemCheckbox);

	}
	private By ItemScreen_SelectButton= By.id("btnSelect");
	public WebElement getItemScreen_SelectButton() {
		return getElement(ItemScreen_SelectButton);

	}
	
	
	
	
	
}
