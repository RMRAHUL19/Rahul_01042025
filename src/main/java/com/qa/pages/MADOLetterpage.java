package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MADOLetterpage extends BasePage {

	util utilobj = new util();

	public MADOLetterpage(WebDriver driver) {
		super(driver);

	}

	
	private By DOLetter = By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst201");
	public WebElement getDOLetter() {
	    return getElement(DOLetter);
	}
	private By ddyear = By.id("ctl00_ctl00_cphpage_cphReport_ddl_year");
	public WebElement getddyear() {
	    return getElement(ddyear);
	}
	
	private By ddlmonth = By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth");
	public WebElement getddlmonth() {
	    return getElement(ddlmonth);
	}
	private By btnPreview = By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	public WebElement getbtnPreview() {
	    return getElement(btnPreview);
	}
	private By btnClear = By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	public WebElement getbtnClear() {
	    return getElement(btnClear);
	}
	private By nextbtn = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[10]/input");
	public WebElement getnextbtn() {
	    return getElement(nextbtn);
	}
	
	private By btnlast = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[12]/input");
	public WebElement getbtnlast() {
	    return getElement(btnlast);
	}
	private By btnprew = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[8]/input");
	public WebElement getbtnprew() {
	    return getElement(btnprew);
	}
	private By firstprev = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[6]/input");
	public WebElement getfirstprev() {
	    return getElement(firstprev);
	}
	private By submitexport = By.id("submitexport");
	public WebElement getsubmitexport() {
	    return getElement(submitexport);
	}
	
	private By printbtn = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[4]/input");
	public WebElement getprintbtn() {
	    return getElement(printbtn);
	}
	
}