package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getOP_Patient_FeedbackPages extends BasePage {

	public getOP_Patient_FeedbackPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}                                                           
	private By outpatientFeedBackSatisfyingLavel_goodRB1=By.id("ctl00_cphpage_gdvfeedback_ctl02_radverygood");
	private By outpatientFeedBackSatisfyingLavel_goodRB2=By.id("ctl00_cphpage_gdvfeedback_ctl03_radverygood");
	private By outpatientFeedBackSatisfyingLavel_goodRB3=By.id("ctl00_cphpage_gdvfeedback_ctl04_radverygood");
	private By outpatientFeedBackSatisfyingLavel_goodRB4=By.id("ctl00_cphpage_gdvfeedback_ctl05_radverygood");
	private By outpatientFeedBackSatisfyingLavel_goodRB5=By.id("ctl00_cphpage_gdvfeedback_ctl06_radverygood");
	private By outpatientFeedBackSatisfyingLavel_goodRB6=By.id("ctl00_cphpage_gdvfeedback_ctl07_radverygood");
	
	private By outpatientFeedBackwaitingTime_ShortRB1=By.id("ctl00_cphpage_gdvwaitingtime_ctl02_radshort");
	private By outpatientFeedBackwaitingTime_ShortRB2=By.id("ctl00_cphpage_gdvwaitingtime_ctl03_radshort");
	private By outpatientFeedBackwaitingTime_ShortRB3=By.id("ctl00_cphpage_gdvwaitingtime_ctl04_radshort");
	private By outpatientFeedBackSatisfyingLavel_Overall=By.id("ctl00_cphpage_rblopoverall_0");
	
	private By optionalDetail_address=By.id("ctl00_cphpage_txtaddress");
	private By optionalDetail_StateDLL=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/select");
	private By optionalDetail_DistrictDLL=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/select");
	private By optionalDetail_PinCode=By.id("ctl00_cphpage_txtPresentPinCode");
	private By optionalDetail_AnySuggestion=By.id("ctl00_cphpage_txtsuggestions");
	private By feedback_ClearButton=By.id("ctl00_cphpage_btnClear");
	private By feedback_saveButton=By.id("ctl00_cphpage_btnSave");

	private By feedback_succesOKButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	
	
	
	
	
	public WebElement getoutpatientFeedBackSatisfyingLavel_goodRB1() {
		return getElement(outpatientFeedBackSatisfyingLavel_goodRB1);
	}
	public WebElement getoutpatientFeedBackSatisfyingLavel_goodRB2() {
		return getElement(outpatientFeedBackSatisfyingLavel_goodRB2);
	}
	public WebElement getoutpatientFeedBackSatisfyingLavel_goodRB3() {
		return getElement(outpatientFeedBackSatisfyingLavel_goodRB3);
	}
	public WebElement getoutpatientFeedBackSatisfyingLavel_goodRB4() {
		return getElement(outpatientFeedBackSatisfyingLavel_goodRB4);
	}
	public WebElement getoutpatientFeedBackSatisfyingLavel_goodRB5() {
		return getElement(outpatientFeedBackSatisfyingLavel_goodRB5);
	}
	public WebElement getoutpatientFeedBackSatisfyingLavel_goodRB6() {
		return getElement(outpatientFeedBackSatisfyingLavel_goodRB6);
	}
	
	public WebElement getoutpatientFeedBackwaitingTime_ShortRB1() {
		return getElement(outpatientFeedBackwaitingTime_ShortRB1);
	}
	public WebElement getoutpatientFeedBackwaitingTime_ShortRB2() {
		return getElement(outpatientFeedBackwaitingTime_ShortRB2);
	}
	public WebElement getoutpatientFeedBackwaitingTime_ShortRB3() {
		return getElement(outpatientFeedBackwaitingTime_ShortRB3);
	}
	public WebElement getoutpatientFeedBackSatisfyingLavel_Overall() {
		return getElement(outpatientFeedBackSatisfyingLavel_Overall);
	}
	public WebElement getoptionalDetail_address() {
		return getElement(optionalDetail_address);
	}
	public WebElement getoptionalDetail_StateDLL() {
		return getElement(optionalDetail_StateDLL);
	}
	public WebElement getoptionalDetail_DistrictDLL() {
		return getElement(optionalDetail_DistrictDLL);
	}
	public WebElement getoptionalDetail_PinCode() {
		return getElement(optionalDetail_PinCode);
	}
	public WebElement getoptionalDetail_AnySuggestion() {
		return getElement(optionalDetail_AnySuggestion);
	}
	public WebElement getfeedback_ClearButton() {
		return getElement(feedback_ClearButton);
	}
	public WebElement getfeedback_saveButton() {
		return getElement(feedback_saveButton);
	}
	public WebElement getfeedback_succesOKButton() {
		return getElement(feedback_succesOKButton);
	}
	
	
	
}
