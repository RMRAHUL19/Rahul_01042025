package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class CSSD_ItemRecieptworklist_Pages extends BasePage {

	public CSSD_ItemRecieptworklist_Pages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
	private By issu_no=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1]");
	public WebElement getissu_no() {
		return getElement(issu_no);
	}
	private By quantityReturntxtbox=By.id("ctl00_cphpage_gdvSearchResults_ctl02_txtQtyReturn");
	public WebElement getquantityReturntxtbox() {
		return getElement(quantityReturntxtbox);
	}
	private By CSSDItemReturnSaveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getCSSDItemReturnSaveButton() {
		return getElement(CSSDItemReturnSaveButton);
	}
	public void testcaseforCssdItemRecieptWorkList() throws InterruptedException {
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		utilobj.JSClick(getissu_no(), driver);

		Thread.sleep(2000);

		// utilobj.ChildWindowforPrescription(driver);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		getquantityReturntxtbox().sendKeys("1");
		Thread.sleep(1000);
		getCSSDItemReturnSaveButton().click();
		Thread.sleep(1000);
		//driver.close();
		driver.switchTo().window(parent3);
		
		
	}
 //	CSSD Item Returns - Dhanwantri 
	

}
