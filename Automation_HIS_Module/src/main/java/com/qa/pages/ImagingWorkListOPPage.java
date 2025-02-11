package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class ImagingWorkListOPPage extends BasePage {
	util utilobj = new util();

	public ImagingWorkListOPPage(WebDriver driver) {

		super(driver);

	}
	String Uhid;

	//// *[@id="ctl00_cphpage_gdvOPWorklist"]/tbody/tr/td[3][text()='25-Jan-2021
	//// 01:37:46 PM']
	//// *[@id="ctl00_cphpage_gdvOPWorklist"]/tbody/tr[5]/td[1]/a
	String parent6 = "";
	String parent8 = "";
	private By lableprecripstionlink = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[4]/table[1]/tbody/tr/td[3]/a");
    /* before */
//private By lableprecripstionlink = By.("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[2]/table[1]/tbody/tr/td[3]/a");
private By txtOrdPackSearch = By.id("txtOrdPackSearch");
private By orderpack = By.id("97701");

private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

private By orderpackselection = By.id("97701"); //

private By btnISaveClose = By.id("btnISaveClose"); //
	private By MyMessageBoxInfo_ButtonOK = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By linkReqNo = By.xpath("//*[@id=\"ctl00_cphpage_gdvOPWorklist\"]/tbody/tr[5]/td[1]/a");
	private By linkReqNocount = By.xpath("//*[@id=\"ctl00_cphpage_gdvOPWorklist\"]/tbody/tr/td[1]/a");

	String linkreq = null;
	String linkreq1 = "//*[@id=\\\"ctl00_cphpage_gdvIPWorklist\\\"]//tbody/tr[";
	String linkreq2 = "]/td[1]/a";
	int recordcount = 0;

	private By chkPatientArrive = By.id("gdvTOItems_ctl02_chkPatientArrive");
	private By btnSave = By.id("btnSave"); // btnUpdate
	private By chkTestPerformed = By.id("gdvTOItems_ctl02_chkTestPerformed");
	private By imgReportEntry = By.id("gdvTOItems_ctl02_imgReportEntry");
	private By imgReportDispatch = By.id("gdvTOItems_ctl02_imgReportDispatch");
//MyMessageBoxInfo_ButtonNo
	private By ButtonOK = By.id("MyMessageBoxInfo_ButtonOK");
	private By ButtonNo = By.id("MyMessageBoxInfo_ButtonNo");
	// gdvSearchResult_ctl02_chkDoctor
	private By txtResultentry = By.xpath("/html/body");
	private By chkDoctor = By.id("gdvSearchResult_ctl02_chkDoctor");
	private By ButtonOKpopup = By.id("popup_ok");

	private By chkVerify = By.id("chkVerify");
	private By btnUpdate = By.id("btnUpdate"); // txtDispatachedTo
	private By txtDispatachedTo = By.id("txtDispatachedTo"); // btnSaveDisplay
	private By btnSaveDisplay = By.id("btnSaveDisplay"); //
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	private By popok = By.id("popup_ok");
	public WebElement getpopok() {
		return getElement(popok);

	}
	public WebElement getcheckin_no_link_Link() {
		return getElement(checkin_no_link);
	}

	
	/*
	 * public WebElement getlinkReqNocount() { return getElement(linkReqNocount); }
	 */
	public WebElement getMyMessageBoxInfo_ButtonOKlink() {
		return getElement(MyMessageBoxInfo_ButtonOK);
	}
	public WebElement getlinkReqNo() {
		return getElement(linkReqNo);
	}

	public WebElement getlinkReqNodynamic() {
		int noofrec = countOfRecords();
		int noofrecorg = noofrec + 1;
		return getElement(By.xpath(linkreq1 + noofrecorg + linkreq2));
	}

	public WebElement getButtonOKpopup() {
		return getElement(ButtonOKpopup);
	}

	public WebElement getchkPatientArrive() {
		return getElement(chkPatientArrive);
	}

	public WebElement getchkTestPerformed() {
		return getElement(chkTestPerformed);
	}

	public WebElement getimgReportEntry() {
		return getElement(imgReportEntry);
	}

	public WebElement getimgReportDispatch() {
		return getElement(imgReportDispatch);
	}

	public WebElement getbtnSave() {
		return getElement(btnSave);
	}

	public WebElement getButtonOK() {
		return getElement(ButtonOK);
	}

	public WebElement getButtonNo() {
		return getElement(ButtonNo);
	}

	public WebElement gettxtResultentry() {
		return getElement(txtResultentry);
	}

	public WebElement getchkDoctor() {
		return getElement(chkDoctor);
	}

	public WebElement getchkVerify() {
		return getElement(chkVerify);
	}

	public WebElement getbtnUpdate() {
		return getElement(btnUpdate);
	}

	public WebElement gettxtDispatachedTo() {
		return getElement(txtDispatachedTo);
	}

	public WebElement getbtnSaveDisplay() {
		return getElement(btnSaveDisplay);
	}

	public int countOfRecords() {

		recordcount = driver.findElements(linkReqNocount).size();

		return recordcount;

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
	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}

	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");

	// Livelist Control

	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl08_chkUHID");
	private By hisLiveListControlchkUHID2 = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID");

	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	private By btncancel = By.id("popup_cancel");

	private By popupmessage = By.id("popup_message");

	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
    private By popokbutton=By.id("popup_ok");
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
	private By btnOK = By.id("ctl00_cphpage_btnOK");
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
	
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public void doPatientCheckIN(String IPNumber, String SpecialisationName) throws InterruptedException {

		

		getTxtIPNO().sendKeys(IPNumber);
		Thread.sleep(2000);
		getLnkbtnIPNo().click();
		Thread.sleep(2000);
		getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		getHisLiveListControlbtnSelect().click();
		Thread.sleep(3000);
		getBtnSaveDisplay().isEnabled();
		Thread.sleep(2000);
		utilobj.selectDropdown(getDdlSpecialisation(), driver, SpecialisationName);

		
		Thread.sleep(2000);
		utilobj.ActionClick(getBtnOK(), driver);

	
		Thread.sleep(2000);

		

		 getBtnSaveDisplay().click();
		Thread.sleep(2000);
	

	

}

public String getPatientCheckinNumber() throws InterruptedException {

	System.out.println(getPopupmessage().getText());
	System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));

	String strCheckinNumber = utilobj.GetCheckinNumberText(getPopupmessage(), driver);

	getBtncancel().click();
	System.out.println(strCheckinNumber);
  

	
	return strCheckinNumber;
}

	public void doOpenCaseSheet(String checkinNumber) throws InterruptedException {

		 
			Thread.sleep(2000);
			utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtCheckinno")), driver,checkinNumber);
			Thread.sleep(2000);
//driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys(checkinNumber);
			utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
			Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
Thread.sleep(2000);


		}

		
	

	public String doCasesheetprecripstion(String orderpackname) throws InterruptedException {

		utilobj.JSClick(getpopok(), driver);
			//getpopok().click();
			Thread.sleep(2000);
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			// utilobj.ChildWindowforPrescription(driver);
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			// driver.switchTo().window("ClientSide_Prescriptions");
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);
			Thread.sleep(2000);

			utilobj.JSClick(getclickorderpackbutton(), driver);
			Thread.sleep(2000);

			// gettxtOrdPackSearch().sendKeys(orderpackname);
			// getclickorderpackbutton().click();

			Thread.sleep(5000);

			utilobj.JSClick(getorderpackselection(), driver);

			Thread.sleep(5000);
