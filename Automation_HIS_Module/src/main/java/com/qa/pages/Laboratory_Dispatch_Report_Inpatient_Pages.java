package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Laboratory_Dispatch_Report_Inpatient_Pages extends BasePage {

	public Laboratory_Dispatch_Report_Inpatient_Pages(WebDriver driver) {
		super(driver);
		
	}
	private By Laboratory_Dispatch_Report_Inpatient_SearchWard=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div[1]/table/tbody/tr[1]/td[6]/input[2]");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_SearchWard() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_SearchWard);
	}
	private By Laboratory_Dispatch_Report_Inpatient_WardName=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td[3]/input[1]");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_WardName() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_WardName);
	}
	private By Laboratory_Dispatch_Report_Inpatient_SearchButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/input");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_SearchButton() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_SearchButton);
	}
	private By Laboratory_Dispatch_Report_Inpatient_Select_Checkbox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div/table/tbody/tr/td/div/table/tbody/tr/td/div/div/table/tbody/tr[1]/td/div/div/div/table/tbody/tr[2]/td[1]/input");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_Select_Checkbox() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_Select_Checkbox);
	}
	private By Laboratory_Dispatch_Report_Inpatient_SelectButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/input[1]");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_SelectButton() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_SelectButton);
	}
	private By Laboratory_Dispatch_Report_Inpatient_SelectDispatchcheckbox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div[2]/div/table/tbody/tr[1]/th[7]/table/tbody/tr[2]/td/input");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_SelectDispatchcheckbox() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_SelectDispatchcheckbox);
	}
	private By Laboratory_Dispatch_Report_Inpatient_DispatchTotextBox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div[1]/table/tbody/tr[3]/td[2]/input");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_DispatchTotextBox() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_DispatchTotextBox);
	}
			private By Laboratory_Dispatch_Report_Inpatient_DispatchButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/input[1]");
	public WebElement getLaboratory_Dispatch_Report_Inpatient_DispatchButton() {
		return getElement(Laboratory_Dispatch_Report_Inpatient_DispatchButton);
	}
	public void TestCaseForLaboratory_Dispatch_Report_Inpatient() throws InterruptedException {
		Thread.sleep(1000);
		getLaboratory_Dispatch_Report_Inpatient_SearchWard().click();
		Thread.sleep(5000);
		getLaboratory_Dispatch_Report_Inpatient_WardName().sendKeys("Female medical ward");
		Thread.sleep(5000);
		getLaboratory_Dispatch_Report_Inpatient_SearchButton().click();
		Thread.sleep(5000);
		getLaboratory_Dispatch_Report_Inpatient_Select_Checkbox().click();
		Thread.sleep(5000);
		getLaboratory_Dispatch_Report_Inpatient_SelectButton().click();
		Thread.sleep(5000);
		getLaboratory_Dispatch_Report_Inpatient_SelectDispatchcheckbox().click();
		Thread.sleep(5000);
		getLaboratory_Dispatch_Report_Inpatient_DispatchTotextBox().sendKeys("Dr test");
		Thread.sleep(5000);
		//getLaboratory_Dispatch_Report_Inpatient_DispatchButton().click();
		
		
		
		
		
		
		
	}
	
	
}
