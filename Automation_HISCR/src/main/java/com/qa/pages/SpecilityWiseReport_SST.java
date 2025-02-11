package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecilityWiseReport_SST extends BasePage  {

	public SpecilityWiseReport_SST(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By SSTReport_Link=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst202");
	public WebElement getSSTReport_Link() {
		return getElement(SSTReport_Link);
	}
	private By ButtonPreview=By.id("ctl00_ctl00_cphpage_cphReport_btn_Preview");
    
	public WebElement getButtonPreview() {
		return getElement(ButtonPreview);
	}
//Referral no 	/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[2]/div[102]/table/tbody/tr[2]/td/table/tbody/tr/td/span
//           	/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[2]/div[115]/table/tbody/tr[2]/td/table/tbody/tr/td/span
//          	/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[2]/div[130]/table/tbody/tr[2]/td/table/tbody/tr/td/span
//              /html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[10]/input	
//template name /html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[2]/div[74]/table/tbody/tr/td/table/tbody/tr/td/span[1]
//location xpath /html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[2]/div[92]/table/tbody/tr/td/table/tbody/tr/td/span[1]
//location data xpath /html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[2]/div[92]/table/tbody/tr/td/table/tbody/tr/td/span[3]
//
}
