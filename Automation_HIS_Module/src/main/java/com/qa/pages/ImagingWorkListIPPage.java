package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.qa.util.util;

public class ImagingWorkListIPPage extends BasePage
{
    util utilobj;
    String parent10;
    String parent12;
    private By linkReqNo;
    private By linkReqNocount;
    String linkreq;
    String linkreq1;
    String linkreq2;
    int recordcount;
    private By chkPatientArrive;
    private By btnSave;
    private By chkTestPerformed;
    private By imgReportEntry;
    private By imgReportDispatch;
    private By ButtonOK;
    private By ButtonNo;
    private By txtResultentry;
    private By chkDoctor;
    private By ButtonOKpopup;
    private By chkVerify;
    private By btnUpdate;
    private By txtDispatachedTo;
    private By btnSaveDisplay;
    private By imgInPatient;
    
    public ImagingWorkListIPPage(final WebDriver driver) {
        super(driver);
        utilobj = new util();
        parent10 = "";
        parent12 = "";
        linkReqNo = By.xpath("//*[@id=\"ctl00_cphpage_gdvIPWorklist\"]/tbody/tr[5]/td[1]/a");
        linkReqNocount = By.xpath("//*[@id=\"ctl00_cphpage_gdvIPWorklist\"]/tbody/tr/td[1]/a");
        linkreq = null;
        
        linkreq1 = "//*[@id=\"ctl00_cphpage_gdvIPWorklist\"]//tbody/tr[";
        linkreq2 = "]/td[1]/a";
        recordcount = 0;
        chkPatientArrive = By.id("gdvTOItems_ctl02_chkPatientArrive");
        btnSave = By.id("btnSave");
        chkTestPerformed = By.id("gdvTOItems_ctl02_chkTestPerformed");
        imgReportEntry = By.id("gdvTOItems_ctl02_imgReportEntry");
        imgReportDispatch = By.id("gdvTOItems_ctl02_imgReportDispatch");
        ButtonOK = By.id("MyMessageBoxInfo_ButtonOK");
        ButtonNo = By.id("MyMessageBoxInfo_ButtonNo");
        txtResultentry = By.xpath("/html/body");
        chkDoctor = By.id("gdvSearchResult_ctl02_chkDoctor");
        ButtonOKpopup = By.id("popup_ok");
        chkVerify = By.id("chkVerify");
        btnUpdate = By.id("btnUpdate");
        txtDispatachedTo = By.id("txtDispatachedTo");
        btnSaveDisplay = By.id("btnSaveDisplay");
        imgInPatient = By.id("ctl00_cphpage_imgInPatient");

    }
    String AdmissionNo;
    private By popok = By.id("popup_ok");

	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");

	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("97701"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	
private By imgexpand = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[2]/th[1]/img");
	
	
	private By bedno=By.id("ctl00_cphpage_lstViewUnit_ctrl0_lstViewUnitBeds_ctrl0_imgComDetails");
	
    public WebElement getimgInPatient() {
        return getElement(imgInPatient);
    }
    
    public WebElement getlinkReqNo() {
        return getElement(linkReqNo);
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
    
    public WebElement getlinkReqNodynamic() {
        final int noofrec = countOfRecords();
        final int noofrecorg = noofrec + 1;
        System.out.println(String.valueOf(linkreq1) + noofrecorg + linkreq2);
        return getElement(By.xpath(String.valueOf(linkreq1) + noofrecorg + linkreq2));
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
        return recordcount = driver.findElements(linkReqNocount).size();
    }
    
    public String getadmissionnumber() {
    	String admission =driver.findElement(By.id("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[1]/tbody/tr[1]/td[2]/span")).getText();
    	return admission;
    }
    public WebElement getbednoLink() {
		return getElement(bedno);
	}

	public WebElement getimgexpand() {
		return getElement(imgexpand);

	}
    public void doOpenIPCaseSheet() {

		try

		{
			// ().click();
			utilobj.JSClick(getimgexpand(), driver);
			Thread.sleep(2000);
			//utilobj.JSClick(getbednoLink(), driver);
			Thread.sleep(2000);
			
			driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("IP112100013");
			Thread.sleep(5000);

			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
			Thread.sleep(5000);

			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
			Thread.sleep(5000);

			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
			Thread.sleep(5000);
		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
    public void doIPCasesheetprecripstion(String orderpackname) {

		try

		{
			Thread.sleep(5000);
			utilobj.JSClick(getpopok(), driver);
			
			Thread.sleep(5000);
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);

			utilobj.JSClick(getclickorderpackbutton(), driver);

			Thread.sleep(3000);

			Thread.sleep(3000);

			utilobj.JSClick(getorderpackselection(), driver);

			Thread.sleep(3000);
			utilobj.JSClick(getbtnISaveClose(), driver);
			Thread.sleep(3000);
			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			driver.switchTo().window(parent3);
			Thread.sleep(3000);
			utilobj.JSClick(getpopok(), driver);
			Thread.sleep(3000);

		}
		

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
    public String getAdmissionNo() {
    	AdmissionNo=driver.findElement(By.id("ctl00_cphpage_lblAdmissionNo_IP")).getText();
    	System.out.println(AdmissionNo);
    	return AdmissionNo;
    	
    }
    public void doImagingWorklistIPFlow(final String reqPageTitle,String AdmissNO) {
    	
        try {
        	
        	//driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
        	Thread.sleep(2000);
            getimgInPatient().click();
            Thread.sleep(3000);
            driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl07_txtCriteria")).sendKeys(AdmissNO);
        	Thread.sleep(1000);
        	driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
        	Thread.sleep(1000);
            final String parent4 = driver.getWindowHandle();
            utilobj.Window(driver);
            utilobj.JSClick(getlinkReqNodynamic(), driver);
            Thread.sleep(3000);
            utilobj.ChildWindow(driver);
            System.out.println(driver.getTitle());
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    public void doImagingWorklistPA() {
        try {
            utilobj.JSClick(getchkPatientArrive(), driver);
            
            utilobj.JSClick(getbtnSave(), driver);

           // getbtnSave().click();
            getButtonOK().click();
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    public void doImagingWorklistTestPerf() {
        try {
            utilobj.JSClick(getchkTestPerformed(), driver);
            Thread.sleep(1000);
            getButtonNo().click();
            Thread.sleep(1000);
            utilobj.JSClick(getbtnSave(), driver);
            Thread.sleep(1000);
            getButtonOK().click();
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    public void doImagingWorklistResultEntry(final String resultText) {
        try {
            parent10 = driver.getWindowHandle();
            utilobj.Window(driver);
            utilobj.JSClick(getimgReportEntry(), driver);
            Thread.sleep(3000);
            utilobj.ChildWindow(driver);
            Thread.sleep(3000);
            driver.switchTo().frame("txtEditor_ctl02_ctl00");
            Thread.sleep(3000);
            gettxtResultentry().sendKeys(new CharSequence[] { resultText });
            Thread.sleep(3000);
            driver.switchTo().defaultContent();
            Thread.sleep(3000);
            getchkDoctor().click();
            Thread.sleep(3000);
            getbtnSave().click();
            Thread.sleep(3000);
            getButtonOKpopup().click();
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    public void doImagingWorklistResultverify() {
        try {
            getchkVerify().click();
            getbtnUpdate().click();
            getButtonOKpopup().click();
            driver.close();
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    public void doImagingWorklistDispatch(final String dispatchname) {
        try {
            driver.switchTo().window(parent10);
            driver.switchTo().defaultContent();
            getbtnSave().click();
            utilobj.Window(driver);
            utilobj.JSClick(getimgReportDispatch(), driver);
            Thread.sleep(3000);
            utilobj.ChildWindow(driver);
            gettxtDispatachedTo().sendKeys(new CharSequence[] { dispatchname });
            getbtnSaveDisplay().click();
            getButtonOKpopup().click();
            driver.close();
            driver.switchTo().window(parent10);
            utilobj.JSClick(getbtnSave(), driver);
            driver.close();
            driver.switchTo().defaultContent();
            
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
}