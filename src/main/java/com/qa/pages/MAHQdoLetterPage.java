package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MAHQdoLetterPage  extends BasePage {

	util utilobj = new util();

	public MAHQdoLetterPage(WebDriver driver) {
		super(driver);
}
	
	private By doletter=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst1");
	public WebElement getdoletter() {
		return getElement(doletter);
	}
	private By ddlStateFuture=By.id("ctl00_ctl00_cphpage_cphReport_ddlStateFuture");
	public WebElement getddlStateFuture() {
		return getElement(ddlStateFuture);
	}
	private By ddlHospitalFuture=By.id("ctl00_ctl00_cphpage_cphReport_ddlHospitalFuture");
	public WebElement getddlHospitalFuture() {
		return getElement(ddlHospitalFuture);
	}
	private By ddlyear=By.id("ctl00_ctl00_cphpage_cphReport_ddl_year");
	public WebElement getddlyear() {
		return getElement(ddlyear);
	}
	private By ddlmonth=By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth");
	public WebElement getddlmonth() {
		return getElement(ddlmonth);
	}
	private By btnPreview=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	public WebElement getbtnPreview() {
		return getElement(btnPreview);
	}
	private By btnClear=By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	public WebElement getbtnClear() {
		return getElement(btnClear);
	}
	private By btnPrint=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[4]/input");
	public WebElement getbtnPrint() {
		return getElement(btnPrint);
	}
	private By btnFirst=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[6]/input");
	public WebElement getbtnFirst() {
		return getElement(btnFirst);
	}
	private By btnPrev=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[8]/input");
	public WebElement getbtnPrev() {
		return getElement(btnPrev);
	}
	private By btnNext=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[10]/input");
	public WebElement getbtnNext() {
		return getElement(btnNext);
	}
	private By btnLast=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[12]/input");
	public WebElement getbtnLast() {
		return getElement(btnLast);
	}
	private By btnOk=By.id("submitexport");
	public WebElement getbtnOk() {
		return getElement(btnOk);
	}
}