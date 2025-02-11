package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inpatient_EmergencyPatientpages extends BasePage {
	
	public Inpatient_EmergencyPatientpages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/*img search*/
	private By ImgUhidSearchLink = By.id("ctl00_cphpage_imgsearchuhid");
	/*Serch Text box*/
	private By UhidSerchTextBoxLink = By.id("ctl00_cphpage_txtUhid");
	/*uhidserch window textbox*/
	private By UhidSerchWindowtextBox = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	/*uhidserch window textbox*/
	private  By UhidSerchWindowSerchButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By  UhidButtonClose= By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnClose");
	/*inpatient_emergency module/ medicine*/
	////tr[@id='ctl00_cphpage_lstViewUnit_ctrl1_row']//img
	private By Inpatient_Emergencypatient_Medicine_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl0_row']//img");
	private By Inpatient_Emergencypatient_Medicine_minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl0_row']//img");
	
	private By Inpatient_Emergencypatient_Medicine_bed02imgclick=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[3]/td[2]/input");
	/*inpatient_emergency module/ Emergency Unit*/
	
	private By Inpatient_Emergencypatient_EmergencyUnit_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl1_row']//img");
	private By Inpatient_Emergencypatient_EmergencyUnit_minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl2_row']//img");
	
	/*inpatient_emergency module/ IcuUnit*/
	private By Inpatient_Emergencypatient_IcuUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl2_row']//img");
	private By Inpatient_Emergencypatient_IcuUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl2_row']//img");
	
	/*inpatient_emergency module/ CasualityUnit*/
	
	private By Inpatient_Emergencypatient_CasualityUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl3_row']//img");
	private By Inpatient_Emergencypatient_CasualityUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl3_row']//img");
	
	/*inpatient_emergency module/ SurgeryUnit*/
//	html body div#wrapper form#aspnetForm div#ctl00_UpdContentPage div div#ctl00_cphpage_MainScreen div.maincontent table.formlevel tbody tr td div.ListViewContainer div#ctl00_cphpage_pnlDetail div.grid table#orders tbody tr#ctl00_cphpage_lstViewUnit_ctrl0_row.group th.first img
	private By Inpatient_Emergencypatient_SurgeryUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl4_row']//img");
	private By Inpatient_Emergencypatient_SurgeryUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl4_row']//img");
	/*inpatient_emergency module/ DumyUnit*/
	private By Inpatient_Emergencypatient_ENTUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl5_row']//img");
	private By Inpatient_Emergencypatient_ENTUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl5_row']//img");
	/*inpatient_emergency module/ TestingUnit*/
	
	private By Inpatient_Emergencypatient_TestingUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl6_row']//img");
	private By Inpatient_Emergencypatient_TestingUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl6_row']//img");
	/*inpatient_emergency module/ L1dcUnit*/
	private By Inpatient_Emergencypatient_l1dcUnit_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl7_row']//img");
	private By Inpatient_Emergencypatient_l1dcUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl7_row']//img");
	
	
	/*inpatient_emergency module/ Gernal_Unit*/
	private By Inpatient_Emergencypatient_GenralUnit_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl8_row']//img");
	private By Inpatient_Emergencypatient_GenralUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl8_row']//img");
	
	
	private By Inpatient_Emergencypatient_ipcasesheet_back_button=By.id("ctl00_cphpage_btnBack");
	
	
	/*inpatient_emergency module*/
	public WebElement getInpatient_Emergencypatient_ipcasesheet_back_buttonLink() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_back_button);
	}
	
	public WebElement getInpatient_Emergencypatient_Medicine_pluselink() {
		return getElement(Inpatient_Emergencypatient_Medicine_pluse);
	}
	private WebElement getInpatient_Emergencypatient_Medicine_minusLink() {
		return getElement(Inpatient_Emergencypatient_Medicine_minus);
	}
	public WebElement getInpatient_Emergencypatient_Medicine_bed02imgclickLink() {
		return getElement(Inpatient_Emergencypatient_Medicine_bed02imgclick);
		
		
	}
	
	public WebElement getInpatient_Emergencypatient_EmergencyUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_EmergencyUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_EmergencyUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_EmergencyUnit_minus);
	}
	public WebElement getInpatient_Emergencypatient_ENTUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_ENTUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_ENTUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_ENTUnit_Minus);
	}
	public WebElement getInpatient_Emergencypatient_CasualityUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_CasualityUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_CasualityUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_CasualityUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_SurgeryUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_SurgeryUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_SurgeryUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_SurgeryUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_TestingUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_TestingUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_TestingUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_TestingUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_l1dcUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_l1dcUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_l1dcUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_l1dcUnit_Minus);
		
	}
	
	
	public WebElement getInpatient_Emergencypatient_GenralUnit_pluselink() {
		return getElement(Inpatient_Emergencypatient_GenralUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_GenralUnit_Minuslink() {
		return getElement(Inpatient_Emergencypatient_GenralUnit_Minus);
		
	}	
	public WebElement getInpatient_Emergencypatient_IcuUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_IcuUnit_Pluse);
	}
	public WebElement getInpatient_Emergencypatient_IcuUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_IcuUnit_Minus);
	}
	public void testCaseforInpatientsEmergencyPatients() throws InterruptedException {
		Thread.sleep(5000);
		getInpatient_Emergencypatient_Medicine_pluselink().click();
		Thread.sleep(5000);
			
		getInpatient_Emergencypatient_Medicine_minusLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_EmergencyUnit_pluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_EmergencyUnit_MinusLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_IcuUnit_PluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_IcuUnit_MinusLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_CasualityUnit_PluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_CasualityUnit_MinusLink().click();
		Thread.sleep(5000);		
		getInpatient_Emergencypatient_SurgeryUnit_PluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_SurgeryUnit_MinusLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_ENTUnit_PluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_ENTUnit_MinusLink().click();
		
		Thread.sleep(5000);
		getInpatient_Emergencypatient_TestingUnit_PluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_TestingUnit_MinusLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_l1dcUnit_pluseLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_l1dcUnit_MinusLink().click();
		Thread.sleep(5000);
		
		getInpatient_Emergencypatient_GenralUnit_pluselink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_GenralUnit_Minuslink().click();
		Thread.sleep(5000);
		
		
		getInpatient_Emergencypatient_Medicine_pluselink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_Medicine_bed02imgclickLink().click();
		Thread.sleep(5000);
		getInpatient_Emergencypatient_ipcasesheet_back_buttonLink().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_txtCriteria")).sendKeys("1199900090");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
		Thread.sleep(2000);
		getInpatient_Emergencypatient_ipcasesheet_back_buttonLink().click();
	
		
	}


}