//			utilobj.JSClick(getbtn_clear_Link(), driver);
//			Thread.sleep(5000);
//			utilobj.JSClick(getbtn_close_Link(), driver);
			
			utilobj.JSClick(getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);

			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			getpopok().click();
			Uhid=driver.findElement(By.id("ctl00_cphpage_lblUHID_OP")).getText();
			System.out.println(Uhid);
			return Uhid;
		}

		
		
	
	public void doImagingWorklistOPFlow(String reqPageTitle,String Uhid) throws InterruptedException {

		
			driver.findElement(By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl07_txtCriteria")).sendKeys(Uhid);
			//getMyMessageBoxInfo_ButtonOKlink().click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_OPWorklistSearch_btnOK")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hyp_0")).click();
			Thread.sleep(2000);
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			// getlinkReqNo().click();
			utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a")), driver);
			//utilobj.JSClick(getlinkReqNodynamic(), driver);

			Thread.sleep(3000);

			utilobj.ChildWindow(driver);

			// utilobj.SwitchToChildWindow(driver,reqPageTitle);

			System.out.println(driver.getTitle());

			// getchkPatientArrive().click();

			// utilobj.JSClick(getchkPatientArrive(), driver);

		
	}

	
	public void doImagingWorklistPA() {

		

			utilobj.JSClick(getchkPatientArrive(), driver);
			getbtnSave().click();
			WebDriverWait wait=new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.visibilityOf(getButtonOK()));
			getButtonOK().click();

		

	}

	public void doImagingWorklistTestPerf() throws InterruptedException {

		

			utilobj.JSClick(getchkTestPerformed(), driver);
			getButtonNo().click();
			Thread.sleep(1000);

			getbtnSave().click();
			WebDriverWait wait=new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.visibilityOf(getButtonOK()));
			getButtonOK().click();
		}

		



	public void doImagingWorklistResultEntry(String resultText) throws InterruptedException {

		

			parent6 = driver.getWindowHandle();

			utilobj.Window(driver);
			utilobj.JSClick(getimgReportEntry(), driver);

			Thread.sleep(3000);

			utilobj.ChildWindow(driver);

			driver.switchTo().frame("txtEditor_ctl02_ctl00");

			gettxtResultentry().sendKeys(resultText);
			driver.switchTo().defaultContent();

			getchkDoctor().click();
			getbtnSave().click();
			WebDriverWait wait=new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.visibilityOf(getButtonOKpopup()));
			getButtonOKpopup().click();

		

	}

	public void doImagingWorklistResultverify() {

		

			getchkVerify().click();
			getbtnUpdate().click();
			WebDriverWait wait=new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.visibilityOf(getButtonOKpopup()));
			getButtonOKpopup().click();
			driver.close();

		

	}

	public void doImagingWorklistDispatch(String dispatchname) throws InterruptedException {

		

			driver.switchTo().window(parent6);
			driver.switchTo().defaultContent();
			getbtnSave().click();
			// String parent8 = driver.getWindowHandle();
			utilobj.Window(driver);
			utilobj.JSClick(getimgReportDispatch(), driver);

			Thread.sleep(3000);

			utilobj.ChildWindow(driver);
			gettxtDispatachedTo().sendKeys(dispatchname);

			getbtnSaveDisplay().click();
			getButtonOKpopup().click();
			driver.close();
			driver.switchTo().window(parent6);
			driver.switchTo().defaultContent();

		

	}

}
