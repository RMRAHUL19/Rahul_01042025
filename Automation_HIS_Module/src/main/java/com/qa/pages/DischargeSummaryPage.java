package com.qa.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class DischargeSummaryPage extends BasePage {
	
	util utilobj = new util();

	public DischargeSummaryPage(WebDriver driver) {
		super(driver);
	}

	private By AdmissionSearchBtn = By.id("ctl00_cphpage_imgAdmNo");
	
	
    private By AdmissionSearchNo = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	
	private By SearchBtn = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	
	private By ChkBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	
	private By ClinicalSummary=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/a[2]/img");

	private By ClinicalSummaryEditBtn=By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]");
	
	private By SaveBtn=By.id("ctl00_cphpage_btnSave");
	
	private By OkPopup=By.id("popup_ok");
	
	private By DoneBtn=By.id("btnDone");
	private By printBtn=By.id("ctl00_cphpage_btnPrint");
	private By templateScreenBtnDDL=By.id("dpScreenSelect");
	private By templateScreenOK=By.id("btnSelectOK");
	
	
	public WebElement gettemplateScreenBtnDDl() {
		return getElement(templateScreenBtnDDL);
	}
	public WebElement getAdmissionSearchBtn() {
		return getElement(AdmissionSearchBtn);
	}
	public WebElement getprintBtn() {
		return getElement(printBtn);
	}
	
	public WebElement getAdmissionSearchNo() {
		return getElement(AdmissionSearchNo);
	}
	public WebElement getSearchBtn() {
		return getElement(SearchBtn);
	}
	
	public WebElement getChkBox() {
		return getElement(ChkBox);
	}
	
	public WebElement getSelectBtn() {
		return getElement(SelectBtn);
	}
	

	public WebElement getClinicalSummary() {
		return getElement(ClinicalSummary);
	}
	
	public WebElement getClinicalSummaryEditBtn() {
		return getElement(ClinicalSummaryEditBtn);
	}
	
	public WebElement getDoneBtn() {
		return getElement(DoneBtn);
	}
	
	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}
	
	public WebElement getOkPopup() {
		return getElement(OkPopup);
	}
	public WebElement gettemplateScreenOK() {
		return getElement(templateScreenOK);
	}
	
	
	public void doDischargeSummaryPage(String AdmissionNo ) {

		try {
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			utilobj.ActionClick(getAdmissionSearchBtn(), driver);
			
            Thread.sleep(2000);
			
			getAdmissionSearchNo().click();

			getAdmissionSearchNo().sendKeys(AdmissionNo);
			getSearchBtn().click();
			
			getChkBox().click();
			getSelectBtn().click();
			
			Thread.sleep(3000);
			
			getSaveBtn().click();
			Thread.sleep(3000);
			getOkPopup().click();
			Thread.sleep(1000);
			getprintBtn().click();
			Thread.sleep(1000);
			utilobj.SwitchToChildWindow(driver, "CaseSummaryView");
			Thread.sleep(1000);
			utilobj.selectDropdown(gettemplateScreenBtnDDl(), driver, "Discharge Summary - MCI");
			Thread.sleep(1000);
			gettemplateScreenOK().click();
			Thread.sleep(1000);
			driver.close();
			Thread.sleep(1000);
			utilobj.SwitchToChildWindow(driver, "CaseSummaryDisplay");
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
			
		/*	String parent=driver.getWindowHandle();

			Set<String>handle=driver.getWindowHandles();
			

			// Now iterate using Iterator
			Iterator<String> It= handle.iterator();

			System.out.println(handle.size());
			String parendid=It.next();
			String childid=It.next();
			
			getClinicalSummary().click();
			
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());
			getClinicalSummaryEditBtn().click();
            driver.findElement(By.id("txtEditor_ctl02_ctl00")).sendKeys("Test test");
			
		
			
			
			Thread.sleep(2000);

			getDoneBtn().click();
			
			
			driver.switchTo().window(parendid);
			
			
			*/
			
			
			
			
			
		  /*  String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getClinicalSummary().click();
			
			
		    utilobj.ChildWindow2(driver);

			System.out.println(driver.getTitle());

			
			//utilobj.JSClick(getClinicalSummaryEditBtn(), driver);
			//driver.findElement(By.id("txtEditor_ctl02_ctl00")).sendKeys("Test test");
			
		
			
			
			//Thread.sleep(2000);

			getDoneBtn().click();
			
			driver.switchTo().window(parent3);

			
*/
			
			Thread.sleep(2000);
			//getSaveBtn().click();
			
	    	//getOkPopup().click();
			
			

		}

		catch (Exception ex) {
			System.err.println(ex);
		}


}

	}
