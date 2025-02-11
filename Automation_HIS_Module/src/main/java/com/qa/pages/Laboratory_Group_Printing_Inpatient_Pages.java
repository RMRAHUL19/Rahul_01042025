package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class Laboratory_Group_Printing_Inpatient_Pages extends BasePage {

	public Laboratory_Group_Printing_Inpatient_Pages(WebDriver driver) {
		super(driver);
		
	}
util utilobj = new util();
private By Laboratory_Group_Printing_Inpatient_Admission_No_Search=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table[1]/tbody/tr[1]/td[2]/input[2]");
public WebElement getLaboratory_Group_Printing_Inpatient_Admission_No_Search() {
	return getElement(Laboratory_Group_Printing_Inpatient_Admission_No_Search);
}
private By Laboratory_Group_Printing_Inpatient_SelectDDL=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/select");
public WebElement getLaboratory_Group_Printing_Inpatient_SelectDDL() {
	return getElement(Laboratory_Group_Printing_Inpatient_SelectDDL);
}
private By Laboratory_Group_Printing_Inpatient_IPNO_textBox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/input[1]");
public WebElement getLaboratory_Group_Printing_Inpatient_IPNO_textBox() {
	return getElement(Laboratory_Group_Printing_Inpatient_IPNO_textBox);
}
private By Laboratory_Group_Printing_Inpatient_SearchButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/input");
public WebElement getLaboratory_Group_Printing_Inpatient_SearchButton() {
	return getElement(Laboratory_Group_Printing_Inpatient_SearchButton);
}
private By Laboratory_Group_Printing_Inpatient_Select_CheckBox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div/table/tbody/tr/td/div/table/tbody/tr/td/div/div/table/tbody/tr[1]/td/div/div/div/table/tbody/tr[5]/td[1]/input");
public WebElement getLaboratory_Group_Printing_Inpatient_Select_CheckBox() {
	return getElement(Laboratory_Group_Printing_Inpatient_Select_CheckBox);
}
private By Laboratory_Group_Printing_Inpatient_SelectButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/input[1]");
public WebElement getLaboratory_Group_Printing_Inpatient_SelectButton() {
	return getElement(Laboratory_Group_Printing_Inpatient_SelectButton);
}
private By Laboratory_Group_Printing_Inpatient_Select_PrintCheckbox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table[2]/tbody/tr/td[1]/div/div/table/tbody/tr[1]/th[6]/span[1]/input");
public WebElement getLaboratory_Group_Printing_Inpatient_Select_PrintCheckbox() {
	return getElement(Laboratory_Group_Printing_Inpatient_Select_PrintCheckbox);
}
private By Laboratory_Group_Printing_Inpatient_Select_DoctorName_Checkbox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table[2]/tbody/tr/td[2]/div/div/table/tbody/tr[5]/td[2]/input");
public WebElement getLaboratory_Group_Printing_Inpatient_Select_DoctorName_Checkbox() {
	return getElement(Laboratory_Group_Printing_Inpatient_Select_DoctorName_Checkbox);
}
private By Laboratory_Group_Printing_Inpatient_VerifyingButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[3]/div/input[3]");
public WebElement getLaboratory_Group_Printing_Inpatient_VerifyingButton() {
	return getElement(Laboratory_Group_Printing_Inpatient_VerifyingButton);
}

private By Laboratory_Group_Printing_Inpatient_ClearButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[3]/div/input[4]");
public WebElement getLaboratory_Group_Printing_Inpatient_ClearButton() {
	return getElement(Laboratory_Group_Printing_Inpatient_ClearButton);
}
private By Laboratory_Group_Printing_Inpatient_VerifyingAllButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[3]/div/input[2]");
public WebElement getLaboratory_Group_Printing_Inpatient_VerifyingAllButtonButton() {
	return getElement(Laboratory_Group_Printing_Inpatient_VerifyingAllButton);
}




public void testcaseforgroup_printing_Inpatient() throws InterruptedException {
	getLaboratory_Group_Printing_Inpatient_Admission_No_Search().click();
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_IPNO_textBox().sendKeys("1199900090");
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_SearchButton().click();
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_Select_CheckBox().click();
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_SelectButton().click();
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_Select_PrintCheckbox().click();
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_Select_DoctorName_Checkbox().click();
	Thread.sleep(5000);
	
String parent3 = driver.getWindowHandle();
   	
	utilobj.Window(driver);
	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_VerifyingButton().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(parent3);
	Thread.sleep(2000);
//	getLaboratory_Group_Printing_Inpatient_VerifyingAllButtonButton().click();
//	Thread.sleep(2000);
	getLaboratory_Group_Printing_Inpatient_ClearButton().click();
	
	
	
	
	
	
}




}
