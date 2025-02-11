package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class MaternityCertificatepages extends BasePage {
	util utilobj=new util();
	public MaternityCertificatepages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By Maternitycertification_IPno=By.id("ctl00_cphpage_imgbtnInsuranceno");
	public WebElement getMaternitycertification_IPnoLink() {
		return getElement(Maternitycertification_IPno);
	}
		private By Maternitycertification_IPno_searchtextbox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
		public WebElement getMaternitycertification_IPno_searchtextboxLink() {
			return getElement(Maternitycertification_IPno_searchtextbox);
		}
		private By Maternitycertification_IPno_searchbutton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
		public WebElement getMaternitycertification_IPno_searchbuttonlink() {
			return  getElement(Maternitycertification_IPno_searchbutton);
		}
		private By Maternitycertification_IPno_selectRadioButton=By.xpath(".//input[@id='ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp']");
		public WebElement getMaternitycertification_IPno_selectRadioButtonLink() {
			return getElement(Maternitycertification_IPno_selectRadioButton);
			
		}
		private By Maternitycertification_IPno_selectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
		public WebElement getMaternitycertification_IPno_selectButtonLink() {
			return getElement(Maternitycertification_IPno_selectButton);
			
		} 
		private By Maternitycertification_IPno_DDL=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
		public WebElement getMaternitycertification_IPno_DDLLink() {
			return getElement(Maternitycertification_IPno_DDL);
			
		}
		private By Maternitycertification_Layout_Durationofpragnancytxtbox=By.id("ctl00_cphpage_txtDurationOfPregnancy");
		public WebElement getMaternitycertification_Layout_DurationofpragnancytxtboxLink() {
			return getElement(Maternitycertification_Layout_Durationofpragnancytxtbox);
		}                                                                         
		private By Maternitycertification_Layout_ExpectedDateOfConfinement=By.id("ctl00_cphpage_txtExpectedDateOfConfinement");
		public WebElement getMaternitycertification_Layout_ExpectedDateOfConfinementLink() {
			return getElement(Maternitycertification_Layout_ExpectedDateOfConfinement);
		}
		private By Maternitycertification_Layout_DateOfConfinement=By.id("ctl00_cphpage_txtdateofConfinement");
		public WebElement getMaternitycertification_Layout_DateOfConfinement() {
			return getElement(Maternitycertification_Layout_DateOfConfinement);
		}
		
		private By Maternitycertification_Layout_ExpectedDateOfConfinement_date=By.id("ctl00_cphpage_CalendarExtender12_day_1_2");
		public WebElement getMaternitycertification_Layout_ExpectedDateOfConfinement_dateLink() {
			return getElement(Maternitycertification_Layout_ExpectedDateOfConfinement_date);
		}
		private By Maternitycertification_Layout_certificateOfMiscarriageRadioButton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_2");
		public WebElement getMaternitycertification_Layout_certificateOfMiscarriageLink() {
			return getElement(Maternitycertification_Layout_certificateOfMiscarriageRadioButton);
		}
		private By Maternitycertification_Layout_Dateofmiscariege=By.id("ctl00_cphpage_txtdateofMiscariage");
		public WebElement getMaternitycertification_Layout_DateofmiscariegeLink() {
			return getElement(Maternitycertification_Layout_Dateofmiscariege);
		}
		private By Maternitycertification_Layout_Dateofmiscariege_date=By.id("ctl00_cphpage_CalendarExtender11_day_1_2");
		public WebElement getMaternitycertification_Layout_Dateofmiscariege_dateLink() {
			return getElement(Maternitycertification_Layout_Dateofmiscariege_date);
		}
		private By Maternitycertification_Layout_Placeofmiscariege=By.id("ctl00_cphpage_txtPlaceofMiscariage");
		public WebElement getMaternitycertification_Layout_PlaceofmiscariegeLink() {
			return getElement(Maternitycertification_Layout_Placeofmiscariege);
		}
		private By Maternitycertification_layout_certificateOfpregnancyradiobutton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_3");
		public WebElement getMaternitycertification_layout_certificateOfpregnancyradiobuttonLink() {
			return getElement(Maternitycertification_layout_certificateOfpregnancyradiobutton);
		}
		private By Maternitycertification_layout_certificateOfpregnancy_Remarx=By.id("ctl00_cphpage_txtMaternityRemrks");
		public WebElement getMaternitycertification_layout_certificateOfpregnancy_RemarxLink() {
			return getElement(Maternitycertification_layout_certificateOfpregnancy_Remarx);
		}
		private By Maternitycertification_layout_previousCertification_hidebutton=By.id("ctl00_cphpage_Image5");
		public WebElement getMaternitycertification_layout_previousCertification_hidebuttonLink() {
			return getElement(Maternitycertification_layout_previousCertification_hidebutton);
		}                                                                                     //ctl00_cphpage_MyMessageBoxInfo_ButtonOK 
		private By Maternitycertification_layout_previousCertification_WarningmsgboxOk=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		public WebElement getMaternitycertification_layout_previousCertification_WarningmsgboxOkLink() {
			return getElement(Maternitycertification_layout_previousCertification_WarningmsgboxOk);
		}
		private By Maternitycertification_layout_certificateofconfinementform18RadioButton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_1");
		public WebElement getMaternitycertification_layout_certificateofconfinementform18RadioButton() {
			return getElement(Maternitycertification_layout_certificateofconfinementform18RadioButton);
		}
		private By Maternitycertification_layout_outcomeofpregnancyDDL=By.id("ctl00_cphpage_ddlOutcomeofPregnancy");
		public WebElement getMaternitycertification_layout_outcomeofpregnancyDDL() {
			return getElement(Maternitycertification_layout_outcomeofpregnancyDDL);
		}
		private By Maternitycertification_layout_Placeofconfinementtxtbox=By.id("ctl00_cphpage_txtPlaceofConfinement");
		public WebElement getMaternitycertification_layout_Placeofconfinementtxtbox() {
			return getElement(Maternitycertification_layout_Placeofconfinementtxtbox);
		}
		private By Maternitycertification_layout_Remarks=By.id("ctl00_cphpage_txtMaternityRemrks");
		public WebElement getMaternitycertification_layout_Remarks() {
			return getElement(Maternitycertification_layout_Remarks);
		}
		private By Maternitycertification_printButton=By.id("ctl00_cphpage_btnPrint");
		public WebElement getMaternitycertification_printButton() {
			return getElement(Maternitycertification_printButton);
		}
		private By Maternitycertification_SaveButton=By.id("ctl00_cphpage_btnSave");
		public WebElement getMaternitycertification_SaveButton() {
			return getElement(Maternitycertification_SaveButton);
		}
		private By Maternitycertification_layout_IWintend=By.id("ctl00_cphpage_txtLeavefromConfinement");
		public WebElement getMaternitycertification_layout_IWintend() {
			return getElement(Maternitycertification_layout_IWintend);
		}
		
		
		
		
		
			
				
		
		
	public void testCaseForeMaternityCertification() throws InterruptedException {
		getMaternitycertification_IPnoLink().click();
		Thread.sleep(2000);
		Select select=new Select(getMaternitycertification_IPno_DDLLink());
		select.selectByVisibleText("Equals");
		Thread.sleep(4000);
		getMaternitycertification_IPno_DDLLink().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		getMaternitycertification_IPno_searchtextboxLink().sendKeys("1199900090");
		Thread.sleep(4000);
		getMaternitycertification_IPno_searchbuttonlink().click();
		Thread.sleep(4000);
		getMaternitycertification_IPno_selectRadioButtonLink().click();
		Thread.sleep(4000);
		getMaternitycertification_IPno_selectButtonLink().click();
		Thread.sleep(4000);
		getMaternitycertification_layout_previousCertification_hidebuttonLink().click();
		Thread.sleep(4000);
		getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys("22");
		Thread.sleep(4000);
		getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		getMaternitycertification_layout_certificateOfpregnancyradiobuttonLink().click();
		Thread.sleep(4000);
		  getMaternitycertification_layout_certificateOfpregnancy_RemarxLink().sendKeys("...........TestRemarks.........");
		  Thread.sleep(4000);
		  getMaternitycertification_Layout_DurationofpragnancytxtboxLink().clear();
		  Thread.sleep(4000);
		  getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys("37");
		  Thread.sleep(4000);
		  getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys(Keys.ENTER);
		  Thread.sleep(4000);
		  getMaternitycertification_layout_certificateofconfinementform18RadioButton().click();
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		  Calendar cal = Calendar.getInstance();
		  //sdf.format(cal.getTime());
		  //cal.add(Calendar.DAY_OF_MONTH, 0);
		  String Date = sdf.format(cal.getTime());
		  System.out.println(Date);
		  Thread.sleep(4000);
		  utilobj.JSEnterText(getMaternitycertification_Layout_DateOfConfinement(), driver, Date);
		  Thread.sleep(4000);
		  cal.add(Calendar.DAY_OF_MONTH, 1);
		  String newDate = sdf.format(cal.getTime());
		  System.out.println(newDate);
		  
		  
		  //getMaternitycertification_Layout_DateOfConfinement().sendKeys(newDate);
		  Thread.sleep(4000);
		  utilobj.selectDropdown(getMaternitycertification_layout_outcomeofpregnancyDDL(), driver, "Live Birth");
		  Thread.sleep(4000);
		  getMaternitycertification_layout_Placeofconfinementtxtbox().sendKeys("test hospital");
		  Thread.sleep(4000);
		  getMaternitycertification_layout_Remarks().sendKeys("Test Remarks...");
		  Thread.sleep(4000);
		  //getMaternitycertification_printButton().click();
		  Thread.sleep(4000);
		  utilobj.JSEnterText(getMaternitycertification_layout_IWintend(), driver, newDate);
		  Thread.sleep(4000);
		  utilobj.JSClick(getMaternitycertification_SaveButton(),driver);
		  Thread.sleep(4000);
		  //getMaternitycertification_SaveButton().clear();
		  getMaternitycertification_layout_previousCertification_WarningmsgboxOkLink().click();
		  Thread.sleep(4000);
		  getMaternitycertification_layout_previousCertification_WarningmsgboxOkLink().click();
		  Thread.sleep(4000);
		  getMaternitycertification_printButton().click();
		  Thread.sleep(1000);
		  utilobj.SwitchToChildWindow(driver, "");
		  Thread.sleep(1000);
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  //driver.close();
		  Thread.sleep(1000);
		  utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		  Thread.sleep(1000);
		  
		  
//	  // utilobj.JSClick(getMaternitycertification_Layout_ExpectedDateOfConfinementLink(), driver);
//	   Thread.sleep(2000);
//		//utilobj.JSClick(getMaternitycertification_Layout_ExpectedDateOfConfinement_dateLink(), driver);
//		Thread.sleep(2000);
//		
//		getMaternitycertification_Layout_certificateOfMiscarriageLink().click();
//		Thread.sleep(2000);
//		utilobj.JSClick(getMaternitycertification_Layout_DateofmiscariegeLink(), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(getMaternitycertification_Layout_Dateofmiscariege_dateLink(),driver);
//		Thread.sleep(2000);
//getMaternitycertification_layout_previousCertification_WarningmsgboxOkLink().click();
//		
//		Thread.sleep(2000);
//		getMaternitycertification_Layout_PlaceofmiscariegeLink().sendKeys("....TestHome......");
//		Thread.sleep(2000);
		
	}
			

}
