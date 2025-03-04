package com.qa.pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import com.qa.util.util;

@SuppressWarnings("unused")
public class OrderPacksPage extends BasePage {
	
	
	util utilobj = new util();
	boolean InvestigationSearch;
	boolean popupok1 = false;
	boolean popupok2 = false;
	boolean popupok3 = false;
	public OrderPacksPage(WebDriver driver) {
		super(driver);
	}
	
	private By OrderPacks=By.id("ctl00_cphpage_txtOrderPackName");
	
/*Investigations*/
	
    private By Investigations=By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_imgbtnInvestigationsSearch");

    private By TestNameTxtBx=By.id("txtName");

    private By SearchBtnInvestigation=By.id("btnSearch");

    private By WindowCheckBox=By.id("ChkSelect4");

    private By SelectBtnInvestigation=By.id("btnSelect");

	private By TestName=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");

	private By SearchBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	
	private By ChkBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl06_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	
	private By Quantity=By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_txtQty");
	
	private By TickMark=By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_imgBtnAckInvestigations");
	
    //private By UpdateBtn=By.xpath("//*[@id='ctl00_cphpage_btnSave']");
	    
	private By popup=By.id("popup_ok");
	
	/*Medications*/
	
	private By Medications=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlSelectedRecords");
	
	private By DrugSearchBtn=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_imgbtnDrugSearch");
	
	private By WindowDrugChkBx=By.id("ChkSelect0");
	
	private By DrugName=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	
	private By DrugNameSearchBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	
	private By DrugNameChkBx=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl07_rdbTemp");
	
	private By DrugSelectBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	
	private By DoseQty=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtDose");
	
	private By DoseType=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlDose");
	
	private By Frequency=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlFrequency");
	
	private By Duration=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtDuration");
	
	private By Admin_Route=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlAdminRoute");
	
	private By Total_Strength=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtQuantity");
	
	private By Total_Strength_drpdwn=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlQuantityUOM");
	
	private By Remarks=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtMedicationsRemarks");
	
	private By Medication_Tick=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_imgbtnAckMedications");
	
	private By DeleteMedication=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[2]/table/tbody/tr[7]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[1]/a[2]");
	
	/*HealthInterventions*/
	
	private By HealthIntervensions=By.id("__tab_ctl00_cphpage_tabSearch_tabpnlProc");
	
	private By WindowHealthInterventions=By.id("ChkSelect4");
	
	private By Procedures=By.id("ctl00_cphpage_tabSearch_tabpnlProc_imgbtnProceduresSearch");
	
	private By HealthInterventionsTestName=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl06_rdbTemp");
	
	private By HealthTnterventionsQty=By.id("ctl00_cphpage_tabSearch_tabpnlProc_txtProceduresQuantity");
	
	private By HealthInterventions_Tick=By.id("ctl00_cphpage_tabSearch_tabpnlProc_imgbtnAckProcedures");
	
	private By HealthInterventions_Delete=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[3]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[1]/a[2]");
	
	/*Diagnosis*/
	
	private By Diagnosis=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlDiagnosis");
	
	private By Diagnosis_Search=By.id("ctl00_cphpage_tabSearch_tabPnlDiagnosis_txtDiagnosis");
	
	private By Diagnosis_Tick=By.id("ctl00_cphpage_tabSearch_tabPnlDiagnosis_imgSNOWMEDAdd");
	
	private By Covid=By.id("840539006$COVID-19");
	
	//private By Covid_Delete=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[4]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[1]/a");
	
	private By Advice=By.id("ctl00_cphpage_txtAdvice");
	
	private By SaveBtn=By.id("ctl00_cphpage_btnSave");

	
	public WebElement getOrderPacks() {
		return getElement(OrderPacks);
	}
	
	
	public WebElement getpopup() {
		return getElement(popup);
	}
	
	/*Investigations*/
	
	public WebElement getInvestigations() {
		return getElement(Investigations);
	}
	
	public WebElement getTestNameTxtBx() {
		return getElement(TestNameTxtBx);
	}
	
	public WebElement getSearchBtnInvestigation() {
		return getElement(SearchBtnInvestigation);
	}
	
	public WebElement getWindowCheckBox() {
		return getElement(WindowCheckBox);
	}
	
	public WebElement getSelectBtnInvestigation() {
		return getElement(SelectBtnInvestigation);
	}
	
