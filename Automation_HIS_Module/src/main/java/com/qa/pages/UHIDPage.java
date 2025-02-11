package com.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class UHIDPage extends BasePage {
	

	util utilobj = new util();
	

	public UHIDPage(WebDriver driver) {
		super(driver);
	}

	private By Title = By.id("ctl00_cphpage_ddlTitle");
	private By FirstName = By.id("ctl00_cphpage_txtFirstName");
	private By LastName = By.id("ctl00_cphpage_txtLastName");
	private By MarriageStatus = By.xpath("//*[@id='ctl00_cphpage_ddlMarriage']");
	private By Age = By.id("ctl00_cphpage_txtAge");
	private By PresentAddres = By.id("ctl00_cphpage_txtPresentAddress1");
	private By Savebutton = By.id("ctl00_cphpage_btnSaveDisplay");
	private By btnYes = By.id("ctl00_cphpage_btnYes1");
	private By InformationPopUp = By.id("ctl00_cphpage_btnYes");
	private By UHID_creation_printButton = By.id("ctl00_cphpage_btnPrint");
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtUhid");
	private By UHID_creation_Uhid_succes = By.id("ctl00_cphpage_btnOK11");
	private By UHID_creation_Uhid_OPDNumber = By.id("ctl00_cphpage_lnkbtnCheckIn");
	private By patientCheckInNumberUHIDTXTBOX=By.id("ctl00_cphpage_txtuhid");
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	private By patientCheckInNumberinfoMsgboxcancelbutton=By.id("popup_cancel");
	private By patientCheckInNumberRegistration=By.id("ctl00_cphpage_lnkRegistration");
	private By UHID_creation_clearButton=By.id("ctl00_cphpage_btnClear");
	private By UHID_creation_IMGsearchUhid=By.id("ctl00_cphpage_imgSearchUhid");
	private By UHID_creation_UHIDsearchtxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By UHID_creation_UHIDButtonsearch=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	private By UHID_creation_UHIDRadiobuttonselect=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By UHID_creation_UHIDsearchselect=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	private By UHID_creation_sameaddrescheckbox=By.id("ctl00_cphpage_chkSamePermanent");
	private By UHID_creation_UpdateButton=By.id("ctl00_cphpage_btnUpdate");
	private By UHID_creation_InsouranceNOtxtbox=By.id("ctl00_cphpage_txtInsuranceNo");
	private By UHID_creation_LivelistLink=By.id("ctl00_cphpage_lnkbtnIPNo");
	private By UHID_creation_LivelistradioButton=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	private By UHID_creation_LivelistSelect=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	private By UHID_creation_Uhid_succesUpdate = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getUHID_creation_Uhid_succesUpdate() {
		return getElement(UHID_creation_Uhid_succesUpdate);
	}
	
	public WebElement getUHID_creation_LivelistSelect() {
		return getElement(UHID_creation_LivelistSelect);
	}
	
	public WebElement getUHID_creation_LivelistradioButton() {
		return getElement(UHID_creation_LivelistradioButton);
	}
	public WebElement getUHID_creation_LivelistLink() {
		return getElement(UHID_creation_LivelistLink);
	}
	
	public WebElement getUHID_creation_UpdateButton() {
		return getElement(UHID_creation_UpdateButton);
	}
	public WebElement getUHID_creation_InsouranceNOtxtbox() {
		return getElement(UHID_creation_InsouranceNOtxtbox);
	}
	public WebElement getUHID_creation_sameaddrescheckbox() {
		return getElement(UHID_creation_sameaddrescheckbox);
	}
	public WebElement getUHID_creation_UHIDRadiobuttonselect() {
		return getElement(UHID_creation_UHIDRadiobuttonselect);
	}
	public WebElement getUHID_creation_UHIDsearchselect() {
		return getElement(UHID_creation_UHIDsearchselect);
	}
	public WebElement getUHID_creation_UHIDButtonsearch() {
		return getElement(UHID_creation_UHIDButtonsearch);
	}
	public WebElement getUHID_creation_IMGsearchUhid() {
		return getElement(UHID_creation_IMGsearchUhid);
	}
	public WebElement getUHID_creation_UHIDsearchtxtbox() {
		return getElement(UHID_creation_UHIDsearchtxtbox);
	}
	public WebElement getUHID_creation_clearButton() {
		return getElement(UHID_creation_clearButton);
	}
	public WebElement getpatientCheckInNumberinfoMsgboxcancelbutton() {
		return getElement(patientCheckInNumberinfoMsgboxcancelbutton);
	}
	public WebElement getpatientCheckInNumberRegistration() {
		return getElement(patientCheckInNumberRegistration);
	}
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	public WebElement getpatientCheckInNumberUHIDTXTBOX() {
		return getElement(patientCheckInNumberUHIDTXTBOX);
	}
	public WebElement getUHID_creation_Uhid_OPDNumber() {
		return getElement(UHID_creation_Uhid_OPDNumber);
	}
	public WebElement getUHID_creation_Uhid_succes() {
		return getElement(UHID_creation_Uhid_succes);
	}

	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	public WebElement getUHID_creation_printButton() {
		return getElement(UHID_creation_printButton);
	}
	public WebElement getTitle() {
		return getElement(Title);
	}

	public WebElement getFirstName() {
		return getElement(FirstName);
	}

	public WebElement getLastName() {
		return getElement(LastName);
	}

	public WebElement getMarriageStatus() {
		return getElement(MarriageStatus);
	}

	public WebElement getAge() {
		return getElement(Age);
	}

	public WebElement getPresentAddres() {
		return getElement(PresentAddres);
	}

	public WebElement getSavebutton() {
		return getElement(Savebutton);
	}
	
	public WebElement getbtnYes() {
		return getElement(btnYes);
	}
	
	public WebElement getInformationPopUp() {
		return getElement(InformationPopUp);
	}
	
	

	public String verifyUHIDPageTitle() {

		return driver.getTitle();

	}
	
	

	public void doUHIDCreationPage(String Title, String FirstName, String LastName, String MaritalStatus, String Age,
			String Address) {

		try {
			
			utilobj.selectDropdown(getTitle(), driver, "Mr.");
			Thread.sleep(2000);
			getFirstName().sendKeys(FirstName);
			Thread.sleep(2000);
			getLastName().sendKeys(LastName);
			
			Thread.sleep(2000);
			
			System.out.println(MaritalStatus + getMarriageStatus());
			Thread.sleep(2000);
			utilobj.selectDropdown(getMarriageStatus(), driver, "Single");
			Thread.sleep(2000);
			getAge().sendKeys(Age);
			Thread.sleep(2000);
			getPresentAddres().sendKeys(Address);
			Thread.sleep(2000);
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra");
			Thread.sleep(20000);
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai");
			Thread.sleep(20000);
			driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
			Thread.sleep(2000);
			getSavebutton().click();
			Thread.sleep(2000);
			getbtnYes().click();
			Thread.sleep(2000);
			getInformationPopUp().click();
			Thread.sleep(2000);
			utilobj.JSClick(getUHID_creation_Uhid_succes(), driver);
			//getUHID_creation_Uhid_succes().click();
			Thread.sleep(2000);
			System.out.println(getUHID_creation_Uhid_txtbox().getText());	
			Thread.sleep(2000);
			String typevalue=getUHID_creation_Uhid_txtbox().getAttribute("value");
			Thread.sleep(2000);
			System.out.println(typevalue);
			Thread.sleep(2000);
			Thread.sleep(2000);//functionility of print button
			Thread.sleep(2000);
			getUHID_creation_printButton().click();
			Thread.sleep(2000);
			utilobj.SwitchToChildWindow(driver, "RegistrationPrintReports.aspx");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(2000);
			utilobj.SwitchToChildWindow(driver, "Registration");
			Thread.sleep(4000);//opd link functionality
			getUHID_creation_Uhid_OPDNumber().click();
			Thread.sleep(4000);
			getpatientCheckInNumberSeviceOkButton().click();
			Thread.sleep(4000);
			getpatientCheckInNumberSaveButton().click();
			Thread.sleep(4000);
			getpatientCheckInNumberinfoMsgboxcancelbutton().click();
			Thread.sleep(4000);
			getpatientCheckInNumberRegistration().click();
			Thread.sleep(4000);//clear button functionelity
			utilobj.selectDropdown(getTitle(), driver, Title);
			Thread.sleep(2000);
			getFirstName().sendKeys(FirstName);
			Thread.sleep(2000);
			getLastName().sendKeys(LastName);
			
			Thread.sleep(2000);
			
			System.out.println(MaritalStatus + getMarriageStatus());
			utilobj.selectDropdown(getMarriageStatus(), driver, MaritalStatus);
			Thread.sleep(2000);
			getAge().sendKeys(Age);
			Thread.sleep(2000);
			getPresentAddres().sendKeys(Address);
			
			getUHID_creation_clearButton().click();
			Thread.sleep(2000);
			//DUMM.0000013656
			getUHID_creation_IMGsearchUhid().click();//uhid search
			Thread.sleep(2000);
			getUHID_creation_UHIDsearchtxtbox().sendKeys(typevalue);
			Thread.sleep(2000);
			getUHID_creation_UHIDButtonsearch().click();
			Thread.sleep(2000);
			getUHID_creation_UHIDRadiobuttonselect().click();
			Thread.sleep(2000);
			getUHID_creation_UHIDsearchselect().click();
			Thread.sleep(2000);
			getUHID_creation_sameaddrescheckbox().click();//update button
			Thread.sleep(2000);
			getUHID_creation_UpdateButton().click();
			Thread.sleep(2000);
			getbtnYes().click();
			
			
			Thread.sleep(2000);
			getUHID_creation_Uhid_succesUpdate().click();
			Thread.sleep(3000);
			getUHID_creation_InsouranceNOtxtbox().sendKeys("1199900090");//search by ipno
			Thread.sleep(2000);
			getUHID_creation_LivelistLink().click();
			Thread.sleep(2000);
			getUHID_creation_LivelistradioButton().click();
			Thread.sleep(2000);
			getUHID_creation_LivelistSelect().click();
			driver.close();
		}

		catch (Exception ex) {
			System.err.println(ex);
		}
		}

	
	
}
