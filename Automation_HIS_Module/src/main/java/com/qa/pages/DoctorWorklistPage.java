package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.qa.util.util;

public class DoctorWorklistPage extends BasePage {
	public DoctorWorklistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
	String strCheckinNumber;
boolean checkinformsg;
	String checkinNumber = null;
	String lblchkin1 = "//span[text()='";
	String lblchkin2 = "']";
	//private By lblBillNo1 = By.linkText(checkinNumber);
	// private By lblBillNo1 = By.xpath(lblchkin1+ checkinNumber +lblchkin2);
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	private By popok = By.id("popup_ok");
	                                                
	private By lableprecripstionlink = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[4]/table[1]/tbody/tr/td[3]/a");
	                                  /* before */
	//private By lableprecripstionlink = By.("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[2]/table[1]/tbody/tr/td[3]/a");
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("97701"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	private By btnclear=By.id("btnClear");
	private By btnclose=By.id("btnIClose");
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");

	// Livelist Control

	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	private By hisLiveListControlchkUHID2 = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID");

	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	private By btnOK = By.id("ctl00_cphpage_btnOK");

	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");

	private By btncancel = By.id("popup_cancel");
	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
	private By popupmessage = By.id("popup_message");
	private By DoctorworkListconsultent = By.id("ctl00_cphpage_imgConsultation");
	private By DoctorworkListReferral = By.id("ctl00_cphpage_imgReferral");
	private By DoctorworkListInfo_buttonOK = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	                                                
	private By DoctorworkListInfo_Specialization = By.id("ctl00_cphpage_imgSpecialization");
	private By DoctorworkListInfo_SpecializationDDL = By.id("ctl00_cphpage_ddlSpecialisation");
	private By DoctorworkListCancelcheckIN = By.id("ctl00_cphpage_gdvSpecialization_ctl02_btnCancelCheckin");
	private By DoctorworkListCancelcheckINYesButton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	/* HIS produciton link */
	private By ProdAppLink = By.linkText("Applications");
	private By ProdHISLink = By.linkText("Health Information System");

	
	public WebElement getProdAppLink() {
		
		return getElement(ProdAppLink);
	}

	public WebElement getProdHISLink() {
		
		return getElement(ProdHISLink);
	}
	/* HIS produciton link */
	public WebElement getDoctorworkListInfo_buttonOK() {
		return getElement(DoctorworkListInfo_buttonOK);

	}
	public WebElement getDoctorworkListInfo_Specialization() {
		return getElement(DoctorworkListInfo_Specialization);

	}
	public WebElement getDoctorworkListInfo_SpecializationDDL() {
		return getElement(DoctorworkListInfo_SpecializationDDL);

	}
	public WebElement getDoctorworkListCancelcheckIN() {
		return getElement(DoctorworkListCancelcheckIN);

	}
	public WebElement getDoctorworkListCancelcheckINYesButton() {
		return getElement(DoctorworkListCancelcheckINYesButton);

	}
		
	public WebElement getDoctorworkListReferral() {
		return getElement(DoctorworkListReferral);

	}
	public WebElement getDoctorworkListconsultent() {
		return getElement(DoctorworkListconsultent);

	}
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public WebElement getbtn_close_Link() {
		return getElement(btnclose);
	}
	public WebElement getbtn_clear_Link() {
		return getElement(btnclear);
	}
	public WebElement getcheckin_no_link_Link() {
		return getElement(checkin_no_link);
	}

	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}

	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}

	public WebElement getpopok() {
		return getElement(popok);

	}

	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}

	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}

	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}

	public WebElement getlblBillNo1(String checkinNumber) {
		return getElement(By.xpath(lblchkin1 + checkinNumber + lblchkin2));
		
	}

	

	public String verifyDoctorWorklistPageTitle() {

		return driver.getTitle();

	}
	public WebElement getTxtIPNO() {
		return getElement(txtIPNO);
	}
	public WebElement getLnkbtnIPNo() {
		return getElement(lnkbtnIPNo);
	}

	public WebElement getHisLiveListControlchkUHID() {
		return getElement(hisLiveListControlchkUHID);
	}

	public WebElement getHisLiveListControlbtnSelect() {
		return getElement(hisLiveListControlbtnSelect);
	}

	public WebElement getBtnOK() {
		return getElement(btnOK);
	}

	public WebElement getBtnSaveDisplay() {
		return getElement(btnSaveDisplay);
	}

	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	public WebElement getDdlSpecialisation() {
		return getElement(ddlSpecialisation);
	}
	
	public void doPatientCheckIN(String IPNumber, String SpecialisationName) throws InterruptedException {

		

			getTxtIPNO().sendKeys(IPNumber);
			getLnkbtnIPNo().click();
			 Thread.sleep(2000);
			getHisLiveListControlchkUHID().click();
			getHisLiveListControlbtnSelect().click();
			Thread.sleep(3000);
			getBtnSaveDisplay().isEnabled();
			Thread.sleep(3000);
			utilobj.selectDropdown(getDdlSpecialisation(), driver, SpecialisationName);
			Thread.sleep(3000);
			

			utilobj.ActionClick(getBtnOK(), driver);

			
			Thread.sleep(5000);

		

			 getBtnSaveDisplay().click();
			Thread.sleep(2000);


		}

		

	
	public String getPatientCheckinNumber() throws InterruptedException {

		System.out.println(getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));

		 strCheckinNumber = utilobj.GetCheckinNumberText(getPopupmessage(), driver);

		getBtncancel().click();
		
	    //getpopokbuttonLink().click();
	   return strCheckinNumber;
	}
	public void dotestcaseforDoctorWorkList(String checkinNumber) throws InterruptedException {

		

			getcheckin_no_link_Link().click();
			Thread.sleep(2000);
			//getpopok().click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_btnBack")).click(); 
			Thread.sleep(2000); 
driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys(checkinNumber);
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_imgCheckinno")).click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_btnCClose")).click();
Thread.sleep(2000);
getDoctorworkListCancelcheckIN().click();
Thread.sleep(2000);
getDoctorworkListCancelcheckINYesButton().click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_txtReason")).sendKeys("test reason");
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_btnOK")).click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();

			
		}

		

	

	public void doCasesheetprecripstion(String orderpackname) throws InterruptedException {

		if(getpopok().isDisplayed()==true) {
			getpopok().click();
		}
			Thread.sleep(2000);
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);
			Thread.sleep(2000);

			utilobj.JSClick(getclickorderpackbutton(), driver);
			Thread.sleep(2000);

			

			Thread.sleep(5000);

			utilobj.JSClick(getorderpackselection(), driver);

			Thread.sleep(5000);
		
			utilobj.JSClick(getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);

			driver.switchTo().defaultContent();

			getpopok().click();

		

	}

}
