package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class IPCaseSheetPrescriptionPage extends BasePage {

	public IPCaseSheetPrescriptionPage(WebDriver driver) {
		super(driver);

	}

	util utilobj = new util();

	private By imgexpand = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[11]/th[1]/img");
	
	//private By imgadmissionno = By.xpath("//span[contains(@id,\"lblUHID\")][text()='DL01.0005337472']//parent::td//preceding-sibling::td[4]/input");
	private By bedno=By.id("ctl00_cphpage_lstViewUnit_ctrl2_lstViewUnitBeds_ctrl0_imgComDetails");
	

	
	private By popok = By.id("popup_ok");

	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");

	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("97701"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	private By btnclear=By.id("btnClear");
	private By btnclose=By.id("btnIClose");
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getchange_facility_location_linkLink() {
		return getElement(change_facility_location_link);
			}
	
	public WebElement getbtn_close_Link() {
		return getElement(btnclose);
	}
	public WebElement getbtn_clear_Link() {
		return getElement(btnclear);
	}
	public WebElement getbednoLink() {
		return getElement(bedno);
	}

	public WebElement getimgexpand() {
		return getElement(imgexpand);

	}

//	public WebElement getimgadmissionno() {
//		return getElement(imgadmissionno);
//
//	}

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

	public String verifyDoctorWorklistPageTitle() {

		return driver.getTitle();

	}

	public void doOpenIPCaseSheet() {

		try

		{
			// ().click();
			utilobj.JSClick(getimgexpand(), driver);
			//utilobj.JSView(getimgadmissionno(), driver);
			//utilobj.JSClick(getbednoLink(), driver);

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
	public void DoOpenCaseSheetforlaboratory() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("IP021900023");
		Thread.sleep(5000);

		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(getlableprecripstionlink()));

	}

	public void doIPCasesheetprecripstion(String orderpackname) throws InterruptedException {

		
			Thread.sleep(5000);

			//getpopok().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			// utilobj.ChildWindowforPrescription(driver);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			// driver.switchTo().window("ClientSide_Prescriptions");
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);

			utilobj.JSClick(getclickorderpackbutton(), driver);

			// gettxtOrdPackSearch().sendKeys(orderpackname);
			// getclickorderpackbutton().click();

			Thread.sleep(3000);

			utilobj.JSClick(getorderpackselection(), driver);

			//Thread.sleep(5000);
			
			//utilobj.JSClick(getbtn_clear_Link(), driver);
			//Thread.sleep(5000);
			//utilobj.JSClick(getbtn_close_Link(), driver);
			Thread.sleep(5000);
//			getpopok().click();
//			Thread.sleep(5000);
//			getpopok().click();

			utilobj.JSClick(getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();

			driver.switchTo().window(parent3);

			//driver.switchTo().defaultContent();

		//	getpopok().click();
//			Thread.sleep(1000);
//			getchange_facility_location_linkLink().click();
		
	}
	public void doChangeHospitalLocation() throws InterruptedException {
		Thread.sleep(1000);
	getchange_facility_location_linkLink().click();
	}
}
