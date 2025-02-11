package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class BedStatusPage extends BasePage{
	util utilobj = new util();
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
	
	
	public void testcaseforBedStatusPage() throws InterruptedException {
		//driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		
		utilobj.selectDropdown(getBedStatus_selectview(), driver, "Icons");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female Surgical Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "female ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female ward 1");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female ward 888");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "general ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "HYD Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "ICCU");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "immunization ");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "MiscWard");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "ONCOLOGY MALE WARD");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Female Surgical Ward");
		Thread.sleep(4000);
		utilobj.selectDropdown(getBedStatus_Ward(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[2]/td/div/div/div/fieldset/table/tbody/tr/td[17]/input")).click();
		Thread.sleep(4000);
		
		getBedStatus_bedDetail().click();

		//driver.close();
	}
}
