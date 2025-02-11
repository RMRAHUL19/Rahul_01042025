package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class OPCaseSheetPage extends BasePage {

	public OPCaseSheetPage(WebDriver driver) {
		super(driver);

	}

	util utilobj = new util();
	boolean presenceokbutton;
	String checkinNumber = null;
	String lblchkin1 = "//span[text()='";
	String lblchkin2 = "']";
	//private By lblBillNo1 = By.linkText(checkinNumber);
	// private By lblBillNo1 = By.xpath(lblchkin1+ checkinNumber +lblchkin2);
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	private By popok = By.id("popup_ok");
	                                                
	private By lableprecripstionlink = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[4]/table[1]/tbody/tr/td[3]/a");
	                                  /* before */
	//private By lableprecripstionlink = By.("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[2]/table[1]/tbody/tr/td[3]/a");
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("97701"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	private By btnclear=By.id("btnClear");
	private By btnclose=By.id("btnIClose");
	
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
		//// span[text()='OPGENE012100026']
	}

	/*
	 * public WebElement getlblBillNo1(String checkinNumber) { return getElement(
	 * By.linkText(checkinNumber)); //// span[text()='OPGENE012100026'] }
	 */

	public String verifyDoctorWorklistPageTitle() {

		return driver.getTitle();

	}
	private By patientcheck_in_ip_txtbox=By.id("ctl00_cphpage_txtIPNO");
	public WebElement getpatientcheck_in_ip_txtboxLink() {
		return getElement(patientcheck_in_ip_txtbox);
	}
	private By patientcheck_in_LiveList_link=By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getpatientcheck_in_LiveList_linkLink() {
		return getElement(patientcheck_in_LiveList_link);
	}
	private By patientcheck_in_Livelist_select_UHID=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	//ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl04_chkUHID
	public WebElement getpationcheck_in_Livelist_select_UHIDradiobuttonLink() {
		return getElement(patientcheck_in_Livelist_select_UHID);
	}
	private By patientcheck_in_Livelist_Selectbutton=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getpatientcheck_in_Livelist_SelectbuttonLink() {
		return getElement(patientcheck_in_Livelist_Selectbutton);
	}
	private By patientcheckin_registration_selectddl=By.id("ctl00_cphpage_ddlSpecialisation");
	public WebElement getpatientcheckin_registration_selectddlLink() {
		return getElement(patientcheckin_registration_selectddl);
	}
	private By patientcheck_in_registration_okbutton=By.id("ctl00_cphpage_btnOK");
	public WebElement getpatientcheck_in_registration_okbuttonLink() {
		return getElement(patientcheck_in_registration_okbutton);
	}
	private By patientcheck_in_registration_savebutton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getpatientcheck_in_registration_savebuttonLink() {
		return getElement(patientcheck_in_registration_savebutton);
	}
	private By popcancelbutton=By.id("popup_cancel");
	public WebElement getpopcencelbuttonLink() {
		return getElement(popcancelbutton);
	}
	public void GoToPatient_check_in(String IPnumber) throws InterruptedException {
		Thread.sleep(2000);
		getpatientcheck_in_ip_txtboxLink().sendKeys(IPnumber);
		Thread.sleep(2000);
		getpatientcheck_in_LiveList_linkLink().click();
		Thread.sleep(2000);
		getpationcheck_in_Livelist_select_UHIDradiobuttonLink().click();
		Thread.sleep(2000);
		getpatientcheck_in_Livelist_SelectbuttonLink().click();
		Thread.sleep(2000);
		Select select=new Select(getpatientcheckin_registration_selectddlLink());
		select.selectByVisibleText("ENT (Otorhinolaryngology)");
		Thread.sleep(2000);
		getpatientcheck_in_registration_okbuttonLink().click();
		//utilobj.JSClick(getpatientcheck_in_registration_okbuttonLink(), driver);
		Thread.sleep(2000);
		getpatientcheck_in_registration_savebuttonLink().click();
		//utilobj.JSClick(getpatientcheck_in_registration_savebuttonLink(), driver);
		Thread.sleep(2000);
		//utilobj.JSClick(getpopokbuttonLink(), driver);

		utilobj.JSClick(getpopcencelbuttonLink(), driver);
		//driver.findElement(By.id("popup_cancel")).click();
		Thread.sleep(2000);
		
		
		
		
	}

	public void doOpenCaseSheet(String checkinNumber) {

		//getpopok().click();
			utilobj.JSClick(getcheckin_no_link_Link(), driver);
			//getcheckin_no_link_Link().click();

			// Code for testing purpose Dr Worklist. - Direct Click

			// driver.findElement(By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1")).click();

		
	}

	public void doCasesheetprecripstion(String orderpackname) throws InterruptedException {

		//utilobj.JSClick(getpopok(), driver);
		utilobj.JSClick(getcheckin_no_link_Link(), driver);
		Thread.sleep(2000);
			 presenceokbutton=getpopok().isDisplayed();
			if(presenceokbutton==true) {
			getpopok().click();
			}
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

			
			Thread.sleep(2000);
			 presenceokbutton=getpopok().isDisplayed();
				if(presenceokbutton==true) {
				getpopok().click();
				}
				

		

	}
	public void dotestCaseSheetchiefComplain() throws InterruptedException {
		// TODO Auto-generated method stub
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_txtinsurenceno")).sendKeys("1199900090");
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_imageScreenSearch")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_btnOpenCaseSheet")).click();
		Thread.sleep(2000);
		
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst1")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_Cancle")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
		
		
	}
	public void dotestCaseSheetHistoryofpresentIllness() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst2")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_Close")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
		
	}
	public void dotestCaseSheetpastHistory() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst3")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
//		utilobj.selectDropdown(driver.findElement(By.id("TemplatePreviewControl_ddleducation")), driver, "Primary");
//		Thread.sleep(2000);
		driver.findElement(By.id("btn_Close")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
		
		
	}
	public void dotestCaseSheetgenralexamination() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst5")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_Close")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	public void dotestCaseSheetsystemicExamination() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst6")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_Close")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	public void dotestCaseSheetLocal_specialExamination() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst7")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_Close")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
		
	}
	public void dotestCaseSheetDiagnos() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst9")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btnIClose")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	public void dotestCaseSheetMedicine() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst12")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btnIClose")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	public void dotestCaseSheetInvastigation() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst13")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btnIClose")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	public void dotestCaseSheetHealthInvestigation() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst14")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btnIClose")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	public void dotestCaseSheetOrderPack() throws InterruptedException {
		// TODO Auto-generated method stub
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		driver.findElement(By.id("ctl00_cphpage_trvSectionst15")).click();
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("btnIClose")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
//		 presenceokbutton=getpopok().isDisplayed();
//			if(presenceokbutton==true) {
//			getpopok().click();
//			}
	}
	
}