	public WebElement getTestName() {
		return getElement(TestName);
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
	
	public WebElement getQuantity() {
		return getElement(Quantity);
	}
	
	public WebElement getTickMark() {
		return getElement(TickMark);
	}
	
	/*Medications*/
	
	public WebElement getMedications() {
		return getElement(Medications);
	}
	
	public WebElement getDrugSearchBtn() {
		return getElement(DrugSearchBtn);
	}
	
	public WebElement getWindowDrugChkBx() {
		return getElement(WindowDrugChkBx);
	}
	
	
	public WebElement getDrugName() {
		return getElement(DrugName);
	}

	public WebElement getDrugNameSearchBtn() {
		return getElement(DrugNameSearchBtn);
	}
	
	public WebElement getDrugNameChkBx() {
		return getElement(DrugNameChkBx);
	}
	
	public WebElement getDrugSelectBtn() {
		return getElement(DrugSelectBtn);
	}
	
	public WebElement getDoseQty() {
		return getElement(DoseQty);
	}
    
	public WebElement getDoseType() {
		return getElement(DoseType);
	}
  
	public WebElement getFrequency() {
		return getElement(Frequency);
	}
	
	public WebElement getDuration() {
		return getElement(Duration);
	}

	public WebElement getAdmin_Route() {
		return getElement(Admin_Route);
	}
	
	public WebElement getTotal_Strength() {
		return getElement(Total_Strength);
	}

	public WebElement getTotal_Strength_drpdwn() {
		return getElement(Total_Strength_drpdwn);
	}

	public WebElement getRemarks() {
		return getElement(Remarks);
	}
	
	public WebElement getMedication_Tick() {
		return getElement(Medication_Tick);
	}

	public WebElement getDeleteMedication() {
		return getElement(DeleteMedication);
	}

	/*HealthInterventions*/
	
	public WebElement getHealthIntervensions() {
		return getElement(HealthIntervensions);
	}
	
	public WebElement getWindowHealthInterventions() {
		return getElement(WindowHealthInterventions);
	}
	
	public WebElement getProcedures() {
		return getElement(Procedures);
	}
	
	public WebElement getHealthInterventionsTestName() {
		return getElement(HealthInterventionsTestName);
	}
	
	public WebElement getHealthTnterventionsQty() {
		return getElement(HealthTnterventionsQty);
	}

	public WebElement getHealthInterventions_Tick() {
		return getElement(HealthInterventions_Tick);
	}
	
	public WebElement getHealthInterventions_Delete() {
		return getElement(HealthInterventions_Delete);
	}
	
	/*Diagnosis*/
	
	public WebElement getDiagnosis() {
		return getElement(Diagnosis);
	}
	
	public WebElement getDiagnosis_Search() {
		return getElement(Diagnosis_Search);
	}
	
	public WebElement getCovid() {
		return getElement(Covid);
	}
	
	public WebElement getDiagnosis_Tick() {
		return getElement(Diagnosis_Tick);
	}

	public WebElement getAdvice() {
		return getElement(Advice);
	}

	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}


	public void doOrderPacks(String OrderPacks, String TestName, String Quantity, String DrugName, String DoseType, String Frequency,
			String Admin_Route, String TestName1, String Diagnosis_Search) throws InterruptedException, NoSuchElementException 
	{
		
				WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(100));
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				Random F=new Random();
				int Num=F.nextInt(2000);
				
				getOrderPacks().sendKeys(OrderPacks+"_"+Num);
		//		driver.findElement(By.id("ctl00_cphpage_ImgName")).click();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				/*Investigations*/	
				String parent3 = driver.getWindowHandle();

				utilobj.Window(driver);

				getInvestigations().click();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.ChildWindow(driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				System.out.println(driver.getTitle());
				

				utilobj.JSEnterText(getTestNameTxtBx(), driver, TestName);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getSearchBtnInvestigation(), driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getWindowCheckBox(), driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getSelectBtnInvestigation(), driver);
				//driver.close();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				Thread.sleep(500); 
				driver.switchTo().window(parent3);
				Thread.sleep(500);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				 
//			 InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
//			 try {
//				    WebElement popupElement = driver.findElement(By.id("popup_ok"));
//				    popupok1 = popupElement.isDisplayed();
//				} catch (Exception e) {
//				    // Element not found, set popupok to false or any default value
//				    popupok1 = false;
//				}
//
//				// Now you can use the value of popupok
//				System.out.println("Is popupok displayed? " + popupok1);
//				if(InvestigationSearch==true) {
//					getTestName().sendKeys(TestName);
//					 getSearchBtn().click();
//					 getChkBox().click();
//					 getSelectBtn().click();
//					 WebDriverWait wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
//					 wait.until(ExpectedConditions.invisibilityOf(getSelectBtn()));
//				}
//				
//				else {
//				if (popupok1==true) {
//					getTickMark().click();
//					Thread.sleep(500);
//					driver.findElement(By.id("popup_ok")).click();
//					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//					utilobj.JSEnterText(getQuantity(), driver, "1");
//					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//					getTickMark().click();
//					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//				}
//				else {
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					utilobj.JSEnterText(getQuantity(), driver, "1");
					Thread.sleep(500);
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					Thread.sleep(500);
					getTickMark().click();
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

					Thread.sleep(2000);
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//				}
				
//				}
				/*Medications*/
				wait.until(ExpectedConditions.elementToBeClickable(getMedications()));
				getMedications().click();
				Thread.sleep(500);
				String parent4 = driver.getWindowHandle();

