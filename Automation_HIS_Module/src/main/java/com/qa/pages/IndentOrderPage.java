package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class IndentOrderPage extends BasePage {

	util utilobj = new util();

	public IndentOrderPage(WebDriver driver) {
		super(driver);
	}

	String IndentNo="";
	
	private By imgSearch = By.id("ctl00_cphpage_imgSearch");

	private By txtCriteria = By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");

	private By btnSearch = By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_btnSearch");

	private By rdbTemp = By.xpath("//*[text()='Store D']//preceding-sibling::td/input");

	private By btnSelect = By.id("ctl00_cphpage_HISDataSearchCtrl_btnSelect");

	private By imgbtnSearchItem1 = By.id("ctl00_cphpage_grdIndentIssues_ctl02_imgbtnSearchItem");

	private By txtName = By.id("txtName");

	private By ChkSelect0 = By.id("ChkSelect0");

	private By itembtnSearch = By.id("btnSearch");
	private By btnSelectItem = By.xpath("//input[@id='btnSelect']");
	private By ReqQty = By.id("ctl00_cphpage_grdIndentIssues_ctl02_ReqQty");

	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");

	private By btnLast5Indent = By.id("btnSearch");

	private By popupok = By.id("popup_ok");
	
	
	private By txtIndentNo = By.id("ctl00_cphpage_txtIndentNo"); 

	public WebElement gettxtIndentNo() {
		return getElement(txtIndentNo);

	}

	public WebElement getpopupok() {
		return getElement(popupok);

	}

	public WebElement getbtnLast5Indent() {
		return getElement(btnLast5Indent);

	}

	public WebElement getbtnSaveDisplay() {
		return getElement(btnSaveDisplay);

	}

	public WebElement getReqQty() {
		return getElement(ReqQty);

	}

	public WebElement getChkSelect0() {
		return getElement(ChkSelect0);

	}

	public WebElement getbtnSelectItem() {
		return getElement(btnSelectItem);

	}

	public WebElement getimgbtnSearchItem1() {
		return getElement(imgbtnSearchItem1);

	}

	public WebElement gettxtName() {
		return getElement(txtName);

	}

	public WebElement getitembtnSearch() {
		return getElement(itembtnSearch);

	}

	public WebElement getimgSearch() {
		return getElement(imgSearch);

	}

	public WebElement gettxtCriteria() {
		return getElement(txtCriteria);

	}

	public WebElement getbtnSearch() {
		return getElement(btnSearch);

	}

	public WebElement getrdbTemp() {
		return getElement(rdbTemp);

	}

	public WebElement getbtnSelect() {
		return getElement(btnSelect);

	}

	public void doIndentOrder() {

		try {

			getimgSearch().click();
			gettxtCriteria().sendKeys("Store D");
			getbtnSearch().click();
			Thread.sleep(2000);
			getrdbTemp().click();
			getbtnSelect().click();
			Thread.sleep(2000);

			String currenthandle = driver.getWindowHandle();

			utilobj.Window(driver);

			utilobj.JSClick(getimgbtnSearchItem1(), driver);

			utilobj.ChildWindow(driver);

			gettxtName().sendKeys("Paracetamol Tab");
			getitembtnSearch().click();
			Thread.sleep(2000);

			getChkSelect0().click();
			Thread.sleep(2000);

			getbtnSelectItem().click();

			driver.switchTo().window(currenthandle);

			Thread.sleep(6000);

			getReqQty().sendKeys("1");

			getbtnSaveDisplay().click();

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}

	public void doIndentOrderLast5Indent() {

		try {

			getimgSearch().click();
			gettxtCriteria().sendKeys("Store D");
			getbtnSearch().click();
			Thread.sleep(2000);
			getrdbTemp().click();
			getbtnSelect().click();
			Thread.sleep(2000);

			getbtnLast5Indent().click();

			getChkSelect0().click();
			Thread.sleep(2000);
			getbtnSelectItem().click();

			Thread.sleep(2000);
			getReqQty().clear();

			getReqQty().sendKeys("1");

			getbtnSaveDisplay().click();
			Thread.sleep(2000);

			getpopupok().click();

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
	
	public String getIndentNumber() {

		try {
		 IndentNo =	gettxtIndentNo().getAttribute("value");
		 System.out.println(IndentNo);
			
		}

		catch (Exception ex) {
			System.err.println(ex);
		}
		return IndentNo;

	}


	
	
	
}
