package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class BedStatusPage extends BasePage{
	
	public BedStatusPage(WebDriver driver) {
		super(driver);

	}
	private By BedStatus_selectview = By.id("ctl00_cphpage_ddlView");

	public WebElement getBedStatus_selectview() {
		return getElement(BedStatus_selectview);
	}
	private By BedStatus_Ward = By.id("ctl00_cphpage_ddlWard");

	public WebElement getBedStatus_Ward() {
		return getElement(BedStatus_Ward);
	}
	private By BedStatus_bedDetail = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/table/tbody/tr/td[1]/input");
	
	public WebElement getBedStatus_bedDetail() {
		return getElement(BedStatus_bedDetail);
	}
	private By BedStatus_bedInformation = By.xpath("//*[@id='ctl00_cphpage_ListViewThumb_ctrl0_ctl01_lblThumbView']");
	public WebElement getBedStatus_bedInformation() {
		return getElement(BedStatus_bedInformation);
	}
	private By BedStatus_bedDetail_closeButton=By.id("btnClose");
	
	public WebElement getBedStatus_bedDetail_closeButton() {
		return getElement(BedStatus_bedDetail_closeButton);
	}
	private By BedStatus_Vecant = By.id("ctl00_cphpage_lstLegend_ctrl0_ctl01_imgLegendButton");

	public WebElement getBedStatus_Vecant() {
		return getElement(BedStatus_Vecant);
	}
	private By BedStatus_AllocateNotocupied = By.id("ctl00_cphpage_lstLegend_ctrl0_ctl03_imgLegendButton");

	public WebElement getBedStatus_AllocateNotocupied() {
		return getElement(BedStatus_AllocateNotocupied);
	}
	private By BedStatus_Ocupied = By.id("ctl00_cphpage_lstLegend_ctrl0_ctl05_imgLegendButton");

	public WebElement getBedStatus_Ocupied() {
		return getElement(BedStatus_Ocupied);
	}
	private By BedStatus_ExtraBed = By.id("ctl00_cphpage_lstLegend_ctrl0_ctl13_imgLegendButton");

	public WebElement getBedStatus_ExtraBed() {
		return getElement(BedStatus_ExtraBed);
	}
	private By ddlBed =By.id("ctl00_cphpage_ddlBed");

	public WebElement getddlBed() 
	{
		return getElement(ddlBed);
		}

	
	
//	public void testcaseforBedStatusPage() throws InterruptedException {
//	Thread.sleep(1000);
//		utilobj.selectDropdown(getBedStatus_selectview(), driver, "Icons");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female Surgical Ward");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "female ward");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female ward 1");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female ward 888");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "general ward");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "HYD Ward");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "ICCU");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "immunization ");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Male Medical Ward");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "MiscWard");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "ONCOLOGY MALE WARD");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female Surgical Ward");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Male Medical Ward");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[2]/td/div/div/div/fieldset/table/tbody/tr/td[17]/input")).click();
//		Thread.sleep(4000);
//		
//		getBedStatus_bedDetail().click();
//
//		driver.close();
//	}
}
