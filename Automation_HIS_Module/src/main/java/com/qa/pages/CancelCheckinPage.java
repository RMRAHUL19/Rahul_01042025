package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class CancelCheckinPage extends BasePage {

	util utilobj = new util();

	public CancelCheckinPage(WebDriver driver) {
		super(driver);

	}

	private By ImgUhidSearch = By.id("ctl00_cphpage_ImgUhid");

	private By UhidSearchTextBox = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	                                      

	private By btnSearch = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
	private By btnSelect = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");

	private By rdbUhid = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");

	// private By SelectBtn = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");

	private By chkCancel = By.id("ctl00_cphpage_gdvCancelCheckin_ctl02_chkCancel");
	private By chkCancel1 = By.id("ctl00_cphpage_gdvCancelCheckin_ctl03_chkCancel");
	private By chkCancel2 = By.id("ctl00_cphpage_gdvCancelCheckin_ctl04_chkCancel");
	private By MyMessageBoxSuccusButtonYes =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By btnCancel = By.id("ctl00_cphpage_btnCancel");
	private By btnClear = By.id("ctl00_cphpage_btnClear");
	private By imgcheckInnosearch = By.id("ctl00_cphpage_imgCheckinno");
	private By uhidsearchtxtbox = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By DoctorWorllist_Specialization_cancelcheckInimg = By.id("ctl00_cphpage_gdvSpecialization_ctl02_btnCancelCheckin");
	private By DoctorWorllist_Conseltation_cancelcheckInimg = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table[2]/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[2]/td[13]/input");
	
	private By DoctorWorllist_cancelcheckininformationButtonNO = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonNo");
	private By DoctorWorllist_ConsultationIMG = By.id("ctl00_cphpage_imgConsultation");
	
	public WebElement getDoctorWorllist_cancelcheckininformationButtonNO() {
		return getElement(DoctorWorllist_cancelcheckininformationButtonNO);
	}
	public WebElement getDoctorWorllist_ConsultationIMG() {
		return getElement(DoctorWorllist_ConsultationIMG);
	}
	
	public WebElement getDoctorWorllist_Specialization_cancelcheckInimg() {
		return getElement(DoctorWorllist_Specialization_cancelcheckInimg);
	}
	public WebElement getDoctorWorllist_Conseltation_cancelcheckInimg() {
		return getElement(DoctorWorllist_Conseltation_cancelcheckInimg);
	}
	public WebElement getuhidsearchtxtbox() {
		return getElement(uhidsearchtxtbox);
	}
	public WebElement getbtnClear() {
		return getElement(btnClear);
	}
	public WebElement getMyMessageBoxSuccusButtonYes() {
		return getElement(MyMessageBoxSuccusButtonYes);
	}
	public WebElement getImgUhidSearch() {
		return getElement(ImgUhidSearch);
	}
	public WebElement imgcheckInnosearch() {
		return getElement(imgcheckInnosearch);
	}

	public WebElement getUhidSearchTextBox() {
		return getElement(UhidSearchTextBox);
	}

	public WebElement getbtnSearch() {
		return getElement(btnSearch);
	}

	public WebElement getbtnSelect() {
		return getElement(btnSelect);
	}

	public WebElement getrdbUhid() {
		return getElement(rdbUhid);
	}

	/*
	 * public WebElement getSelectBtnc() { return getElement(SelectBtn); }
	 */

	public WebElement getchkCancel() {
		return getElement(chkCancel);
	}
	public WebElement getchkCancel1() {
		return getElement(chkCancel1);
	}
	public WebElement getchkCancel2() {
		return getElement(chkCancel2);
	}

	public WebElement getbtnCancel() {
		return getElement(btnCancel);
	}

	/*
	 * public String verifyCancelCheckinPageTitle() {
	 * 
	 * return driver.getTitle();
	 * 
	 * }
	 */
	


	public void doCancelCheckin(String UHDNo) throws InterruptedException {

		
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
			Thread.sleep(2000);
			imgcheckInnosearch().click();
			Thread.sleep(2000);
			getuhidsearchtxtbox().sendKeys("OPGENE062100073");
			Thread.sleep(2000);
			getbtnSearch().click();
			Thread.sleep(2000);
			getrdbUhid().click();			
			Thread.sleep(2000);
			getbtnSelect().click();
			Thread.sleep(2000);
			getchkCancel().click();
			Thread.sleep(2000);
			getbtnClear().click();
			Thread.sleep(2000);			
			getImgUhidSearch().click();
			Thread.sleep(2000);
			getUhidSearchTextBox().sendKeys(UHDNo);
			Thread.sleep(2000);
			getbtnSearch().click();
			Thread.sleep(2000);
			getrdbUhid().click();
			Thread.sleep(2000);
			getbtnSelect().click();
			Thread.sleep(2000);
			getchkCancel().click();
			Thread.sleep(2000);
			getbtnCancel().click();
			Thread.sleep(2000);
			getMyMessageBoxSuccusButtonYes().click();
			Thread.sleep(2000);
			getbtnClear().click();
			getImgUhidSearch().click();
			Thread.sleep(2000);
			getUhidSearchTextBox().sendKeys(UHDNo);
			Thread.sleep(2000);
			getbtnSearch().click();
			Thread.sleep(2000);
			getrdbUhid().click();
			Thread.sleep(2000);
			getbtnSelect().click();
			Thread.sleep(2000);
			getchkCancel().click();
			Thread.sleep(2000);
			getchkCancel1().click();
			Thread.sleep(2000);
			getchkCancel2().click();
			Thread.sleep(2000);
//			getbtnCancel().click();
//			Thread.sleep(2000);
//		getMyMessageBoxSuccusButtonYes().click();
			
			

//			Thread.sleep(2000);
//			utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
//			Thread.sleep(2000);
//			utilobj.JSClick(driver.findElement(By.linkText("Doctor Worklist")), driver);
//			Thread.sleep(2000);
//			
//			getDoctorWorllist_Specialization_cancelcheckInimg().click();
//			Thread.sleep(2000);
//			getDoctorWorllist_cancelcheckininformationButtonNO().click();
//			Thread.sleep(2000);
//			getDoctorWorllist_ConsultationIMG().click();
//			Thread.sleep(2000);
//			utilobj.JSClick(getDoctorWorllist_Conseltation_cancelcheckInimg(), driver);
//			Thread.sleep(2000);
//			driver.close();
			
			

		}

		
		
		

	}

