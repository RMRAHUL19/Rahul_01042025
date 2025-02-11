package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Laboratory_Bulk_Result_verification_Pages extends BasePage {

	public Laboratory_Bulk_Result_verification_Pages(WebDriver driver) {
		super(driver);
		
	}
	private By Result_Enter_FromDate=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table/tbody/tr/td[4]/input");
	public WebElement getResult_Enter_FromDateLink() {
		return getElement(Result_Enter_FromDate);
	}
	private By Result_Enter_ToDate=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table/tbody/tr/td[6]/input");
	public WebElement getResult_Enter_ToDateLink() {
		return getElement(Result_Enter_ToDate);
	}
	private By Result_Enter_OkButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[2]/div/input[1]");
	public WebElement getResult_Enter_OkButtonLink() {
		return getElement(Result_Enter_OkButton);
	}
	private By Result_Enter_Verifycheckbox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[1]/input");
	public WebElement getResult_Enter_VerifycheckboxLink() {
		return getElement(Result_Enter_Verifycheckbox);
	}
	private By Result_Enter_VerifyButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[5]/div[2]/input[2]");
	public WebElement getResult_Enter_VerifyButtonLink() {
		return getElement(Result_Enter_VerifyButton);
	}
			private By Result_Enter_ClearButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[2]/div/input[2]");
	public WebElement getResult_Enter_ClearButtonLink() {
		return getElement(Result_Enter_ClearButton);
	}
	
	
	public void testcaseforLaboratory_Bulk_Result_verification() throws InterruptedException {
		getResult_Enter_FromDateLink().sendKeys("01-Apr-2021");
		Thread.sleep(2000);
		getResult_Enter_ToDateLink().sendKeys("20-May-2021");
		Thread.sleep(2000);
		getResult_Enter_ToDateLink().sendKeys(Keys.ENTER);
		//getResult_Enter_OkButtonLink().click();
		Thread.sleep(2000);
		getResult_Enter_VerifycheckboxLink().click();
		Thread.sleep(2000);
		//getResult_Enter_VerifyButtonLink().click();
		//Thread.sleep(1000);
		getResult_Enter_ClearButtonLink().click();
		
		
		
		
		
		
		
	}

	
}