				utilobj.Window(driver);
				Thread.sleep(500);

				getDrugSearchBtn().click();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.ChildWindow(driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				System.out.println(driver.getTitle());
				

				utilobj.JSEnterText(getTestNameTxtBx(), driver, DrugName);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getSearchBtnInvestigation(), driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getWindowDrugChkBx(), driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getSelectBtnInvestigation(), driver);
				//driver.close();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				 driver.switchTo().window(parent4);
				
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
				
//				 InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
				 try {
					    WebElement popupElement = driver.findElement(By.id("popup_ok"));
					    popupok2 = popupElement.isDisplayed();
					} catch (Exception e) {
					    // Element not found, set popupok to false or any default value
					    popupok2 = false;
					}

					// Now you can use the value of popupok
					System.out.println("Is popupok displayed? " + popupok2);
//				if(InvestigationSearch==true) {
//					getDrugName().sendKeys(DrugName);
//					getDrugNameSearchBtn().click();
//					getDrugNameChkBx().click();
//					getDrugSelectBtn().click();
//					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//					getDoseQty().clear();
//					WebDriverWait wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
//					 wait.until(ExpectedConditions.invisibilityOf(getSelectBtn()));
//				}
				
//				else {
					 if (popupok2==true) {
						
						Thread.sleep(500);
						driver.findElement(By.id("popup_ok")).click();
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getDoseQty().sendKeys("1");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getDoseType().sendKeys(DoseType);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getFrequency().sendKeys(Frequency);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getDuration().sendKeys("3");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getAdmin_Route().sendKeys(Admin_Route);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getTotal_Strength().sendKeys("3");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getTotal_Strength_drpdwn().sendKeys(DoseType);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getRemarks().sendKeys("Test");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getMedication_Tick().click();
						Thread.sleep(500);
						wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					}
					 else {
					 	driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getDoseQty().sendKeys("1");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getDoseType().sendKeys(DoseType);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getFrequency().sendKeys(Frequency);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getDuration().sendKeys("3");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getAdmin_Route().sendKeys(Admin_Route);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getTotal_Strength().sendKeys("3");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getTotal_Strength_drpdwn().sendKeys(DoseType);
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getRemarks().sendKeys("Test");
						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
						getMedication_Tick().click();
						Thread.sleep(500);
						wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

						driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					 }
//				}
				/*HealthInterventions*/
				Thread.sleep(500);
				getHealthIntervensions().click();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				String parent5 = driver.getWindowHandle();

				utilobj.Window(driver);

				getProcedures().click();

				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.ChildWindow(driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				System.out.println(driver.getTitle());
				utilobj.JSEnterText(getTestNameTxtBx(), driver, TestName1);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getSearchBtnInvestigation(), driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getWindowHealthInterventions(), driver);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				utilobj.JSClick(getSelectBtnInvestigation(), driver);
			//	driver.close();
				Thread.sleep(500);
				 driver.switchTo().window(parent5);
				 Thread.sleep(500);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
//				InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
				try {
				    WebElement popupElement = driver.findElement(By.id("popup_ok"));
				    popupok3 = popupElement.isDisplayed();
				} catch (Exception e) {
				    // Element not found, set popupok to false or any default value
				    popupok3 = false;
				}

				// Now you can use the value of popupok
				System.out.println("Is popupok displayed? " + popupok3);
//				if(InvestigationSearch==true) {
//				getTestName().sendKeys(TestName1);
//				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//				 getSearchBtn().click();
//				 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//				 getHealthInterventionsTestName().click();
//				 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//				 getSelectBtn().click();
//				 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//				}
//				else {
				 if (popupok3==true) {
					Thread.sleep(500);
					driver.findElement(By.id("popup_ok")).click();
					Thread.sleep(500);
					getHealthTnterventionsQty().sendKeys("1");
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					getHealthInterventions_Tick().click();
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				}
				 else {
					getHealthTnterventionsQty().sendKeys("1");
					Thread.sleep(500);
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					Thread.sleep(500);
					getHealthInterventions_Tick().click();
					Thread.sleep(500);
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				 }
				 
//				}
				/*Diagnosis*/	
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

				getDiagnosis().click();
				
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				getDiagnosis_Search().sendKeys(Diagnosis_Search);
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				getCovid().click();
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				getDiagnosis_Tick().click();
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

				getAdvice().sendKeys("Test test");
				Thread.sleep(500);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
				Thread.sleep(500);
				getSaveBtn().click();
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

				getpopup().click();
//				assertEquals(popupok1, false);
				assertEquals(popupok2, false, "An error message appears after clicking providing investigations and clicking on medications tab which is Unable To Process the Request.Please Try Again.");
				assertEquals(popupok3, false, "An error message appears after clicking providing medications and clicking on health interventions tab which is Unable To Process the Request.Please Try Again.");
			

		
	}

}
