package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndentRaisedworkFlowPage extends BasePage{

	public IndentRaisedworkFlowPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By IndentToSearchImageButton = By.id("ctl00_cphpage_imgSearch");
	public WebElement getIndentToSearchImageButton() {
		return getElement(IndentToSearchImageButton);
	}
	private By IndentTo_StoreNameTextBox = By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getIndentTo_StoreNameTextBox() {
		return getElement(IndentTo_StoreNameTextBox);
	}
	private By IndentTo_Store_SearchButton = By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_btnSearch");
	public WebElement getIndentTo_Store_SearchButton() {
		return getElement(IndentTo_Store_SearchButton);
	}
	private By IndentTo_Store_CheckBox = By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getIndentTo_Store_CheckBox() {
		return getElement(IndentTo_Store_CheckBox);
		
	}
	private By IndentTo_Store_SelectButton = By.id("ctl00_cphpage_HISDataSearchCtrl_btnSelect");
	public WebElement getIndentTo_Store_SelectButton() {
		return getElement(IndentTo_Store_SelectButton);
		
	}
	private By IndentTo_Item_NameImageSearchButton = By.id("ctl00_cphpage_grdIndentIssues_ctl02_imgbtnSearchItem");
	public WebElement getIndentTo_Item_NameImageSearchButton() {
		return getElement(IndentTo_Item_NameImageSearchButton);
		
	}
	private By IndentTo_Item_Name_SearchTextbox = By.id("txtName");
	public WebElement getIndentTo_Item_Name_SearchTextbox() {
		return getElement(IndentTo_Item_Name_SearchTextbox);
		
	}
	private By IndentTo_Item_Name_searchButton = By.id("btnSearch");
	public WebElement getIndentTo_Item_Name_searchButton() {
		return getElement(IndentTo_Item_Name_searchButton);
		
	}
	private By IndentTo_Item_Name_checkbox = By.id("ChkSelect0");
	public WebElement getIndentTo_Item_Name_checkbox() {
		return getElement(IndentTo_Item_Name_checkbox);
		
	}
	private By IndentTo_Item_Name_SelectButton = By.id("btnSelect");
	public WebElement getIndentTo_Item_Name_SelectButton() {
		return getElement(IndentTo_Item_Name_SelectButton);
		
	}
	private By IndentTo_RequirmentQuantityTextBox = By.id("ctl00_cphpage_grdIndentIssues_ctl02_ReqQty");
	public WebElement getIndentTo_RequirmentQuantityTextBox() {
		return getElement(IndentTo_RequirmentQuantityTextBox);
		
	}
	private By IndentTo_RemarksTextBox = By.id("ctl00_cphpage_grdIndentIssues_ctl02_Remarks");
	public WebElement getIndentTo_RemarksTextBox() {
		return getElement(IndentTo_RemarksTextBox);
		
	}
	private By IndentTo_SaveButton = By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getIndentTo_SaveButton() {
		return getElement(IndentTo_SaveButton);
		
	}
	private By IndentTo_SuccessOkButton = By.id("popup_ok");
	public WebElement getIndentTo_SuccessOkButton() {
		return getElement(IndentTo_SuccessOkButton);
		
	}
	private By IndentTo_ViewButton = By.id("ctl00_cphpage_btnView");
	public WebElement getIndentTo_ViewButton() {
		return getElement(IndentTo_ViewButton);
		
	}
	private By IndentWorkList_IsuueRadiobutton = By.id("ctl00_cphpage_grdIndentReceipts_ctl02_rdbReceiptsList");
	                                                    
	public WebElement getIndentWorkList_IsuueRadiobutton() {
		return getElement(IndentWorkList_IsuueRadiobutton);
		
	}
	private By IndentWorkList_ViewIndent = By.id("ctl00_cphpage_btnRecp_ViewIndent");
	public WebElement getIndentWorkList_ViewIndent() {
		return getElement(IndentWorkList_ViewIndent);
		
	}
	private By IndentWorkList_ViewIndent_ApproveButton = By.id("ctl00_cphpage_btnApprove");
	public WebElement getIndentWorkList_ViewIndent_ApproveButton() {
		return getElement(IndentWorkList_ViewIndent_ApproveButton);
		
	}
	private By IndentWorkList_ViewIndent_CloseButton = By.id("ctl00_cphpage_btnClose");
	public WebElement getIndentWorkList_ViewIndent_CloseButton() {
		return getElement(IndentWorkList_ViewIndent_CloseButton);
		
	}
	private By ChangeLocation = By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getChangeLocation() {
		return getElement(ChangeLocation);
		
	}
	private By WarningMessageOkButton = By.id("ctl00_cphpage_MessageBoxInfo_ButtonOK");
	public WebElement getWarningMessageOkButton() {
		return getElement(WarningMessageOkButton);
		
	}
	private By IndentWorkList_IssueTab = By.id("ctl00_cphpage_btnIssuesTab");
	public WebElement getIndentWorkList_IssueTab() {
		return getElement(IndentWorkList_IssueTab);
		
	}
	private By IndentWorkList_IndentIssueRadiobutton = By.id("ctl00_cphpage_grdIndentIssues_ctl02_rdbIssueList");
	public WebElement getIndentWorkList_IndentIssueRadiobutton() {
		return getElement(IndentWorkList_IndentIssueRadiobutton);
		
	}
	private By IndentWorkList_IssueViewIndent = By.id("ctl00_cphpage_btnIssue_ViewIndent");
	public WebElement getIndentWorkList_IssueViewIndent() {
		return getElement(IndentWorkList_IssueViewIndent);
		
	}
	private By IndentWorkList_Issue_IssueIndentButton = By.id("ctl00_cphpage_btnIssue_IssueIndent");
	public WebElement getIndentWorkList_Issue_IssueIndentButton() {
		return getElement(IndentWorkList_Issue_IssueIndentButton);
		
	}
	private By IndentWorkList_Issue_IssueIndent_SubItemsearchButton = By.id("ctl00_cphpage_gdvIndentIssueItems_ctl02_imgbtnSubItemSearch");
	public WebElement getIndentWorkList_Issue_IssueIndent_SubItemsearchButton() {
		return getElement(IndentWorkList_Issue_IssueIndent_SubItemsearchButton);
		
	}
	private By IndentWorkList_Issue_IssueIndent_SubsituteItemCheckButton = By.id("ChkSelect4");
	public WebElement getIndentWorkList_Issue_IssueIndent_SubsituteItemCheckButton() {
		return getElement(IndentWorkList_Issue_IssueIndent_SubsituteItemCheckButton);
	}
	
	private By IndentWorkList_Issue_IssueIndent_SubsituteItemSelectButton = By.id("btnSelect");
	public WebElement getIndentWorkList_Issue_IssueIndent_SubsituteItemSelectButton() {
		return getElement(IndentWorkList_Issue_IssueIndent_SubsituteItemSelectButton);
	}
	private By IndentWorkList_Issue_IssueIndent_SaveButton = By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getIndentWorkList_Issue_IssueIndent_SaveButton() {
		return getElement(IndentWorkList_Issue_IssueIndent_SaveButton);
	}
	private By IndentWorkList_Issue_IssueIndent_InformationYesButton = By.id("ctl00_cphpage_MessageBoxInfo_ButtonYes");
	public WebElement getIndentWorkList_Issue_IssueIndent_InformationYesButton() {
		return getElement(IndentWorkList_Issue_IssueIndent_InformationYesButton);
	}
	private By IndentWorkList_IssueIndent_CloseButton = By.id("ctl00_cphpage_btnIssueClose");
	public WebElement getIndentWorkList_IssueIndent_CloseButton() {
		return getElement(IndentWorkList_IssueIndent_CloseButton);
		
	}
	private By IndentWorkList_IssueIndent_UnitOfMesurment = By.id("ctl00_cphpage_gdvIndentIssueItems_ctl02_ddlIssueUnits");
	public WebElement getIndentWorkList_IssueIndent_UnitOfMesurment() {
		return getElement(IndentWorkList_IssueIndent_UnitOfMesurment);
		
	}
	private By IndentWorkList_RecieptAcknowladgeRadioButton = By.id("ctl00_cphpage_grdIndentReceipts_ctl02_rdbReceiptsList");
	public WebElement getIndentWorkList_RecieptAcknowladgeRadioButton() {
		return getElement(IndentWorkList_RecieptAcknowladgeRadioButton);
		
	}
	private By IndentWorkList_RecieptAcknow_viewIssue = By.id("ctl00_cphpage_btnRecp_ViewIssue");
	public WebElement getIndentWorkList_RecieptAcknow_viewIssue() {
		return getElement(IndentWorkList_RecieptAcknow_viewIssue);
		
	}
	private By IndentWorkList_RecieptAcknow_RecieptAckButton = By.id("ctl00_cphpage_btnReceiptAckdisplay");
	public WebElement getIndentWorkList_RecieptAcknow_RecieptAckButton() {
		return getElement(IndentWorkList_RecieptAcknow_RecieptAckButton);
		
	}
	private By IndentWorkList_RecieptAcknow_Closebutton = By.id("ctl00_cphpage_btnReceiptClose");
	public WebElement getIndentWorkList_RecieptAcknow_Closebutton() {
		return getElement(IndentWorkList_RecieptAcknow_Closebutton);
		
	}
	
	
	
	
	
	
}
