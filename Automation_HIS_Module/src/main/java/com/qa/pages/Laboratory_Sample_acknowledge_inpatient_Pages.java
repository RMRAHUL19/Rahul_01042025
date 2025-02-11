package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Laboratory_Sample_acknowledge_inpatient_Pages extends BasePage {

	public Laboratory_Sample_acknowledge_inpatient_Pages(WebDriver driver) {
		
		super(driver);
	}
	private By from_date=By.id("ctl00_cphpage_txtOrderfromdate");
	public WebElement getfrom_dateLink() {
		return getElement(from_date);
		
	}
	private By To_date=By.id("ctl00_cphpage_txtOrdertodate");
	public WebElement getTo_dateLink() {
		return getElement(To_date);
			
	}
	private By IPNumber_txtBox=By.id("ctl00_cphpage_txtIpNo");
	public WebElement getIPNumber_txtBoxLink() {
		return getElement(IPNumber_txtBox);
			
	}
	private By Ok_Button=By.id("ctl00_cphpage_btnOk");
	public WebElement getOk_ButtonLink() {
		return getElement(Ok_Button);
			
	}
	private By Acknowledge_Button=By.id("ctl00_cphpage_btnAcknowledge");
	public WebElement getAcknowledge_ButtonLink() {
		return getElement(Acknowledge_Button);			
	}
	
	public void Test_case_for_Laboratory_Sample_acknowledge_inpatient() throws InterruptedException {
		getfrom_dateLink().clear();
		Thread.sleep(4000);
		getTo_dateLink().clear();
		Thread.sleep(4000);
		getIPNumber_txtBoxLink().sendKeys("1111111111");
		Thread.sleep(5000);
		getOk_ButtonLink().click();
		Thread.sleep(4000);
		getIPNumber_txtBoxLink().clear();
		Thread.sleep(4000);
		getfrom_dateLink().sendKeys("20-May-2021");
		Thread.sleep(4000);
		getTo_dateLink().sendKeys("27-May-2021");
		Thread.sleep(4000);
		getOk_ButtonLink().click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		
		//getAcknowledge_ButtonLink().click();
		
		
	}
	

}
