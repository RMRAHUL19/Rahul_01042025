package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MAStatusDoletterpage extends BasePage {

	util utilobj = new util();

	public MAStatusDoletterpage(WebDriver driver) {
		super(driver);

	}

	
	private By statusDOLetter = By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst2");
	public WebElement getstatusDOLetter() {
	    return getElement(statusDOLetter);
	}
	private By ddl_year = By.id("ctl00_ctl00_cphpage_cphReport_ddl_year");
	public WebElement getddl_year() {
	    return getElement(ddl_year);
	}
	private By ddlmonth = By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth");
	public WebElement getddlmonth() {
	    return getElement(ddlmonth);
	}

	private By btnClear = By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	public WebElement getbtnClear() {
	    return getElement(btnClear);
	}
	private By btnPreview = By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	public WebElement getbtnPreview() {
	    return getElement(btnPreview);
	}
	private By nxtbtn = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[10]/input");
	public WebElement getnxtbtn() {
	    return getElement(nxtbtn);
	}
	private By btnlast = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[12]/input");
	public WebElement getbtnlast() {
	    return getElement(btnlast);
	}
	
	private By prebtn = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[8]/input");
	public WebElement getprebtn() {
	    return getElement(prebtn);
	}
	private By frstpage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[6]/input");
	public WebElement getfrstpage() {
	    return getElement(frstpage);
	}
	
	private By printbtn = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[4]/input");
	public WebElement getprintbtn() {
	    return getElement(printbtn);
	}
	private By submitexport = By.id("submitexport");
	public WebElement getsubmitexport() {
	    return getElement(submitexport);
	}
}